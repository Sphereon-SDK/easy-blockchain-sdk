# Swagger\Client\AllApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/easy/0.10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chainIdExists**](AllApi.md#chainIdExists) | **GET** /{context}/chains/id/{chainId} | Determine chain id exists
[**createBackend**](AllApi.md#createBackend) | **POST** /backends | Create a new backend
[**createChain**](AllApi.md#createChain) | **POST** /{context}/chains | Create a new chain
[**createContext**](AllApi.md#createContext) | **POST** /contexts | Create context
[**createEntry**](AllApi.md#createEntry) | **POST** /{context}/chains/{chainId}/entries | Create a new entry in the provided chain
[**deleteBackend**](AllApi.md#deleteBackend) | **DELETE** /backends/{backendId} | Delete a backend
[**deleteContext**](AllApi.md#deleteContext) | **DELETE** /contexts/{context} | Delete context
[**determineChainId**](AllApi.md#determineChainId) | **POST** /{context}/chains/id | Predetermine id of chain
[**determineEntryId**](AllApi.md#determineEntryId) | **POST** /{context}/chains/id/{chainId}/entries | Predetermine id of an entry
[**entryById**](AllApi.md#entryById) | **GET** /{context}/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
[**entryByRequest**](AllApi.md#entryByRequest) | **POST** /{context}/chains/{chainId}/entries/entry | Get an existing entry in the provided chain
[**entryIdExists**](AllApi.md#entryIdExists) | **GET** /{context}/chains/id/{chainId}/entries/{entryId} | Determine entry id exists
[**findBackends**](AllApi.md#findBackends) | **GET** /backends/{backendId}/find | Find backends
[**firstEntry**](AllApi.md#firstEntry) | **GET** /{context}/chains/{chainId}/entries/first | Get the first entry in the provided chain
[**getBackend**](AllApi.md#getBackend) | **GET** /backends/{backendId} | Get backend by id
[**getContext**](AllApi.md#getContext) | **GET** /contexts/{context} | Get context
[**lastEntry**](AllApi.md#lastEntry) | **GET** /{context}/chains/{chainId}/entries/last | Get the last entry in the provided chain.
[**listBackends**](AllApi.md#listBackends) | **GET** /backends | List backends
[**nextEntryById**](AllApi.md#nextEntryById) | **GET** /{context}/chains/{chainId}/entries/{entryId}/next | Get the entry after the supplied entry Id (the next) in the provided chain
[**nextEntryByRequest**](AllApi.md#nextEntryByRequest) | **POST** /{context}/chains/{chainId}/entries/entry/next | Get the entry after the supplied entry Id (the next) in the provided chain
[**previousEntryById**](AllApi.md#previousEntryById) | **GET** /{context}/chains/{chainId}/entries/{entryId}/previous | Get the entry before the supplied entry Id (the previous) in the provided chain
[**previousEntryByRequest**](AllApi.md#previousEntryByRequest) | **POST** /{context}/chains/{chainId}/entries/entry/previous | Get the entry before the supplied entry Id (the previous) in the provided chain


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

$api_instance = new Swagger\Client\Api\AllApi();
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

[**\Swagger\Client\Model\IdResponse**](../Model/IdResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createBackend**
> \Swagger\Client\Model\Backend createBackend($backend)

Create a new backend

Create a new backend. A Backend is the link to one blockchain implementation and it' s nodes. Unless you create your own private blockchain network, you should not have to create a new backend. Just use one of the public backends available.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\AllApi();
$backend = new \Swagger\Client\Model\Backend(); // \Swagger\Client\Model\Backend | backend

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
 **backend** | [**\Swagger\Client\Model\Backend**](../Model/Backend.md)| backend |

### Return type

[**\Swagger\Client\Model\Backend**](../Model/Backend.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

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

$api_instance = new Swagger\Client\Api\AllApi();
$context = "context_example"; // string | context
$chain = new \Swagger\Client\Model\Chain(); // \Swagger\Client\Model\Chain | Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!

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
 **chain** | [**\Swagger\Client\Model\Chain**](../Model/Chain.md)| Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! |

### Return type

[**\Swagger\Client\Model\CommittedChainResponse**](../Model/CommittedChainResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

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

$api_instance = new Swagger\Client\Api\AllApi();
$context = new \Swagger\Client\Model\Context(); // \Swagger\Client\Model\Context | context

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
 **context** | [**\Swagger\Client\Model\Context**](../Model/Context.md)| context |

### Return type

[**\Swagger\Client\Model\Context**](../Model/Context.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

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

$api_instance = new Swagger\Client\Api\AllApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry = new \Swagger\Client\Model\Entry(); // \Swagger\Client\Model\Entry | Create a new entry for the specified chain
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

# **deleteBackend**
> \Swagger\Client\Model\Backend deleteBackend($backend_id)

Delete a backend

Delete backend by id (not by name)

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\AllApi();
$backend_id = "backend_id_example"; // string | backendId

try {
    $result = $api_instance->deleteBackend($backend_id);
    print_r($result);
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

[**\Swagger\Client\Model\Backend**](../Model/Backend.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

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

$api_instance = new Swagger\Client\Api\AllApi();
$context = "context_example"; // string | context

try {
    $result = $api_instance->deleteContext($context);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->deleteContext: ', $e->getMessage(), PHP_EOL;
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

$api_instance = new Swagger\Client\Api\AllApi();
$context = "context_example"; // string | context
$chain = new \Swagger\Client\Model\Chain(); // \Swagger\Client\Model\Chain | Determine a chain hash. The entry needs at least a (combination of) globally unique external Id in the complete Blockchain network!
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

$api_instance = new Swagger\Client\Api\AllApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry = new \Swagger\Client\Model\Entry(); // \Swagger\Client\Model\Entry | The entry to determine the hash for on the specified chain
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

$api_instance = new Swagger\Client\Api\AllApi();
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

$api_instance = new Swagger\Client\Api\AllApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry = new \Swagger\Client\Model\Entry(); // \Swagger\Client\Model\Entry | Retrieve the entry
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

$api_instance = new Swagger\Client\Api\AllApi();
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

[**\Swagger\Client\Model\IdResponse**](../Model/IdResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **findBackends**
> \Swagger\Client\Model\Backend[] findBackends($backend_id, $include_public)

Find backends

Find existing backend(s) by id (single result) and/or name (multiple results). Optionally including public backends of others. Please note that we never return sensitive information like password or rpc hosts. Even not for backend owners themselves

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\AllApi();
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

[**\Swagger\Client\Model\Backend[]**](../Model/Backend.md)

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

$api_instance = new Swagger\Client\Api\AllApi();
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

[**\Swagger\Client\Model\AnchoredEntryResponse**](../Model/AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBackend**
> \Swagger\Client\Model\Backend getBackend($backend_id, $include_public)

Get backend by id

Get existing backend by id (not by name). Optionally including public backend of others. Please note that we never return sensitive information like password or rpc hosts. Even not for backend owners themselves

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\AllApi();
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

[**\Swagger\Client\Model\Backend**](../Model/Backend.md)

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

$api_instance = new Swagger\Client\Api\AllApi();
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

[**\Swagger\Client\Model\Context**](../Model/Context.md)

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

$api_instance = new Swagger\Client\Api\AllApi();
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

[**\Swagger\Client\Model\AnchoredEntryResponse**](../Model/AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listBackends**
> \Swagger\Client\Model\Backend[] listBackends($include_public)

List backends

List existing backends. Optionally including public backends of others.  Please note that we never return sensitive information like password or rpc hosts. Even not for backend owners themselves

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\AllApi();
$include_public = false; // bool | includePublic

try {
    $result = $api_instance->listBackends($include_public);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->listBackends: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include_public** | **bool**| includePublic | [optional] [default to false]

### Return type

[**\Swagger\Client\Model\Backend[]**](../Model/Backend.md)

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

$api_instance = new Swagger\Client\Api\AllApi();
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

$api_instance = new Swagger\Client\Api\AllApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry = new \Swagger\Client\Model\Entry(); // \Swagger\Client\Model\Entry | Retrieve the entry
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

$api_instance = new Swagger\Client\Api\AllApi();
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

$api_instance = new Swagger\Client\Api\AllApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId
$entry = new \Swagger\Client\Model\Entry(); // \Swagger\Client\Model\Entry | Retrieve the entry
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

