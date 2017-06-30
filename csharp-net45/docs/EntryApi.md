# Sphereon.SDK.Blockchain.Easy.Api.EntryApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateEntry**](EntryApi.md#createentry) | **POST** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries | Create a new entry in the provided chain
[**EntryById**](EntryApi.md#entrybyid) | **GET** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
[**EntryByRequest**](EntryApi.md#entrybyrequest) | **POST** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry | Get an existing entry in the provided chain
[**FirstEntry**](EntryApi.md#firstentry) | **GET** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/first | Get the first entry in the provided chain. This is the oldest entry also called the chain tail
[**LastEntry**](EntryApi.md#lastentry) | **GET** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/last | Get the last entry in the provided chain. This is the most recent entry also called the chain head
[**NextEntryById**](EntryApi.md#nextentrybyid) | **GET** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId}/next | Get the entry after the supplied entry Id (the next) in the provided chain
[**NextEntryByRequest**](EntryApi.md#nextentrybyrequest) | **POST** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry/next | Get the entry after the supplied entry Id (the next) in the provided chain
[**PreviousEntryById**](EntryApi.md#previousentrybyid) | **GET** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/{entryId}/previous | Get the entry before the supplied entry Id (the previous) in the provided chain
[**PreviousEntryByRequest**](EntryApi.md#previousentrybyrequest) | **POST** /blockchain/easy/0.9.1/{context}/chains/{chainId}/entries/entry/previous | Get the entry before the supplied entry Id (the previous) in the provided chain


<a name="createentry"></a>
# **CreateEntry**
> CommittedEntryResponse CreateEntry (string context, string chainId, Entry entry)

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

            var apiInstance = new EntryApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId
            var entry = new Entry(); // Entry | Create a new entry for the specified chain

            try
            {
                // Create a new entry in the provided chain
                CommittedEntryResponse result = apiInstance.CreateEntry(context, chainId, entry);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EntryApi.CreateEntry: " + e.Message );
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

### Return type

[**CommittedEntryResponse**](CommittedEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="entrybyid"></a>
# **EntryById**
> AnchoredEntryResponse EntryById (string context, string chainId, string entryId)

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

            var apiInstance = new EntryApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId
            var entryId = entryId_example;  // string | entryId

            try
            {
                // Get an existing entry in the provided chain
                AnchoredEntryResponse result = apiInstance.EntryById(context, chainId, entryId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EntryApi.EntryById: " + e.Message );
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

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="entrybyrequest"></a>
# **EntryByRequest**
> AnchoredEntryResponse EntryByRequest (string context, string chainId, Entry entry)

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

            var apiInstance = new EntryApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId
            var entry = new Entry(); // Entry | Retrieve the entry

            try
            {
                // Get an existing entry in the provided chain
                AnchoredEntryResponse result = apiInstance.EntryByRequest(context, chainId, entry);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EntryApi.EntryByRequest: " + e.Message );
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

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="firstentry"></a>
# **FirstEntry**
> AnchoredEntryResponse FirstEntry (string context, string chainId)

Get the first entry in the provided chain. This is the oldest entry also called the chain tail

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

            var apiInstance = new EntryApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId

            try
            {
                // Get the first entry in the provided chain. This is the oldest entry also called the chain tail
                AnchoredEntryResponse result = apiInstance.FirstEntry(context, chainId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EntryApi.FirstEntry: " + e.Message );
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

<a name="lastentry"></a>
# **LastEntry**
> AnchoredEntryResponse LastEntry (string context, string chainId)

Get the last entry in the provided chain. This is the most recent entry also called the chain head

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

            var apiInstance = new EntryApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId

            try
            {
                // Get the last entry in the provided chain. This is the most recent entry also called the chain head
                AnchoredEntryResponse result = apiInstance.LastEntry(context, chainId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EntryApi.LastEntry: " + e.Message );
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

<a name="nextentrybyid"></a>
# **NextEntryById**
> AnchoredEntryResponse NextEntryById (string context, string chainId, string entryId)

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

            var apiInstance = new EntryApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId
            var entryId = entryId_example;  // string | entryId

            try
            {
                // Get the entry after the supplied entry Id (the next) in the provided chain
                AnchoredEntryResponse result = apiInstance.NextEntryById(context, chainId, entryId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EntryApi.NextEntryById: " + e.Message );
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

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="nextentrybyrequest"></a>
# **NextEntryByRequest**
> AnchoredEntryResponse NextEntryByRequest (string context, string chainId, Entry entry)

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

            var apiInstance = new EntryApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId
            var entry = new Entry(); // Entry | Retrieve the entry

            try
            {
                // Get the entry after the supplied entry Id (the next) in the provided chain
                AnchoredEntryResponse result = apiInstance.NextEntryByRequest(context, chainId, entry);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EntryApi.NextEntryByRequest: " + e.Message );
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
> AnchoredEntryResponse PreviousEntryById (string context, string chainId, string entryId)

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

            var apiInstance = new EntryApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId
            var entryId = entryId_example;  // string | entryId

            try
            {
                // Get the entry before the supplied entry Id (the previous) in the provided chain
                AnchoredEntryResponse result = apiInstance.PreviousEntryById(context, chainId, entryId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EntryApi.PreviousEntryById: " + e.Message );
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

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="previousentrybyrequest"></a>
# **PreviousEntryByRequest**
> AnchoredEntryResponse PreviousEntryByRequest (string context, string chainId, Entry entry)

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

            var apiInstance = new EntryApi();
            var context = context_example;  // string | context
            var chainId = chainId_example;  // string | chainId
            var entry = new Entry(); // Entry | Retrieve the entry

            try
            {
                // Get the entry before the supplied entry Id (the previous) in the provided chain
                AnchoredEntryResponse result = apiInstance.PreviousEntryByRequest(context, chainId, entry);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EntryApi.PreviousEntryByRequest: " + e.Message );
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

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

