# EasyBlockchainApi.EntryApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEntry**](EntryApi.md#createEntry) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries | Create a new entry in the provided chain
[**entryById**](EntryApi.md#entryById) | **GET** /blockchain/easy/0.1.0/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
[**entryByRequest**](EntryApi.md#entryByRequest) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries/entry | Get an existing entry in the provided chain
[**firstEntry**](EntryApi.md#firstEntry) | **GET** /blockchain/easy/0.1.0/chains/{chainId}/entries/first | Get the first entry in the provided chain. This is the oldest entry also called the chain tail
[**lastEntry**](EntryApi.md#lastEntry) | **GET** /blockchain/easy/0.1.0/chains/{chainId}/entries/last | Get the last entry in the provided chain. This is the most recent entry also called the chain head
[**nextEntryById**](EntryApi.md#nextEntryById) | **GET** /blockchain/easy/0.1.0/chains/{chainId}/entries/{entryId}/next | Get the entry after the supplied entry Id (the next) in the provided chain
[**nextEntryByRequest**](EntryApi.md#nextEntryByRequest) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries/entry/next | Get the entry after the supplied entry Id (the next) in the provided chain
[**previousEntryById**](EntryApi.md#previousEntryById) | **GET** /blockchain/easy/0.1.0/chains/{chainId}/entries/{entryId}/previous | Get the entry before the supplied entry Id (the previous) in the provided chain
[**previousEntryByRequest**](EntryApi.md#previousEntryByRequest) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries/entry/previous | Get the entry before the supplied entry Id (the previous) in the provided chain


<a name="createEntry"></a>
# **createEntry**
> CommittedEntryResponse createEntry(chainId, entry)

Create a new entry in the provided chain

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');

var apiInstance = new EasyBlockchainApi.EntryApi();

var chainId = "chainId_example"; // String | chainId

var entry = new EasyBlockchainApi.Entry(); // Entry | Create a new entry for the specified chain


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createEntry(chainId, entry, callback);
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

<a name="entryById"></a>
# **entryById**
> AnchoredEntryResponse entryById(chainId, entryId)

Get an existing entry in the provided chain

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');

var apiInstance = new EasyBlockchainApi.EntryApi();

var chainId = "chainId_example"; // String | chainId

var entryId = "entryId_example"; // String | entryId


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.entryById(chainId, entryId, callback);
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
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');

var apiInstance = new EasyBlockchainApi.EntryApi();

var chainId = "chainId_example"; // String | chainId

var entry = new EasyBlockchainApi.Entry(); // Entry | Retrieve the entry


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.entryByRequest(chainId, entry, callback);
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

<a name="firstEntry"></a>
# **firstEntry**
> AnchoredEntryResponse firstEntry(chainId)

Get the first entry in the provided chain. This is the oldest entry also called the chain tail

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');

var apiInstance = new EasyBlockchainApi.EntryApi();

var chainId = "chainId_example"; // String | chainId


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.firstEntry(chainId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| chainId | 

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="lastEntry"></a>
# **lastEntry**
> AnchoredEntryResponse lastEntry(chainId)

Get the last entry in the provided chain. This is the most recent entry also called the chain head

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');

var apiInstance = new EasyBlockchainApi.EntryApi();

var chainId = "chainId_example"; // String | chainId


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.lastEntry(chainId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| chainId | 

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="nextEntryById"></a>
# **nextEntryById**
> AnchoredEntryResponse nextEntryById(chainId, entryId)

Get the entry after the supplied entry Id (the next) in the provided chain

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');

var apiInstance = new EasyBlockchainApi.EntryApi();

var chainId = "chainId_example"; // String | chainId

var entryId = "entryId_example"; // String | entryId


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.nextEntryById(chainId, entryId, callback);
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

<a name="nextEntryByRequest"></a>
# **nextEntryByRequest**
> AnchoredEntryResponse nextEntryByRequest(chainId, entry)

Get the entry after the supplied entry Id (the next) in the provided chain

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');

var apiInstance = new EasyBlockchainApi.EntryApi();

var chainId = "chainId_example"; // String | chainId

var entry = new EasyBlockchainApi.Entry(); // Entry | Retrieve the entry


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.nextEntryByRequest(chainId, entry, callback);
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

<a name="previousEntryById"></a>
# **previousEntryById**
> AnchoredEntryResponse previousEntryById(chainId, entryId)

Get the entry before the supplied entry Id (the previous) in the provided chain

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');

var apiInstance = new EasyBlockchainApi.EntryApi();

var chainId = "chainId_example"; // String | chainId

var entryId = "entryId_example"; // String | entryId


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.previousEntryById(chainId, entryId, callback);
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

<a name="previousEntryByRequest"></a>
# **previousEntryByRequest**
> AnchoredEntryResponse previousEntryByRequest(chainId, entry)

Get the entry before the supplied entry Id (the previous) in the provided chain

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');

var apiInstance = new EasyBlockchainApi.EntryApi();

var chainId = "chainId_example"; // String | chainId

var entry = new EasyBlockchainApi.Entry(); // Entry | Retrieve the entry


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.previousEntryByRequest(chainId, entry, callback);
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

