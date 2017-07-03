package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
import com.sphereon.sdk.blockchain.easy.model.IdResponse;
import com.sphereon.sdk.blockchain.easy.model.ErrorResponse;
import com.sphereon.sdk.blockchain.easy.model.Backend;
import com.sphereon.sdk.blockchain.easy.model.CommittedChainResponse;
import com.sphereon.sdk.blockchain.easy.model.Chain;
import com.sphereon.sdk.blockchain.easy.model.Context;
import com.sphereon.sdk.blockchain.easy.model.CommittedEntryResponse;
import com.sphereon.sdk.blockchain.easy.model.Entry;
import java.time.OffsetDateTime;
import com.sphereon.sdk.blockchain.easy.model.AnchoredEntryResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AllApi
 */
public class AllApiTest {

    private AllApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AllApi.class);
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
     * Create a new backend
     *
     * 
     */
    @Test
    public void createBackendTest() {
        Backend backend = null;
        // Backend response = api.createBackend(backend);

        // TODO: test validations
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
    
    /**
     * Create a new context
     *
     * 
     */
    @Test
    public void createContextTest() {
        Context context = null;
        // Context response = api.createContext(context);

        // TODO: test validations
    }
    
    /**
     * Create a new entry in the provided chain
     *
     * 
     */
    @Test
    public void createEntryTest() {
        String context = null;
        String chainId = null;
        Entry entry = null;
        OffsetDateTime currentAnchorTime = null;
        // CommittedEntryResponse response = api.createEntry(context, chainId, entry, currentAnchorTime);

        // TODO: test validations
    }
    
    /**
     * Delete backend by id (not by ledgername)
     *
     * 
     */
    @Test
    public void deleteBackendTest() {
        String backendId = null;
        // Void response = api.deleteBackend(backendId);

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
     * Get an existing entry in the provided chain
     *
     * 
     */
    @Test
    public void entryByIdTest() {
        String context = null;
        String chainId = null;
        String entryId = null;
        OffsetDateTime currentAnchorTime = null;
        // AnchoredEntryResponse response = api.entryById(context, chainId, entryId, currentAnchorTime);

        // TODO: test validations
    }
    
    /**
     * Get an existing entry in the provided chain
     *
     * 
     */
    @Test
    public void entryByRequestTest() {
        String context = null;
        String chainId = null;
        Entry entry = null;
        OffsetDateTime currentAnchorTime = null;
        // AnchoredEntryResponse response = api.entryByRequest(context, chainId, entry, currentAnchorTime);

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
    
    /**
     * Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others
     *
     * 
     */
    @Test
    public void findBackendsTest() {
        String backendId = null;
        Boolean includePublic = null;
        // List<Backend> response = api.findBackends(backendId, includePublic);

        // TODO: test validations
    }
    
    /**
     * Get the first entry in the provided chain. This is the oldest entry also called the chain tail.  Please note that the achorTimes will only contain the first anchor time. Call getEntry to retrieve all times
     *
     * 
     */
    @Test
    public void firstEntryTest() {
        String context = null;
        String chainId = null;
        // AnchoredEntryResponse response = api.firstEntry(context, chainId);

        // TODO: test validations
    }
    
    /**
     * Get existing backend by id (not by ledgername). Optionally including public backend of others
     *
     * 
     */
    @Test
    public void getBackendTest() {
        String backendId = null;
        Boolean includePublic = null;
        // Backend response = api.getBackend(backendId, includePublic);

        // TODO: test validations
    }
    
    /**
     * Get an existing context
     *
     * 
     */
    @Test
    public void getContextTest() {
        String context = null;
        // Context response = api.getContext(context);

        // TODO: test validations
    }
    
    /**
     * Get the last entry in the provided chain. This is the most recent entry also called the chain head. Please note that the achorTimes will only contain the latest anchor time. Call getEntry to retrieve all times
     *
     * 
     */
    @Test
    public void lastEntryTest() {
        String context = null;
        String chainId = null;
        // AnchoredEntryResponse response = api.lastEntry(context, chainId);

        // TODO: test validations
    }
    
    /**
     * List existing backends.
     *
     * 
     */
    @Test
    public void listBackendsTest() {
        // List<Backend> response = api.listBackends();

        // TODO: test validations
    }
    
    /**
     * Get the entry after the supplied entry Id (the next) in the provided chain
     *
     * 
     */
    @Test
    public void nextEntryByIdTest() {
        String context = null;
        String chainId = null;
        String entryId = null;
        OffsetDateTime currentAnchorTime = null;
        // AnchoredEntryResponse response = api.nextEntryById(context, chainId, entryId, currentAnchorTime);

        // TODO: test validations
    }
    
    /**
     * Get the entry after the supplied entry Id (the next) in the provided chain
     *
     * 
     */
    @Test
    public void nextEntryByRequestTest() {
        String context = null;
        String chainId = null;
        Entry entry = null;
        OffsetDateTime currentAnchorTime = null;
        // AnchoredEntryResponse response = api.nextEntryByRequest(context, chainId, entry, currentAnchorTime);

        // TODO: test validations
    }
    
    /**
     * Get the entry before the supplied entry Id (the previous) in the provided chain
     *
     * 
     */
    @Test
    public void previousEntryByIdTest() {
        String context = null;
        String chainId = null;
        String entryId = null;
        OffsetDateTime currentAnchorTime = null;
        // AnchoredEntryResponse response = api.previousEntryById(context, chainId, entryId, currentAnchorTime);

        // TODO: test validations
    }
    
    /**
     * Get the entry before the supplied entry Id (the previous) in the provided chain
     *
     * 
     */
    @Test
    public void previousEntryByRequestTest() {
        String context = null;
        String chainId = null;
        Entry entry = null;
        OffsetDateTime currentAnchorTime = null;
        // AnchoredEntryResponse response = api.previousEntryByRequest(context, chainId, entry, currentAnchorTime);

        // TODO: test validations
    }
    
}
