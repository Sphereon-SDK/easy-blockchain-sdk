# Sphereon.SDK.Blockchain.Easy.Api.ContextApi

All URIs are relative to *https://gw-dev.api.cloud.sphereon.com/blockchain/easy/0.10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateBackend**](ContextApi.md#createbackend) | **POST** /backends | Create a new backend
[**CreateContext**](ContextApi.md#createcontext) | **POST** / | Create a new context
[**DeleteBackend**](ContextApi.md#deletebackend) | **DELETE** /backends/{backendId} | Delete backend by id (not by ledgername)
[**FindBackends**](ContextApi.md#findbackends) | **GET** /backends/{backendId}/find | Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others
[**GetBackend**](ContextApi.md#getbackend) | **GET** /backends/{backendId} | Get existing backend by id (not by ledgername). Optionally including public backend of others
[**GetContext**](ContextApi.md#getcontext) | **GET** /{context} | Get an existing context
[**ListBackends**](ContextApi.md#listbackends) | **GET** /backends | List existing backends.


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

            var apiInstance = new ContextApi();
            var backend = new Backend(); // Backend | backend

            try
            {
                // Create a new backend
                Backend result = apiInstance.CreateBackend(backend);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContextApi.CreateBackend: " + e.Message );
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

            var apiInstance = new ContextApi();
            var context = new Context(); // Context | context

            try
            {
                // Create a new context
                Context result = apiInstance.CreateContext(context);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContextApi.CreateContext: " + e.Message );
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

            var apiInstance = new ContextApi();
            var backendId = backendId_example;  // string | backendId

            try
            {
                // Delete backend by id (not by ledgername)
                apiInstance.DeleteBackend(backendId);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContextApi.DeleteBackend: " + e.Message );
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
 - **Accept**: */*

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

            var apiInstance = new ContextApi();
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
                Debug.Print("Exception when calling ContextApi.FindBackends: " + e.Message );
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

            var apiInstance = new ContextApi();
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
                Debug.Print("Exception when calling ContextApi.GetBackend: " + e.Message );
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

            var apiInstance = new ContextApi();
            var context = context_example;  // string | context

            try
            {
                // Get an existing context
                Context result = apiInstance.GetContext(context);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContextApi.GetContext: " + e.Message );
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

            var apiInstance = new ContextApi();

            try
            {
                // List existing backends.
                List&lt;Backend&gt; result = apiInstance.ListBackends();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContextApi.ListBackends: " + e.Message );
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

