# EasyBlockchainApi.IdApi

All URIs are relative to *https://gw-dev.api.cloud.sphereon.com/blockchain/easy/0.10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chainIdExists**](IdApi.md#chainIdExists) | **GET** /{context}/chains/id/{chainId} | Determine whether the Id of a chain exists in the blockchain
[**determineChainId**](IdApi.md#determineChainId) | **POST** /{context}/chains/id | Pre determine the Id of a chain request without anchoring it in the blockchain
[**determineEntryId**](IdApi.md#determineEntryId) | **POST** /{context}/chains/id/{chainId}/entries | Pre determine the Id of an entry request without anchoring the entry
[**entryIdExists**](IdApi.md#entryIdExists) | **GET** /{context}/chains/id/{chainId}/entries/{entryId} | Determine whether the Id of an entry exists in the blockchain


<a name="chainIdExists"></a>
# **chainIdExists**
> IdResponse chainIdExists(context, chainId)

Determine whether the Id of a chain exists in the blockchain

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');
var defaultClient = EasyBlockchainApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new EasyBlockchainApi.IdApi();

var context = "context_example"; // String | context

var chainId = "chainId_example"; // String | chainId


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.chainIdExists(context, chainId, callback);
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

<a name="determineChainId"></a>
# **determineChainId**
> IdResponse determineChainId(context, chain, opts)

Pre determine the Id of a chain request without anchoring it in the blockchain

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');
var defaultClient = EasyBlockchainApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new EasyBlockchainApi.IdApi();

var context = "context_example"; // String | context

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
apiInstance.determineChainId(context, chain, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **String**| context | 
 **chain** | [**Chain**](Chain.md)| Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! | 
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
> IdResponse determineEntryId(context, chainId, entry, opts)

Pre determine the Id of an entry request without anchoring the entry

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');
var defaultClient = EasyBlockchainApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new EasyBlockchainApi.IdApi();

var context = "context_example"; // String | context

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
apiInstance.determineEntryId(context, chainId, entry, opts, callback);
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

<a name="entryIdExists"></a>
# **entryIdExists**
> IdResponse entryIdExists(context, chainId, entryId)

Determine whether the Id of an entry exists in the blockchain

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');
var defaultClient = EasyBlockchainApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new EasyBlockchainApi.IdApi();

var context = "context_example"; // String | context

var chainId = "chainId_example"; // String | chainId

var entryId = "entryId_example"; // String | entryId


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.entryIdExists(context, chainId, entryId, callback);
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

