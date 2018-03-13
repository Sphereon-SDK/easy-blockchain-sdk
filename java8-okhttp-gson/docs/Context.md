
# Context

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access** | [**Access**](Access.md) |  |  [optional]
**backendIds** | **List&lt;String&gt;** | The backend Ids used in this context. Currently only one backend is supported. The first backend Id supplied will be used. In the future it will be possible to connect multiple backends to one context. Only use the backend Ids, not the names here! | 
**name** | **String** | The name of the context as it is being used in the url. Please regard case! Because of the nature of the context within the API, the context name has to be globally unique amongst tenants! | 
**id** | **String** |  |  [optional]



