/*
 * Shared Buckets
 * Schema for describing shared buckets in Dapla Kuben structure 
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package no.ssb.dapla.kuben.v1;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Configuration of a shared bucket.
 */
@JsonPropertyOrder({
  SharedBucket.JSON_PROPERTY_NAME,
  SharedBucket.JSON_PROPERTY_WRITTEN_TO_BY,
  SharedBucket.JSON_PROPERTY_SHARED_WITH
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-07T12:41:00.766192262Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class SharedBucket {
  public static final String JSON_PROPERTY_NAME = "name";
  @jakarta.annotation.Nonnull
  private String name;

  /**
   * Specifies who has write access to the bucket.
   */
  public enum WrittenToByEnum {
    TEAM_DEVELOPERS(String.valueOf("team/developers")),
    
    TEAM_DATA_ADMINS(String.valueOf("team/data-admins")),
    
    DELOMAT(String.valueOf("delomat"));

    private String value;

    WrittenToByEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WrittenToByEnum fromValue(String value) {
      for (WrittenToByEnum b : WrittenToByEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_WRITTEN_TO_BY = "writtenToBy";
  @jakarta.annotation.Nullable
  private WrittenToByEnum writtenToBy = WrittenToByEnum.TEAM_DEVELOPERS;

  public static final String JSON_PROPERTY_SHARED_WITH = "sharedWith";
  @jakarta.annotation.Nonnull
  private Set<String> sharedWith = new LinkedHashSet<>();

  public SharedBucket() { 
  }

  public SharedBucket name(@jakarta.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique name identifying the bucket.
   * @return name
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }


  public SharedBucket writtenToBy(@jakarta.annotation.Nullable WrittenToByEnum writtenToBy) {
    this.writtenToBy = writtenToBy;
    return this;
  }

  /**
   * Specifies who has write access to the bucket.
   * @return writtenToBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WRITTEN_TO_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WrittenToByEnum getWrittenToBy() {
    return writtenToBy;
  }


  @JsonProperty(JSON_PROPERTY_WRITTEN_TO_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWrittenToBy(@jakarta.annotation.Nullable WrittenToByEnum writtenToBy) {
    this.writtenToBy = writtenToBy;
  }


  public SharedBucket sharedWith(@jakarta.annotation.Nonnull Set<String> sharedWith) {
    this.sharedWith = sharedWith;
    return this;
  }

  public SharedBucket addSharedWithItem(String sharedWithItem) {
    if (this.sharedWith == null) {
      this.sharedWith = new LinkedHashSet<>();
    }
    this.sharedWith.add(sharedWithItem);
    return this;
  }

  /**
   * List of group names that this bucket is shared with.
   * @return sharedWith
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SHARED_WITH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Set<String> getSharedWith() {
    return sharedWith;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_SHARED_WITH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSharedWith(@jakarta.annotation.Nonnull Set<String> sharedWith) {
    this.sharedWith = sharedWith;
  }


  /**
   * Return true if this SharedBucket object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedBucket sharedBucket = (SharedBucket) o;
    return Objects.equals(this.name, sharedBucket.name) &&
        Objects.equals(this.writtenToBy, sharedBucket.writtenToBy) &&
        Objects.equals(this.sharedWith, sharedBucket.sharedWith);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, writtenToBy, sharedWith);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedBucket {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    writtenToBy: ").append(toIndentedString(writtenToBy)).append("\n");
    sb.append("    sharedWith: ").append(toIndentedString(sharedWith)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

