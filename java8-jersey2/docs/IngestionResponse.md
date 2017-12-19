
# IngestionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestTime** | [**OffsetDateTime**](OffsetDateTime.md) | The request date/time for this document in ISO 8601 format |  [optional]
**deliveryTime** | [**OffsetDateTime**](OffsetDateTime.md) | The delivery date/time of this job in ISO 8601 format |  [optional]
**documentId** | **String** |  |  [optional]
**version** | **Long** |  |  [optional]
**deliveryStatus** | [**DeliveryStatusEnum**](#DeliveryStatusEnum) | The deliveryStatus of the document | 
**statusMessage** | **String** | A delivery status message, which can be informational, warning or error. A message here does not indicate an error per se |  [optional]


<a name="DeliveryStatusEnum"></a>
## Enum: DeliveryStatusEnum
Name | Value
---- | -----
CREATED | &quot;CREATED&quot;
QUEUED | &quot;QUEUED&quot;
ON_HOLD | &quot;ON_HOLD&quot;
PROCESSING | &quot;PROCESSING&quot;
DELIVERED | &quot;DELIVERED&quot;
ERROR | &quot;ERROR&quot;



