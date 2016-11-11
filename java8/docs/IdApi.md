# IdApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**determineChainId**](IdApi.md#determineChainId) | **POST** /blockchain/easy/0.1.0/chains/id | Pre determine the Id of a chain request without anchoring it in the blockchain
[**determineEntryId**](IdApi.md#determineEntryId) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries/id | Pre determine the Id of an entry request without anchoring the entry


<a name="determineChainId"></a>
# **determineChainId**
> IdResponse determineChainId(chain)

Pre determine the Id of a chain request without anchoring it in the blockchain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.api.IdApi;


IdApi apiInstance = new IdApi();
Chain chain = new Chain(); // Chain | Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!
try {
    IdResponse result = apiInstance.determineChainId(chain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdApi#determineChainId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | [**Chain**](Chain.md)| Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! |

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="determineEntryId"></a>
# **determineEntryId**
> IdResponse determineEntryId(chainId, entry)

Pre determine the Id of an entry request without anchoring the entry

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.api.IdApi;


IdApi apiInstance = new IdApi();
String chainId = "chainId_example"; // String | chainId
Entry entry = new Entry(); // Entry | The entry to determine the hash for on the specified chain
try {
    IdResponse result = apiInstance.determineEntryId(chainId, entry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdApi#determineEntryId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| chainId |
 **entry** | [**Entry**](Entry.md)| The entry to determine the hash for on the specified chain |

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

