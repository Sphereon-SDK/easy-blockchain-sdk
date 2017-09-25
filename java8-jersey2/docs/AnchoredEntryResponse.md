
# AnchoredEntryResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anchoredEntry** | [**CommittedEntry**](CommittedEntry.md) |  | 
**anchorTimes** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md) | All the times at which the Entry with the same Id was anchored in the blockchain in ISO 8601 format. The first, current and last Anchor Times will also be in this list |  [optional]
**currentAnchorTime** | [**OffsetDateTime**](OffsetDateTime.md) | The current anchor time (this is not necessarely the last anchor time!) of the entry (if any) in the blockchain in ISO 8601 format |  [optional]
**anchorState** | [**AnchorStateEnum**](#AnchorStateEnum) |  | 
**lastAnchorTime** | [**OffsetDateTime**](OffsetDateTime.md) | The last anchor time of the entry (if any) in the blockchain in ISO 8601 format |  [optional]
**firstAnchorTime** | [**OffsetDateTime**](OffsetDateTime.md) | The first anchor time of the entry (if any) in the blockchain in ISO 8601 format |  [optional]


<a name="AnchorStateEnum"></a>
## Enum: AnchorStateEnum
Name | Value
---- | -----
REQUESTED | &quot;REQUESTED&quot;
COMMITTED | &quot;COMMITTED&quot;
NOT_FOUND | &quot;NOT_FOUND&quot;
ANCHORED | &quot;ANCHORED&quot;



