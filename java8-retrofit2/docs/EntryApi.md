# EntryApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEntry**](EntryApi.md#createEntry) | **POST** blockchain/easy/0.9.1/{context}/chains/{chainId}/entries | Create a new entry in the provided chain
[**entryById**](EntryApi.md#entryById) | **GET** blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
[**entryByRequest**](EntryApi.md#entryByRequest) | **POST** blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry | Get an existing entry in the provided chain
[**firstEntry**](EntryApi.md#firstEntry) | **GET** blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/first | Get the first entry in the provided chain. This is the oldest entry also called the chain tail
[**lastEntry**](EntryApi.md#lastEntry) | **GET** blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/last | Get the last entry in the provided chain. This is the most recent entry also called the chain head
[**nextEntryById**](EntryApi.md#nextEntryById) | **GET** blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId}/next | Get the entry after the supplied entry Id (the next) in the provided chain
[**nextEntryByRequest**](EntryApi.md#nextEntryByRequest) | **POST** blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry/next | Get the entry after the supplied entry Id (the next) in the provided chain
[**previousEntryById**](EntryApi.md#previousEntryById) | **GET** blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId}/previous | Get the entry before the supplied entry Id (the previous) in the provided chain
[**previousEntryByRequest**](EntryApi.md#previousEntryByRequest) | **POST** blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry/previous | Get the entry before the supplied entry Id (the previous) in the provided chain


<a name="createEntry"></a>
# **createEntry**
> CommittedEntryResponse createEntry(context, chainId, entry)

Create a new entry in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.EntryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

EntryApi apiInstance = new EntryApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
Entry entry = new Entry(); // Entry | Create a new entry for the specified chain
try {
    CommittedEntryResponse result = apiInstance.createEntry(context, chainId, entry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#createEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context |
 **chainId** | **String**| chainId |
 **entry** | [**Entry**](Entry.md)| Create a new entry for the specified chain |

### Return type

[**CommittedEntryResponse**](CommittedEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="entryById"></a>
# **entryById**
> AnchoredEntryResponse entryById(context, chainId, entryId)

Get an existing entry in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.EntryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

EntryApi apiInstance = new EntryApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
String entryId = "entryId_example"; // String | entryId
try {
    AnchoredEntryResponse result = apiInstance.entryById(context, chainId, entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#entryById");
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

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="entryByRequest"></a>
# **entryByRequest**
> AnchoredEntryResponse entryByRequest(context, chainId, entry)

Get an existing entry in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.EntryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

EntryApi apiInstance = new EntryApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
Entry entry = new Entry(); // Entry | Retrieve the entry
try {
    AnchoredEntryResponse result = apiInstance.entryByRequest(context, chainId, entry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#entryByRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context |
 **chainId** | **String**| chainId |
 **entry** | [**Entry**](Entry.md)| Retrieve the entry |

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="firstEntry"></a>
# **firstEntry**
> AnchoredEntryResponse firstEntry(context, chainId)

Get the first entry in the provided chain. This is the oldest entry also called the chain tail

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.EntryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

EntryApi apiInstance = new EntryApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
try {
    AnchoredEntryResponse result = apiInstance.firstEntry(context, chainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#firstEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context |
 **chainId** | **String**| chainId |

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="lastEntry"></a>
# **lastEntry**
> AnchoredEntryResponse lastEntry(context, chainId)

Get the last entry in the provided chain. This is the most recent entry also called the chain head

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.EntryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

EntryApi apiInstance = new EntryApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
try {
    AnchoredEntryResponse result = apiInstance.lastEntry(context, chainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#lastEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context |
 **chainId** | **String**| chainId |

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="nextEntryById"></a>
# **nextEntryById**
> AnchoredEntryResponse nextEntryById(context, chainId, entryId)

Get the entry after the supplied entry Id (the next) in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.EntryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

EntryApi apiInstance = new EntryApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
String entryId = "entryId_example"; // String | entryId
try {
    AnchoredEntryResponse result = apiInstance.nextEntryById(context, chainId, entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#nextEntryById");
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

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="nextEntryByRequest"></a>
# **nextEntryByRequest**
> AnchoredEntryResponse nextEntryByRequest(context, chainId, entry)

Get the entry after the supplied entry Id (the next) in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.EntryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

EntryApi apiInstance = new EntryApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
Entry entry = new Entry(); // Entry | Retrieve the entry
try {
    AnchoredEntryResponse result = apiInstance.nextEntryByRequest(context, chainId, entry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#nextEntryByRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context |
 **chainId** | **String**| chainId |
 **entry** | [**Entry**](Entry.md)| Retrieve the entry |

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="previousEntryById"></a>
# **previousEntryById**
> AnchoredEntryResponse previousEntryById(context, chainId, entryId)

Get the entry before the supplied entry Id (the previous) in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.EntryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

EntryApi apiInstance = new EntryApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
String entryId = "entryId_example"; // String | entryId
try {
    AnchoredEntryResponse result = apiInstance.previousEntryById(context, chainId, entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#previousEntryById");
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

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="previousEntryByRequest"></a>
# **previousEntryByRequest**
> AnchoredEntryResponse previousEntryByRequest(context, chainId, entry)

Get the entry before the supplied entry Id (the previous) in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.EntryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

EntryApi apiInstance = new EntryApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
Entry entry = new Entry(); // Entry | Retrieve the entry
try {
    AnchoredEntryResponse result = apiInstance.previousEntryByRequest(context, chainId, entry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#previousEntryByRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context |
 **chainId** | **String**| chainId |
 **entry** | [**Entry**](Entry.md)| Retrieve the entry |

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

