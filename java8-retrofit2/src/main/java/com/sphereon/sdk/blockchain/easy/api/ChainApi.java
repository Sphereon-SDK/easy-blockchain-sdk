package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sphereon.sdk.blockchain.easy.model.CommittedChainResponse;
import com.sphereon.sdk.blockchain.easy.model.Chain;
import com.sphereon.sdk.blockchain.easy.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ChainApi {
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
  @POST("blockchain/easy/0.9/{context}/chains")
  Call<CommittedChainResponse> createChain(
    @retrofit2.http.Path("context") String context, @retrofit2.http.Body Chain chain
  );

}
