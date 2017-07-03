package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
import com.sphereon.sdk.blockchain.easy.model.Backend;
import com.sphereon.sdk.blockchain.easy.model.ErrorResponse;
import com.sphereon.sdk.blockchain.easy.model.Context;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContextApi
 */
public class ContextApiTest {

    private ContextApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ContextApi.class);
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
     * List existing backends.
     *
     * 
     */
    @Test
    public void listBackendsTest() {
        // List<Backend> response = api.listBackends();

        // TODO: test validations
    }
    
}
