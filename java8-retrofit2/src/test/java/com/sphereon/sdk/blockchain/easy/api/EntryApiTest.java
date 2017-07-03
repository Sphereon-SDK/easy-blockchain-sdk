package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
import com.sphereon.sdk.blockchain.easy.model.CommittedEntryResponse;
import com.sphereon.sdk.blockchain.easy.model.Entry;
import java.time.OffsetDateTime;
import com.sphereon.sdk.blockchain.easy.model.ErrorResponse;
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
        String context = null;
        String chainId = null;
        Entry entry = null;
        OffsetDateTime currentAnchorTime = null;
        // CommittedEntryResponse response = api.createEntry(context, chainId, entry, currentAnchorTime);

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
