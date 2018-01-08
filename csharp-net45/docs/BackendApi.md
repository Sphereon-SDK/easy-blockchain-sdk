# Sphereon.SDK.Blockchain.Easy.Api.BackendApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/easy/0.10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateBackend**](BackendApi.md#createbackend) | **POST** /backends | Create a new backend
[**DeleteBackend**](BackendApi.md#deletebackend) | **DELETE** /backends/{backendId} | Delete a backend
[**FindBackends**](BackendApi.md#findbackends) | **GET** /backends/{backendId}/find | Find backends
[**GetBackend**](BackendApi.md#getbackend) | **GET** /backends/{backendId} | Get backend by id
[**ListBackends**](BackendApi.md#listbackends) | **GET** /backends | List backends


<a name="createbackend"></a>
# **CreateBackend**
> Backend CreateBackend (Backend backend)

Create a new backend

Create a new backend. A Backend is the link to one blockchain implementation and it' s nodes. Unless you create your own private blockchain network, you should not have to create a new backend. Just use one of the public backends available.

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

            var apiInstance = new BackendApi();
            var backend = new Backend(); // Backend | backend

            try
            {
                // Create a new backend
                Backend result = apiInstance.CreateBackend(backend);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling BackendApi.CreateBackend: " + e.Message );
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

<a name="deletebackend"></a>
# **DeleteBackend**
> Backend DeleteBackend (string backendId)

Delete a backend

Delete backend by id (not by name)

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

            var apiInstance = new BackendApi();
            var backendId = backendId_example;  // string | backendId

            try
            {
                // Delete a backend
                Backend result = apiInstance.DeleteBackend(backendId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling BackendApi.DeleteBackend: " + e.Message );
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

[**Backend**](Backend.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="findbackends"></a>
# **FindBackends**
> List<Backend> FindBackends (string backendId, bool? includePublic = null)

Find backends

Find existing backend(s) by id (single result) and/or name (multiple results). Optionally including public backends of others. Please note that we never return sensitive information like password or rpc hosts. Even not for backend owners themselves

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

            var apiInstance = new BackendApi();
            var backendId = backendId_example;  // string | backendId
            var includePublic = true;  // bool? | includePublic (optional)  (default to false)

            try
            {
                // Find backends
                List&lt;Backend&gt; result = apiInstance.FindBackends(backendId, includePublic);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling BackendApi.FindBackends: " + e.Message );
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

<a name="getbackend"></a>
# **GetBackend**
> Backend GetBackend (string backendId, bool? includePublic = null)

Get backend by id

Get existing backend by id (not by name). Optionally including public backend of others. Please note that we never return sensitive information like password or rpc hosts. Even not for backend owners themselves

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

            var apiInstance = new BackendApi();
            var backendId = backendId_example;  // string | backendId
            var includePublic = true;  // bool? | includePublic (optional)  (default to false)

            try
            {
                // Get backend by id
                Backend result = apiInstance.GetBackend(backendId, includePublic);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling BackendApi.GetBackend: " + e.Message );
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

<a name="listbackends"></a>
# **ListBackends**
> List<Backend> ListBackends (bool? includePublic = null)

List backends

List existing backends. Optionally including public backends of others.  Please note that we never return sensitive information like password or rpc hosts. Even not for backend owners themselves

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

            var apiInstance = new BackendApi();
            var includePublic = true;  // bool? | includePublic (optional)  (default to false)

            try
            {
                // List backends
                List&lt;Backend&gt; result = apiInstance.ListBackends(includePublic);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling BackendApi.ListBackends: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includePublic** | **bool?**| includePublic | [optional] [default to false]

### Return type

[**List<Backend>**](Backend.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

