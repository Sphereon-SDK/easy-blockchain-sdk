# Sphereon.SDK.Blockchain.Easy.Model.Context
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Access** | [**Access**](Access.md) |  | [optional] 
**BackendIds** | **List&lt;string&gt;** | The backend Ids used in this context. Currently only one backend is supported. The first backend Id supplied will be used. In the future it will be possible to connect multiple backends to one context. Only use the backend Ids, not the names here! | 
**Name** | **string** | The name of the context as it is being used in the url. Please regard case! Because of the nature of the context within the API, the context name has to be globally unique amongst tenants! | 
**Id** | **string** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

