
# Backend

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rpcProviders** | [**List&lt;RpcProvider&gt;**](RpcProvider.md) | One or more nodes that comprise the blockchain backend | 
**apiVersion** | **Integer** |  |  [optional]
**name** | **String** | The name of the backend. | 
**start** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**end** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**dataStructure** | [**DataStructureEnum**](#DataStructureEnum) |  |  [optional]
**id** | **String** |  |  [optional]
**externalAccess** | [**Access**](Access.md) |  |  [optional]


<a name="DataStructureEnum"></a>
## Enum: DataStructureEnum
Name | Value
---- | -----
FACTOM | &quot;FACTOM&quot;
MULTICHAIN | &quot;MULTICHAIN&quot;
ETHEREUM | &quot;ETHEREUM&quot;



