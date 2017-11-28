package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.ApiException;
import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
import com.sphereon.sdk.blockchain.easy.handler.Configuration;
import com.sphereon.sdk.blockchain.easy.handler.Pair;

import javax.ws.rs.core.GenericType;

import com.sphereon.sdk.blockchain.easy.model.AnchoredEntryResponse;
import com.sphereon.sdk.blockchain.easy.model.CommittedEntryResponse;
import com.sphereon.sdk.blockchain.easy.model.Entry;
import com.sphereon.sdk.blockchain.easy.model.ErrorResponse;
import java.time.OffsetDateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-28T12:30:16.700+01:00")
public class EntryApi {
  private ApiClient apiClient;

  public EntryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EntryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new entry in the provided chain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entry Create a new entry for the specified chain (required)
   * @param currentAnchorTime  (optional)
   * @return CommittedEntryResponse
   * @throws ApiException if fails to make API call
   */
  public CommittedEntryResponse createEntry(String context, String chainId, Entry entry, OffsetDateTime currentAnchorTime) throws ApiException {
    Object localVarPostBody = entry;
    
    // verify the required parameter 'context' is set
    if (context == null) {
      throw new ApiException(400, "Missing the required parameter 'context' when calling createEntry");
    }
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling createEntry");
    }
    
    // verify the required parameter 'entry' is set
    if (entry == null) {
      throw new ApiException(400, "Missing the required parameter 'entry' when calling createEntry");
    }
    
