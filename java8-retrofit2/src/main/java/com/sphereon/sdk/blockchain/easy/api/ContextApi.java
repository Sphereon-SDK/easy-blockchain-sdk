package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sphereon.sdk.blockchain.easy.model.Backend;
import com.sphereon.sdk.blockchain.easy.model.Context;
import com.sphereon.sdk.blockchain.easy.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ContextApi {
  /**
   * Create a new backend
   * 
   * @param backend backend (required)
   * @return Call&lt;Backend&gt;
   */
  @Headers({
    "Content-Type:application/json;charset&#x3D;UTF-8"
  })
  @POST("backends")
  Call<Backend> createBackend(
    @retrofit2.http.Body Backend backend
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
  @POST("")
  Call<Context> createContext(
    @retrofit2.http.Body Context context
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
  @DELETE("backends/{backendId}")
  Call<Void> deleteBackend(
    @retrofit2.http.Path("backendId") String backendId
  );

  /**
   * Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others
   * 
   * @param backendId backendId (required)
   * @param includePublic includePublic (optional, default to false)
   * @return Call&lt;List&lt;Backend&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("backends/{backendId}/find")
  Call<List<Backend>> findBackends(
    @retrofit2.http.Path("backendId") String backendId, @retrofit2.http.Query("includePublic") Boolean includePublic
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
  @GET("backends/{backendId}")
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
  @GET("{context}")
  Call<Context> getContext(
    @retrofit2.http.Path("context") String context
  );

  /**
   * List existing backends.
   * 
   * @return Call&lt;List&lt;Backend&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("backends")
  Call<List<Backend>> listBackends();
    

}
