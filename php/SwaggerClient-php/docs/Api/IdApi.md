# Sphereon\SDK\Blockchain\Easy\IdApi

All URIs are relative to *https://gw.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chainIdExists**](IdApi.md#chainIdExists) | **GET** /blockchain/easy/0.9/{context}/chains/id/{chainId} | Determine whether the Id of a chain exists in the blockchain
[**determineChainId**](IdApi.md#determineChainId) | **POST** /blockchain/easy/0.9/{context}/chains/id | Pre determine the Id of a chain request without anchoring it in the blockchain
[**determineEntryId**](IdApi.md#determineEntryId) | **POST** /blockchain/easy/0.9/{context}/chains/id/{chainId}/entries | Pre determine the Id of an entry request without anchoring the entry
[**entryIdExists**](IdApi.md#entryIdExists) | **GET** /blockchain/easy/0.9/{context}/chains/id/{chainId}/entries/{entryId} | Determine whether the Id of an entry exists in the blockchain


# **chainIdExists**
> \Sphereon\SDK\Blockchain\Easy\Model\IdResponse chainIdExists($context, $chain_id)

Determine whether the Id of a chain exists in the blockchain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\IdApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId

try {
    $result = $api_instance->chainIdExists($context, $chain_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling IdApi->chainIdExists: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain_id** | **string**| chainId |

### Return type

[**\Sphereon\SDK\Blockchain\Easy\Model\IdResponse**](../Model/IdResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **determineChainId**
> \Sphereon\SDK\Blockchain\Easy\Model\IdResponse determineChainId($context, $chain, $check_existence)

Pre determine the Id of a chain request without anchoring it in the blockchain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\IdApi();
$context = "context_example"; // string | context
$chain = new \Sphereon\SDK\Blockchain\Easy\Model\Chain(); // \Sphereon\SDK\Blockchain\Easy\Model\Chain | Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!
$check_existence = false; // bool | Check whether the id exists

try {
    $result = $api_instance->determineChainId($context, $chain, $check_existence);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling IdApi->determineChainId: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain** | [**\Sphereon\SDK\Blockchain\Easy\Model\Chain**](../Model/Chain.md)| Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! |
 **check_existence** | **bool**| Check whether the id exists | [optional] [default to false]

### Return type

[**\Sphereon\SDK\Blockchain\Easy\Model\IdResponse**](../Model/IdResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **determineEntryId**
> \Sphereon\SDK\Blockchain\Easy\Model\IdResponse determineEntryId($context, $chain_id, $entry, $check_existence)

Pre determine the Id of an entry request without anchoring the entry

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\IdApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry = new \Sphereon\SDK\Blockchain\Easy\Model\Entry(); // \Sphereon\SDK\Blockchain\Easy\Model\Entry | The entry to determine the hash for on the specified chain
$check_existence = false; // bool | Check whether the id exists

try {
    $result = $api_instance->determineEntryId($context, $chain_id, $entry, $check_existence);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling IdApi->determineEntryId: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain_id** | **string**| chainId |
 **entry** | [**\Sphereon\SDK\Blockchain\Easy\Model\Entry**](../Model/Entry.md)| The entry to determine the hash for on the specified chain |
 **check_existence** | **bool**| Check whether the id exists | [optional] [default to false]

### Return type

[**\Sphereon\SDK\Blockchain\Easy\Model\IdResponse**](../Model/IdResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **entryIdExists**
> \Sphereon\SDK\Blockchain\Easy\Model\IdResponse entryIdExists($context, $chain_id, $entry_id)

Determine whether the Id of an entry exists in the blockchain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\IdApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry_id = "entry_id_example"; // string | entryId

try {
    $result = $api_instance->entryIdExists($context, $chain_id, $entry_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling IdApi->entryIdExists: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain_id** | **string**| chainId |
 **entry_id** | **string**| entryId |

### Return type

[**\Sphereon\SDK\Blockchain\Easy\Model\IdResponse**](../Model/IdResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

