/*
 * Easy Blockchain API
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of Factom or Multichain. The latter also allows for a private blockchain. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a context is available using the / POST endpoint. Normally you only need one context. This is the place where backend providers and blockchain implementations are being specified.  2. Make sure a chain has been created using the /chain POST endpoint. Normally you only need one or a handful of chains. This is a relative expensive operation.  3. Store entries on the chain from step 2. The entries will contain the content and metadata you want to store forever on the specified chain.  4. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.9.1
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.ApiCallback;
import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
import com.sphereon.sdk.blockchain.easy.handler.ApiException;
import com.sphereon.sdk.blockchain.easy.handler.ApiResponse;
import com.sphereon.sdk.blockchain.easy.handler.Configuration;
import com.sphereon.sdk.blockchain.easy.handler.Pair;
import com.sphereon.sdk.blockchain.easy.handler.ProgressRequestBody;
import com.sphereon.sdk.blockchain.easy.handler.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.sphereon.sdk.blockchain.easy.model.Backend;
import com.sphereon.sdk.blockchain.easy.model.ErrorResponse;
import com.sphereon.sdk.blockchain.easy.model.Context;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContextApi {
    private ApiClient apiClient;

    public ContextApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContextApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createBackend */
    private com.squareup.okhttp.Call createBackendCall(Backend backend, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = backend;
        
        // verify the required parameter 'backend' is set
        if (backend == null) {
            throw new ApiException("Missing the required parameter 'backend' when calling createBackend(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/blockchain/easy/0.9.1/backends".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=UTF-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Create a new backend
     * 
     * @param backend backend (required)
     * @return Backend
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Backend createBackend(Backend backend) throws ApiException {
        ApiResponse<Backend> resp = createBackendWithHttpInfo(backend);
        return resp.getData();
    }

    /**
     * Create a new backend
     * 
     * @param backend backend (required)
     * @return ApiResponse&lt;Backend&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Backend> createBackendWithHttpInfo(Backend backend) throws ApiException {
        com.squareup.okhttp.Call call = createBackendCall(backend, null, null);
        Type localVarReturnType = new TypeToken<Backend>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a new backend (asynchronously)
     * 
     * @param backend backend (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createBackendAsync(Backend backend, final ApiCallback<Backend> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createBackendCall(backend, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Backend>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for createContext */
    private com.squareup.okhttp.Call createContextCall(Context context, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = context;
        
        // verify the required parameter 'context' is set
        if (context == null) {
            throw new ApiException("Missing the required parameter 'context' when calling createContext(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/blockchain/easy/0.9.1/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=UTF-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Create a new context
     * 
     * @param context context (required)
     * @return Context
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Context createContext(Context context) throws ApiException {
        ApiResponse<Context> resp = createContextWithHttpInfo(context);
        return resp.getData();
    }

    /**
     * Create a new context
     * 
     * @param context context (required)
     * @return ApiResponse&lt;Context&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Context> createContextWithHttpInfo(Context context) throws ApiException {
        com.squareup.okhttp.Call call = createContextCall(context, null, null);
        Type localVarReturnType = new TypeToken<Context>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a new context (asynchronously)
     * 
     * @param context context (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createContextAsync(Context context, final ApiCallback<Context> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createContextCall(context, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Context>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteBackend */
    private com.squareup.okhttp.Call deleteBackendCall(String backendId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'backendId' is set
        if (backendId == null) {
            throw new ApiException("Missing the required parameter 'backendId' when calling deleteBackend(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/blockchain/easy/0.9.1/backends/{backendId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "backendId" + "\\}", apiClient.escapeString(backendId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*_/_*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Delete backend by id (not by ledgername)
     * 
     * @param backendId backendId (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteBackend(String backendId) throws ApiException {
        deleteBackendWithHttpInfo(backendId);
    }

    /**
     * Delete backend by id (not by ledgername)
     * 
     * @param backendId backendId (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteBackendWithHttpInfo(String backendId) throws ApiException {
        com.squareup.okhttp.Call call = deleteBackendCall(backendId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete backend by id (not by ledgername) (asynchronously)
     * 
     * @param backendId backendId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteBackendAsync(String backendId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteBackendCall(backendId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for findBackends */
    private com.squareup.okhttp.Call findBackendsCall(String backendId, Boolean includePublic, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'backendId' is set
        if (backendId == null) {
            throw new ApiException("Missing the required parameter 'backendId' when calling findBackends(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/blockchain/easy/0.9.1/backends/{backendId}/find".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "backendId" + "\\}", apiClient.escapeString(backendId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (includePublic != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "includePublic", includePublic));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others
     * 
     * @param backendId backendId (required)
     * @param includePublic includePublic (optional, default to false)
     * @return List&lt;Backend&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Backend> findBackends(String backendId, Boolean includePublic) throws ApiException {
        ApiResponse<List<Backend>> resp = findBackendsWithHttpInfo(backendId, includePublic);
        return resp.getData();
    }

    /**
     * Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others
     * 
     * @param backendId backendId (required)
     * @param includePublic includePublic (optional, default to false)
     * @return ApiResponse&lt;List&lt;Backend&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Backend>> findBackendsWithHttpInfo(String backendId, Boolean includePublic) throws ApiException {
        com.squareup.okhttp.Call call = findBackendsCall(backendId, includePublic, null, null);
        Type localVarReturnType = new TypeToken<List<Backend>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others (asynchronously)
     * 
     * @param backendId backendId (required)
     * @param includePublic includePublic (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findBackendsAsync(String backendId, Boolean includePublic, final ApiCallback<List<Backend>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = findBackendsCall(backendId, includePublic, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Backend>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getBackend */
    private com.squareup.okhttp.Call getBackendCall(String backendId, Boolean includePublic, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'backendId' is set
        if (backendId == null) {
            throw new ApiException("Missing the required parameter 'backendId' when calling getBackend(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/blockchain/easy/0.9.1/backends/{backendId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "backendId" + "\\}", apiClient.escapeString(backendId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (includePublic != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "includePublic", includePublic));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get existing backend by id (not by ledgername). Optionally including public backend of others
     * 
     * @param backendId backendId (required)
     * @param includePublic includePublic (optional, default to false)
     * @return Backend
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Backend getBackend(String backendId, Boolean includePublic) throws ApiException {
        ApiResponse<Backend> resp = getBackendWithHttpInfo(backendId, includePublic);
        return resp.getData();
    }

    /**
     * Get existing backend by id (not by ledgername). Optionally including public backend of others
     * 
     * @param backendId backendId (required)
     * @param includePublic includePublic (optional, default to false)
     * @return ApiResponse&lt;Backend&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Backend> getBackendWithHttpInfo(String backendId, Boolean includePublic) throws ApiException {
        com.squareup.okhttp.Call call = getBackendCall(backendId, includePublic, null, null);
        Type localVarReturnType = new TypeToken<Backend>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get existing backend by id (not by ledgername). Optionally including public backend of others (asynchronously)
     * 
     * @param backendId backendId (required)
     * @param includePublic includePublic (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getBackendAsync(String backendId, Boolean includePublic, final ApiCallback<Backend> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getBackendCall(backendId, includePublic, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Backend>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getContext */
    private com.squareup.okhttp.Call getContextCall(String context, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'context' is set
        if (context == null) {
            throw new ApiException("Missing the required parameter 'context' when calling getContext(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/blockchain/easy/0.9.1/{context}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "context" + "\\}", apiClient.escapeString(context.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get an existing context
     * 
     * @param context context (required)
     * @return Context
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Context getContext(String context) throws ApiException {
        ApiResponse<Context> resp = getContextWithHttpInfo(context);
        return resp.getData();
    }

    /**
     * Get an existing context
     * 
     * @param context context (required)
     * @return ApiResponse&lt;Context&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Context> getContextWithHttpInfo(String context) throws ApiException {
        com.squareup.okhttp.Call call = getContextCall(context, null, null);
        Type localVarReturnType = new TypeToken<Context>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an existing context (asynchronously)
     * 
     * @param context context (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getContextAsync(String context, final ApiCallback<Context> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getContextCall(context, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Context>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listBackends */
    private com.squareup.okhttp.Call listBackendsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/blockchain/easy/0.9.1/backends".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * List existing backends.
     * 
     * @return List&lt;Backend&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Backend> listBackends() throws ApiException {
        ApiResponse<List<Backend>> resp = listBackendsWithHttpInfo();
        return resp.getData();
    }

    /**
     * List existing backends.
     * 
     * @return ApiResponse&lt;List&lt;Backend&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Backend>> listBackendsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = listBackendsCall(null, null);
        Type localVarReturnType = new TypeToken<List<Backend>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List existing backends. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listBackendsAsync(final ApiCallback<List<Backend>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listBackendsCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Backend>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}