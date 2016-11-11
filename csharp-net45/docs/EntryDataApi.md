# Sphereon.SDK.Blockchain.Easy.Api.EntryDataApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateEntryUsingPOST**](EntryDataApi.md#createentryusingpost) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries | Create a new entry in the provided chain
[**DetermineEntryId**](EntryDataApi.md#determineentryid) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries/id | Pre determine the Id of an entry request without anchoring the entry
[**EntryById**](EntryDataApi.md#entrybyid) | **GET** /blockchain/easy/0.1.0/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
[**EntryByRequest**](EntryDataApi.md#entrybyrequest) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries/entry | Get an existing entry in the provided chain


<a name="createentryusingpost"></a>
# **CreateEntryUsingPOST**
> CommittedEntryResponse CreateEntryUsingPOST (string chainId, Entry entry)

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
    public class CreateEntryUsingPOSTExample
    {
        public void main()
        {
            
            var apiInstance = new EntryDataApi();
            var chainId = chainId_example;  // string | chainId
            var entry = new Entry(); // Entry | Create a new entry for the specified chain

            try
            {
                // Create a new entry in the provided chain
                CommittedEntryResponse result = apiInstance.CreateEntryUsingPOST(chainId, entry);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EntryDataApi.CreateEntryUsingPOST: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **string**| chainId | 
 **entry** | [**Entry**](Entry.md)| Create a new entry for the specified chain | 

### Return type

[**CommittedEntryResponse**](CommittedEntryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="determineentryid"></a>
# **DetermineEntryId**
> IdResponse DetermineEntryId (string chainId, Entry entry)

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
            
            var apiInstance = new EntryDataApi();
            var chainId = chainId_example;  // string | chainId
            var entry = new Entry(); // Entry | The entry to determine the hash for on the specified chain

            try
            {
                // Pre determine the Id of an entry request without anchoring the entry
                IdResponse result = apiInstance.DetermineEntryId(chainId, entry);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EntryDataApi.DetermineEntryId: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **string**| chainId | 
 **entry** | [**Entry**](Entry.md)| The entry to determine the hash for on the specified chain | 

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="entrybyid"></a>
# **EntryById**
> AnchoredEntryResponse EntryById (string chainId, string entryId)

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
            
            var apiInstance = new EntryDataApi();
            var chainId = chainId_example;  // string | chainId
            var entryId = entryId_example;  // string | entryId

            try
            {
                // Get an existing entry in the provided chain
                AnchoredEntryResponse result = apiInstance.EntryById(chainId, entryId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EntryDataApi.EntryById: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **string**| chainId | 
 **entryId** | **string**| entryId | 

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="entrybyrequest"></a>
# **EntryByRequest**
> AnchoredEntryResponse EntryByRequest (string chainId, Entry entry)

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
            
            var apiInstance = new EntryDataApi();
            var chainId = chainId_example;  // string | chainId
            var entry = new Entry(); // Entry | Retrieve the entry

            try
            {
                // Get an existing entry in the provided chain
                AnchoredEntryResponse result = apiInstance.EntryByRequest(chainId, entry);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EntryDataApi.EntryByRequest: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **string**| chainId | 
 **entry** | [**Entry**](Entry.md)| Retrieve the entry | 

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

