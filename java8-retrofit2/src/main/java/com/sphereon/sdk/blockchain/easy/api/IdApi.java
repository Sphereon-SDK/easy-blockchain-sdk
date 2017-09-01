package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sphereon.sdk.blockchain.easy.model.IdResponse;
import com.sphereon.sdk.blockchain.easy.model.ErrorResponse;
import com.sphereon.sdk.blockchain.easy.model.Chain;
import com.sphereon.sdk.blockchain.easy.model.Entry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IdApi {
  /**
   * Determine whether the Id of a chain exists in the blockchain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @return Call&lt;IdResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @GET("blockchain/easy/0.9/{context}/chains/id/{chainId}")
  Call<IdResponse> chainIdExists(
    @retrofit2.http.Path("context") String context, @retrofit2.http.Path("chainId") String chainId
  );

  /**
   * Pre determine the Id of a chain request without anchoring it in the blockchain
   * 
   * @param context context (required)
   * @param chain Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! (required)
   * @param checkExistence Check whether the id exists (optional, default to false)
   * @return Call&lt;IdResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json;charset&#x3D;UTF-8" 
  })
  @POST("blockchain/easy/0.9/{context}/chains/id")
  Call<IdResponse> determineChainId(
    @retrofit2.http.Path("context") String context, @retrofit2.http.Body Chain chain, @retrofit2.http.Query("checkExistence") Boolean checkExistence
  );

  /**
   * Pre determine the Id of an entry request without anchoring the entry
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entry The entry to determine the hash for on the specified chain (required)
   * @param checkExistence Check whether the id exists (optional, default to false)
   * @return Call&lt;IdResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json;charset&#x3D;UTF-8" 
  })
  @POST("blockchain/easy/0.9/{context}/chains/id/{chainId}/entries")
  Call<IdResponse> determineEntryId(
    @retrofit2.http.Path("context") String context, @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Body Entry entry, @retrofit2.http.Query("checkExistence") Boolean checkExistence
  );

  /**
   * Determine whether the Id of an entry exists in the blockchain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entryId entryId (required)
   * @return Call&lt;IdResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @GET("blockchain/easy/0.9/{context}/chains/id/{chainId}/entries/{entryId}")
  Call<IdResponse> entryIdExists(
    @retrofit2.http.Path("context") String context, @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Path("entryId") String entryId
  );

}
