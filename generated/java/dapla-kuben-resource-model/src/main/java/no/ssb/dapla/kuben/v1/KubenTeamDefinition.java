
package no.ssb.dapla.kuben.v1;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


/**
 * KubenTeamDefinition
 * <p>
 * The definition of a team inside Kuben Fields that are important for the technical configuration of a team
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "uniform_name",
    "display_name",
    "gcp",
    "github",
    "atlantis",
    "artifact_registry"
})
@Generated("jsonschema2pojo")
public class KubenTeamDefinition implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("uniform_name")
    @Pattern(regexp = "^[a-z0-9-]*$")
    @Size(max = 17)
    @NotNull
    private String uniformName;
    /**
     * The human readable form of the teams name
     * (Required)
     * 
     */
    @JsonProperty("display_name")
    @JsonPropertyDescription("The human readable form of the teams name")
    @NotNull
    private String displayName;
    @JsonProperty("gcp")
    @Valid
    private Gcp gcp;
    @JsonProperty("github")
    @Valid
    private Github github;
    @JsonProperty("atlantis")
    @Valid
    private Atlantis atlantis;
    @JsonProperty("artifact_registry")
    @Valid
    private ArtifactRegistry artifactRegistry;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -2990202222857127942L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public KubenTeamDefinition() {
    }

    /**
     * 
     * @param displayName
     *     The human readable form of the teams name.
     */
    public KubenTeamDefinition(String uniformName, String displayName, Gcp gcp, Github github, Atlantis atlantis, ArtifactRegistry artifactRegistry) {
        super();
        this.uniformName = uniformName;
        this.displayName = displayName;
        this.gcp = gcp;
        this.github = github;
        this.atlantis = atlantis;
        this.artifactRegistry = artifactRegistry;
    }

    public static KubenTeamDefinition.KubenTeamDefinitionBuilderBase builder() {
        return new KubenTeamDefinition.KubenTeamDefinitionBuilder();
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("uniform_name")
    public String getUniformName() {
        return uniformName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("uniform_name")
    public void setUniformName(String uniformName) {
        this.uniformName = uniformName;
    }

    /**
     * The human readable form of the teams name
     * (Required)
     * 
     */
    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The human readable form of the teams name
     * (Required)
     * 
     */
    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("gcp")
    public Gcp getGcp() {
        return gcp;
    }

    @JsonProperty("gcp")
    public void setGcp(Gcp gcp) {
        this.gcp = gcp;
    }

    @JsonProperty("github")
    public Github getGithub() {
        return github;
    }

    @JsonProperty("github")
    public void setGithub(Github github) {
        this.github = github;
    }

    @JsonProperty("atlantis")
    public Atlantis getAtlantis() {
        return atlantis;
    }

    @JsonProperty("atlantis")
    public void setAtlantis(Atlantis atlantis) {
        this.atlantis = atlantis;
    }

    @JsonProperty("artifact_registry")
    public ArtifactRegistry getArtifactRegistry() {
        return artifactRegistry;
    }

    @JsonProperty("artifact_registry")
    public void setArtifactRegistry(ArtifactRegistry artifactRegistry) {
        this.artifactRegistry = artifactRegistry;
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
        sb.append(KubenTeamDefinition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uniformName");
        sb.append('=');
        sb.append(((this.uniformName == null)?"<null>":this.uniformName));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("gcp");
        sb.append('=');
        sb.append(((this.gcp == null)?"<null>":this.gcp));
        sb.append(',');
        sb.append("github");
        sb.append('=');
        sb.append(((this.github == null)?"<null>":this.github));
        sb.append(',');
        sb.append("atlantis");
        sb.append('=');
        sb.append(((this.atlantis == null)?"<null>":this.atlantis));
        sb.append(',');
        sb.append("artifactRegistry");
        sb.append('=');
        sb.append(((this.artifactRegistry == null)?"<null>":this.artifactRegistry));
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
        result = ((result* 31)+((this.uniformName == null)? 0 :this.uniformName.hashCode()));
        result = ((result* 31)+((this.github == null)? 0 :this.github.hashCode()));
        result = ((result* 31)+((this.atlantis == null)? 0 :this.atlantis.hashCode()));
        result = ((result* 31)+((this.gcp == null)? 0 :this.gcp.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.artifactRegistry == null)? 0 :this.artifactRegistry.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KubenTeamDefinition) == false) {
            return false;
        }
        KubenTeamDefinition rhs = ((KubenTeamDefinition) other);
        return ((((((((this.uniformName == rhs.uniformName)||((this.uniformName!= null)&&this.uniformName.equals(rhs.uniformName)))&&((this.github == rhs.github)||((this.github!= null)&&this.github.equals(rhs.github))))&&((this.atlantis == rhs.atlantis)||((this.atlantis!= null)&&this.atlantis.equals(rhs.atlantis))))&&((this.gcp == rhs.gcp)||((this.gcp!= null)&&this.gcp.equals(rhs.gcp))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.artifactRegistry == rhs.artifactRegistry)||((this.artifactRegistry!= null)&&this.artifactRegistry.equals(rhs.artifactRegistry))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    public static class KubenTeamDefinitionBuilder
        extends KubenTeamDefinition.KubenTeamDefinitionBuilderBase<KubenTeamDefinition>
    {


        public KubenTeamDefinitionBuilder() {
            super();
        }

        public KubenTeamDefinitionBuilder(String uniformName, String displayName, Gcp gcp, Github github, Atlantis atlantis, ArtifactRegistry artifactRegistry) {
            super(uniformName, displayName, gcp, github, atlantis, artifactRegistry);
        }

    }

    public static abstract class KubenTeamDefinitionBuilderBase<T extends KubenTeamDefinition >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public KubenTeamDefinitionBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(KubenTeamDefinition.KubenTeamDefinitionBuilder.class)) {
                this.instance = ((T) new KubenTeamDefinition());
            }
        }

        @SuppressWarnings("unchecked")
        public KubenTeamDefinitionBuilderBase(String uniformName, String displayName, Gcp gcp, Github github, Atlantis atlantis, ArtifactRegistry artifactRegistry) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(KubenTeamDefinition.KubenTeamDefinitionBuilder.class)) {
                this.instance = ((T) new KubenTeamDefinition(uniformName, displayName, gcp, github, atlantis, artifactRegistry));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public KubenTeamDefinition.KubenTeamDefinitionBuilderBase withUniformName(String uniformName) {
            ((KubenTeamDefinition) this.instance).uniformName = uniformName;
            return this;
        }

        public KubenTeamDefinition.KubenTeamDefinitionBuilderBase withDisplayName(String displayName) {
            ((KubenTeamDefinition) this.instance).displayName = displayName;
            return this;
        }

        public KubenTeamDefinition.KubenTeamDefinitionBuilderBase withGcp(Gcp gcp) {
            ((KubenTeamDefinition) this.instance).gcp = gcp;
            return this;
        }

        public KubenTeamDefinition.KubenTeamDefinitionBuilderBase withGithub(Github github) {
            ((KubenTeamDefinition) this.instance).github = github;
            return this;
        }

        public KubenTeamDefinition.KubenTeamDefinitionBuilderBase withAtlantis(Atlantis atlantis) {
            ((KubenTeamDefinition) this.instance).atlantis = atlantis;
            return this;
        }

        public KubenTeamDefinition.KubenTeamDefinitionBuilderBase withArtifactRegistry(ArtifactRegistry artifactRegistry) {
            ((KubenTeamDefinition) this.instance).artifactRegistry = artifactRegistry;
            return this;
        }

        public KubenTeamDefinition.KubenTeamDefinitionBuilderBase withAdditionalProperty(String name, Object value) {
            ((KubenTeamDefinition) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
