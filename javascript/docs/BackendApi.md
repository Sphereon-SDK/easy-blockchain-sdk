# EasyBlockchainApi.BackendApi

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
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');
var defaultClient = EasyBlockchainApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new EasyBlockchainApi.BackendApi();

var backend = new EasyBlockchainApi.Backend(); // Backend | backend


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createBackend(backend, callback);
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
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');
var defaultClient = EasyBlockchainApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new EasyBlockchainApi.BackendApi();

var backendId = "backendId_example"; // String | backendId


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.deleteBackend(backendId, callback);
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
> [Backend] findBackends(backendId, opts)

Find backends

Find existing backend(s) by id (single result) and/or name (multiple results). Optionally including public backends of others. Please note that we never return sensitive information like password or rpc hosts. Even not for backend owners themselves

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');
var defaultClient = EasyBlockchainApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new EasyBlockchainApi.BackendApi();

var backendId = "backendId_example"; // String | backendId

var opts = { 
  'includePublic': false // Boolean | includePublic
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.findBackends(backendId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **String**| backendId | 
 **includePublic** | **Boolean**| includePublic | [optional] [default to false]

### Return type

[**[Backend]**](Backend.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getBackend"></a>
# **getBackend**
> Backend getBackend(backendId, opts)

Get backend by id

Get existing backend by id (not by name). Optionally including public backend of others. Please note that we never return sensitive information like password or rpc hosts. Even not for backend owners themselves

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');
var defaultClient = EasyBlockchainApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new EasyBlockchainApi.BackendApi();

var backendId = "backendId_example"; // String | backendId

var opts = { 
  'includePublic': false // Boolean | includePublic
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBackend(backendId, opts, callback);
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
> [Backend] listBackends(opts)

List backends

List existing backends. Optionally including public backends of others.  Please note that we never return sensitive information like password or rpc hosts. Even not for backend owners themselves

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');
var defaultClient = EasyBlockchainApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new EasyBlockchainApi.BackendApi();

var opts = { 
  'includePublic': false // Boolean | includePublic
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.listBackends(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includePublic** | **Boolean**| includePublic | [optional] [default to false]

### Return type

[**[Backend]**](Backend.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

