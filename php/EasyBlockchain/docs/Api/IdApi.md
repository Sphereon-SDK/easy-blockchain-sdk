# Swagger\Client\IdApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/easy/0.10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chainIdExists**](IdApi.md#chainIdExists) | **GET** /{context}/chains/id/{chainId} | Determine chain id exists
[**determineChainId**](IdApi.md#determineChainId) | **POST** /{context}/chains/id | Predetermine id of chain
[**determineEntryId**](IdApi.md#determineEntryId) | **POST** /{context}/chains/id/{chainId}/entries | Predetermine id of an entry
[**entryIdExists**](IdApi.md#entryIdExists) | **GET** /{context}/chains/id/{chainId}/entries/{entryId} | Determine entry id exists


# **chainIdExists**
> \Swagger\Client\Model\IdResponse chainIdExists($context, $chain_id)

Determine chain id exists

Determine whether the Id of a chain exists in the blockchain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\IdApi();
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

[**\Swagger\Client\Model\IdResponse**](../Model/IdResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **determineChainId**
> \Swagger\Client\Model\IdResponse determineChainId($context, $chain, $check_existence)

Predetermine id of chain

Pre determine the Id of a chain without anchoring it in the blockchain. You determine the Id that the chain would receive once it would have been anchored

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\IdApi();
$context = "context_example"; // string | context
$chain = new \Swagger\Client\Model\Chain(); // \Swagger\Client\Model\Chain | Determine a chain hash. The entry needs at least a (combination of) globally unique external Id in the complete Blockchain network!
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
 **chain** | [**\Swagger\Client\Model\Chain**](../Model/Chain.md)| Determine a chain hash. The entry needs at least a (combination of) globally unique external Id in the complete Blockchain network! |
 **check_existence** | **bool**| Check whether the id exists | [optional] [default to false]

### Return type

[**\Swagger\Client\Model\IdResponse**](../Model/IdResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **determineEntryId**
> \Swagger\Client\Model\IdResponse determineEntryId($context, $chain_id, $entry, $check_existence)

Predetermine id of an entry

Pre determine the Id of an entry request without anchoring the entry

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\IdApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry = new \Swagger\Client\Model\Entry(); // \Swagger\Client\Model\Entry | The entry to determine the hash for on the specified chain
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
 **entry** | [**\Swagger\Client\Model\Entry**](../Model/Entry.md)| The entry to determine the hash for on the specified chain |
 **check_existence** | **bool**| Check whether the id exists | [optional] [default to false]

### Return type

[**\Swagger\Client\Model\IdResponse**](../Model/IdResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **entryIdExists**
> \Swagger\Client\Model\IdResponse entryIdExists($context, $chain_id, $entry_id)

Determine entry id exists

Determine whether the Id of an entry exists in the blockchain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\IdApi();
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

[**\Swagger\Client\Model\IdResponse**](../Model/IdResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

