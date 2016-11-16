package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
import com.sphereon.sdk.blockchain.easy.model.CommittedEntryResponse;
import com.sphereon.sdk.blockchain.easy.model.Entry;
import com.sphereon.sdk.blockchain.easy.model.VndErrors;
import com.sphereon.sdk.blockchain.easy.model.AnchoredEntryResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EntryApi
 */
public class EntryApiTest {

    private EntryApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(EntryApi.class);
    }

    
    /**
     * Create a new entry in the provided chain
     *
     * 
     */
    @Test
    public void createEntryTest() {
        String chainId = null;
        Entry entry = null;
        // CommittedEntryResponse response = api.createEntry(chainId, entry);

        // TODO: test validations
    }
    
    /**
     * Get an existing entry in the provided chain
     *
     * 
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
     *
     * 
     */
    @Test
    public void entryByRequestTest() {
        String chainId = null;
        Entry entry = null;
        // AnchoredEntryResponse response = api.entryByRequest(chainId, entry);

        // TODO: test validations
    }
    
    /**
     * Get the first entry in the provided chain. This is the oldest entry also called the chain tail
     *
     * 
     */
    @Test
    public void firstEntryTest() {
        String chainId = null;
        // AnchoredEntryResponse response = api.firstEntry(chainId);

        // TODO: test validations
    }
    
    /**
     * Get the last entry in the provided chain. This is the most recent entry also called the chain head
     *
     * 
     */
    @Test
    public void lastEntryTest() {
        String chainId = null;
        // AnchoredEntryResponse response = api.lastEntry(chainId);

        // TODO: test validations
    }
    
    /**
     * Get the entry after the supplied entry Id (the next) in the provided chain
     *
     * 
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
     *
     * 
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
     *
     * 
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
     *
     * 
     */
    @Test
    public void previousEntryByRequestTest() {
        String chainId = null;
        Entry entry = null;
        // AnchoredEntryResponse response = api.previousEntryByRequest(chainId, entry);

        // TODO: test validations
    }
    
}
