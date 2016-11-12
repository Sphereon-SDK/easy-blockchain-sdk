# EasyBlockchainApi.IdApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chainIdExists**](IdApi.md#chainIdExists) | **GET** /blockchain/easy/0.1.0/chains/id/{chainId} | Determine whether the Id of a chain exists in the blockchain
[**determineChainId**](IdApi.md#determineChainId) | **POST** /blockchain/easy/0.1.0/chains/id | Pre determine the Id of a chain request without anchoring it in the blockchain
[**determineEntryId**](IdApi.md#determineEntryId) | **POST** /blockchain/easy/0.1.0/chains/id/{chainId}/entries | Pre determine the Id of an entry request without anchoring the entry
[**entryIdExists**](IdApi.md#entryIdExists) | **GET** /blockchain/easy/0.1.0/chains/id/{chainId}/entries/{entryId} | Determine whether the Id of an entry exists in the blockchain


<a name="chainIdExists"></a>
# **chainIdExists**
> IdResponse chainIdExists(chainId)

Determine whether the Id of a chain exists in the blockchain

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');

var apiInstance = new EasyBlockchainApi.IdApi();

var chainId = "chainId_example"; // String | chainId


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.chainIdExists(chainId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| chainId | 

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="determineChainId"></a>
# **determineChainId**
> IdResponse determineChainId(chain, opts)

Pre determine the Id of a chain request without anchoring it in the blockchain

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');

var apiInstance = new EasyBlockchainApi.IdApi();

var chain = new EasyBlockchainApi.Chain(); // Chain | Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!

var opts = { 
  'checkExistence': false // Boolean | Check whether the id exists
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.determineChainId(chain, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | [**Chain**](Chain.md)| Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! | 
 **checkExistence** | **Boolean**| Check whether the id exists | [optional] [default to false]

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="determineEntryId"></a>
# **determineEntryId**
> IdResponse determineEntryId(chainId, entry, opts)

Pre determine the Id of an entry request without anchoring the entry

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');

var apiInstance = new EasyBlockchainApi.IdApi();

var chainId = "chainId_example"; // String | chainId

var entry = new EasyBlockchainApi.Entry(); // Entry | The entry to determine the hash for on the specified chain

var opts = { 
  'checkExistence': false // Boolean | Check whether the id exists
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.determineEntryId(chainId, entry, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| chainId | 
 **entry** | [**Entry**](Entry.md)| The entry to determine the hash for on the specified chain | 
 **checkExistence** | **Boolean**| Check whether the id exists | [optional] [default to false]

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="entryIdExists"></a>
# **entryIdExists**
> IdResponse entryIdExists(chainId, entryId)

Determine whether the Id of an entry exists in the blockchain

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');

var apiInstance = new EasyBlockchainApi.IdApi();

var chainId = "chainId_example"; // String | chainId

var entryId = "entryId_example"; // String | entryId


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.entryIdExists(chainId, entryId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| chainId | 
 **entryId** | **String**| entryId | 

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

