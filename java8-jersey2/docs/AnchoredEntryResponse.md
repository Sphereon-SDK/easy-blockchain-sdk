
# AnchoredEntryResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anchorState** | [**AnchorStateEnum**](#AnchorStateEnum) |  | 
**anchorTimes** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md) | The times at which the anchoredEntry was anchored in the blockchain in ISO 8601 format |  [optional]
**anchoredEntry** | [**CommittedEntry**](CommittedEntry.md) |  | 


<a name="AnchorStateEnum"></a>
## Enum: AnchorStateEnum
Name | Value
---- | -----
REQUESTED | &quot;REQUESTED&quot;
COMMITTED | &quot;COMMITTED&quot;
NOT_FOUND | &quot;NOT_FOUND&quot;



