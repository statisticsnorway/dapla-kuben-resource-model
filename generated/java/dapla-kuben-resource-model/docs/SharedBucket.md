

# SharedBucket

Configuration of a shared bucket.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Unique name identifying the bucket. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Specifies which kind of type and characteristics the shared bucket has. |  [optional] |
|**sharedWith** | **Set&lt;String&gt;** | List of group names that this bucket is shared with. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;standard&quot; |
| DELOMAT | &quot;delomat&quot; |



