package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sphereon.sdk.blockchain.easy.model.CommittedEntryResponse;
import com.sphereon.sdk.blockchain.easy.model.Entry;
import com.sphereon.sdk.blockchain.easy.model.VndErrors;
import com.sphereon.sdk.blockchain.easy.model.AnchoredEntryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EntryApi {
  /**
   * Create a new entry in the provided chain
   * 
   * @param chainId chainId (required)
   * @param entry Create a new entry for the specified chain (required)
   * @return Call&lt;CommittedEntryResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @POST("blockchain/easy/0.1.0/chains/{chainId}/entries")
  Call<CommittedEntryResponse> createEntry(
    @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Body Entry entry
  );

  /**
   * Get an existing entry in the provided chain
   * 
   * @param chainId chainId (required)
   * @param entryId entryId (required)
   * @return Call&lt;AnchoredEntryResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @GET("blockchain/easy/0.1.0/chains/{chainId}/entries/{entryId}")
  Call<AnchoredEntryResponse> entryById(
    @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Path("entryId") String entryId
  );

  /**
   * Get an existing entry in the provided chain
   * 
   * @param chainId chainId (required)
   * @param entry Retrieve the entry (required)
   * @return Call&lt;AnchoredEntryResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @POST("blockchain/easy/0.1.0/chains/{chainId}/entries/entry")
  Call<AnchoredEntryResponse> entryByRequest(
    @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Body Entry entry
  );

  /**
   * Get the first entry in the provided chain. This is the oldest entry also called the chain tail
   * 
   * @param chainId chainId (required)
   * @return Call&lt;AnchoredEntryResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @GET("blockchain/easy/0.1.0/chains/{chainId}/entries/first")
  Call<AnchoredEntryResponse> firstEntry(
    @retrofit2.http.Path("chainId") String chainId
  );

  /**
   * Get the last entry in the provided chain. This is the most recent entry also called the chain head
   * 
   * @param chainId chainId (required)
   * @return Call&lt;AnchoredEntryResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @GET("blockchain/easy/0.1.0/chains/{chainId}/entries/last")
  Call<AnchoredEntryResponse> lastEntry(
    @retrofit2.http.Path("chainId") String chainId
  );

  /**
   * Get the entry after the supplied entry Id (the next) in the provided chain
   * 
   * @param chainId chainId (required)
   * @param entryId entryId (required)
   * @return Call&lt;AnchoredEntryResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @GET("blockchain/easy/0.1.0/chains/{chainId}/entries/{entryId}/next")
  Call<AnchoredEntryResponse> nextEntryById(
    @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Path("entryId") String entryId
  );

  /**
   * Get the entry after the supplied entry Id (the next) in the provided chain
   * 
   * @param chainId chainId (required)
   * @param entry Retrieve the entry (required)
   * @return Call&lt;AnchoredEntryResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @POST("blockchain/easy/0.1.0/chains/{chainId}/entries/entry/next")
  Call<AnchoredEntryResponse> nextEntryByRequest(
    @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Body Entry entry
  );

  /**
   * Get the entry before the supplied entry Id (the previous) in the provided chain
   * 
   * @param chainId chainId (required)
   * @param entryId entryId (required)
   * @return Call&lt;AnchoredEntryResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @GET("blockchain/easy/0.1.0/chains/{chainId}/entries/{entryId}/previous")
  Call<AnchoredEntryResponse> previousEntryById(
    @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Path("entryId") String entryId
  );

  /**
   * Get the entry before the supplied entry Id (the previous) in the provided chain
   * 
   * @param chainId chainId (required)
   * @param entry Retrieve the entry (required)
   * @return Call&lt;AnchoredEntryResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @POST("blockchain/easy/0.1.0/chains/{chainId}/entries/entry/previous")
  Call<AnchoredEntryResponse> previousEntryByRequest(
    @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Body Entry entry
  );

}
