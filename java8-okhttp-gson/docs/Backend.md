
# Backend

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rpcProviders** | [**List&lt;RpcProvider&gt;**](RpcProvider.md) |  |  [optional]
**apiVersion** | **Integer** |  |  [optional]
**ledgerName** | **String** |  |  [optional]
**implementation** | [**ImplementationEnum**](#ImplementationEnum) |  |  [optional]
**start** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**end** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**dataStructure** | [**DataStructureEnum**](#DataStructureEnum) |  |  [optional]
**id** | **String** |  |  [optional]
**externalAccess** | [**Access**](Access.md) |  |  [optional]


<a name="ImplementationEnum"></a>
## Enum: ImplementationEnum
Name | Value
---- | -----
BITCOIN | &quot;Bitcoin&quot;
NONE | &quot;None&quot;
ETHEREUM | &quot;Ethereum&quot;


<a name="DataStructureEnum"></a>
## Enum: DataStructureEnum
Name | Value
---- | -----
FACTOM | &quot;Factom&quot;
MULTICHAIN | &quot;Multichain&quot;
ETHEREUM | &quot;Ethereum&quot;



