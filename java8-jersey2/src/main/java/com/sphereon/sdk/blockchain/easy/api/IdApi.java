package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.ApiException;
import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
import com.sphereon.sdk.blockchain.easy.handler.Configuration;
import com.sphereon.sdk.blockchain.easy.handler.Pair;

import javax.ws.rs.core.GenericType;

import com.sphereon.sdk.blockchain.easy.model.IdResponse;
import com.sphereon.sdk.blockchain.easy.model.VndErrors;
import com.sphereon.sdk.blockchain.easy.model.Chain;
import com.sphereon.sdk.blockchain.easy.model.Entry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-14T02:45:39.206+01:00")
public class IdApi {
  private ApiClient apiClient;

  public IdApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IdApi(ApiClient apiClient) {
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
   * @param chainId chainId (required)
   * @return IdResponse
   * @throws ApiException if fails to make API call
   */
  public IdResponse chainIdExists(String chainId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling chainIdExists");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/easy/0.1.0/chains/id/{chainId}".replaceAll("\\{format\\}","json")
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

    GenericType<IdResponse> localVarReturnType = new GenericType<IdResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Pre determine the Id of a chain request without anchoring it in the blockchain
   * 
   * @param chain Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! (required)
   * @param checkExistence Check whether the id exists (optional, default to false)
   * @return IdResponse
   * @throws ApiException if fails to make API call
   */
  public IdResponse determineChainId(Chain chain, Boolean checkExistence) throws ApiException {
    Object localVarPostBody = chain;
    
    // verify the required parameter 'chain' is set
    if (chain == null) {
      throw new ApiException(400, "Missing the required parameter 'chain' when calling determineChainId");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/easy/0.1.0/chains/id".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkExistence", checkExistence));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<IdResponse> localVarReturnType = new GenericType<IdResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Pre determine the Id of an entry request without anchoring the entry
   * 
   * @param chainId chainId (required)
   * @param entry The entry to determine the hash for on the specified chain (required)
   * @param checkExistence Check whether the id exists (optional, default to false)
   * @return IdResponse
   * @throws ApiException if fails to make API call
   */
  public IdResponse determineEntryId(String chainId, Entry entry, Boolean checkExistence) throws ApiException {
    Object localVarPostBody = entry;
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling determineEntryId");
    }
    
    // verify the required parameter 'entry' is set
    if (entry == null) {
      throw new ApiException(400, "Missing the required parameter 'entry' when calling determineEntryId");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/easy/0.1.0/chains/id/{chainId}/entries".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkExistence", checkExistence));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<IdResponse> localVarReturnType = new GenericType<IdResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Determine whether the Id of an entry exists in the blockchain
   * 
   * @param chainId chainId (required)
   * @param entryId entryId (required)
   * @return IdResponse
   * @throws ApiException if fails to make API call
   */
  public IdResponse entryIdExists(String chainId, String entryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'chainId' is set
    if (chainId == null) {
      throw new ApiException(400, "Missing the required parameter 'chainId' when calling entryIdExists");
    }
    
    // verify the required parameter 'entryId' is set
    if (entryId == null) {
      throw new ApiException(400, "Missing the required parameter 'entryId' when calling entryIdExists");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/easy/0.1.0/chains/id/{chainId}/entries/{entryId}".replaceAll("\\{format\\}","json")
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

    GenericType<IdResponse> localVarReturnType = new GenericType<IdResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
