package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.ApiException;
import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
import com.sphereon.sdk.blockchain.easy.handler.Configuration;
import com.sphereon.sdk.blockchain.easy.handler.Pair;

import javax.ws.rs.core.GenericType;

import com.sphereon.sdk.blockchain.easy.model.CommittedEntryResponse;
import com.sphereon.sdk.blockchain.easy.model.Entry;
import com.sphereon.sdk.blockchain.easy.model.VndErrors;
import com.sphereon.sdk.blockchain.easy.model.AnchoredEntryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-14T02:45:39.206+01:00")
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
   * @param chainId chainId (required)
   * @param entry Create a new entry for the specified chain (required)
   * @return CommittedEntryResponse
   * @throws ApiException if fails to make API call
   */
  public CommittedEntryResponse createEntry(String chainId, Entry entry) throws ApiException {
    Object localVarPostBody = entry;
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling createEntry");
    }
    
    // verify the required parameter 'entry' is set
    if (entry == null) {
      throw new ApiException(400, "Missing the required parameter 'entry' when calling createEntry");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/easy/0.1.0/chains/{chainId}/entries".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<CommittedEntryResponse> localVarReturnType = new GenericType<CommittedEntryResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get an existing entry in the provided chain
   * 
   * @param chainId chainId (required)
   * @param entryId entryId (required)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse entryById(String chainId, String entryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling entryById");
    }
    
    // verify the required parameter 'entryId' is set
    if (entryId == null) {
      throw new ApiException(400, "Missing the required parameter 'entryId' when calling entryById");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/easy/0.1.0/chains/{chainId}/entries/{entryId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()))
      .replaceAll("\\{" + "entryId" + "\\}", apiClient.escapeString(entryId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
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
   * @param chainId chainId (required)
   * @param entry Retrieve the entry (required)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse entryByRequest(String chainId, Entry entry) throws ApiException {
    Object localVarPostBody = entry;
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling entryByRequest");
    }
    
    // verify the required parameter 'entry' is set
    if (entry == null) {
      throw new ApiException(400, "Missing the required parameter 'entry' when calling entryByRequest");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/easy/0.1.0/chains/{chainId}/entries/entry".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
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
   * Get the first entry in the provided chain. This is the oldest entry also called the chain tail
   * 
   * @param chainId chainId (required)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse firstEntry(String chainId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling firstEntry");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/easy/0.1.0/chains/{chainId}/entries/first".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
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
   * Get the last entry in the provided chain. This is the most recent entry also called the chain head
   * 
   * @param chainId chainId (required)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse lastEntry(String chainId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling lastEntry");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/easy/0.1.0/chains/{chainId}/entries/last".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
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
   * @param chainId chainId (required)
   * @param entryId entryId (required)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse nextEntryById(String chainId, String entryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling nextEntryById");
    }
    
    // verify the required parameter 'entryId' is set
    if (entryId == null) {
      throw new ApiException(400, "Missing the required parameter 'entryId' when calling nextEntryById");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/easy/0.1.0/chains/{chainId}/entries/{entryId}/next".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()))
      .replaceAll("\\{" + "entryId" + "\\}", apiClient.escapeString(entryId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
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
   * @param chainId chainId (required)
   * @param entry Retrieve the entry (required)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse nextEntryByRequest(String chainId, Entry entry) throws ApiException {
    Object localVarPostBody = entry;
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling nextEntryByRequest");
    }
    
    // verify the required parameter 'entry' is set
    if (entry == null) {
      throw new ApiException(400, "Missing the required parameter 'entry' when calling nextEntryByRequest");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/easy/0.1.0/chains/{chainId}/entries/entry/next".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
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
   * @param chainId chainId (required)
   * @param entryId entryId (required)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse previousEntryById(String chainId, String entryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling previousEntryById");
    }
    
    // verify the required parameter 'entryId' is set
    if (entryId == null) {
      throw new ApiException(400, "Missing the required parameter 'entryId' when calling previousEntryById");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/easy/0.1.0/chains/{chainId}/entries/{entryId}/previous".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()))
      .replaceAll("\\{" + "entryId" + "\\}", apiClient.escapeString(entryId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
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
   * @param chainId chainId (required)
   * @param entry Retrieve the entry (required)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse previousEntryByRequest(String chainId, Entry entry) throws ApiException {
    Object localVarPostBody = entry;
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling previousEntryByRequest");
    }
    
    // verify the required parameter 'entry' is set
    if (entry == null) {
      throw new ApiException(400, "Missing the required parameter 'entry' when calling previousEntryByRequest");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/easy/0.1.0/chains/{chainId}/entries/entry/previous".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
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
