# EasyBlockchainApi.AllApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChainUsingPOST**](AllApi.md#createChainUsingPOST) | **POST** /blockchain/easy/0.1.0/chains | Create a new chain
[**createEntryUsingPOST**](AllApi.md#createEntryUsingPOST) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries | Create a new entry in the provided chain
[**determineChainId**](AllApi.md#determineChainId) | **POST** /blockchain/easy/0.1.0/chains/id | Pre determine the Id of a chain request without anchoring it in the blockchain
[**determineEntryId**](AllApi.md#determineEntryId) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries/id | Pre determine the Id of an entry request without anchoring the entry
[**entryById**](AllApi.md#entryById) | **GET** /blockchain/easy/0.1.0/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
[**entryByRequest**](AllApi.md#entryByRequest) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries/entry | Get an existing entry in the provided chain


<a name="createChainUsingPOST"></a>
# **createChainUsingPOST**
> CommittedChainResponse createChainUsingPOST(chain)

Create a new chain

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');

var apiInstance = new EasyBlockchainApi.AllApi();

var chain = new EasyBlockchainApi.Chain(); // Chain | Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createChainUsingPOST(chain, callback);
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

<a name="createEntryUsingPOST"></a>
# **createEntryUsingPOST**
> CommittedEntryResponse createEntryUsingPOST(chainId, entry)

Create a new entry in the provided chain

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');

var apiInstance = new EasyBlockchainApi.AllApi();

var chainId = "chainId_example"; // String | chainId

var entry = new EasyBlockchainApi.Entry(); // Entry | Create a new entry for the specified chain


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createEntryUsingPOST(chainId, entry, callback);
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

<a name="determineChainId"></a>
# **determineChainId**
> IdResponse determineChainId(chain)

Pre determine the Id of a chain request without anchoring it in the blockchain

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');

var apiInstance = new EasyBlockchainApi.AllApi();

var chain = new EasyBlockchainApi.Chain(); // Chain | Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.determineChainId(chain, callback);
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
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');

var apiInstance = new EasyBlockchainApi.AllApi();

var chainId = "chainId_example"; // String | chainId

var entry = new EasyBlockchainApi.Entry(); // Entry | The entry to determine the hash for on the specified chain


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.determineEntryId(chainId, entry, callback);
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
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');

var apiInstance = new EasyBlockchainApi.AllApi();

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

var apiInstance = new EasyBlockchainApi.AllApi();

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

