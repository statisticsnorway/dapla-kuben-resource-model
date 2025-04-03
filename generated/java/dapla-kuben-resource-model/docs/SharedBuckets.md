

# SharedBuckets

The description of the SharedBuckets data structure. Information and configuration of buckets this team share.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | [**VersionEnum**](#VersionEnum) | The version of this specification |  |
|**kind** | [**KindEnum**](#KindEnum) | Resource identifier. |  |
|**buckets** | [**List&lt;SharedBucket&gt;**](SharedBucket.md) | List of shared bucket configurations. |  |



## Enum: VersionEnum

| Name | Value |
|---- | -----|
| KUBEN_V1 | &quot;kuben/v1&quot; |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| SHARED_BUCKETS | &quot;SharedBuckets&quot; |



