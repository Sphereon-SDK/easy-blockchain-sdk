# ChainApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChainUsingPOST**](ChainApi.md#createChainUsingPOST) | **POST** /blockchain/easy/0.1.0/chains | Create a new chain
[**determineChainId**](ChainApi.md#determineChainId) | **POST** /blockchain/easy/0.1.0/chains/id | Pre determine the Id of a chain request without anchoring it in the blockchain


<a name="createChainUsingPOST"></a>
# **createChainUsingPOST**
> CommittedChainResponse createChainUsingPOST(chain)

Create a new chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.api.ChainApi;


ChainApi apiInstance = new ChainApi();
Chain chain = new Chain(); // Chain | Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!
try {
    CommittedChainResponse result = apiInstance.createChainUsingPOST(chain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainApi#createChainUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | [**Chain**](Chain.md)| Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! |

### Return type

[**CommittedChainResponse**](CommittedChainResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="determineChainId"></a>
# **determineChainId**
> IdResponse determineChainId(chain)

Pre determine the Id of a chain request without anchoring it in the blockchain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.api.ChainApi;


ChainApi apiInstance = new ChainApi();
Chain chain = new Chain(); // Chain | Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!
try {
    IdResponse result = apiInstance.determineChainId(chain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainApi#determineChainId");
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

