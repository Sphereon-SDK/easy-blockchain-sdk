package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sphereon.sdk.blockchain.easy.model.IdResponse;
import com.sphereon.sdk.blockchain.easy.model.ErrorResponse;
import com.sphereon.sdk.blockchain.easy.model.Backend;
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

public interface AllApi {
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
  @GET("blockchain/easy/0.9.1/{context}/chains/id/{chainId}")
  Call<IdResponse> chainIdExists(
    @retrofit2.http.Path("context") String context, @retrofit2.http.Path("chainId") String chainId
  );

  /**
   * Create a new backend
   * 
   * @param backend backend (required)
   * @return Call&lt;Backend&gt;
   */
  
  @Headers({
  	"Content-Type:application/json;charset&#x3D;UTF-8" 
  })
  @POST("blockchain/easy/0.9.1/backends")
  Call<Backend> createBackend(
    @retrofit2.http.Body Backend backend
  );

  /**
   * Create a new chain
   * 
   * @param context context (required)
   * @param chain Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! (required)
   * @return Call&lt;CommittedChainResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json;charset&#x3D;UTF-8" 
  })
  @POST("blockchain/easy/0.9.1/{context}/chains")
  Call<CommittedChainResponse> createChain(
    @retrofit2.http.Path("context") String context, @retrofit2.http.Body Chain chain
  );

  /**
   * Create a new context
   * 
   * @param context context (required)
   * @return Call&lt;Context&gt;
   */
  
  @Headers({
  	"Content-Type:application/json;charset&#x3D;UTF-8" 
  })
  @POST("blockchain/easy/0.9.1/")
  Call<Context> createContext(
    @retrofit2.http.Body Context context
  );

  /**
   * Create a new entry in the provided chain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entry Create a new entry for the specified chain (required)
   * @return Call&lt;CommittedEntryResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json;charset&#x3D;UTF-8" 
  })
  @POST("blockchain/easy/0.9.1/{context}/chains/{chainId}/entries")
  Call<CommittedEntryResponse> createEntry(
    @retrofit2.http.Path("context") String context, @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Body Entry entry
  );

  /**
   * Delete backend by id (not by ledgername)
   * 
   * @param backendId backendId (required)
   * @return Call&lt;Void&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @DELETE("blockchain/easy/0.9.1/backends/{backendId}")
  Call<Void> deleteBackend(
    @retrofit2.http.Path("backendId") String backendId
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
  @POST("blockchain/easy/0.9.1/{context}/chains/id")
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
  @POST("blockchain/easy/0.9.1/{context}/chains/id/{chainId}/entries")
  Call<IdResponse> determineEntryId(
    @retrofit2.http.Path("context") String context, @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Body Entry entry, @retrofit2.http.Query("checkExistence") Boolean checkExistence
  );

  /**
   * Get an existing entry in the provided chain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entryId entryId (required)
   * @return Call&lt;AnchoredEntryResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @GET("blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId}")
  Call<AnchoredEntryResponse> entryById(
    @retrofit2.http.Path("context") String context, @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Path("entryId") String entryId
  );

  /**
   * Get an existing entry in the provided chain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entry Retrieve the entry (required)
   * @return Call&lt;AnchoredEntryResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @POST("blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry")
  Call<AnchoredEntryResponse> entryByRequest(
    @retrofit2.http.Path("context") String context, @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Body Entry entry
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
  @GET("blockchain/easy/0.9.1/{context}/chains/id/{chainId}/entries/{entryId}")
  Call<IdResponse> entryIdExists(
    @retrofit2.http.Path("context") String context, @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Path("entryId") String entryId
  );

  /**
   * Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others
   * 
   * @param backendId backendId (required)
   * @param includePublic includePublic (optional, default to false)
   * @return Call&lt;List<Backend>&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @GET("blockchain/easy/0.9.1/backends/{backendId}/find")
  Call<List<Backend>> findBackends(
    @retrofit2.http.Path("backendId") String backendId, @retrofit2.http.Query("includePublic") Boolean includePublic
  );

  /**
   * Get the first entry in the provided chain. This is the oldest entry also called the chain tail
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @return Call&lt;AnchoredEntryResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @GET("blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/first")
  Call<AnchoredEntryResponse> firstEntry(
    @retrofit2.http.Path("context") String context, @retrofit2.http.Path("chainId") String chainId
  );

  /**
   * Get existing backend by id (not by ledgername). Optionally including public backend of others
   * 
   * @param backendId backendId (required)
   * @param includePublic includePublic (optional, default to false)
   * @return Call&lt;Backend&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @GET("blockchain/easy/0.9.1/backends/{backendId}")
  Call<Backend> getBackend(
    @retrofit2.http.Path("backendId") String backendId, @retrofit2.http.Query("includePublic") Boolean includePublic
  );

  /**
   * Get an existing context
   * 
   * @param context context (required)
   * @return Call&lt;Context&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @GET("blockchain/easy/0.9.1/{context}")
  Call<Context> getContext(
    @retrofit2.http.Path("context") String context
  );

  /**
   * Get the last entry in the provided chain. This is the most recent entry also called the chain head
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @return Call&lt;AnchoredEntryResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @GET("blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/last")
  Call<AnchoredEntryResponse> lastEntry(
    @retrofit2.http.Path("context") String context, @retrofit2.http.Path("chainId") String chainId
  );

  /**
   * List existing backends.
   * 
   * @return Call&lt;List<Backend>&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @GET("blockchain/easy/0.9.1/backends")
  Call<List<Backend>> listBackends();
    

  /**
   * Get the entry after the supplied entry Id (the next) in the provided chain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entryId entryId (required)
   * @return Call&lt;AnchoredEntryResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @GET("blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId}/next")
  Call<AnchoredEntryResponse> nextEntryById(
    @retrofit2.http.Path("context") String context, @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Path("entryId") String entryId
  );

  /**
   * Get the entry after the supplied entry Id (the next) in the provided chain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entry Retrieve the entry (required)
   * @return Call&lt;AnchoredEntryResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @POST("blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry/next")
  Call<AnchoredEntryResponse> nextEntryByRequest(
    @retrofit2.http.Path("context") String context, @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Body Entry entry
  );

  /**
   * Get the entry before the supplied entry Id (the previous) in the provided chain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entryId entryId (required)
   * @return Call&lt;AnchoredEntryResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @GET("blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId}/previous")
  Call<AnchoredEntryResponse> previousEntryById(
    @retrofit2.http.Path("context") String context, @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Path("entryId") String entryId
  );

  /**
   * Get the entry before the supplied entry Id (the previous) in the provided chain
   * 
   * @param context context (required)
   * @param chainId chainId (required)
   * @param entry Retrieve the entry (required)
   * @return Call&lt;AnchoredEntryResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @POST("blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry/previous")
  Call<AnchoredEntryResponse> previousEntryByRequest(
    @retrofit2.http.Path("context") String context, @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Body Entry entry
  );

}
