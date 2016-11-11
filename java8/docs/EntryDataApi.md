# EntryDataApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEntryUsingPOST**](EntryDataApi.md#createEntryUsingPOST) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries | Create a new entry in the provided chain
[**determineEntryId**](EntryDataApi.md#determineEntryId) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries/id | Pre determine the Id of an entry request without anchoring the entry
[**entryById**](EntryDataApi.md#entryById) | **GET** /blockchain/easy/0.1.0/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
[**entryByRequest**](EntryDataApi.md#entryByRequest) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries/entry | Get an existing entry in the provided chain


<a name="createEntryUsingPOST"></a>
# **createEntryUsingPOST**
> CommittedEntryResponse createEntryUsingPOST(chainId, entry)

Create a new entry in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.api.EntryDataApi;


EntryDataApi apiInstance = new EntryDataApi();
String chainId = "chainId_example"; // String | chainId
Entry entry = new Entry(); // Entry | Create a new entry for the specified chain
try {
    CommittedEntryResponse result = apiInstance.createEntryUsingPOST(chainId, entry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryDataApi#createEntryUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| chainId |
 **entry** | [**Entry**](Entry.md)| Create a new entry for the specified chain |

### Return type

[**CommittedEntryResponse**](CommittedEntryResponse.md)

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
//import com.sphereon.sdk.blockchain.easy.api.EntryDataApi;


EntryDataApi apiInstance = new EntryDataApi();
String chainId = "chainId_example"; // String | chainId
Entry entry = new Entry(); // Entry | The entry to determine the hash for on the specified chain
try {
    IdResponse result = apiInstance.determineEntryId(chainId, entry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryDataApi#determineEntryId");
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

<a name="entryById"></a>
# **entryById**
> AnchoredEntryResponse entryById(chainId, entryId)

Get an existing entry in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.api.EntryDataApi;


EntryDataApi apiInstance = new EntryDataApi();
String chainId = "chainId_example"; // String | chainId
String entryId = "entryId_example"; // String | entryId
try {
    AnchoredEntryResponse result = apiInstance.entryById(chainId, entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryDataApi#entryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| chainId |
 **entryId** | **String**| entryId |

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="entryByRequest"></a>
# **entryByRequest**
> AnchoredEntryResponse entryByRequest(chainId, entry)

Get an existing entry in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.api.EntryDataApi;


EntryDataApi apiInstance = new EntryDataApi();
String chainId = "chainId_example"; // String | chainId
Entry entry = new Entry(); // Entry | Retrieve the entry
try {
    AnchoredEntryResponse result = apiInstance.entryByRequest(chainId, entry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryDataApi#entryByRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| chainId |
 **entry** | [**Entry**](Entry.md)| Retrieve the entry |

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

