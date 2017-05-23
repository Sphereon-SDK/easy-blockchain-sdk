package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.ApiException;
import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
import com.sphereon.sdk.blockchain.easy.handler.Configuration;
import com.sphereon.sdk.blockchain.easy.handler.Pair;

import javax.ws.rs.core.GenericType;

import com.sphereon.sdk.blockchain.easy.model.IdResponse;
import com.sphereon.sdk.blockchain.easy.model.ErrorResponse;
import com.sphereon.sdk.blockchain.easy.model.CommittedChainResponse;
import com.sphereon.sdk.blockchain.easy.model.Chain;
import com.sphereon.sdk.blockchain.easy.model.Context;
import com.sphereon.sdk.blockchain.easy.model.CommittedEntryResponse;
import com.sphereon.sdk.blockchain.easy.model.Entry;
import com.sphereon.sdk.blockchain.easy.model.AnchoredEntryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-09T13:08:27.372+02:00")
public class AllApi {
  private ApiClient apiClient;

  public AllApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AllApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Determine whether the Id of a chain exists in the blockchain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @return IdResponse
   * @throws ApiException if fails to make API call
   */
  public IdResponse chainIdExists(String context, String chainId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'context' is set
    if (context == null) {
      throw new ApiException(400, "Missing the required parameter 'context' when calling chainIdExists");
    }
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling chainIdExists");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/easy/0.9.1/{context}/chains/id/{chainId}".replaceAll("\\{format\\}","json")
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

    GenericType<IdResponse> localVarReturnType = new GenericType<IdResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a new chain
   * 
   * @param context context (required)
   * @param chain Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! (required)
   * @return CommittedChainResponse
   * @throws ApiException if fails to make API call
   */
  public CommittedChainResponse createChain(String context, Chain chain) throws ApiException {
    Object localVarPostBody = chain;
    
    // verify the required parameter 'context' is set
    if (context == null) {
      throw new ApiException(400, "Missing the required parameter 'context' when calling createChain");
    }
    
    // verify the required parameter 'chain' is set
    if (chain == null) {
      throw new ApiException(400, "Missing the required parameter 'chain' when calling createChain");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/easy/0.9.1/{context}/chains".replaceAll("\\{format\\}","json")
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
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<CommittedChainResponse> localVarReturnType = new GenericType<CommittedChainResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a new context
   * 
   * @param entity entity (required)
   * @return Context
   * @throws ApiException if fails to make API call
   */
  public Context createContext(Context entity) throws ApiException {
    Object localVarPostBody = entity;
    
    // verify the required parameter 'entity' is set
    if (entity == null) {
      throw new ApiException(400, "Missing the required parameter 'entity' when calling createContext");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/easy/0.9.1/".replaceAll("\\{format\\}","json");

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
   * Create a new entry in the provided chain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entry Create a new entry for the specified chain (required)
   * @return CommittedEntryResponse
   * @throws ApiException if fails to make API call
   */
  public CommittedEntryResponse createEntry(String context, String chainId, Entry entry) throws ApiException {
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
    String localVarPath = "/blockchain/easy/0.9.1/{context}/chains/{chainId}/entries".replaceAll("\\{format\\}","json")
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
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<CommittedEntryResponse> localVarReturnType = new GenericType<CommittedEntryResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Pre determine the Id of a chain request without anchoring it in the blockchain
   * 
   * @param context context (required)
   * @param chain Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! (required)
   * @param checkExistence Check whether the id exists (optional, default to false)
   * @return IdResponse
   * @throws ApiException if fails to make API call
   */
  public IdResponse determineChainId(String context, Chain chain, Boolean checkExistence) throws ApiException {
    Object localVarPostBody = chain;
    
    // verify the required parameter 'context' is set
    if (context == null) {
      throw new ApiException(400, "Missing the required parameter 'context' when calling determineChainId");
    }
    
    // verify the required parameter 'chain' is set
    if (chain == null) {
      throw new ApiException(400, "Missing the required parameter 'chain' when calling determineChainId");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/easy/0.9.1/{context}/chains/id".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "context" + "\\}", apiClient.escapeString(context.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkExistence", checkExistence));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<IdResponse> localVarReturnType = new GenericType<IdResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Pre determine the Id of an entry request without anchoring the entry
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entry The entry to determine the hash for on the specified chain (required)
   * @param checkExistence Check whether the id exists (optional, default to false)
   * @return IdResponse
   * @throws ApiException if fails to make API call
   */
  public IdResponse determineEntryId(String context, String chainId, Entry entry, Boolean checkExistence) throws ApiException {
    Object localVarPostBody = entry;
    
    // verify the required parameter 'context' is set
    if (context == null) {
      throw new ApiException(400, "Missing the required parameter 'context' when calling determineEntryId");
    }
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling determineEntryId");
    }
    
    // verify the required parameter 'entry' is set
    if (entry == null) {
      throw new ApiException(400, "Missing the required parameter 'entry' when calling determineEntryId");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/easy/0.9.1/{context}/chains/id/{chainId}/entries".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "context" + "\\}", apiClient.escapeString(context.toString()))
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkExistence", checkExistence));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<IdResponse> localVarReturnType = new GenericType<IdResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get an existing entry in the provided chain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entryId entryId (required)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse entryById(String context, String chainId, String entryId) throws ApiException {
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
    String localVarPath = "/blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "context" + "\\}", apiClient.escapeString(context.toString()))
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()))
      .replaceAll("\\{" + "entryId" + "\\}", apiClient.escapeString(entryId.toString()));

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
   * Get an existing entry in the provided chain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entry Retrieve the entry (required)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse entryByRequest(String context, String chainId, Entry entry) throws ApiException {
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
    String localVarPath = "/blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Determine whether the Id of an entry exists in the blockchain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entryId entryId (required)
   * @return IdResponse
   * @throws ApiException if fails to make API call
   */
  public IdResponse entryIdExists(String context, String chainId, String entryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'context' is set
    if (context == null) {
      throw new ApiException(400, "Missing the required parameter 'context' when calling entryIdExists");
    }
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling entryIdExists");
    }
    
    // verify the required parameter 'entryId' is set
    if (entryId == null) {
      throw new ApiException(400, "Missing the required parameter 'entryId' when calling entryIdExists");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/easy/0.9.1/{context}/chains/id/{chainId}/entries/{entryId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "context" + "\\}", apiClient.escapeString(context.toString()))
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()))
      .replaceAll("\\{" + "entryId" + "\\}", apiClient.escapeString(entryId.toString()));

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

    GenericType<IdResponse> localVarReturnType = new GenericType<IdResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the first entry in the provided chain. This is the oldest entry also called the chain tail
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
    String localVarPath = "/blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/first".replaceAll("\\{format\\}","json")
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
   * Create a new context
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
    String localVarPath = "/blockchain/easy/0.9.1/{context}".replaceAll("\\{format\\}","json")
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
   * Get the last entry in the provided chain. This is the most recent entry also called the chain head
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
    String localVarPath = "/blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/last".replaceAll("\\{format\\}","json")
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
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse nextEntryById(String context, String chainId, String entryId) throws ApiException {
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
    String localVarPath = "/blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId}/next".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "context" + "\\}", apiClient.escapeString(context.toString()))
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()))
      .replaceAll("\\{" + "entryId" + "\\}", apiClient.escapeString(entryId.toString()));

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
   * @param entry Retrieve the entry (required)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse nextEntryByRequest(String context, String chainId, Entry entry) throws ApiException {
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
    String localVarPath = "/blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry/next".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the entry before the supplied entry Id (the previous) in the provided chain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entryId entryId (required)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse previousEntryById(String context, String chainId, String entryId) throws ApiException {
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
    String localVarPath = "/blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId}/previous".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "context" + "\\}", apiClient.escapeString(context.toString()))
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()))
      .replaceAll("\\{" + "entryId" + "\\}", apiClient.escapeString(entryId.toString()));

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
   * Get the entry before the supplied entry Id (the previous) in the provided chain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entry Retrieve the entry (required)
   * @return AnchoredEntryResponse
   * @throws ApiException if fails to make API call
   */
  public AnchoredEntryResponse previousEntryByRequest(String context, String chainId, Entry entry) throws ApiException {
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
    String localVarPath = "/blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry/previous".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
