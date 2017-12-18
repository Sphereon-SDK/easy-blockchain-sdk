# EasyBlockchainApi.ContextApi

All URIs are relative to *https://gw.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createContext**](ContextApi.md#createContext) | **POST** /blockchain/easy/0.10/ | Create context
[**deleteContext**](ContextApi.md#deleteContext) | **DELETE** /blockchain/easy/0.10/{context} | Delete context
[**getContext**](ContextApi.md#getContext) | **GET** /blockchain/easy/0.10/{context} | Get context


<a name="createContext"></a>
# **createContext**
> Context createContext(context)

Create context

Create a new context

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');
var defaultClient = EasyBlockchainApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new EasyBlockchainApi.ContextApi();

var context = new EasyBlockchainApi.Context(); // Context | context


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createContext(context, callback);
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

<a name="deleteContext"></a>
# **deleteContext**
> Context deleteContext(context)

Delete context

Delete an existing context

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');
var defaultClient = EasyBlockchainApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new EasyBlockchainApi.ContextApi();

var context = "context_example"; // String | context


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.deleteContext(context, callback);
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

<a name="getContext"></a>
# **getContext**
> Context getContext(context)

Get context

Get an existing context

### Example
```javascript
var EasyBlockchainApi = require('easy_blockchain_api');
var defaultClient = EasyBlockchainApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new EasyBlockchainApi.ContextApi();

var context = "context_example"; // String | context


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getContext(context, callback);
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

