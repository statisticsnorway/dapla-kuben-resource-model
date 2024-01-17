
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
import no.ssb.dapla.kuben.partials.v1.TeamInfoMetadataSchema;


/**
 * PlatformManagedTeamInfo
 * <p>
 * Information about the team that the platform team manages.Team information that is not strictly required for configuration of the team
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
public class PlatformManagedTeamInfo implements Serializable
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
    private PlatformManagedTeamInfo.Kind kind;
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
     * Corresponds to the "spec" property.The specification of the concrete metadata for the team. All keys must be lowercase (a-z), may contain _
     * (Required)
     * 
     */
    @JsonProperty("spec")
    @JsonPropertyDescription("The specification of the concrete metadata for the team. All keys must be lowercase (a-z), may contain _")
    @Valid
    @NotNull
    private PlatformManagedTeamInfoSpec platformManagedTeamInfoSpec;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -7238368837522507909L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PlatformManagedTeamInfo() {
    }

    /**
     * 
     * @param kind
     *     Which kind of metadata are being described.
     * @param version
     *     The version of this specification.
     * @param platformManagedTeamInfoSpec
     *     The specification of the concrete metadata for the team. All keys must be lowercase (a-z), may contain _.
     */
    public PlatformManagedTeamInfo(String version, PlatformManagedTeamInfo.Kind kind, TeamInfoMetadataSchema metadata, PlatformManagedTeamInfoSpec platformManagedTeamInfoSpec) {
        super();
        this.version = version;
        this.kind = kind;
        this.metadata = metadata;
        this.platformManagedTeamInfoSpec = platformManagedTeamInfoSpec;
    }

    public static PlatformManagedTeamInfo.PlatformManagedTeamInfoBuilderBase builder() {
        return new PlatformManagedTeamInfo.PlatformManagedTeamInfoBuilder();
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
    public PlatformManagedTeamInfo.Kind getKind() {
        return kind;
    }

    /**
     * Which kind of metadata are being described
     * (Required)
     * 
     */
    @JsonProperty("kind")
    public void setKind(PlatformManagedTeamInfo.Kind kind) {
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
     * Corresponds to the "spec" property.The specification of the concrete metadata for the team. All keys must be lowercase (a-z), may contain _
     * (Required)
     * 
     */
    @JsonProperty("spec")
    public PlatformManagedTeamInfoSpec getPlatformManagedTeamInfoSpec() {
        return platformManagedTeamInfoSpec;
    }

    /**
     * 
     * Corresponds to the "spec" property.The specification of the concrete metadata for the team. All keys must be lowercase (a-z), may contain _
     * (Required)
     * 
     */
    @JsonProperty("spec")
    public void setPlatformManagedTeamInfoSpec(PlatformManagedTeamInfoSpec platformManagedTeamInfoSpec) {
        this.platformManagedTeamInfoSpec = platformManagedTeamInfoSpec;
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
        sb.append(PlatformManagedTeamInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("platformManagedTeamInfoSpec");
        sb.append('=');
        sb.append(((this.platformManagedTeamInfoSpec == null)?"<null>":this.platformManagedTeamInfoSpec));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.kind == null)? 0 :this.kind.hashCode()));
        result = ((result* 31)+((this.platformManagedTeamInfoSpec == null)? 0 :this.platformManagedTeamInfoSpec.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlatformManagedTeamInfo) == false) {
            return false;
        }
        PlatformManagedTeamInfo rhs = ((PlatformManagedTeamInfo) other);
        return ((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind))))&&((this.platformManagedTeamInfoSpec == rhs.platformManagedTeamInfoSpec)||((this.platformManagedTeamInfoSpec!= null)&&this.platformManagedTeamInfoSpec.equals(rhs.platformManagedTeamInfoSpec))));
    }


    /**
     * Which kind of metadata are being described
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Kind {

        PLATFORM_MANAGED_TEAM_INFO("PlatformManagedTeamInfo");
        private final String value;
        private final static Map<String, PlatformManagedTeamInfo.Kind> CONSTANTS = new HashMap<String, PlatformManagedTeamInfo.Kind>();

        static {
            for (PlatformManagedTeamInfo.Kind c: values()) {
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
        public static PlatformManagedTeamInfo.Kind fromValue(String value) {
            PlatformManagedTeamInfo.Kind constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public static class PlatformManagedTeamInfoBuilder
        extends PlatformManagedTeamInfo.PlatformManagedTeamInfoBuilderBase<PlatformManagedTeamInfo>
    {


        public PlatformManagedTeamInfoBuilder() {
            super();
        }

        public PlatformManagedTeamInfoBuilder(String version, PlatformManagedTeamInfo.Kind kind, TeamInfoMetadataSchema metadata, PlatformManagedTeamInfoSpec platformManagedTeamInfoSpec) {
            super(version, kind, metadata, platformManagedTeamInfoSpec);
        }

    }

    public static abstract class PlatformManagedTeamInfoBuilderBase<T extends PlatformManagedTeamInfo >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public PlatformManagedTeamInfoBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(PlatformManagedTeamInfo.PlatformManagedTeamInfoBuilder.class)) {
                this.instance = ((T) new PlatformManagedTeamInfo());
            }
        }

        @SuppressWarnings("unchecked")
        public PlatformManagedTeamInfoBuilderBase(String version, PlatformManagedTeamInfo.Kind kind, TeamInfoMetadataSchema metadata, PlatformManagedTeamInfoSpec platformManagedTeamInfoSpec) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(PlatformManagedTeamInfo.PlatformManagedTeamInfoBuilder.class)) {
                this.instance = ((T) new PlatformManagedTeamInfo(version, kind, metadata, platformManagedTeamInfoSpec));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public PlatformManagedTeamInfo.PlatformManagedTeamInfoBuilderBase withVersion(String version) {
            ((PlatformManagedTeamInfo) this.instance).version = version;
            return this;
        }

        public PlatformManagedTeamInfo.PlatformManagedTeamInfoBuilderBase withKind(PlatformManagedTeamInfo.Kind kind) {
            ((PlatformManagedTeamInfo) this.instance).kind = kind;
            return this;
        }

        public PlatformManagedTeamInfo.PlatformManagedTeamInfoBuilderBase withMetadata(TeamInfoMetadataSchema metadata) {
            ((PlatformManagedTeamInfo) this.instance).metadata = metadata;
            return this;
        }

        public PlatformManagedTeamInfo.PlatformManagedTeamInfoBuilderBase withPlatformManagedTeamInfoSpec(PlatformManagedTeamInfoSpec platformManagedTeamInfoSpec) {
            ((PlatformManagedTeamInfo) this.instance).platformManagedTeamInfoSpec = platformManagedTeamInfoSpec;
            return this;
        }

        public PlatformManagedTeamInfo.PlatformManagedTeamInfoBuilderBase withAdditionalProperty(String name, Object value) {
            ((PlatformManagedTeamInfo) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
