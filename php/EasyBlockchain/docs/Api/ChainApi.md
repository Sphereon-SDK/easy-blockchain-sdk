# Swagger\Client\ChainApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/easy/0.10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChain**](ChainApi.md#createChain) | **POST** /{context}/chains | Create a new chain


# **createChain**
> \Swagger\Client\Model\CommittedChainResponse createChain($context, $chain)

Create a new chain

Create a new chain. Create a new chain. You can regard a chain as a blockchain within a blockchain, All entries in a chain are linked and relies on data from previous entries in the chain.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ChainApi();
$context = "context_example"; // string | context
$chain = new \Swagger\Client\Model\Chain(); // \Swagger\Client\Model\Chain | Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!

try {
    $result = $api_instance->createChain($context, $chain);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChainApi->createChain: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain** | [**\Swagger\Client\Model\Chain**](../Model/Chain.md)| Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! |

### Return type

[**\Swagger\Client\Model\CommittedChainResponse**](../Model/CommittedChainResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

