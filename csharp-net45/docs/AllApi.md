# Sphereon.SDK.Blockchain.Easy.Api.AllApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ChainIdExists**](AllApi.md#chainidexists) | **GET** /blockchain/easy/0.9.1/{context}/chains/id/{chainId} | Determine whether the Id of a chain exists in the blockchain
[**CreateBackend**](AllApi.md#createbackend) | **POST** /blockchain/easy/0.9.1/backends | Create a new backend
[**CreateChain**](AllApi.md#createchain) | **POST** /blockchain/easy/0.9.1/{context}/chains | Create a new chain
[**CreateContext**](AllApi.md#createcontext) | **POST** /blockchain/easy/0.9.1/ | Create a new context
[**CreateEntry**](AllApi.md#createentry) | **POST** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries | Create a new entry in the provided chain
[**DeleteBackend**](AllApi.md#deletebackend) | **DELETE** /blockchain/easy/0.9.1/backends/{backendId} | Delete backend by id (not by ledgername)
[**DetermineChainId**](AllApi.md#determinechainid) | **POST** /blockchain/easy/0.9.1/{context}/chains/id | Pre determine the Id of a chain request without anchoring it in the blockchain
[**DetermineEntryId**](AllApi.md#determineentryid) | **POST** /blockchain/easy/0.9.1/{context}/chains/id/{chainId}/entries | Pre determine the Id of an entry request without anchoring the entry
[**EntryById**](AllApi.md#entrybyid) | **GET** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
[**EntryByRequest**](AllApi.md#entrybyrequest) | **POST** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry | Get an existing entry in the provided chain
[**EntryIdExists**](AllApi.md#entryidexists) | **GET** /blockchain/easy/0.9.1/{context}/chains/id/{chainId}/entries/{entryId} | Determine whether the Id of an entry exists in the blockchain
[**FindBackends**](AllApi.md#findbackends) | **GET** /blockchain/easy/0.9.1/backends/{backendId}/find | Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others
[**FirstEntry**](AllApi.md#firstentry) | **GET** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/first | Get the first entry in the provided chain. This is the oldest entry also called the chain tail.  Please note that the achorTimes will only contain the first anchor time. Call getEntry to retrieve all times
[**GetBackend**](AllApi.md#getbackend) | **GET** /blockchain/easy/0.9.1/backends/{backendId} | Get existing backend by id (not by ledgername). Optionally including public backend of others
[**GetContext**](AllApi.md#getcontext) | **GET** /blockchain/easy/0.9.1/{context} | Get an existing context
[**LastEntry**](AllApi.md#lastentry) | **GET** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/last | Get the last entry in the provided chain. This is the most recent entry also called the chain head. Please note that the achorTimes will only contain the latest anchor time. Call getEntry to retrieve all times
[**ListBackends**](AllApi.md#listbackends) | **GET** /blockchain/easy/0.9.1/backends | List existing backends.
[**NextEntryById**](AllApi.md#nextentrybyid) | **GET** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId}/next | Get the entry after the supplied entry Id (the next) in the provided chain
[**NextEntryByRequest**](AllApi.md#nextentrybyrequest) | **POST** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry/next | Get the entry after the supplied entry Id (the next) in the provided chain
[**PreviousEntryById**](AllApi.md#previousentrybyid) | **GET** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId}/previous | Get the entry before the supplied entry Id (the previous) in the provided chain
[**PreviousEntryByRequest**](AllApi.md#previousentrybyrequest) | **POST** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry/previous | Get the entry before the supplied entry Id (the previous) in the provided chain


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

            var apiInstance = new AllApi();
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
                Debug.Print("Exception when calling AllApi.ChainIdExists: " + e.Message );
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

<a name="createbackend"></a>
# **CreateBackend**
> Backend CreateBackend (Backend backend)

Create a new backend

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class CreateBackendExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var backend = new Backend(); // Backend | backend

            try
            {
                // Create a new backend
                Backend result = apiInstance.CreateBackend(backend);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.CreateBackend: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backend** | [**Backend**](Backend.md)| backend | 

### Return type

[**Backend**](Backend.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createchain"></a>
# **CreateChain**
> CommittedChainResponse CreateChain (string context, Chain chain)

Create a new chain

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class CreateChainExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var context = context_example;  // string | context
            var chain = new Chain(); // Chain | Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!

            try
            {
                // Create a new chain
                CommittedChainResponse result = apiInstance.CreateChain(context, chain);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.CreateChain: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context | 
 **chain** | [**Chain**](Chain.md)| Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! | 

### Return type

[**CommittedChainResponse**](CommittedChainResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createcontext"></a>
# **CreateContext**
> Context CreateContext (Context context)

Create a new context

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class CreateContextExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var context = new Context(); // Context | context

            try
            {
                // Create a new context
                Context result = apiInstance.CreateContext(context);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.CreateContext: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | [**Context**](Context.md)| context | 

### Return type

[**Context**](Context.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createentry"></a>
# **CreateEntry**
> CommittedEntryResponse CreateEntry (string context, string chainId, Entry entry, DateTime? currentAnchorTime = null)

Create a new entry in the provided chain

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class CreateEntryExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId
            var entry = new Entry(); // Entry | Create a new entry for the specified chain
            var currentAnchorTime = 2013-10-20T19:20:30+01:00;  // DateTime? |  (optional) 

            try
            {
                // Create a new entry in the provided chain
                CommittedEntryResponse result = apiInstance.CreateEntry(context, chainId, entry, currentAnchorTime);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.CreateEntry: " + e.Message );
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
 **entry** | [**Entry**](Entry.md)| Create a new entry for the specified chain | 
 **currentAnchorTime** | **DateTime?**|  | [optional] 

### Return type

[**CommittedEntryResponse**](CommittedEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletebackend"></a>
# **DeleteBackend**
> void DeleteBackend (string backendId)

Delete backend by id (not by ledgername)

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class DeleteBackendExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var backendId = backendId_example;  // string | backendId

            try
            {
                // Delete backend by id (not by ledgername)
                apiInstance.DeleteBackend(backendId);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.DeleteBackend: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **string**| backendId | 

### Return type

void (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

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

            var apiInstance = new AllApi();
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
                Debug.Print("Exception when calling AllApi.DetermineChainId: " + e.Message );
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

            var apiInstance = new AllApi();
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
                Debug.Print("Exception when calling AllApi.DetermineEntryId: " + e.Message );
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

<a name="entrybyid"></a>
# **EntryById**
> AnchoredEntryResponse EntryById (string context, string chainId, string entryId, DateTime? currentAnchorTime = null)

Get an existing entry in the provided chain

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class EntryByIdExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId
            var entryId = entryId_example;  // string | entryId
            var currentAnchorTime = 2013-10-20T19:20:30+01:00;  // DateTime? |  (optional) 

            try
            {
                // Get an existing entry in the provided chain
                AnchoredEntryResponse result = apiInstance.EntryById(context, chainId, entryId, currentAnchorTime);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.EntryById: " + e.Message );
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
 **currentAnchorTime** | **DateTime?**|  | [optional] 

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="entrybyrequest"></a>
# **EntryByRequest**
> AnchoredEntryResponse EntryByRequest (string context, string chainId, Entry entry, DateTime? currentAnchorTime = null)

Get an existing entry in the provided chain

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class EntryByRequestExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId
            var entry = new Entry(); // Entry | Retrieve the entry
            var currentAnchorTime = 2013-10-20T19:20:30+01:00;  // DateTime? |  (optional) 

            try
            {
                // Get an existing entry in the provided chain
                AnchoredEntryResponse result = apiInstance.EntryByRequest(context, chainId, entry, currentAnchorTime);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.EntryByRequest: " + e.Message );
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
 **entry** | [**Entry**](Entry.md)| Retrieve the entry | 
 **currentAnchorTime** | **DateTime?**|  | [optional] 

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
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

            var apiInstance = new AllApi();
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
                Debug.Print("Exception when calling AllApi.EntryIdExists: " + e.Message );
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

<a name="findbackends"></a>
# **FindBackends**
> List<Backend> FindBackends (string backendId, bool? includePublic = null)

Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class FindBackendsExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var backendId = backendId_example;  // string | backendId
            var includePublic = true;  // bool? | includePublic (optional)  (default to false)

            try
            {
                // Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others
                List&lt;Backend&gt; result = apiInstance.FindBackends(backendId, includePublic);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.FindBackends: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **string**| backendId | 
 **includePublic** | **bool?**| includePublic | [optional] [default to false]

### Return type

[**List<Backend>**](Backend.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="firstentry"></a>
# **FirstEntry**
> AnchoredEntryResponse FirstEntry (string context, string chainId)

Get the first entry in the provided chain. This is the oldest entry also called the chain tail.  Please note that the achorTimes will only contain the first anchor time. Call getEntry to retrieve all times

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class FirstEntryExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId

            try
            {
                // Get the first entry in the provided chain. This is the oldest entry also called the chain tail.  Please note that the achorTimes will only contain the first anchor time. Call getEntry to retrieve all times
                AnchoredEntryResponse result = apiInstance.FirstEntry(context, chainId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.FirstEntry: " + e.Message );
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

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getbackend"></a>
# **GetBackend**
> Backend GetBackend (string backendId, bool? includePublic = null)

Get existing backend by id (not by ledgername). Optionally including public backend of others

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class GetBackendExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var backendId = backendId_example;  // string | backendId
            var includePublic = true;  // bool? | includePublic (optional)  (default to false)

            try
            {
                // Get existing backend by id (not by ledgername). Optionally including public backend of others
                Backend result = apiInstance.GetBackend(backendId, includePublic);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.GetBackend: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **string**| backendId | 
 **includePublic** | **bool?**| includePublic | [optional] [default to false]

### Return type

[**Backend**](Backend.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getcontext"></a>
# **GetContext**
> Context GetContext (string context)

Get an existing context

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class GetContextExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var context = context_example;  // string | context

            try
            {
                // Get an existing context
                Context result = apiInstance.GetContext(context);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.GetContext: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context** | **string**| context | 

### Return type

[**Context**](Context.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="lastentry"></a>
# **LastEntry**
> AnchoredEntryResponse LastEntry (string context, string chainId)

Get the last entry in the provided chain. This is the most recent entry also called the chain head. Please note that the achorTimes will only contain the latest anchor time. Call getEntry to retrieve all times

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class LastEntryExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId

            try
            {
                // Get the last entry in the provided chain. This is the most recent entry also called the chain head. Please note that the achorTimes will only contain the latest anchor time. Call getEntry to retrieve all times
                AnchoredEntryResponse result = apiInstance.LastEntry(context, chainId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.LastEntry: " + e.Message );
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

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="listbackends"></a>
# **ListBackends**
> List<Backend> ListBackends ()

List existing backends.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class ListBackendsExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();

            try
            {
                // List existing backends.
                List&lt;Backend&gt; result = apiInstance.ListBackends();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.ListBackends: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<Backend>**](Backend.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="nextentrybyid"></a>
# **NextEntryById**
> AnchoredEntryResponse NextEntryById (string context, string chainId, string entryId, DateTime? currentAnchorTime = null)

Get the entry after the supplied entry Id (the next) in the provided chain

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class NextEntryByIdExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId
            var entryId = entryId_example;  // string | entryId
            var currentAnchorTime = 2013-10-20T19:20:30+01:00;  // DateTime? |  (optional) 

            try
            {
                // Get the entry after the supplied entry Id (the next) in the provided chain
                AnchoredEntryResponse result = apiInstance.NextEntryById(context, chainId, entryId, currentAnchorTime);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.NextEntryById: " + e.Message );
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
 **currentAnchorTime** | **DateTime?**|  | [optional] 

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="nextentrybyrequest"></a>
# **NextEntryByRequest**
> AnchoredEntryResponse NextEntryByRequest (string context, string chainId, Entry entry, DateTime? currentAnchorTime = null)

Get the entry after the supplied entry Id (the next) in the provided chain

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class NextEntryByRequestExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId
            var entry = new Entry(); // Entry | Retrieve the entry
            var currentAnchorTime = 2013-10-20T19:20:30+01:00;  // DateTime? |  (optional) 

            try
            {
                // Get the entry after the supplied entry Id (the next) in the provided chain
                AnchoredEntryResponse result = apiInstance.NextEntryByRequest(context, chainId, entry, currentAnchorTime);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.NextEntryByRequest: " + e.Message );
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
 **entry** | [**Entry**](Entry.md)| Retrieve the entry | 
 **currentAnchorTime** | **DateTime?**|  | [optional] 

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="previousentrybyid"></a>
# **PreviousEntryById**
> AnchoredEntryResponse PreviousEntryById (string context, string chainId, string entryId, DateTime? currentAnchorTime = null)

Get the entry before the supplied entry Id (the previous) in the provided chain

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class PreviousEntryByIdExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId
            var entryId = entryId_example;  // string | entryId
            var currentAnchorTime = 2013-10-20T19:20:30+01:00;  // DateTime? |  (optional) 

            try
            {
                // Get the entry before the supplied entry Id (the previous) in the provided chain
                AnchoredEntryResponse result = apiInstance.PreviousEntryById(context, chainId, entryId, currentAnchorTime);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.PreviousEntryById: " + e.Message );
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
 **currentAnchorTime** | **DateTime?**|  | [optional] 

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="previousentrybyrequest"></a>
# **PreviousEntryByRequest**
> AnchoredEntryResponse PreviousEntryByRequest (string context, string chainId, Entry entry, DateTime? currentAnchorTime = null)

Get the entry before the supplied entry Id (the previous) in the provided chain

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class PreviousEntryByRequestExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId
            var entry = new Entry(); // Entry | Retrieve the entry
            var currentAnchorTime = 2013-10-20T19:20:30+01:00;  // DateTime? |  (optional) 

            try
            {
                // Get the entry before the supplied entry Id (the previous) in the provided chain
                AnchoredEntryResponse result = apiInstance.PreviousEntryByRequest(context, chainId, entry, currentAnchorTime);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.PreviousEntryByRequest: " + e.Message );
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
 **entry** | [**Entry**](Entry.md)| Retrieve the entry | 
 **currentAnchorTime** | **DateTime?**|  | [optional] 

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

