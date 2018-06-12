# Swagger\Client\EntryApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/easy/0.10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEntry**](EntryApi.md#createEntry) | **POST** /{context}/chains/{chainId}/entries | Create a new entry in the provided chain
[**entryById**](EntryApi.md#entryById) | **GET** /{context}/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
[**entryByRequest**](EntryApi.md#entryByRequest) | **POST** /{context}/chains/{chainId}/entries/entry | Get an existing entry in the provided chain
[**firstEntry**](EntryApi.md#firstEntry) | **GET** /{context}/chains/{chainId}/entries/first | Get the first entry in the provided chain
[**lastEntry**](EntryApi.md#lastEntry) | **GET** /{context}/chains/{chainId}/entries/last | Get the last entry in the provided chain.
[**nextEntryById**](EntryApi.md#nextEntryById) | **GET** /{context}/chains/{chainId}/entries/{entryId}/next | Get the entry after the supplied entry Id (the next) in the provided chain
[**nextEntryByRequest**](EntryApi.md#nextEntryByRequest) | **POST** /{context}/chains/{chainId}/entries/entry/next | Get the entry after the supplied entry Id (the next) in the provided chain
[**previousEntryById**](EntryApi.md#previousEntryById) | **GET** /{context}/chains/{chainId}/entries/{entryId}/previous | Get the entry before the supplied entry Id (the previous) in the provided chain
[**previousEntryByRequest**](EntryApi.md#previousEntryByRequest) | **POST** /{context}/chains/{chainId}/entries/entry/previous | Get the entry before the supplied entry Id (the previous) in the provided chain


# **createEntry**
> \Swagger\Client\Model\CommittedEntryResponse createEntry($context, $chain_id, $entry, $current_anchor_time)

Create a new entry in the provided chain

Create a new entry in the provided chain. The entry will be linked to the previous entry. If the entry already exists, the API will add an anchor time, since the entry Id would be the same as the previously registered entry

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\EntryApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry = new \Swagger\Client\Model\Entry(); // \Swagger\Client\Model\Entry | Create a new entry for the specified chain
$current_anchor_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | 

try {
    $result = $api_instance->createEntry($context, $chain_id, $entry, $current_anchor_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EntryApi->createEntry: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain_id** | **string**| chainId |
 **entry** | [**\Swagger\Client\Model\Entry**](../Model/Entry.md)| Create a new entry for the specified chain |
 **current_anchor_time** | **\DateTime**|  | [optional]

### Return type

[**\Swagger\Client\Model\CommittedEntryResponse**](../Model/CommittedEntryResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **entryById**
> \Swagger\Client\Model\AnchoredEntryResponse entryById($context, $chain_id, $entry_id, $current_anchor_time)

Get an existing entry in the provided chain

Get an existing entry in the provided chain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\EntryApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry_id = "entry_id_example"; // string | entryId
$current_anchor_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | 

try {
    $result = $api_instance->entryById($context, $chain_id, $entry_id, $current_anchor_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EntryApi->entryById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain_id** | **string**| chainId |
 **entry_id** | **string**| entryId |
 **current_anchor_time** | **\DateTime**|  | [optional]

### Return type

[**\Swagger\Client\Model\AnchoredEntryResponse**](../Model/AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **entryByRequest**
> \Swagger\Client\Model\AnchoredEntryResponse entryByRequest($context, $chain_id, $entry, $current_anchor_time)

Get an existing entry in the provided chain

Get an existing entry in the provided chain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\EntryApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry = new \Swagger\Client\Model\Entry(); // \Swagger\Client\Model\Entry | Retrieve the entry
$current_anchor_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | 

try {
    $result = $api_instance->entryByRequest($context, $chain_id, $entry, $current_anchor_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EntryApi->entryByRequest: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain_id** | **string**| chainId |
 **entry** | [**\Swagger\Client\Model\Entry**](../Model/Entry.md)| Retrieve the entry |
 **current_anchor_time** | **\DateTime**|  | [optional]

### Return type

[**\Swagger\Client\Model\AnchoredEntryResponse**](../Model/AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **firstEntry**
> \Swagger\Client\Model\AnchoredEntryResponse firstEntry($context, $chain_id)

Get the first entry in the provided chain

Get the first entry in the provided chain. This is the oldest entry also called the chain tail.  Please note that the achorTimes will only contain the first anchor time. Call getEntry to retrieve all times

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\EntryApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId

try {
    $result = $api_instance->firstEntry($context, $chain_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EntryApi->firstEntry: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain_id** | **string**| chainId |

### Return type

[**\Swagger\Client\Model\AnchoredEntryResponse**](../Model/AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **lastEntry**
> \Swagger\Client\Model\AnchoredEntryResponse lastEntry($context, $chain_id)

Get the last entry in the provided chain.

Get the last entry in the provided chain. This is the most recent entry also called the chain head. Please note that the achorTimes will only contain the latest anchor time. Call getEntry to retrieve all times

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\EntryApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId

try {
    $result = $api_instance->lastEntry($context, $chain_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EntryApi->lastEntry: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain_id** | **string**| chainId |

### Return type

[**\Swagger\Client\Model\AnchoredEntryResponse**](../Model/AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **nextEntryById**
> \Swagger\Client\Model\AnchoredEntryResponse nextEntryById($context, $chain_id, $entry_id, $current_anchor_time)

Get the entry after the supplied entry Id (the next) in the provided chain

Get the entry after the supplied entry Id (the next) in the provided chain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\EntryApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry_id = "entry_id_example"; // string | entryId
$current_anchor_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | 

try {
    $result = $api_instance->nextEntryById($context, $chain_id, $entry_id, $current_anchor_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EntryApi->nextEntryById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain_id** | **string**| chainId |
 **entry_id** | **string**| entryId |
 **current_anchor_time** | **\DateTime**|  | [optional]

### Return type

[**\Swagger\Client\Model\AnchoredEntryResponse**](../Model/AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **nextEntryByRequest**
> \Swagger\Client\Model\AnchoredEntryResponse nextEntryByRequest($context, $chain_id, $entry, $current_anchor_time)

Get the entry after the supplied entry Id (the next) in the provided chain

Get the entry after the supplied entry Id (the next) in the provided chain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\EntryApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry = new \Swagger\Client\Model\Entry(); // \Swagger\Client\Model\Entry | Retrieve the entry
$current_anchor_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | 

try {
    $result = $api_instance->nextEntryByRequest($context, $chain_id, $entry, $current_anchor_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EntryApi->nextEntryByRequest: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain_id** | **string**| chainId |
 **entry** | [**\Swagger\Client\Model\Entry**](../Model/Entry.md)| Retrieve the entry |
 **current_anchor_time** | **\DateTime**|  | [optional]

### Return type

[**\Swagger\Client\Model\AnchoredEntryResponse**](../Model/AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **previousEntryById**
> \Swagger\Client\Model\AnchoredEntryResponse previousEntryById($context, $chain_id, $entry_id, $current_anchor_time)

Get the entry before the supplied entry Id (the previous) in the provided chain

Get the entry before the supplied entry Id (the previous) in the provided chain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\EntryApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry_id = "entry_id_example"; // string | entryId
$current_anchor_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | 

try {
    $result = $api_instance->previousEntryById($context, $chain_id, $entry_id, $current_anchor_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EntryApi->previousEntryById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain_id** | **string**| chainId |
 **entry_id** | **string**| entryId |
 **current_anchor_time** | **\DateTime**|  | [optional]

### Return type

[**\Swagger\Client\Model\AnchoredEntryResponse**](../Model/AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **previousEntryByRequest**
> \Swagger\Client\Model\AnchoredEntryResponse previousEntryByRequest($context, $chain_id, $entry, $current_anchor_time)

Get the entry before the supplied entry Id (the previous) in the provided chain

Get the entry before the supplied entry Id (the previous) in the provided chain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\EntryApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry = new \Swagger\Client\Model\Entry(); // \Swagger\Client\Model\Entry | Retrieve the entry
$current_anchor_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | 

try {
    $result = $api_instance->previousEntryByRequest($context, $chain_id, $entry, $current_anchor_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EntryApi->previousEntryByRequest: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain_id** | **string**| chainId |
 **entry** | [**\Swagger\Client\Model\Entry**](../Model/Entry.md)| Retrieve the entry |
 **current_anchor_time** | **\DateTime**|  | [optional]

### Return type

[**\Swagger\Client\Model\AnchoredEntryResponse**](../Model/AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

