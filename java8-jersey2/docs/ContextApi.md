# ContextApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createContext**](ContextApi.md#createContext) | **POST** /blockchain/easy/0.9.1/ | Create a new context
[**getContext**](ContextApi.md#getContext) | **GET** /blockchain/easy/0.9.1/{context} | Create a new context


<a name="createContext"></a>
# **createContext**
> Context createContext(entity)

Create a new context

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.ContextApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ContextApi apiInstance = new ContextApi();
Context entity = new Context(); // Context | entity
try {
    Context result = apiInstance.createContext(entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContextApi#createContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | [**Context**](Context.md)| entity |

### Return type

[**Context**](Context.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="getContext"></a>
# **getContext**
> Context getContext(context)

Create a new context

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.ContextApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ContextApi apiInstance = new ContextApi();
String context = "context_example"; // String | context
try {
    Context result = apiInstance.getContext(context);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContextApi#getContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context |

### Return type

[**Context**](Context.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

