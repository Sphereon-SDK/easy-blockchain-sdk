# Sphereon.SDK.Blockchain.Easy.Api.ContextApi

All URIs are relative to *https://gw.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateContext**](ContextApi.md#createcontext) | **POST** /blockchain/easy/0.10/ | Create context
[**DeleteContext**](ContextApi.md#deletecontext) | **DELETE** /blockchain/easy/0.10/{context} | Delete context
[**GetContext**](ContextApi.md#getcontext) | **GET** /blockchain/easy/0.10/{context} | Get context


<a name="createcontext"></a>
# **CreateContext**
> Context CreateContext (Context context)

Create context

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
                // Create context
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

<a name="deletecontext"></a>
# **DeleteContext**
> Context DeleteContext (string context)

Delete context

Delete an existing context

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Example
{
    public class DeleteContextExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ContextApi();
            var context = context_example;  // string | context

            try
            {
                // Delete context
                Context result = apiInstance.DeleteContext(context);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContextApi.DeleteContext: " + e.Message );
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

<a name="getcontext"></a>
# **GetContext**
> Context GetContext (string context)

Get context

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
                // Get context
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

