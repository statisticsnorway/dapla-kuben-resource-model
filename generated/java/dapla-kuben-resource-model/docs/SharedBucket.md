

# SharedBucket

Configuration of a shared bucket.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Unique name identifying the bucket. |  |
|**writtenToBy** | [**WrittenToByEnum**](#WrittenToByEnum) | Specifies who has write access to the bucket. |  [optional] |
|**sharedWith** | **Set&lt;String&gt;** | List of group names that this bucket is shared with. |  |



## Enum: WrittenToByEnum

| Name | Value |
|---- | -----|
| TEAM_DEVELOPERS | &quot;team/developers&quot; |
| TEAM_DATA_ADMINS | &quot;team/data-admins&quot; |
| DELOMAT | &quot;delomat&quot; |



