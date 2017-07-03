package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
import com.sphereon.sdk.blockchain.easy.model.IdResponse;
import com.sphereon.sdk.blockchain.easy.model.ErrorResponse;
import com.sphereon.sdk.blockchain.easy.model.Chain;
import com.sphereon.sdk.blockchain.easy.model.Entry;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IdApi
 */
public class IdApiTest {

    private IdApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(IdApi.class);
    }

    
    /**
     * Determine whether the Id of a chain exists in the blockchain
     *
     * 
     */
    @Test
    public void chainIdExistsTest() {
        String context = null;
        String chainId = null;
        // IdResponse response = api.chainIdExists(context, chainId);

        // TODO: test validations
    }
    
    /**
     * Pre determine the Id of a chain request without anchoring it in the blockchain
     *
     * 
     */
    @Test
    public void determineChainIdTest() {
        String context = null;
        Chain chain = null;
        Boolean checkExistence = null;
        // IdResponse response = api.determineChainId(context, chain, checkExistence);

        // TODO: test validations
    }
    
    /**
     * Pre determine the Id of an entry request without anchoring the entry
     *
     * 
     */
    @Test
    public void determineEntryIdTest() {
        String context = null;
        String chainId = null;
        Entry entry = null;
        Boolean checkExistence = null;
        // IdResponse response = api.determineEntryId(context, chainId, entry, checkExistence);

        // TODO: test validations
    }
    
    /**
     * Determine whether the Id of an entry exists in the blockchain
     *
     * 
     */
    @Test
    public void entryIdExistsTest() {
        String context = null;
        String chainId = null;
        String entryId = null;
        // IdResponse response = api.entryIdExists(context, chainId, entryId);

        // TODO: test validations
    }
    
}
