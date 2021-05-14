package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.libs.authentication.api.AuthenticationApi;
import com.sphereon.libs.authentication.api.TokenRequest;
import com.sphereon.libs.authentication.api.config.ApiConfiguration;
import com.sphereon.libs.authentication.api.config.PersistenceMode;
import com.sphereon.libs.authentication.api.config.PersistenceType;
import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
import com.sphereon.sdk.blockchain.easy.model.Chain;
import com.sphereon.sdk.blockchain.easy.model.Entry;
import com.sphereon.sdk.blockchain.easy.model.EntryData;
import com.sphereon.sdk.blockchain.easy.model.ExternalId;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AbstractApiTest {

    public static final String APPLICATION_NAME = "tests.blockchain-proof";
    public static final String CONTEXT_MULTICHAIN = "multichain";
    public static final String CONTEXT_FACTOM = "factom";
    public static final String TEST_ENTRY_CONTENT = "Test Entry Content";
    public static final String FIRST_ENTRY_EXTERNAL_ID = "first entry external id";
    public static final String SECOND_ENTRY_EXTERNAL_ID = "second entry external id";
    public static final String TEST_CHAIN_ID = "502b99271ff6a3f8509ba2764e1e1c1482ad800140c17b25e165837ab5320501";
    public static final long TOKEN_VALIDITY_SECONDS = 5400;
    public static final int CONNECTION_TIMEOUT = 40000;

    private static final AuthenticationApi authenticationApi;

    static {

        ApiConfiguration tokenApiConfig = new ApiConfiguration.Builder()
                                              .withApplication(APPLICATION_NAME)
                                              .withPersistenceType(PersistenceType.SYSTEM_ENVIRONMENT)
                                              .withPersistenceMode(PersistenceMode.READ_WRITE)
                                              .withAutoEncryptSecrets(true)
                                              .build();
        authenticationApi = new AuthenticationApi.Builder().withConfiguration(tokenApiConfig).build();
    }

    protected final void configureApi(ApiClient apiClient) {
        apiClient.setConnectTimeout(CONNECTION_TIMEOUT);
        apiClient.getHttpClient().setReadTimeout(CONNECTION_TIMEOUT, TimeUnit.MILLISECONDS);
        apiClient.getHttpClient().setWriteTimeout(CONNECTION_TIMEOUT, TimeUnit.MILLISECONDS);
        String gatewayUrl = System.getProperty("tests.easy-blockchain.gateway-url");
        if (StringUtils.isNotEmpty(gatewayUrl)) {
            gatewayUrl = System.getenv("tests.easy-blockchain.gateway-url");
            apiClient.setBasePath(gatewayUrl);
        }
        if (StringUtils.isNotEmpty(gatewayUrl)) {
            apiClient.setBasePath(gatewayUrl);
        }

        TokenRequest tokenRequest = authenticationApi.requestToken()
                                        .withValidityPeriod(TOKEN_VALIDITY_SECONDS)
                                        .build();
        apiClient.setAccessToken(tokenRequest.execute().getAccessToken());
    }


    protected final Chain createChainRequest(String content, String... externalIdValues) {
        Entry firstEntry = createEntry(content, externalIdValues);
        Chain chain = new Chain();
        chain.setFirstEntry(firstEntry);
        return chain;
    }


    protected final Entry createEntry(String content, String... externalIdValues) {
        List<ExternalId> externalIds = new ArrayList<>();
        for (String externalIdValue : externalIdValues) {
            ExternalId externalId = new ExternalId();
            externalId.setValue(externalIdValue.getBytes());
            externalIds.add(externalId);
        }
        EntryData entryData = new EntryData();
        entryData.setExternalIds(externalIds);
        entryData.setContent(content.getBytes());
        Entry entry = new Entry();
        entry.setEntryData(entryData);
        return entry;
    }
}
