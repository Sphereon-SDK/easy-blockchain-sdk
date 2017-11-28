package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.ApiException;
import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
import com.sphereon.sdk.blockchain.easy.handler.Configuration;
import com.sphereon.sdk.blockchain.easy.handler.Pair;

import javax.ws.rs.core.GenericType;

import com.sphereon.sdk.blockchain.easy.model.Backend;
import com.sphereon.sdk.blockchain.easy.model.Context;
import com.sphereon.sdk.blockchain.easy.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-28T12:30:16.700+01:00")
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

  /**
   * Create a new backend
   * 
   * @param backend backend (required)
   * @return Backend
   * @throws ApiException if fails to make API call
   */
  public Backend createBackend(Backend backend) throws ApiException {
    Object localVarPostBody = backend;
    
    // verify the required parameter 'backend' is set
    if (backend == null) {
      throw new ApiException(400, "Missing the required parameter 'backend' when calling createBackend");
    }
    
    // create path and map variables
    String localVarPath = "/backends";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<Backend> localVarReturnType = new GenericType<Backend>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a new context
   * 
   * @param context context (required)
   * @return Context
   * @throws ApiException if fails to make API call
   */
  public Context createContext(Context context) throws ApiException {
    Object localVarPostBody = context;
    
    // verify the required parameter 'context' is set
    if (context == null) {
      throw new ApiException(400, "Missing the required parameter 'context' when calling createContext");
    }
    
    // create path and map variables
    String localVarPath = "/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<Context> localVarReturnType = new GenericType<Context>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete backend by id (not by ledgername)
   * 
   * @param backendId backendId (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteBackend(String backendId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'backendId' is set
    if (backendId == null) {
      throw new ApiException(400, "Missing the required parameter 'backendId' when calling deleteBackend");
    }
    
    // create path and map variables
    String localVarPath = "/backends/{backendId}"
      .replaceAll("\\{" + "backendId" + "\\}", apiClient.escapeString(backendId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others
   * 
   * @param backendId backendId (required)
   * @param includePublic includePublic (optional, default to false)
   * @return List&lt;Backend&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Backend> findBackends(String backendId, Boolean includePublic) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'backendId' is set
    if (backendId == null) {
      throw new ApiException(400, "Missing the required parameter 'backendId' when calling findBackends");
    }
    
    // create path and map variables
    String localVarPath = "/backends/{backendId}/find"
      .replaceAll("\\{" + "backendId" + "\\}", apiClient.escapeString(backendId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includePublic", includePublic));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<List<Backend>> localVarReturnType = new GenericType<List<Backend>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get existing backend by id (not by ledgername). Optionally including public backend of others
   * 
   * @param backendId backendId (required)
   * @param includePublic includePublic (optional, default to false)
   * @return Backend
   * @throws ApiException if fails to make API call
   */
  public Backend getBackend(String backendId, Boolean includePublic) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'backendId' is set
    if (backendId == null) {
      throw new ApiException(400, "Missing the required parameter 'backendId' when calling getBackend");
    }
    
    // create path and map variables
    String localVarPath = "/backends/{backendId}"
      .replaceAll("\\{" + "backendId" + "\\}", apiClient.escapeString(backendId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includePublic", includePublic));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<Backend> localVarReturnType = new GenericType<Backend>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get an existing context
   * 
   * @param context context (required)
   * @return Context
   * @throws ApiException if fails to make API call
   */
  public Context getContext(String context) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'context' is set
    if (context == null) {
      throw new ApiException(400, "Missing the required parameter 'context' when calling getContext");
    }
    
    // create path and map variables
    String localVarPath = "/{context}"
      .replaceAll("\\{" + "context" + "\\}", apiClient.escapeString(context.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<Context> localVarReturnType = new GenericType<Context>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List existing backends.
   * 
   * @return List&lt;Backend&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Backend> listBackends() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backends";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<List<Backend>> localVarReturnType = new GenericType<List<Backend>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
