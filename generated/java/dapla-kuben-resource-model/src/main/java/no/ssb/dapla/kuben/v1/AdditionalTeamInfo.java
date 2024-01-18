
package no.ssb.dapla.kuben.v1;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


/**
 * AdditionalTeamInfo
 * <p>
 * Additional fields to express custom team information Information the team can add without any restrictions on what kind of data is specified. Can be useful in situations where teams want to express or communicate some kind of information without it fitting the defined team info model.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "version",
    "kind",
    "metadata",
    "spec"
})
@Generated("jsonschema2pojo")
public class AdditionalTeamInfo implements Serializable
{

    /**
     * The version of this specification
     * (Required)
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("The version of this specification")
    @Pattern(regexp = "^kuben/v[0-9]+$")
    @NotNull
    private String version;
    /**
     * Which kind of metadata are being described
     * (Required)
     * 
     */
    @JsonProperty("kind")
    @JsonPropertyDescription("Which kind of metadata are being described")
    @NotNull
    private AdditionalTeamInfo.Kind kind;
    /**
     * The metadata fields common to all kinds/entities
     * (Required)
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("The metadata fields common to all kinds/entities")
    @Valid
    @NotNull
    private TeamInfoMetadataSchema metadata;
    /**
     * 
     * Corresponds to the "spec" property.Custom fields/metadata for the team. All keys must be lowercase (a-z), may contain _
     * (Required)
     * 
     */
    @JsonProperty("spec")
    @JsonPropertyDescription("Custom fields/metadata for the team. All keys must be lowercase (a-z), may contain _")
    @Valid
    @NotNull
    private AdditionalTeamInfoSpec additionalTeamInfoSpec;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -5619746270560269015L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AdditionalTeamInfo() {
    }

    /**
     * 
     * @param kind
     *     Which kind of metadata are being described.
     * @param additionalTeamInfoSpec
     *     Custom fields/metadata for the team. All keys must be lowercase (a-z), may contain _.
     * @param version
     *     The version of this specification.
     */
    public AdditionalTeamInfo(String version, AdditionalTeamInfo.Kind kind, TeamInfoMetadataSchema metadata, AdditionalTeamInfoSpec additionalTeamInfoSpec) {
        super();
        this.version = version;
        this.kind = kind;
        this.metadata = metadata;
        this.additionalTeamInfoSpec = additionalTeamInfoSpec;
    }

    public static AdditionalTeamInfo.AdditionalTeamInfoBuilderBase builder() {
        return new AdditionalTeamInfo.AdditionalTeamInfoBuilder();
    }

    /**
     * The version of this specification
     * (Required)
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * The version of this specification
     * (Required)
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Which kind of metadata are being described
     * (Required)
     * 
     */
    @JsonProperty("kind")
    public AdditionalTeamInfo.Kind getKind() {
        return kind;
    }

    /**
     * Which kind of metadata are being described
     * (Required)
     * 
     */
    @JsonProperty("kind")
    public void setKind(AdditionalTeamInfo.Kind kind) {
        this.kind = kind;
    }

    /**
     * The metadata fields common to all kinds/entities
     * (Required)
     * 
     */
    @JsonProperty("metadata")
    public TeamInfoMetadataSchema getMetadata() {
        return metadata;
    }

    /**
     * The metadata fields common to all kinds/entities
     * (Required)
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(TeamInfoMetadataSchema metadata) {
        this.metadata = metadata;
    }

    /**
     * 
     * Corresponds to the "spec" property.Custom fields/metadata for the team. All keys must be lowercase (a-z), may contain _
     * (Required)
     * 
     */
    @JsonProperty("spec")
    public AdditionalTeamInfoSpec getAdditionalTeamInfoSpec() {
        return additionalTeamInfoSpec;
    }

    /**
     * 
     * Corresponds to the "spec" property.Custom fields/metadata for the team. All keys must be lowercase (a-z), may contain _
     * (Required)
     * 
     */
    @JsonProperty("spec")
    public void setAdditionalTeamInfoSpec(AdditionalTeamInfoSpec additionalTeamInfoSpec) {
        this.additionalTeamInfoSpec = additionalTeamInfoSpec;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdditionalTeamInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
        sb.append(',');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("additionalTeamInfoSpec");
        sb.append('=');
        sb.append(((this.additionalTeamInfoSpec == null)?"<null>":this.additionalTeamInfoSpec));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.additionalTeamInfoSpec == null)? 0 :this.additionalTeamInfoSpec.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.kind == null)? 0 :this.kind.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdditionalTeamInfo) == false) {
            return false;
        }
        AdditionalTeamInfo rhs = ((AdditionalTeamInfo) other);
        return ((((((this.additionalTeamInfoSpec == rhs.additionalTeamInfoSpec)||((this.additionalTeamInfoSpec!= null)&&this.additionalTeamInfoSpec.equals(rhs.additionalTeamInfoSpec)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind))));
    }

    public static class AdditionalTeamInfoBuilder
        extends AdditionalTeamInfo.AdditionalTeamInfoBuilderBase<AdditionalTeamInfo>
    {


        public AdditionalTeamInfoBuilder() {
            super();
        }

        public AdditionalTeamInfoBuilder(String version, AdditionalTeamInfo.Kind kind, TeamInfoMetadataSchema metadata, AdditionalTeamInfoSpec additionalTeamInfoSpec) {
            super(version, kind, metadata, additionalTeamInfoSpec);
        }

    }

    public static abstract class AdditionalTeamInfoBuilderBase<T extends AdditionalTeamInfo >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public AdditionalTeamInfoBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(AdditionalTeamInfo.AdditionalTeamInfoBuilder.class)) {
                this.instance = ((T) new AdditionalTeamInfo());
            }
        }

        @SuppressWarnings("unchecked")
        public AdditionalTeamInfoBuilderBase(String version, AdditionalTeamInfo.Kind kind, TeamInfoMetadataSchema metadata, AdditionalTeamInfoSpec additionalTeamInfoSpec) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(AdditionalTeamInfo.AdditionalTeamInfoBuilder.class)) {
                this.instance = ((T) new AdditionalTeamInfo(version, kind, metadata, additionalTeamInfoSpec));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public AdditionalTeamInfo.AdditionalTeamInfoBuilderBase withVersion(String version) {
            ((AdditionalTeamInfo) this.instance).version = version;
            return this;
        }

        public AdditionalTeamInfo.AdditionalTeamInfoBuilderBase withKind(AdditionalTeamInfo.Kind kind) {
            ((AdditionalTeamInfo) this.instance).kind = kind;
            return this;
        }

        public AdditionalTeamInfo.AdditionalTeamInfoBuilderBase withMetadata(TeamInfoMetadataSchema metadata) {
            ((AdditionalTeamInfo) this.instance).metadata = metadata;
            return this;
        }

        public AdditionalTeamInfo.AdditionalTeamInfoBuilderBase withAdditionalTeamInfoSpec(AdditionalTeamInfoSpec additionalTeamInfoSpec) {
            ((AdditionalTeamInfo) this.instance).additionalTeamInfoSpec = additionalTeamInfoSpec;
            return this;
        }

        public AdditionalTeamInfo.AdditionalTeamInfoBuilderBase withAdditionalProperty(String name, Object value) {
            ((AdditionalTeamInfo) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }


    /**
     * Which kind of metadata are being described
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Kind {

        ADDITIONAL_TEAM_INFO("AdditionalTeamInfo");
        private final String value;
        private final static Map<String, AdditionalTeamInfo.Kind> CONSTANTS = new HashMap<String, AdditionalTeamInfo.Kind>();

        static {
            for (AdditionalTeamInfo.Kind c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Kind(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static AdditionalTeamInfo.Kind fromValue(String value) {
            AdditionalTeamInfo.Kind constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
