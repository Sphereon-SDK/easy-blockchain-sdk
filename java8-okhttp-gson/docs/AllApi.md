# AllApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/easy/0.10/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chainIdExists**](AllApi.md#chainIdExists) | **GET** /{context}/chains/id/{chainId} | Determine chain id exists
[**createBackend**](AllApi.md#createBackend) | **POST** /backends | Create a new backend
[**createChain**](AllApi.md#createChain) | **POST** /{context}/chains | Create a new chain
[**createContext**](AllApi.md#createContext) | **POST** / | Create context
[**createEntry**](AllApi.md#createEntry) | **POST** /{context}/chains/{chainId}/entries | Create a new entry in the provided chain
[**deleteBackend**](AllApi.md#deleteBackend) | **DELETE** /backends/{backendId} | Delete a backend
[**deleteContext**](AllApi.md#deleteContext) | **DELETE** /{context} | Delete context
[**determineChainId**](AllApi.md#determineChainId) | **POST** /{context}/chains/id | Predetermine id of chain
[**determineEntryId**](AllApi.md#determineEntryId) | **POST** /{context}/chains/id/{chainId}/entries | Predetermine id of an entry
[**entryById**](AllApi.md#entryById) | **GET** /{context}/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
[**entryByRequest**](AllApi.md#entryByRequest) | **POST** /{context}/chains/{chainId}/entries/entry | Get an existing entry in the provided chain
[**entryIdExists**](AllApi.md#entryIdExists) | **GET** /{context}/chains/id/{chainId}/entries/{entryId} | Determine entry id exists
[**findBackends**](AllApi.md#findBackends) | **GET** /backends/{backendId}/find | Find backends
[**firstEntry**](AllApi.md#firstEntry) | **GET** /{context}/chains/{chainId}/entries/first | Get the first entry in the provided chain
[**getBackend**](AllApi.md#getBackend) | **GET** /backends/{backendId} | Get backend
[**getContext**](AllApi.md#getContext) | **GET** /{context} | Get context
[**lastEntry**](AllApi.md#lastEntry) | **GET** /{context}/chains/{chainId}/entries/last | Get the last entry in the provided chain.
[**listBackends**](AllApi.md#listBackends) | **GET** /backends | List backends
[**nextEntryById**](AllApi.md#nextEntryById) | **GET** /{context}/chains/{chainId}/entries/{entryId}/next | Get the entry after the supplied entry Id (the next) in the provided chain
[**nextEntryByRequest**](AllApi.md#nextEntryByRequest) | **POST** /{context}/chains/{chainId}/entries/entry/next | Get the entry after the supplied entry Id (the next) in the provided chain
[**previousEntryById**](AllApi.md#previousEntryById) | **GET** /{context}/chains/{chainId}/entries/{entryId}/previous | Get the entry before the supplied entry Id (the previous) in the provided chain
[**previousEntryByRequest**](AllApi.md#previousEntryByRequest) | **POST** /{context}/chains/{chainId}/entries/entry/previous | Get the entry before the supplied entry Id (the previous) in the provided chain


<a name="chainIdExists"></a>
# **chainIdExists**
> IdResponse chainIdExists(context, chainId)

Determine chain id exists

Determine whether the Id of a chain exists in the blockchain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
try {
    IdResponse result = apiInstance.chainIdExists(context, chainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#chainIdExists");
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

<a name="createBackend"></a>
# **createBackend**
> Backend createBackend(backend)

Create a new backend

Create a new backend

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
Backend backend = new Backend(); // Backend | backend
try {
    Backend result = apiInstance.createBackend(backend);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#createBackend");
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

<a name="createChain"></a>
# **createChain**
> CommittedChainResponse createChain(context, chain)

Create a new chain

Create a new chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String context = "context_example"; // String | context
Chain chain = new Chain(); // Chain | Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!
try {
    CommittedChainResponse result = apiInstance.createChain(context, chain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#createChain");
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

<a name="createContext"></a>
# **createContext**
> Context createContext(context)

Create context

Create a new context

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
Context context = new Context(); // Context | context
try {
    Context result = apiInstance.createContext(context);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#createContext");
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

<a name="createEntry"></a>
# **createEntry**
> CommittedEntryResponse createEntry(context, chainId, entry, currentAnchorTime)

Create a new entry in the provided chain

Create a new entry in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
Entry entry = new Entry(); // Entry | Create a new entry for the specified chain
OffsetDateTime currentAnchorTime = new OffsetDateTime(); // OffsetDateTime | 
try {
    CommittedEntryResponse result = apiInstance.createEntry(context, chainId, entry, currentAnchorTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#createEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context |
 **chainId** | **String**| chainId |
 **entry** | [**Entry**](Entry.md)| Create a new entry for the specified chain |
 **currentAnchorTime** | **OffsetDateTime**|  | [optional]

### Return type

[**CommittedEntryResponse**](CommittedEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="deleteBackend"></a>
# **deleteBackend**
> Backend deleteBackend(backendId)

Delete a backend

Delete backend by id (not by ledgername)

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String backendId = "backendId_example"; // String | backendId
try {
    Backend result = apiInstance.deleteBackend(backendId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#deleteBackend");
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

<a name="deleteContext"></a>
# **deleteContext**
> Context deleteContext(context)

Delete context

Delete an existing context

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String context = "context_example"; // String | context
try {
    Context result = apiInstance.deleteContext(context);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#deleteContext");
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

<a name="determineChainId"></a>
# **determineChainId**
> IdResponse determineChainId(context, chain, checkExistence)

Predetermine id of chain

Pre determine the Id of a chain request without anchoring it in the blockchain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String context = "context_example"; // String | context
Chain chain = new Chain(); // Chain | Determine a chain hash. The entry needs at least a (combination of) globally unique external Id in the complete Blockchain network!
Boolean checkExistence = false; // Boolean | Check whether the id exists
try {
    IdResponse result = apiInstance.determineChainId(context, chain, checkExistence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#determineChainId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context |
 **chain** | [**Chain**](Chain.md)| Determine a chain hash. The entry needs at least a (combination of) globally unique external Id in the complete Blockchain network! |
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

Predetermine id of an entry

Pre determine the Id of an entry request without anchoring the entry

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
Entry entry = new Entry(); // Entry | The entry to determine the hash for on the specified chain
Boolean checkExistence = false; // Boolean | Check whether the id exists
try {
    IdResponse result = apiInstance.determineEntryId(context, chainId, entry, checkExistence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#determineEntryId");
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

<a name="entryById"></a>
# **entryById**
> AnchoredEntryResponse entryById(context, chainId, entryId, currentAnchorTime)

Get an existing entry in the provided chain

Get an existing entry in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
String entryId = "entryId_example"; // String | entryId
OffsetDateTime currentAnchorTime = new OffsetDateTime(); // OffsetDateTime | 
try {
    AnchoredEntryResponse result = apiInstance.entryById(context, chainId, entryId, currentAnchorTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#entryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context |
 **chainId** | **String**| chainId |
 **entryId** | **String**| entryId |
 **currentAnchorTime** | **OffsetDateTime**|  | [optional]

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="entryByRequest"></a>
# **entryByRequest**
> AnchoredEntryResponse entryByRequest(context, chainId, entry, currentAnchorTime)

Get an existing entry in the provided chain

Get an existing entry in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
Entry entry = new Entry(); // Entry | Retrieve the entry
OffsetDateTime currentAnchorTime = new OffsetDateTime(); // OffsetDateTime | 
try {
    AnchoredEntryResponse result = apiInstance.entryByRequest(context, chainId, entry, currentAnchorTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#entryByRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context |
 **chainId** | **String**| chainId |
 **entry** | [**Entry**](Entry.md)| Retrieve the entry |
 **currentAnchorTime** | **OffsetDateTime**|  | [optional]

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="entryIdExists"></a>
# **entryIdExists**
> IdResponse entryIdExists(context, chainId, entryId)

Determine entry id exists

Determine whether the Id of an entry exists in the blockchain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
String entryId = "entryId_example"; // String | entryId
try {
    IdResponse result = apiInstance.entryIdExists(context, chainId, entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#entryIdExists");
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

<a name="findBackends"></a>
# **findBackends**
> List&lt;Backend&gt; findBackends(backendId, includePublic)

Find backends

Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String backendId = "backendId_example"; // String | backendId
Boolean includePublic = false; // Boolean | includePublic
try {
    List<Backend> result = apiInstance.findBackends(backendId, includePublic);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#findBackends");
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

<a name="firstEntry"></a>
# **firstEntry**
> AnchoredEntryResponse firstEntry(context, chainId)

Get the first entry in the provided chain

Get the first entry in the provided chain. This is the oldest entry also called the chain tail.  Please note that the achorTimes will only contain the first anchor time. Call getEntry to retrieve all times

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
try {
    AnchoredEntryResponse result = apiInstance.firstEntry(context, chainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#firstEntry");
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

<a name="getBackend"></a>
# **getBackend**
> Backend getBackend(backendId, includePublic)

Get backend

Get existing backend by id (not by ledgername). Optionally including public backend of others

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String backendId = "backendId_example"; // String | backendId
Boolean includePublic = false; // Boolean | includePublic
try {
    Backend result = apiInstance.getBackend(backendId, includePublic);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#getBackend");
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

Get context

Get an existing context

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String context = "context_example"; // String | context
try {
    Context result = apiInstance.getContext(context);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#getContext");
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

<a name="lastEntry"></a>
# **lastEntry**
> AnchoredEntryResponse lastEntry(context, chainId)

Get the last entry in the provided chain.

Get the last entry in the provided chain. This is the most recent entry also called the chain head. Please note that the achorTimes will only contain the latest anchor time. Call getEntry to retrieve all times

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
try {
    AnchoredEntryResponse result = apiInstance.lastEntry(context, chainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#lastEntry");
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

<a name="listBackends"></a>
# **listBackends**
> List&lt;Backend&gt; listBackends()

List backends

List existing backends.

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
try {
    List<Backend> result = apiInstance.listBackends();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#listBackends");
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

<a name="nextEntryById"></a>
# **nextEntryById**
> AnchoredEntryResponse nextEntryById(context, chainId, entryId, currentAnchorTime)

Get the entry after the supplied entry Id (the next) in the provided chain

Get the entry after the supplied entry Id (the next) in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
String entryId = "entryId_example"; // String | entryId
OffsetDateTime currentAnchorTime = new OffsetDateTime(); // OffsetDateTime | 
try {
    AnchoredEntryResponse result = apiInstance.nextEntryById(context, chainId, entryId, currentAnchorTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#nextEntryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context |
 **chainId** | **String**| chainId |
 **entryId** | **String**| entryId |
 **currentAnchorTime** | **OffsetDateTime**|  | [optional]

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="nextEntryByRequest"></a>
# **nextEntryByRequest**
> AnchoredEntryResponse nextEntryByRequest(context, chainId, entry, currentAnchorTime)

Get the entry after the supplied entry Id (the next) in the provided chain

Get the entry after the supplied entry Id (the next) in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
Entry entry = new Entry(); // Entry | Retrieve the entry
OffsetDateTime currentAnchorTime = new OffsetDateTime(); // OffsetDateTime | 
try {
    AnchoredEntryResponse result = apiInstance.nextEntryByRequest(context, chainId, entry, currentAnchorTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#nextEntryByRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context |
 **chainId** | **String**| chainId |
 **entry** | [**Entry**](Entry.md)| Retrieve the entry |
 **currentAnchorTime** | **OffsetDateTime**|  | [optional]

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="previousEntryById"></a>
# **previousEntryById**
> AnchoredEntryResponse previousEntryById(context, chainId, entryId, currentAnchorTime)

Get the entry before the supplied entry Id (the previous) in the provided chain

Get the entry before the supplied entry Id (the previous) in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
String entryId = "entryId_example"; // String | entryId
OffsetDateTime currentAnchorTime = new OffsetDateTime(); // OffsetDateTime | 
try {
    AnchoredEntryResponse result = apiInstance.previousEntryById(context, chainId, entryId, currentAnchorTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#previousEntryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context |
 **chainId** | **String**| chainId |
 **entryId** | **String**| entryId |
 **currentAnchorTime** | **OffsetDateTime**|  | [optional]

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="previousEntryByRequest"></a>
# **previousEntryByRequest**
> AnchoredEntryResponse previousEntryByRequest(context, chainId, entry, currentAnchorTime)

Get the entry before the supplied entry Id (the previous) in the provided chain

Get the entry before the supplied entry Id (the previous) in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String context = "context_example"; // String | context
String chainId = "chainId_example"; // String | chainId
Entry entry = new Entry(); // Entry | Retrieve the entry
OffsetDateTime currentAnchorTime = new OffsetDateTime(); // OffsetDateTime | 
try {
    AnchoredEntryResponse result = apiInstance.previousEntryByRequest(context, chainId, entry, currentAnchorTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#previousEntryByRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context |
 **chainId** | **String**| chainId |
 **entry** | [**Entry**](Entry.md)| Retrieve the entry |
 **currentAnchorTime** | **OffsetDateTime**|  | [optional]

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

