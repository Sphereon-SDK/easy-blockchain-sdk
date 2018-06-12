# Swagger\Client\ContextApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/easy/0.10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createContext**](ContextApi.md#createContext) | **POST** /contexts | Create context
[**deleteContext**](ContextApi.md#deleteContext) | **DELETE** /contexts/{context} | Delete context
[**getContext**](ContextApi.md#getContext) | **GET** /contexts/{context} | Get context


# **createContext**
> \Swagger\Client\Model\Context createContext($context)

Create context

Create a new context

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ContextApi();
$context = new \Swagger\Client\Model\Context(); // \Swagger\Client\Model\Context | context

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
 **context** | [**\Swagger\Client\Model\Context**](../Model/Context.md)| context |

### Return type

[**\Swagger\Client\Model\Context**](../Model/Context.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteContext**
> \Swagger\Client\Model\Context deleteContext($context)

Delete context

Delete an existing context

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ContextApi();
$context = "context_example"; // string | context

try {
    $result = $api_instance->deleteContext($context);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ContextApi->deleteContext: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |

### Return type

[**\Swagger\Client\Model\Context**](../Model/Context.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getContext**
> \Swagger\Client\Model\Context getContext($context)

Get context

Get an existing context

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ContextApi();
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

[**\Swagger\Client\Model\Context**](../Model/Context.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

