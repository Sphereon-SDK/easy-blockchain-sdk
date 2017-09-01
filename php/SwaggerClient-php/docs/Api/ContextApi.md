# Sphereon\SDK\Blockchain\Easy\ContextApi

All URIs are relative to *https://gw.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBackend**](ContextApi.md#createBackend) | **POST** /blockchain/easy/0.9/backends | Create a new backend
[**createContext**](ContextApi.md#createContext) | **POST** /blockchain/easy/0.9/ | Create a new context
[**deleteBackend**](ContextApi.md#deleteBackend) | **DELETE** /blockchain/easy/0.9/backends/{backendId} | Delete backend by id (not by ledgername)
[**findBackends**](ContextApi.md#findBackends) | **GET** /blockchain/easy/0.9/backends/{backendId}/find | Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others
[**getBackend**](ContextApi.md#getBackend) | **GET** /blockchain/easy/0.9/backends/{backendId} | Get existing backend by id (not by ledgername). Optionally including public backend of others
[**getContext**](ContextApi.md#getContext) | **GET** /blockchain/easy/0.9/{context} | Get an existing context
[**listBackends**](ContextApi.md#listBackends) | **GET** /blockchain/easy/0.9/backends | List existing backends.


# **createBackend**
> \Sphereon\SDK\Blockchain\Easy\Model\Backend createBackend($backend)

Create a new backend

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\ContextApi();
$backend = new \Sphereon\SDK\Blockchain\Easy\Model\Backend(); // \Sphereon\SDK\Blockchain\Easy\Model\Backend | backend

try {
    $result = $api_instance->createBackend($backend);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ContextApi->createBackend: ', $e->getMessage(), PHP_EOL;
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

# **createContext**
> \Sphereon\SDK\Blockchain\Easy\Model\Context createContext($context)

Create a new context

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\ContextApi();
$context = new \Sphereon\SDK\Blockchain\Easy\Model\Context(); // \Sphereon\SDK\Blockchain\Easy\Model\Context | context

try {
    $result = $api_instance->createContext($context);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ContextApi->createContext: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | [**\Sphereon\SDK\Blockchain\Easy\Model\Context**](../Model/Context.md)| context |

### Return type

[**\Sphereon\SDK\Blockchain\Easy\Model\Context**](../Model/Context.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteBackend**
> deleteBackend($backend_id)

Delete backend by id (not by ledgername)

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\ContextApi();
$backend_id = "backend_id_example"; // string | backendId

try {
    $api_instance->deleteBackend($backend_id);
} catch (Exception $e) {
    echo 'Exception when calling ContextApi->deleteBackend: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backend_id** | **string**| backendId |

### Return type

void (empty response body)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **findBackends**
> \Sphereon\SDK\Blockchain\Easy\Model\Backend[] findBackends($backend_id, $include_public)

Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\ContextApi();
$backend_id = "backend_id_example"; // string | backendId
$include_public = false; // bool | includePublic

try {
    $result = $api_instance->findBackends($backend_id, $include_public);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ContextApi->findBackends: ', $e->getMessage(), PHP_EOL;
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

Get existing backend by id (not by ledgername). Optionally including public backend of others

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\ContextApi();
$backend_id = "backend_id_example"; // string | backendId
$include_public = false; // bool | includePublic

try {
    $result = $api_instance->getBackend($backend_id, $include_public);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ContextApi->getBackend: ', $e->getMessage(), PHP_EOL;
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

# **getContext**
> \Sphereon\SDK\Blockchain\Easy\Model\Context getContext($context)

Get an existing context

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\ContextApi();
$context = "context_example"; // string | context

try {
    $result = $api_instance->getContext($context);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ContextApi->getContext: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |

### Return type

[**\Sphereon\SDK\Blockchain\Easy\Model\Context**](../Model/Context.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listBackends**
> \Sphereon\SDK\Blockchain\Easy\Model\Backend[] listBackends()

List existing backends.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\ContextApi();

try {
    $result = $api_instance->listBackends();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ContextApi->listBackends: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Sphereon\SDK\Blockchain\Easy\Model\Backend[]**](../Model/Backend.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

