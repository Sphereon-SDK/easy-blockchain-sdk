# Sphereon\SDK\Blockchain\Easy\AllApi

All URIs are relative to *https://gw.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chainIdExists**](AllApi.md#chainIdExists) | **GET** /blockchain/easy/0.9/{context}/chains/id/{chainId} | Determine whether the Id of a chain exists in the blockchain
[**createBackend**](AllApi.md#createBackend) | **POST** /blockchain/easy/0.9/backends | Create a new backend
[**createChain**](AllApi.md#createChain) | **POST** /blockchain/easy/0.9/{context}/chains | Create a new chain
[**createContext**](AllApi.md#createContext) | **POST** /blockchain/easy/0.9/ | Create a new context
[**createEntry**](AllApi.md#createEntry) | **POST** /blockchain/easy/0.9/{context}/chains/{chainId}/entries | Create a new entry in the provided chain
[**deleteBackend**](AllApi.md#deleteBackend) | **DELETE** /blockchain/easy/0.9/backends/{backendId} | Delete backend by id (not by ledgername)
[**determineChainId**](AllApi.md#determineChainId) | **POST** /blockchain/easy/0.9/{context}/chains/id | Pre determine the Id of a chain request without anchoring it in the blockchain
[**determineEntryId**](AllApi.md#determineEntryId) | **POST** /blockchain/easy/0.9/{context}/chains/id/{chainId}/entries | Pre determine the Id of an entry request without anchoring the entry
[**entryById**](AllApi.md#entryById) | **GET** /blockchain/easy/0.9/{context}/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
[**entryByRequest**](AllApi.md#entryByRequest) | **POST** /blockchain/easy/0.9/{context}/chains/{chainId}/entries/entry | Get an existing entry in the provided chain
[**entryIdExists**](AllApi.md#entryIdExists) | **GET** /blockchain/easy/0.9/{context}/chains/id/{chainId}/entries/{entryId} | Determine whether the Id of an entry exists in the blockchain
[**findBackends**](AllApi.md#findBackends) | **GET** /blockchain/easy/0.9/backends/{backendId}/find | Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others
[**firstEntry**](AllApi.md#firstEntry) | **GET** /blockchain/easy/0.9/{context}/chains/{chainId}/entries/first | Get the first entry in the provided chain. This is the oldest entry also called the chain tail.  Please note that the achorTimes will only contain the first anchor time. Call getEntry to retrieve all times
[**getBackend**](AllApi.md#getBackend) | **GET** /blockchain/easy/0.9/backends/{backendId} | Get existing backend by id (not by ledgername). Optionally including public backend of others
[**getContext**](AllApi.md#getContext) | **GET** /blockchain/easy/0.9/{context} | Get an existing context
[**lastEntry**](AllApi.md#lastEntry) | **GET** /blockchain/easy/0.9/{context}/chains/{chainId}/entries/last | Get the last entry in the provided chain. This is the most recent entry also called the chain head. Please note that the achorTimes will only contain the latest anchor time. Call getEntry to retrieve all times
[**listBackends**](AllApi.md#listBackends) | **GET** /blockchain/easy/0.9/backends | List existing backends.
[**nextEntryById**](AllApi.md#nextEntryById) | **GET** /blockchain/easy/0.9/{context}/chains/{chainId}/entries/{entryId}/next | Get the entry after the supplied entry Id (the next) in the provided chain
[**nextEntryByRequest**](AllApi.md#nextEntryByRequest) | **POST** /blockchain/easy/0.9/{context}/chains/{chainId}/entries/entry/next | Get the entry after the supplied entry Id (the next) in the provided chain
[**previousEntryById**](AllApi.md#previousEntryById) | **GET** /blockchain/easy/0.9/{context}/chains/{chainId}/entries/{entryId}/previous | Get the entry before the supplied entry Id (the previous) in the provided chain
[**previousEntryByRequest**](AllApi.md#previousEntryByRequest) | **POST** /blockchain/easy/0.9/{context}/chains/{chainId}/entries/entry/previous | Get the entry before the supplied entry Id (the previous) in the provided chain


# **chainIdExists**
> \Sphereon\SDK\Blockchain\Easy\Model\IdResponse chainIdExists($context, $chain_id)

Determine whether the Id of a chain exists in the blockchain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId

try {
    $result = $api_instance->chainIdExists($context, $chain_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->chainIdExists: ', $e->getMessage(), PHP_EOL;
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

# **createBackend**
> \Sphereon\SDK\Blockchain\Easy\Model\Backend createBackend($backend)

Create a new backend

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
$backend = new \Sphereon\SDK\Blockchain\Easy\Model\Backend(); // \Sphereon\SDK\Blockchain\Easy\Model\Backend | backend

try {
    $result = $api_instance->createBackend($backend);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->createBackend: ', $e->getMessage(), PHP_EOL;
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

# **createChain**
> \Sphereon\SDK\Blockchain\Easy\Model\CommittedChainResponse createChain($context, $chain)

Create a new chain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
$context = "context_example"; // string | context
$chain = new \Sphereon\SDK\Blockchain\Easy\Model\Chain(); // \Sphereon\SDK\Blockchain\Easy\Model\Chain | Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!

try {
    $result = $api_instance->createChain($context, $chain);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->createChain: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain** | [**\Sphereon\SDK\Blockchain\Easy\Model\Chain**](../Model/Chain.md)| Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! |

### Return type

[**\Sphereon\SDK\Blockchain\Easy\Model\CommittedChainResponse**](../Model/CommittedChainResponse.md)

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

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
$context = new \Sphereon\SDK\Blockchain\Easy\Model\Context(); // \Sphereon\SDK\Blockchain\Easy\Model\Context | context

try {
    $result = $api_instance->createContext($context);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->createContext: ', $e->getMessage(), PHP_EOL;
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

# **createEntry**
> \Sphereon\SDK\Blockchain\Easy\Model\CommittedEntryResponse createEntry($context, $chain_id, $entry, $current_anchor_time)

Create a new entry in the provided chain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry = new \Sphereon\SDK\Blockchain\Easy\Model\Entry(); // \Sphereon\SDK\Blockchain\Easy\Model\Entry | Create a new entry for the specified chain
$current_anchor_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | 

try {
    $result = $api_instance->createEntry($context, $chain_id, $entry, $current_anchor_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->createEntry: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain_id** | **string**| chainId |
 **entry** | [**\Sphereon\SDK\Blockchain\Easy\Model\Entry**](../Model/Entry.md)| Create a new entry for the specified chain |
 **current_anchor_time** | **\DateTime**|  | [optional]

### Return type

[**\Sphereon\SDK\Blockchain\Easy\Model\CommittedEntryResponse**](../Model/CommittedEntryResponse.md)

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

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
$backend_id = "backend_id_example"; // string | backendId

try {
    $api_instance->deleteBackend($backend_id);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->deleteBackend: ', $e->getMessage(), PHP_EOL;
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

# **determineChainId**
> \Sphereon\SDK\Blockchain\Easy\Model\IdResponse determineChainId($context, $chain, $check_existence)

Pre determine the Id of a chain request without anchoring it in the blockchain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
$context = "context_example"; // string | context
$chain = new \Sphereon\SDK\Blockchain\Easy\Model\Chain(); // \Sphereon\SDK\Blockchain\Easy\Model\Chain | Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!
$check_existence = false; // bool | Check whether the id exists

try {
    $result = $api_instance->determineChainId($context, $chain, $check_existence);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->determineChainId: ', $e->getMessage(), PHP_EOL;
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

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry = new \Sphereon\SDK\Blockchain\Easy\Model\Entry(); // \Sphereon\SDK\Blockchain\Easy\Model\Entry | The entry to determine the hash for on the specified chain
$check_existence = false; // bool | Check whether the id exists

try {
    $result = $api_instance->determineEntryId($context, $chain_id, $entry, $check_existence);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->determineEntryId: ', $e->getMessage(), PHP_EOL;
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

# **entryById**
> \Sphereon\SDK\Blockchain\Easy\Model\AnchoredEntryResponse entryById($context, $chain_id, $entry_id, $current_anchor_time)

Get an existing entry in the provided chain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry_id = "entry_id_example"; // string | entryId
$current_anchor_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | 

try {
    $result = $api_instance->entryById($context, $chain_id, $entry_id, $current_anchor_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->entryById: ', $e->getMessage(), PHP_EOL;
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

[**\Sphereon\SDK\Blockchain\Easy\Model\AnchoredEntryResponse**](../Model/AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **entryByRequest**
> \Sphereon\SDK\Blockchain\Easy\Model\AnchoredEntryResponse entryByRequest($context, $chain_id, $entry, $current_anchor_time)

Get an existing entry in the provided chain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry = new \Sphereon\SDK\Blockchain\Easy\Model\Entry(); // \Sphereon\SDK\Blockchain\Easy\Model\Entry | Retrieve the entry
$current_anchor_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | 

try {
    $result = $api_instance->entryByRequest($context, $chain_id, $entry, $current_anchor_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->entryByRequest: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain_id** | **string**| chainId |
 **entry** | [**\Sphereon\SDK\Blockchain\Easy\Model\Entry**](../Model/Entry.md)| Retrieve the entry |
 **current_anchor_time** | **\DateTime**|  | [optional]

### Return type

[**\Sphereon\SDK\Blockchain\Easy\Model\AnchoredEntryResponse**](../Model/AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
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

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry_id = "entry_id_example"; // string | entryId

try {
    $result = $api_instance->entryIdExists($context, $chain_id, $entry_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->entryIdExists: ', $e->getMessage(), PHP_EOL;
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

# **findBackends**
> \Sphereon\SDK\Blockchain\Easy\Model\Backend[] findBackends($backend_id, $include_public)

Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
$backend_id = "backend_id_example"; // string | backendId
$include_public = false; // bool | includePublic

try {
    $result = $api_instance->findBackends($backend_id, $include_public);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->findBackends: ', $e->getMessage(), PHP_EOL;
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

# **firstEntry**
> \Sphereon\SDK\Blockchain\Easy\Model\AnchoredEntryResponse firstEntry($context, $chain_id)

Get the first entry in the provided chain. This is the oldest entry also called the chain tail.  Please note that the achorTimes will only contain the first anchor time. Call getEntry to retrieve all times

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId

try {
    $result = $api_instance->firstEntry($context, $chain_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->firstEntry: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain_id** | **string**| chainId |

### Return type

[**\Sphereon\SDK\Blockchain\Easy\Model\AnchoredEntryResponse**](../Model/AnchoredEntryResponse.md)

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

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
$backend_id = "backend_id_example"; // string | backendId
$include_public = false; // bool | includePublic

try {
    $result = $api_instance->getBackend($backend_id, $include_public);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->getBackend: ', $e->getMessage(), PHP_EOL;
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

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
$context = "context_example"; // string | context

try {
    $result = $api_instance->getContext($context);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->getContext: ', $e->getMessage(), PHP_EOL;
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

# **lastEntry**
> \Sphereon\SDK\Blockchain\Easy\Model\AnchoredEntryResponse lastEntry($context, $chain_id)

Get the last entry in the provided chain. This is the most recent entry also called the chain head. Please note that the achorTimes will only contain the latest anchor time. Call getEntry to retrieve all times

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId

try {
    $result = $api_instance->lastEntry($context, $chain_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->lastEntry: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain_id** | **string**| chainId |

### Return type

[**\Sphereon\SDK\Blockchain\Easy\Model\AnchoredEntryResponse**](../Model/AnchoredEntryResponse.md)

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

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();

try {
    $result = $api_instance->listBackends();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->listBackends: ', $e->getMessage(), PHP_EOL;
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

# **nextEntryById**
> \Sphereon\SDK\Blockchain\Easy\Model\AnchoredEntryResponse nextEntryById($context, $chain_id, $entry_id, $current_anchor_time)

Get the entry after the supplied entry Id (the next) in the provided chain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry_id = "entry_id_example"; // string | entryId
$current_anchor_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | 

try {
    $result = $api_instance->nextEntryById($context, $chain_id, $entry_id, $current_anchor_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->nextEntryById: ', $e->getMessage(), PHP_EOL;
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

[**\Sphereon\SDK\Blockchain\Easy\Model\AnchoredEntryResponse**](../Model/AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **nextEntryByRequest**
> \Sphereon\SDK\Blockchain\Easy\Model\AnchoredEntryResponse nextEntryByRequest($context, $chain_id, $entry, $current_anchor_time)

Get the entry after the supplied entry Id (the next) in the provided chain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry = new \Sphereon\SDK\Blockchain\Easy\Model\Entry(); // \Sphereon\SDK\Blockchain\Easy\Model\Entry | Retrieve the entry
$current_anchor_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | 

try {
    $result = $api_instance->nextEntryByRequest($context, $chain_id, $entry, $current_anchor_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->nextEntryByRequest: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain_id** | **string**| chainId |
 **entry** | [**\Sphereon\SDK\Blockchain\Easy\Model\Entry**](../Model/Entry.md)| Retrieve the entry |
 **current_anchor_time** | **\DateTime**|  | [optional]

### Return type

[**\Sphereon\SDK\Blockchain\Easy\Model\AnchoredEntryResponse**](../Model/AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **previousEntryById**
> \Sphereon\SDK\Blockchain\Easy\Model\AnchoredEntryResponse previousEntryById($context, $chain_id, $entry_id, $current_anchor_time)

Get the entry before the supplied entry Id (the previous) in the provided chain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry_id = "entry_id_example"; // string | entryId
$current_anchor_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | 

try {
    $result = $api_instance->previousEntryById($context, $chain_id, $entry_id, $current_anchor_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->previousEntryById: ', $e->getMessage(), PHP_EOL;
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

[**\Sphereon\SDK\Blockchain\Easy\Model\AnchoredEntryResponse**](../Model/AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **previousEntryByRequest**
> \Sphereon\SDK\Blockchain\Easy\Model\AnchoredEntryResponse previousEntryByRequest($context, $chain_id, $entry, $current_anchor_time)

Get the entry before the supplied entry Id (the previous) in the provided chain

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry = new \Sphereon\SDK\Blockchain\Easy\Model\Entry(); // \Sphereon\SDK\Blockchain\Easy\Model\Entry | Retrieve the entry
$current_anchor_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | 

try {
    $result = $api_instance->previousEntryByRequest($context, $chain_id, $entry, $current_anchor_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->previousEntryByRequest: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context |
 **chain_id** | **string**| chainId |
 **entry** | [**\Sphereon\SDK\Blockchain\Easy\Model\Entry**](../Model/Entry.md)| Retrieve the entry |
 **current_anchor_time** | **\DateTime**|  | [optional]

### Return type

[**\Sphereon\SDK\Blockchain\Easy\Model\AnchoredEntryResponse**](../Model/AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

