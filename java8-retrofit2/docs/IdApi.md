# IdApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/easy/0.9*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chainIdExists**](IdApi.md#chainIdExists) | **GET** {context}/chains/id/{chainId} | Determine whether the Id of a chain exists in the blockchain
[**determineChainId**](IdApi.md#determineChainId) | **POST** {context}/chains/id | Pre determine the Id of a chain request without anchoring it in the blockchain
[**determineEntryId**](IdApi.md#determineEntryId) | **POST** {context}/chains/id/{chainId}/entries | Pre determine the Id of an entry request without anchoring the entry
[**entryIdExists**](IdApi.md#entryIdExists) | **GET** {context}/chains/id/{chainId}/entries/{entryId} | Determine whether the Id of an entry exists in the blockchain


<a name="chainIdExists"></a>
# **chainIdExists**
> IdResponse chainIdExists(context, chainId)

Determine whether the Id of a chain exists in the blockchain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.IdApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

IdApi apiInstance = new IdApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
try {
    IdResponse result = apiInstance.chainIdExists(context, chainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdApi#chainIdExists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context |
 **chainId** | **String**| chainId |

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="determineChainId"></a>
# **determineChainId**
> IdResponse determineChainId(context, chain, checkExistence)

Pre determine the Id of a chain request without anchoring it in the blockchain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.IdApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

IdApi apiInstance = new IdApi();
String context = "context_example"; // String | context
Chain chain = new Chain(); // Chain | Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!
Boolean checkExistence = false; // Boolean | Check whether the id exists
try {
    IdResponse result = apiInstance.determineChainId(context, chain, checkExistence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdApi#determineChainId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context |
 **chain** | [**Chain**](Chain.md)| Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! |
 **checkExistence** | **Boolean**| Check whether the id exists | [optional] [default to false]

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="determineEntryId"></a>
# **determineEntryId**
> IdResponse determineEntryId(context, chainId, entry, checkExistence)

Pre determine the Id of an entry request without anchoring the entry

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.IdApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

IdApi apiInstance = new IdApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
Entry entry = new Entry(); // Entry | The entry to determine the hash for on the specified chain
Boolean checkExistence = false; // Boolean | Check whether the id exists
try {
    IdResponse result = apiInstance.determineEntryId(context, chainId, entry, checkExistence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdApi#determineEntryId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context |
 **chainId** | **String**| chainId |
 **entry** | [**Entry**](Entry.md)| The entry to determine the hash for on the specified chain |
 **checkExistence** | **Boolean**| Check whether the id exists | [optional] [default to false]

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="entryIdExists"></a>
# **entryIdExists**
> IdResponse entryIdExists(context, chainId, entryId)

Determine whether the Id of an entry exists in the blockchain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.IdApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

IdApi apiInstance = new IdApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
String entryId = "entryId_example"; // String | entryId
try {
    IdResponse result = apiInstance.entryIdExists(context, chainId, entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdApi#entryIdExists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context |
 **chainId** | **String**| chainId |
 **entryId** | **String**| entryId |

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

