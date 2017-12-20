# IngestionApi

All URIs are relative to *https://gw.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDocumentStatus**](IngestionApi.md#getDocumentStatus) | **GET** /enterprise-integration/null/ingestion/documents/{documentId}/status | Get the status of the given document id
[**receiveDocument**](IngestionApi.md#receiveDocument) | **PUT** /enterprise-integration/null/ingestion/channels/{channelName} | Push document to the ingestion queue
[**resendDocument**](IngestionApi.md#resendDocument) | **PUT** /enterprise-integration/null/ingestion/documents/{documentId}/resend | Resend document with the given document id
[**uploadInputFile**](IngestionApi.md#uploadInputFile) | **POST** /enterprise-integration/null/ingestion/streams | Upload a file


<a name="getDocumentStatus"></a>
# **getDocumentStatus**
> IngestionResponse getDocumentStatus(documentId)

Get the status of the given document id

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.IngestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

IngestionApi apiInstance = new IngestionApi();
String documentId = "documentId_example"; // String | documentId
try {
    IngestionResponse result = apiInstance.getDocumentStatus(documentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IngestionApi#getDocumentStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **String**| documentId |

### Return type

[**IngestionResponse**](IngestionResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="receiveDocument"></a>
# **receiveDocument**
> IngestionResponse receiveDocument(channelName, documentPayload, documentType)

Push document to the ingestion queue

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.IngestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

IngestionApi apiInstance = new IngestionApi();
String channelName = "channelName_example"; // String | channelName
DocumentPayload documentPayload = new DocumentPayload(); // DocumentPayload | documentPayload
String documentType = "documentType_example"; // String | documentType
try {
    IngestionResponse result = apiInstance.receiveDocument(channelName, documentPayload, documentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IngestionApi#receiveDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelName** | **String**| channelName |
 **documentPayload** | [**DocumentPayload**](DocumentPayload.md)| documentPayload |
 **documentType** | **String**| documentType | [optional]

### Return type

[**IngestionResponse**](IngestionResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="resendDocument"></a>
# **resendDocument**
> IngestionResponse resendDocument(documentId)

Resend document with the given document id

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.IngestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

IngestionApi apiInstance = new IngestionApi();
String documentId = "documentId_example"; // String | documentId
try {
    IngestionResponse result = apiInstance.resendDocument(documentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IngestionApi#resendDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **String**| documentId |

### Return type

[**IngestionResponse**](IngestionResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="uploadInputFile"></a>
# **uploadInputFile**
> DocumentPayload uploadInputFile(stream)

Upload a file

Upload an input image. Classification will not be started yet.

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiClient;
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.handler.Configuration;
//import com.sphereon.sdk.blockchain.easy.handler.auth.*;
//import com.sphereon.sdk.blockchain.easy.api.IngestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

IngestionApi apiInstance = new IngestionApi();
File stream = new File("/path/to/file.txt"); // File | The document data to be ingested
try {
    DocumentPayload result = apiInstance.uploadInputFile(stream);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IngestionApi#uploadInputFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream** | **File**| The document data to be ingested |

### Return type

[**DocumentPayload**](DocumentPayload.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

