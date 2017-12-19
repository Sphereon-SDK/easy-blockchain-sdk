package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
import com.sphereon.sdk.blockchain.easy.model.Backend;
import com.sphereon.sdk.blockchain.easy.model.ErrorResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BackendApi
 */
public class BackendApiTest {

    private BackendApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(BackendApi.class);
    }

    
    /**
     * Create a new backend
     *
     * Create a new backend
     */
    @Test
    public void createBackendTest() {
        Backend backend = null;
        // Backend response = api.createBackend(backend);

        // TODO: test validations
    }
    
    /**
     * Delete a backend
     *
     * Delete backend by id (not by ledgername)
     */
    @Test
    public void deleteBackendTest() {
        String backendId = null;
        // Backend response = api.deleteBackend(backendId);

        // TODO: test validations
    }
    
    /**
     * Find backends
     *
     * Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others
     */
    @Test
    public void findBackendsTest() {
        String backendId = null;
        Boolean includePublic = null;
        // List<Backend> response = api.findBackends(backendId, includePublic);

        // TODO: test validations
    }
    
    /**
     * Get backend
     *
     * Get existing backend by id (not by ledgername). Optionally including public backend of others
     */
    @Test
    public void getBackendTest() {
        String backendId = null;
        Boolean includePublic = null;
        // Backend response = api.getBackend(backendId, includePublic);

        // TODO: test validations
    }
    
    /**
     * List backends
     *
     * List existing backends.
     */
    @Test
    public void listBackendsTest() {
        // List<Backend> response = api.listBackends();

        // TODO: test validations
    }
    
}
