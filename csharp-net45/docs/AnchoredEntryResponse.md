# Sphereon.SDK.Blockchain.Easy.Model.AnchoredEntryResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AnchoredEntry** | [**CommittedEntry**](CommittedEntry.md) |  | 
**AnchorTimes** | **List&lt;DateTime?&gt;** | All the times at which the Entry with the same Id was anchored in the blockchain in ISO 8601 format. The first, current and last Anchor Times will also be in this list | [optional] 
**CurrentAnchorTime** | **DateTime?** | The current anchor time (this is not necessarely the last anchor time!) of the entry (if any) in the blockchain in ISO 8601 format | [optional] 
**AnchorState** | **string** |  | 
**LastAnchorTime** | **DateTime?** | The last anchor time of the entry (if any) in the blockchain in ISO 8601 format | [optional] 
**FirstAnchorTime** | **DateTime?** | The first anchor time of the entry (if any) in the blockchain in ISO 8601 format | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