    // create path and map variables
    String localVarPath = "/{context}/chains/{chainId}/entries"
      .replaceAll("\\{" + "context" + "\\}", apiClient.escapeString(context.toString()))
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currentAnchorTime", currentAnchorTime));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<CommittedEntryResponse> localVarReturnType = new GenericType<CommittedEntryResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get an existing entry in the provided chain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entryId entryId (required)
   * @param currentAnchorTime  (optional)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse entryById(String context, String chainId, String entryId, OffsetDateTime currentAnchorTime) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'context' is set
    if (context == null) {
      throw new ApiException(400, "Missing the required parameter 'context' when calling entryById");
    }
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling entryById");
    }
    
    // verify the required parameter 'entryId' is set
    if (entryId == null) {
      throw new ApiException(400, "Missing the required parameter 'entryId' when calling entryById");
    }
    
    // create path and map variables
    String localVarPath = "/{context}/chains/{chainId}/entries/{entryId}"
      .replaceAll("\\{" + "context" + "\\}", apiClient.escapeString(context.toString()))
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()))
      .replaceAll("\\{" + "entryId" + "\\}", apiClient.escapeString(entryId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currentAnchorTime", currentAnchorTime));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<AnchoredEntryResponse> localVarReturnType = new GenericType<AnchoredEntryResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get an existing entry in the provided chain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entry Retrieve the entry (required)
   * @param currentAnchorTime  (optional)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse entryByRequest(String context, String chainId, Entry entry, OffsetDateTime currentAnchorTime) throws ApiException {
    Object localVarPostBody = entry;
    
    // verify the required parameter 'context' is set
    if (context == null) {
      throw new ApiException(400, "Missing the required parameter 'context' when calling entryByRequest");
    }
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling entryByRequest");
    }
    
    // verify the required parameter 'entry' is set
    if (entry == null) {
      throw new ApiException(400, "Missing the required parameter 'entry' when calling entryByRequest");
    }
    
    // create path and map variables
    String localVarPath = "/{context}/chains/{chainId}/entries/entry"
      .replaceAll("\\{" + "context" + "\\}", apiClient.escapeString(context.toString()))
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currentAnchorTime", currentAnchorTime));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<AnchoredEntryResponse> localVarReturnType = new GenericType<AnchoredEntryResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the first entry in the provided chain. This is the oldest entry also called the chain tail.  Please note that the achorTimes will only contain the first anchor time. Call getEntry to retrieve all times
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse firstEntry(String context, String chainId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'context' is set
    if (context == null) {
      throw new ApiException(400, "Missing the required parameter 'context' when calling firstEntry");
    }
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling firstEntry");
    }
    
    // create path and map variables
    String localVarPath = "/{context}/chains/{chainId}/entries/first"
      .replaceAll("\\{" + "context" + "\\}", apiClient.escapeString(context.toString()))
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()));

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

    GenericType<AnchoredEntryResponse> localVarReturnType = new GenericType<AnchoredEntryResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the last entry in the provided chain. This is the most recent entry also called the chain head. Please note that the achorTimes will only contain the latest anchor time. Call getEntry to retrieve all times
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse lastEntry(String context, String chainId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'context' is set
    if (context == null) {
      throw new ApiException(400, "Missing the required parameter 'context' when calling lastEntry");
    }
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling lastEntry");
    }
    
    // create path and map variables
    String localVarPath = "/{context}/chains/{chainId}/entries/last"
      .replaceAll("\\{" + "context" + "\\}", apiClient.escapeString(context.toString()))
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()));

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

    GenericType<AnchoredEntryResponse> localVarReturnType = new GenericType<AnchoredEntryResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the entry after the supplied entry Id (the next) in the provided chain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entryId entryId (required)
   * @param currentAnchorTime  (optional)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse nextEntryById(String context, String chainId, String entryId, OffsetDateTime currentAnchorTime) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'context' is set
    if (context == null) {
      throw new ApiException(400, "Missing the required parameter 'context' when calling nextEntryById");
    }
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling nextEntryById");
    }
    
    // verify the required parameter 'entryId' is set
    if (entryId == null) {
      throw new ApiException(400, "Missing the required parameter 'entryId' when calling nextEntryById");
    }
    
    // create path and map variables
    String localVarPath = "/{context}/chains/{chainId}/entries/{entryId}/next"
      .replaceAll("\\{" + "context" + "\\}", apiClient.escapeString(context.toString()))
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()))
      .replaceAll("\\{" + "entryId" + "\\}", apiClient.escapeString(entryId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currentAnchorTime", currentAnchorTime));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<AnchoredEntryResponse> localVarReturnType = new GenericType<AnchoredEntryResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the entry after the supplied entry Id (the next) in the provided chain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entry Retrieve the entry (required)
   * @param currentAnchorTime  (optional)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse nextEntryByRequest(String context, String chainId, Entry entry, OffsetDateTime currentAnchorTime) throws ApiException {
    Object localVarPostBody = entry;
    
    // verify the required parameter 'context' is set
    if (context == null) {
      throw new ApiException(400, "Missing the required parameter 'context' when calling nextEntryByRequest");
    }
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling nextEntryByRequest");
    }
    
    // verify the required parameter 'entry' is set
    if (entry == null) {
      throw new ApiException(400, "Missing the required parameter 'entry' when calling nextEntryByRequest");
    }
    
    // create path and map variables
    String localVarPath = "/{context}/chains/{chainId}/entries/entry/next"
      .replaceAll("\\{" + "context" + "\\}", apiClient.escapeString(context.toString()))
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currentAnchorTime", currentAnchorTime));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<AnchoredEntryResponse> localVarReturnType = new GenericType<AnchoredEntryResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the entry before the supplied entry Id (the previous) in the provided chain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entryId entryId (required)
   * @param currentAnchorTime  (optional)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse previousEntryById(String context, String chainId, String entryId, OffsetDateTime currentAnchorTime) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'context' is set
    if (context == null) {
      throw new ApiException(400, "Missing the required parameter 'context' when calling previousEntryById");
    }
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling previousEntryById");
    }
    
    // verify the required parameter 'entryId' is set
    if (entryId == null) {
      throw new ApiException(400, "Missing the required parameter 'entryId' when calling previousEntryById");
    }
    
    // create path and map variables
    String localVarPath = "/{context}/chains/{chainId}/entries/{entryId}/previous"
      .replaceAll("\\{" + "context" + "\\}", apiClient.escapeString(context.toString()))
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()))
      .replaceAll("\\{" + "entryId" + "\\}", apiClient.escapeString(entryId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currentAnchorTime", currentAnchorTime));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<AnchoredEntryResponse> localVarReturnType = new GenericType<AnchoredEntryResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the entry before the supplied entry Id (the previous) in the provided chain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entry Retrieve the entry (required)
   * @param currentAnchorTime  (optional)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse previousEntryByRequest(String context, String chainId, Entry entry, OffsetDateTime currentAnchorTime) throws ApiException {
    Object localVarPostBody = entry;
    
    // verify the required parameter 'context' is set
    if (context == null) {
      throw new ApiException(400, "Missing the required parameter 'context' when calling previousEntryByRequest");
    }
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling previousEntryByRequest");
    }
    
    // verify the required parameter 'entry' is set
    if (entry == null) {
      throw new ApiException(400, "Missing the required parameter 'entry' when calling previousEntryByRequest");
    }
    
    // create path and map variables
    String localVarPath = "/{context}/chains/{chainId}/entries/entry/previous"
      .replaceAll("\\{" + "context" + "\\}", apiClient.escapeString(context.toString()))
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currentAnchorTime", currentAnchorTime));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<AnchoredEntryResponse> localVarReturnType = new GenericType<AnchoredEntryResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
