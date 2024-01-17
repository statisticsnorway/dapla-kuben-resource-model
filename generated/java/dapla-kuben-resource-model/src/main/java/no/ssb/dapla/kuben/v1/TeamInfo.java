
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
 * TeamInfo
 * <p>
 * Predefined metadata fields that the team manages
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
public class TeamInfo implements Serializable
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
    private TeamInfo.Kind kind;
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
    private TeamInfoSpec teamInfoSpec;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 3092443285990684784L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TeamInfo() {
    }

    /**
     * 
     * @param teamInfoSpec
     *     The specification of the concrete metadata for the team. All keys must be lowercase (a-z), may contain _.
     * @param kind
     *     Which kind of metadata are being described.
     * @param version
     *     The version of this specification.
     */
    public TeamInfo(String version, TeamInfo.Kind kind, TeamInfoMetadataSchema metadata, TeamInfoSpec teamInfoSpec) {
        super();
        this.version = version;
        this.kind = kind;
        this.metadata = metadata;
        this.teamInfoSpec = teamInfoSpec;
    }

    public static TeamInfo.TeamInfoBuilderBase builder() {
        return new TeamInfo.TeamInfoBuilder();
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
    public TeamInfo.Kind getKind() {
        return kind;
    }

    /**
     * Which kind of metadata are being described
     * (Required)
     * 
     */
    @JsonProperty("kind")
    public void setKind(TeamInfo.Kind kind) {
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
    public TeamInfoSpec getTeamInfoSpec() {
        return teamInfoSpec;
    }

    /**
     * 
     * Corresponds to the "spec" property.The specification of the concrete metadata for the team. All keys must be lowercase (a-z), may contain _
     * (Required)
     * 
     */
    @JsonProperty("spec")
    public void setTeamInfoSpec(TeamInfoSpec teamInfoSpec) {
        this.teamInfoSpec = teamInfoSpec;
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
        sb.append(TeamInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("teamInfoSpec");
        sb.append('=');
        sb.append(((this.teamInfoSpec == null)?"<null>":this.teamInfoSpec));
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
        result = ((result* 31)+((this.teamInfoSpec == null)? 0 :this.teamInfoSpec.hashCode()));
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
        if ((other instanceof TeamInfo) == false) {
            return false;
        }
        TeamInfo rhs = ((TeamInfo) other);
        return ((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.teamInfoSpec == rhs.teamInfoSpec)||((this.teamInfoSpec!= null)&&this.teamInfoSpec.equals(rhs.teamInfoSpec))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind))));
    }


    /**
     * Which kind of metadata are being described
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Kind {

        TEAM_INFO("TeamInfo");
        private final String value;
        private final static Map<String, TeamInfo.Kind> CONSTANTS = new HashMap<String, TeamInfo.Kind>();

        static {
            for (TeamInfo.Kind c: values()) {
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
        public static TeamInfo.Kind fromValue(String value) {
            TeamInfo.Kind constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public static class TeamInfoBuilder
        extends TeamInfo.TeamInfoBuilderBase<TeamInfo>
    {


        public TeamInfoBuilder() {
            super();
        }

        public TeamInfoBuilder(String version, TeamInfo.Kind kind, TeamInfoMetadataSchema metadata, TeamInfoSpec teamInfoSpec) {
            super(version, kind, metadata, teamInfoSpec);
        }

    }

    public static abstract class TeamInfoBuilderBase<T extends TeamInfo >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public TeamInfoBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(TeamInfo.TeamInfoBuilder.class)) {
                this.instance = ((T) new TeamInfo());
            }
        }

        @SuppressWarnings("unchecked")
        public TeamInfoBuilderBase(String version, TeamInfo.Kind kind, TeamInfoMetadataSchema metadata, TeamInfoSpec teamInfoSpec) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(TeamInfo.TeamInfoBuilder.class)) {
                this.instance = ((T) new TeamInfo(version, kind, metadata, teamInfoSpec));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public TeamInfo.TeamInfoBuilderBase withVersion(String version) {
            ((TeamInfo) this.instance).version = version;
            return this;
        }

        public TeamInfo.TeamInfoBuilderBase withKind(TeamInfo.Kind kind) {
            ((TeamInfo) this.instance).kind = kind;
            return this;
        }

        public TeamInfo.TeamInfoBuilderBase withMetadata(TeamInfoMetadataSchema metadata) {
            ((TeamInfo) this.instance).metadata = metadata;
            return this;
        }

        public TeamInfo.TeamInfoBuilderBase withTeamInfoSpec(TeamInfoSpec teamInfoSpec) {
            ((TeamInfo) this.instance).teamInfoSpec = teamInfoSpec;
            return this;
        }

        public TeamInfo.TeamInfoBuilderBase withAdditionalProperty(String name, Object value) {
            ((TeamInfo) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
