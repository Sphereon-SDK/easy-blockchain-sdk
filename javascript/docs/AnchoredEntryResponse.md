# EasyBlockchainApi.AnchoredEntryResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anchoredEntry** | [**CommittedEntry**](CommittedEntry.md) |  | 
**anchorTimes** | **[Date]** | All the times at which the Entry with the same Id was anchored in the blockchain in ISO 8601 format. The first, current and last Anchor Times will also be in this list | [optional] 
**currentAnchorTime** | **Date** | The current anchor time (this is not necessarely the last anchor time!) of the entry (if any) in the blockchain in ISO 8601 format | [optional] 
**anchorState** | **String** |  | 
**lastAnchorTime** | **Date** | The last anchor time of the entry (if any) in the blockchain in ISO 8601 format | [optional] 
**firstAnchorTime** | **Date** | The first anchor time of the entry (if any) in the blockchain in ISO 8601 format | [optional] 


<a name="AnchorStateEnum"></a>
## Enum: AnchorStateEnum


* `REQUESTED` (value: `"REQUESTED"`)

* `COMMITTED` (value: `"COMMITTED"`)

* `NOT_FOUND` (value: `"NOT_FOUND"`)

* `ANCHORED` (value: `"ANCHORED"`)




