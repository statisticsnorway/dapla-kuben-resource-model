
package no.ssb.dapla.kuben.partials.v1;

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
import jakarta.validation.constraints.Size;


/**
 * The metadata fields common to all kinds/entities
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "team_name",
    "visibility"
})
@Generated("jsonschema2pojo")
public class TeamInfoMetadataSchema implements Serializable
{

    /**
     * Name of this resource
     * (Required)
     * 
     */
    @JsonProperty("team_name")
    @JsonPropertyDescription("Name of this resource")
    @Size(min = 1)
    @NotNull
    private String teamName;
    /**
     * Whenever the metadata in this manifest is considered to be exposed in e.g. a portal. Will default to public if not specified
     * 
     */
    @JsonProperty("visibility")
    @JsonPropertyDescription("Whenever the metadata in this manifest is considered to be exposed in e.g. a portal. Will default to public if not specified")
    private TeamInfoMetadataSchema.Visibility visibility;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 1258206655867380465L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TeamInfoMetadataSchema() {
    }

    /**
     * 
     * @param teamName
     *     Name of this resource.
     * @param visibility
     *     Whenever the metadata in this manifest is considered to be exposed in e.g. a portal. Will default to public if not specified.
     */
    public TeamInfoMetadataSchema(String teamName, TeamInfoMetadataSchema.Visibility visibility) {
        super();
        this.teamName = teamName;
        this.visibility = visibility;
    }

    public static TeamInfoMetadataSchema.TeamInfoMetadataSchemaBuilderBase builder() {
        return new TeamInfoMetadataSchema.TeamInfoMetadataSchemaBuilder();
    }

    /**
     * Name of this resource
     * (Required)
     * 
     */
    @JsonProperty("team_name")
    public String getTeamName() {
        return teamName;
    }

    /**
     * Name of this resource
     * (Required)
     * 
     */
    @JsonProperty("team_name")
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Whenever the metadata in this manifest is considered to be exposed in e.g. a portal. Will default to public if not specified
     * 
     */
    @JsonProperty("visibility")
    public TeamInfoMetadataSchema.Visibility getVisibility() {
        return visibility;
    }

    /**
     * Whenever the metadata in this manifest is considered to be exposed in e.g. a portal. Will default to public if not specified
     * 
     */
    @JsonProperty("visibility")
    public void setVisibility(TeamInfoMetadataSchema.Visibility visibility) {
        this.visibility = visibility;
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
        sb.append(TeamInfoMetadataSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("teamName");
        sb.append('=');
        sb.append(((this.teamName == null)?"<null>":this.teamName));
        sb.append(',');
        sb.append("visibility");
        sb.append('=');
        sb.append(((this.visibility == null)?"<null>":this.visibility));
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
        result = ((result* 31)+((this.teamName == null)? 0 :this.teamName.hashCode()));
        result = ((result* 31)+((this.visibility == null)? 0 :this.visibility.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TeamInfoMetadataSchema) == false) {
            return false;
        }
        TeamInfoMetadataSchema rhs = ((TeamInfoMetadataSchema) other);
        return ((((this.teamName == rhs.teamName)||((this.teamName!= null)&&this.teamName.equals(rhs.teamName)))&&((this.visibility == rhs.visibility)||((this.visibility!= null)&&this.visibility.equals(rhs.visibility))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    public static class TeamInfoMetadataSchemaBuilder
        extends TeamInfoMetadataSchema.TeamInfoMetadataSchemaBuilderBase<TeamInfoMetadataSchema>
    {


        public TeamInfoMetadataSchemaBuilder() {
            super();
        }

        public TeamInfoMetadataSchemaBuilder(String teamName, TeamInfoMetadataSchema.Visibility visibility) {
            super(teamName, visibility);
        }

    }

    public static abstract class TeamInfoMetadataSchemaBuilderBase<T extends TeamInfoMetadataSchema >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public TeamInfoMetadataSchemaBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(TeamInfoMetadataSchema.TeamInfoMetadataSchemaBuilder.class)) {
                this.instance = ((T) new TeamInfoMetadataSchema());
            }
        }

        @SuppressWarnings("unchecked")
        public TeamInfoMetadataSchemaBuilderBase(String teamName, TeamInfoMetadataSchema.Visibility visibility) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(TeamInfoMetadataSchema.TeamInfoMetadataSchemaBuilder.class)) {
                this.instance = ((T) new TeamInfoMetadataSchema(teamName, visibility));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public TeamInfoMetadataSchema.TeamInfoMetadataSchemaBuilderBase withTeamName(String teamName) {
            ((TeamInfoMetadataSchema) this.instance).teamName = teamName;
            return this;
        }

        public TeamInfoMetadataSchema.TeamInfoMetadataSchemaBuilderBase withVisibility(TeamInfoMetadataSchema.Visibility visibility) {
            ((TeamInfoMetadataSchema) this.instance).visibility = visibility;
            return this;
        }

        public TeamInfoMetadataSchema.TeamInfoMetadataSchemaBuilderBase withAdditionalProperty(String name, Object value) {
            ((TeamInfoMetadataSchema) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }


    /**
     * Whenever the metadata in this manifest is considered to be exposed in e.g. a portal. Will default to public if not specified
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Visibility {

        PRIVATE("PRIVATE"),
        PUBLIC("PUBLIC");
        private final String value;
        private final static Map<String, TeamInfoMetadataSchema.Visibility> CONSTANTS = new HashMap<String, TeamInfoMetadataSchema.Visibility>();

        static {
            for (TeamInfoMetadataSchema.Visibility c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Visibility(String value) {
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
        public static TeamInfoMetadataSchema.Visibility fromValue(String value) {
            TeamInfoMetadataSchema.Visibility constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
