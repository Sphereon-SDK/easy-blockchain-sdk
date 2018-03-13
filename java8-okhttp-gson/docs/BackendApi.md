# BackendApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/easy/0.10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBackend**](BackendApi.md#createBackend) | **POST** /backends | Create a new backend
[**deleteBackend**](BackendApi.md#deleteBackend) | **DELETE** /backends/{backendId} | Delete a backend
[**findBackends**](BackendApi.md#findBackends) | **GET** /backends/{backendId}/find | Find backends
[**getBackend**](BackendApi.md#getBackend) | **GET** /backends/{backendId} | Get backend by id
[**listBackends**](BackendApi.md#listBackends) | **GET** /backends | List backends


<a name="createBackend"></a>
# **createBackend**
> Backend createBackend(backend)

Create a new backend

Create a new backend. A Backend is the link to one blockchain implementation and it&#39; s nodes. Unless you create your own private blockchain network, you should not have to create a new backend. Just use one of the public backends available.

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.BackendApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

BackendApi apiInstance = new BackendApi();
Backend backend = new Backend(); // Backend | backend
try {
    Backend result = apiInstance.createBackend(backend);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BackendApi#createBackend");
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

<a name="deleteBackend"></a>
# **deleteBackend**
> Backend deleteBackend(backendId)

Delete a backend

Delete backend by id (not by name)

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.BackendApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

BackendApi apiInstance = new BackendApi();
String backendId = "backendId_example"; // String | backendId
try {
    Backend result = apiInstance.deleteBackend(backendId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BackendApi#deleteBackend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **String**| backendId |

### Return type

[**Backend**](Backend.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="findBackends"></a>
# **findBackends**
> List&lt;Backend&gt; findBackends(backendId, includePublic)

Find backends

Find existing backend(s) by id (single result) and/or name (multiple results). Optionally including public backends of others. Please note that we never return sensitive information like password or rpc hosts. Even not for backend owners themselves

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.BackendApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

BackendApi apiInstance = new BackendApi();
String backendId = "backendId_example"; // String | backendId
Boolean includePublic = false; // Boolean | includePublic
try {
    List<Backend> result = apiInstance.findBackends(backendId, includePublic);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BackendApi#findBackends");
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

Get backend by id

Get existing backend by id (not by name). Optionally including public backend of others. Please note that we never return sensitive information like password or rpc hosts. Even not for backend owners themselves

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.BackendApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

BackendApi apiInstance = new BackendApi();
String backendId = "backendId_example"; // String | backendId
Boolean includePublic = false; // Boolean | includePublic
try {
    Backend result = apiInstance.getBackend(backendId, includePublic);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BackendApi#getBackend");
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

<a name="listBackends"></a>
# **listBackends**
> List&lt;Backend&gt; listBackends(includePublic)

List backends

List existing backends. Optionally including public backends of others.  Please note that we never return sensitive information like password or rpc hosts. Even not for backend owners themselves

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.BackendApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

BackendApi apiInstance = new BackendApi();
Boolean includePublic = false; // Boolean | includePublic
try {
    List<Backend> result = apiInstance.listBackends(includePublic);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BackendApi#listBackends");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includePublic** | **Boolean**| includePublic | [optional] [default to false]

### Return type

[**List&lt;Backend&gt;**](Backend.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

