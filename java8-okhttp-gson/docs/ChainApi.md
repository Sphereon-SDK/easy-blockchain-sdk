# ChainApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChain**](ChainApi.md#createChain) | **POST** /blockchain/easy/0.9/{context}/chains | Create a new chain


<a name="createChain"></a>
# **createChain**
> CommittedChainResponse createChain(context, chain)

Create a new chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.ChainApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ChainApi apiInstance = new ChainApi();
String context = "context_example"; // String | context
Chain chain = new Chain(); // Chain | Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!
try {
    CommittedChainResponse result = apiInstance.createChain(context, chain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainApi#createChain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context |
 **chain** | [**Chain**](Chain.md)| Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! |

### Return type

[**CommittedChainResponse**](CommittedChainResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

