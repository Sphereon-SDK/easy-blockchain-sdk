# Sphereon.SDK.Blockchain.Easy.Api.ContextApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateContext**](ContextApi.md#createcontext) | **POST** /blockchain/easy/0.9.1/ | Create a new context
[**GetContext**](ContextApi.md#getcontext) | **GET** /blockchain/easy/0.9.1/{context} | Create a new context


<a name="createcontext"></a>
# **CreateContext**
> Context CreateContext (Context entity)

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
            var entity = new Context(); // Context | entity

            try
            {
                // Create a new context
                Context result = apiInstance.CreateContext(entity);
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
 **entity** | [**Context**](Context.md)| entity | 

### Return type

[**Context**](Context.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getcontext"></a>
# **GetContext**
> Context GetContext (string context)

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
                // Create a new context
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

