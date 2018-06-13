# Sphereon\SDK\Blockchain\Easy\BackendApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/easy/0.10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBackend**](BackendApi.md#createBackend) | **POST** /backends | Create a new backend
[**deleteBackend**](BackendApi.md#deleteBackend) | **DELETE** /backends/{backendId} | Delete a backend
[**findBackends**](BackendApi.md#findBackends) | **GET** /backends/{backendId}/find | Find backends
[**getBackend**](BackendApi.md#getBackend) | **GET** /backends/{backendId} | Get backend by id
[**listBackends**](BackendApi.md#listBackends) | **GET** /backends | List backends


# **createBackend**
> \Sphereon\SDK\Blockchain\Easy\Model\Backend createBackend($backend)

Create a new backend

Create a new backend. A Backend is the link to one blockchain implementation and it' s nodes. Unless you create your own private blockchain network, you should not have to create a new backend. Just use one of the public backends available.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\BackendApi();
$backend = new \Sphereon\SDK\Blockchain\Easy\Model\Backend(); // \Sphereon\SDK\Blockchain\Easy\Model\Backend | backend

try {
    $result = $api_instance->createBackend($backend);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BackendApi->createBackend: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backend** | [**\Sphereon\SDK\Blockchain\Easy\Model\Backend**](../Model/Backend.md)| backend |

### Return type

[**\Sphereon\SDK\Blockchain\Easy\Model\Backend**](../Model/Backend.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteBackend**
> \Sphereon\SDK\Blockchain\Easy\Model\Backend deleteBackend($backend_id)

Delete a backend

Delete backend by id (not by name)

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\BackendApi();
$backend_id = "backend_id_example"; // string | backendId

try {
    $result = $api_instance->deleteBackend($backend_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BackendApi->deleteBackend: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backend_id** | **string**| backendId |

### Return type

[**\Sphereon\SDK\Blockchain\Easy\Model\Backend**](../Model/Backend.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **findBackends**
> \Sphereon\SDK\Blockchain\Easy\Model\Backend[] findBackends($backend_id, $include_public)

Find backends

Find existing backend(s) by id (single result) and/or name (multiple results). Optionally including public backends of others. Please note that we never return sensitive information like password or rpc hosts. Even not for backend owners themselves

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\BackendApi();
$backend_id = "backend_id_example"; // string | backendId
$include_public = false; // bool | includePublic

try {
    $result = $api_instance->findBackends($backend_id, $include_public);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BackendApi->findBackends: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backend_id** | **string**| backendId |
 **include_public** | **bool**| includePublic | [optional] [default to false]

### Return type

[**\Sphereon\SDK\Blockchain\Easy\Model\Backend[]**](../Model/Backend.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBackend**
> \Sphereon\SDK\Blockchain\Easy\Model\Backend getBackend($backend_id, $include_public)

Get backend by id

Get existing backend by id (not by name). Optionally including public backend of others. Please note that we never return sensitive information like password or rpc hosts. Even not for backend owners themselves

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\BackendApi();
$backend_id = "backend_id_example"; // string | backendId
$include_public = false; // bool | includePublic

try {
    $result = $api_instance->getBackend($backend_id, $include_public);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BackendApi->getBackend: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backend_id** | **string**| backendId |
 **include_public** | **bool**| includePublic | [optional] [default to false]

### Return type

[**\Sphereon\SDK\Blockchain\Easy\Model\Backend**](../Model/Backend.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listBackends**
> \Sphereon\SDK\Blockchain\Easy\Model\Backend[] listBackends($include_public)

List backends

List existing backends. Optionally including public backends of others.  Please note that we never return sensitive information like password or rpc hosts. Even not for backend owners themselves

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\BackendApi();
$include_public = false; // bool | includePublic

try {
    $result = $api_instance->listBackends($include_public);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BackendApi->listBackends: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include_public** | **bool**| includePublic | [optional] [default to false]

### Return type

[**\Sphereon\SDK\Blockchain\Easy\Model\Backend[]**](../Model/Backend.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

