# ContextApi

All URIs are relative to *https://gw.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBackend**](ContextApi.md#createBackend) | **POST** blockchain/easy/0.9/backends | Create a new backend
[**createContext**](ContextApi.md#createContext) | **POST** blockchain/easy/0.9/ | Create a new context
[**deleteBackend**](ContextApi.md#deleteBackend) | **DELETE** blockchain/easy/0.9/backends/{backendId} | Delete backend by id (not by ledgername)
[**findBackends**](ContextApi.md#findBackends) | **GET** blockchain/easy/0.9/backends/{backendId}/find | Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others
[**getBackend**](ContextApi.md#getBackend) | **GET** blockchain/easy/0.9/backends/{backendId} | Get existing backend by id (not by ledgername). Optionally including public backend of others
[**getContext**](ContextApi.md#getContext) | **GET** blockchain/easy/0.9/{context} | Get an existing context
[**listBackends**](ContextApi.md#listBackends) | **GET** blockchain/easy/0.9/backends | List existing backends.


<a name="createBackend"></a>
# **createBackend**
> Backend createBackend(backend)

Create a new backend

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
Backend backend = new Backend(); // Backend | backend
try {
    Backend result = apiInstance.createBackend(backend);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContextApi#createBackend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backend** | [**Backend**](Backend.md)| backend |

### Return type

[**Backend**](Backend.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="createContext"></a>
# **createContext**
> Context createContext(context)

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
Context context = new Context(); // Context | context
try {
    Context result = apiInstance.createContext(context);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContextApi#createContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | [**Context**](Context.md)| context |

### Return type

[**Context**](Context.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="deleteBackend"></a>
# **deleteBackend**
> Void deleteBackend(backendId)

Delete backend by id (not by ledgername)

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
String backendId = "backendId_example"; // String | backendId
try {
    Void result = apiInstance.deleteBackend(backendId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContextApi#deleteBackend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **String**| backendId |

### Return type

[**Void**](.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="findBackends"></a>
# **findBackends**
> List&lt;Backend&gt; findBackends(backendId, includePublic)

Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others

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
String backendId = "backendId_example"; // String | backendId
Boolean includePublic = false; // Boolean | includePublic
try {
    List<Backend> result = apiInstance.findBackends(backendId, includePublic);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContextApi#findBackends");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **String**| backendId |
 **includePublic** | **Boolean**| includePublic | [optional] [default to false]

### Return type

[**List&lt;Backend&gt;**](Backend.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getBackend"></a>
# **getBackend**
> Backend getBackend(backendId, includePublic)

Get existing backend by id (not by ledgername). Optionally including public backend of others

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
String backendId = "backendId_example"; // String | backendId
Boolean includePublic = false; // Boolean | includePublic
try {
    Backend result = apiInstance.getBackend(backendId, includePublic);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContextApi#getBackend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **String**| backendId |
 **includePublic** | **Boolean**| includePublic | [optional] [default to false]

### Return type

[**Backend**](Backend.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getContext"></a>
# **getContext**
> Context getContext(context)

Get an existing context

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

<a name="listBackends"></a>
# **listBackends**
> List&lt;Backend&gt; listBackends()

List existing backends.

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
try {
    List<Backend> result = apiInstance.listBackends();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContextApi#listBackends");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Backend&gt;**](Backend.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

