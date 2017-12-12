# EasyBlockchainApi.ChainApi

All URIs are relative to *https://gw-dev.api.cloud.sphereon.com/blockchain/easy/0.10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChain**](ChainApi.md#createChain) | **POST** /{context}/chains | Create a new chain


<a name="createChain"></a>
# **createChain**
> CommittedChainResponse createChain(context, chain)

Create a new chain

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');
var defaultClient = EasyBlockchainApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new EasyBlockchainApi.ChainApi();

var context = "context_example"; // String | context

var chain = new EasyBlockchainApi.Chain(); // Chain | Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createChain(context, chain, callback);
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

