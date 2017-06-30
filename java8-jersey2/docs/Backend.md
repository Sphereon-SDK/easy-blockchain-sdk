
# Backend

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **Integer** |  |  [optional]
**dataStructure** | [**DataStructureEnum**](#DataStructureEnum) |  |  [optional]
**end** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**id** | **String** |  |  [optional]
**implementation** | [**ImplementationEnum**](#ImplementationEnum) |  |  [optional]
**ledgerName** | **String** |  |  [optional]
**owner** | **String** |  |  [optional]
**rpcProviders** | [**List&lt;RpcProvider&gt;**](RpcProvider.md) |  |  [optional]
**start** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="DataStructureEnum"></a>
## Enum: DataStructureEnum
Name | Value
---- | -----
FACTOM | &quot;Factom&quot;
MULTICHAIN | &quot;Multichain&quot;


<a name="ImplementationEnum"></a>
## Enum: ImplementationEnum
Name | Value
---- | -----
BITCOIN | &quot;Bitcoin&quot;
NONE | &quot;None&quot;



