# AnchoredEntryResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anchored_entry** | [**\Sphereon\SDK\Blockchain\Easy\Model\CommittedEntry**](CommittedEntry.md) |  | 
**anchor_times** | [**\DateTime[]**](\DateTime.md) | All the times at which the Entry with the same Id was anchored in the blockchain in ISO 8601 format. The first, current and last Anchor Times will also be in this list | [optional] 
**current_anchor_time** | [**\DateTime**](\DateTime.md) | The current anchor time (this is not necessarely the last anchor time!) of the entry (if any) in the blockchain in ISO 8601 format | [optional] 
**anchor_state** | **string** |  | 
**last_anchor_time** | [**\DateTime**](\DateTime.md) | The last anchor time of the entry (if any) in the blockchain in ISO 8601 format | [optional] 
**first_anchor_time** | [**\DateTime**](\DateTime.md) | The first anchor time of the entry (if any) in the blockchain in ISO 8601 format | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


