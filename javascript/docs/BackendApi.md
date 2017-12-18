# EasyBlockchainApi.BackendApi

All URIs are relative to *https://gw.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBackend**](BackendApi.md#createBackend) | **POST** /blockchain/easy/0.10/backends | Create a new backend
[**deleteBackend**](BackendApi.md#deleteBackend) | **DELETE** /blockchain/easy/0.10/backends/{backendId} | Delete a backend
[**findBackends**](BackendApi.md#findBackends) | **GET** /blockchain/easy/0.10/backends/{backendId}/find | Find backends
[**getBackend**](BackendApi.md#getBackend) | **GET** /blockchain/easy/0.10/backends/{backendId} | Get backend
[**listBackends**](BackendApi.md#listBackends) | **GET** /blockchain/easy/0.10/backends | List backends


<a name="createBackend"></a>
# **createBackend**
> Backend createBackend(backend)

Create a new backend

Create a new backend

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

Delete backend by id (not by ledgername)

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

Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others

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

Get backend

Get existing backend by id (not by ledgername). Optionally including public backend of others

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
> [Backend] listBackends()

List backends

List existing backends.

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');
var defaultClient = EasyBlockchainApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new EasyBlockchainApi.BackendApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.listBackends(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[Backend]**](Backend.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

