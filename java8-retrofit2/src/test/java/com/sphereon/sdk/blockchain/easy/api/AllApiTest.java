package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
import com.sphereon.sdk.blockchain.easy.model.Chain;
import com.sphereon.sdk.blockchain.easy.model.Entry;
import com.sphereon.sdk.blockchain.easy.model.IdResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Response;

import java.io.IOException;

/**
 * API tests for AllApi
 */
public class AllApiTest {

    private AllApi api;

    @Before
    public void setup() {
        ApiClient apiClient = new ApiClient("oauth2schema");
        apiClient.setAccessToken("1234567789");
        api = apiClient.createService(AllApi.class);

    }


    /**
     * Determine whether the Id of a chain exists in the blockchain
     */
    @Test
    @Ignore
    public void chainIdExistsTest() throws IOException {
        String chainId = "432434";
        Response<IdResponse> response = api.chainIdExists(chainId).execute();
        Assert.assertEquals(200, response.code());
        IdResponse idResponse = response.body();
        Assert.assertNotNull(idResponse);
        Assert.assertEquals(IdResponse.ExistsEnum.FALSE, idResponse.getExists());
    }

    /**
     * Create a new chain
     */
    @Test
    public void createChainTest() {
        Chain chain = null;
        // CommittedChainResponse response = api.createChain(chain);

        // TODO: test validations
    }

    /**
     * Create a new entry in the provided chain
     */
    @Test
    public void createEntryTest() {
        String chainId = null;
        Entry entry = null;
        // CommittedEntryResponse response = api.createEntry(chainId, entry);

        // TODO: test validations
    }

    /**
     * Pre determine the Id of a chain request without anchoring it in the blockchain
     */
    @Test
    public void determineChainIdTest() {
        Chain chain = null;
        Boolean checkExistence = null;
        // IdResponse response = api.determineChainId(chain, checkExistence);

        // TODO: test validations
    }

    /**
     * Pre determine the Id of an entry request without anchoring the entry
     */
    @Test
    public void determineEntryIdTest() {
        String chainId = null;
        Entry entry = null;
        Boolean checkExistence = null;
        // IdResponse response = api.determineEntryId(chainId, entry, checkExistence);

        // TODO: test validations
    }

    /**
     * Get an existing entry in the provided chain
     */
    @Test
    public void entryByIdTest() {
        String chainId = null;
        String entryId = null;
        // AnchoredEntryResponse response = api.entryById(chainId, entryId);

        // TODO: test validations
    }

    /**
     * Get an existing entry in the provided chain
     */
    @Test
    public void entryByRequestTest() {
        String chainId = null;
        Entry entry = null;
        // AnchoredEntryResponse response = api.entryByRequest(chainId, entry);

        // TODO: test validations
    }

    /**
     * Determine whether the Id of an entry exists in the blockchain
     */
    @Test
    public void entryIdExistsTest() {
        String chainId = null;
        String entryId = null;
        // IdResponse response = api.entryIdExists(chainId, entryId);

        // TODO: test validations
    }

    /**
     * Get the first entry in the provided chain. This is the oldest entry also called the chain tail
     */
    @Test
    public void firstEntryTest() {
        String chainId = null;
        // AnchoredEntryResponse response = api.firstEntry(chainId);

        // TODO: test validations
    }

    /**
     * Get the last entry in the provided chain. This is the most recent entry also called the chain head
     */
    @Test
    public void lastEntryTest() {
        String chainId = null;
        // AnchoredEntryResponse response = api.lastEntry(chainId);

        // TODO: test validations
    }

    /**
     * Get the entry after the supplied entry Id (the next) in the provided chain
     */
    @Test
    public void nextEntryByIdTest() {
        String chainId = null;
        String entryId = null;
        // AnchoredEntryResponse response = api.nextEntryById(chainId, entryId);

        // TODO: test validations
    }

    /**
     * Get the entry after the supplied entry Id (the next) in the provided chain
     */
    @Test
    public void nextEntryByRequestTest() {
        String chainId = null;
        Entry entry = null;
        // AnchoredEntryResponse response = api.nextEntryByRequest(chainId, entry);

        // TODO: test validations
    }

    /**
     * Get the entry before the supplied entry Id (the previous) in the provided chain
     */
    @Test
    public void previousEntryByIdTest() {
        String chainId = null;
        String entryId = null;
        // AnchoredEntryResponse response = api.previousEntryById(chainId, entryId);

        // TODO: test validations
    }

    /**
     * Get the entry before the supplied entry Id (the previous) in the provided chain
     */
    @Test
    public void previousEntryByRequestTest() {
        String chainId = null;
        Entry entry = null;
        // AnchoredEntryResponse response = api.previousEntryByRequest(chainId, entry);

        // TODO: test validations
    }

}
