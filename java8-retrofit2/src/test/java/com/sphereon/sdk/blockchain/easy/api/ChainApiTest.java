package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
import com.sphereon.sdk.blockchain.easy.model.CommittedChainResponse;
import com.sphereon.sdk.blockchain.easy.model.Chain;
import com.sphereon.sdk.blockchain.easy.model.ErrorResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChainApi
 */
public class ChainApiTest {

    private ChainApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ChainApi.class);
    }

    
    /**
     * Create a new chain
     *
     * 
     */
    @Test
    public void createChainTest() {
        String context = null;
        Chain chain = null;
        // CommittedChainResponse response = api.createChain(context, chain);

        // TODO: test validations
    }
    
}
