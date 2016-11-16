package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sphereon.sdk.blockchain.easy.model.CommittedChainResponse;
import com.sphereon.sdk.blockchain.easy.model.Chain;
import com.sphereon.sdk.blockchain.easy.model.VndErrors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ChainApi {
  /**
   * Create a new chain
   * 
   * @param chain Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! (required)
   * @return Call&lt;CommittedChainResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @POST("blockchain/easy/0.1.0/chains")
  Call<CommittedChainResponse> createChain(
    @retrofit2.http.Body Chain chain
  );

}
