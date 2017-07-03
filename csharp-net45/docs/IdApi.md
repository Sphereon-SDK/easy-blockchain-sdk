# Sphereon.SDK.Blockchain.Easy.Api.IdApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ChainIdExists**](IdApi.md#chainidexists) | **GET** /blockchain/easy/0.9.1/{context}/chains/id/{chainId} | Determine whether the Id of a chain exists in the blockchain
[**DetermineChainId**](IdApi.md#determinechainid) | **POST** /blockchain/easy/0.9.1/{context}/chains/id | Pre determine the Id of a chain request without anchoring it in the blockchain
[**DetermineEntryId**](IdApi.md#determineentryid) | **POST** /blockchain/easy/0.9.1/{context}/chains/id/{chainId}/entries | Pre determine the Id of an entry request without anchoring the entry
[**EntryIdExists**](IdApi.md#entryidexists) | **GET** /blockchain/easy/0.9.1/{context}/chains/id/{chainId}/entries/{entryId} | Determine whether the Id of an entry exists in the blockchain


<a name="chainidexists"></a>
# **ChainIdExists**
> IdResponse ChainIdExists (string context, string chainId)

Determine whether the Id of a chain exists in the blockchain

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class ChainIdExistsExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new IdApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId

            try
            {
                // Determine whether the Id of a chain exists in the blockchain
                IdResponse result = apiInstance.ChainIdExists(context, chainId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling IdApi.ChainIdExists: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context | 
 **chainId** | **string**| chainId | 

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="determinechainid"></a>
# **DetermineChainId**
> IdResponse DetermineChainId (string context, Chain chain, bool? checkExistence = null)

Pre determine the Id of a chain request without anchoring it in the blockchain

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class DetermineChainIdExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new IdApi();
            var context = context_example;  // string | context
            var chain = new Chain(); // Chain | Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!
            var checkExistence = true;  // bool? | Check whether the id exists (optional)  (default to false)

            try
            {
                // Pre determine the Id of a chain request without anchoring it in the blockchain
                IdResponse result = apiInstance.DetermineChainId(context, chain, checkExistence);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling IdApi.DetermineChainId: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context | 
 **chain** | [**Chain**](Chain.md)| Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! | 
 **checkExistence** | **bool?**| Check whether the id exists | [optional] [default to false]

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="determineentryid"></a>
# **DetermineEntryId**
> IdResponse DetermineEntryId (string context, string chainId, Entry entry, bool? checkExistence = null)

Pre determine the Id of an entry request without anchoring the entry

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class DetermineEntryIdExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new IdApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId
            var entry = new Entry(); // Entry | The entry to determine the hash for on the specified chain
            var checkExistence = true;  // bool? | Check whether the id exists (optional)  (default to false)

            try
            {
                // Pre determine the Id of an entry request without anchoring the entry
                IdResponse result = apiInstance.DetermineEntryId(context, chainId, entry, checkExistence);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling IdApi.DetermineEntryId: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context | 
 **chainId** | **string**| chainId | 
 **entry** | [**Entry**](Entry.md)| The entry to determine the hash for on the specified chain | 
 **checkExistence** | **bool?**| Check whether the id exists | [optional] [default to false]

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="entryidexists"></a>
# **EntryIdExists**
> IdResponse EntryIdExists (string context, string chainId, string entryId)

Determine whether the Id of an entry exists in the blockchain

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class EntryIdExistsExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new IdApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId
            var entryId = entryId_example;  // string | entryId

            try
            {
                // Determine whether the Id of an entry exists in the blockchain
                IdResponse result = apiInstance.EntryIdExists(context, chainId, entryId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling IdApi.EntryIdExists: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context | 
 **chainId** | **string**| chainId | 
 **entryId** | **string**| entryId | 

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

