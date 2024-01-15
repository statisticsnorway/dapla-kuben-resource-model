
package no.ssb.dapla.kuben.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "formats",
    "repos"
})
@Generated("jsonschema2pojo")
public class ArtifactRegistry implements Serializable
{

    /**
     * Set of formats - in upper case- to create artifact registries for, as defined in https://cloud.google.com/artifact-registry/docs/supported-formats . Examples is DOCKER, PYTHON
     * 
     */
    @JsonProperty("formats")
    @JsonPropertyDescription("Set of formats - in upper case- to create artifact registries for, as defined in https://cloud.google.com/artifact-registry/docs/supported-formats . Examples is DOCKER, PYTHON")
    @Valid
    private List<String> formats = new ArrayList<String>();
    /**
     * A list of github repos that should be able to push to artifact registry
     * 
     */
    @JsonProperty("repos")
    @JsonPropertyDescription("A list of github repos that should be able to push to artifact registry")
    @Valid
    private List<Object> repos = new ArrayList<Object>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -7592682883344824911L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ArtifactRegistry() {
    }

    /**
     * 
     * @param formats
     *     Set of formats - in upper case- to create artifact registries for, as defined in https://cloud.google.com/artifact-registry/docs/supported-formats . Examples is DOCKER, PYTHON.
     * @param repos
     *     A list of github repos that should be able to push to artifact registry.
     */
    public ArtifactRegistry(List<String> formats, List<Object> repos) {
        super();
        this.formats = formats;
        this.repos = repos;
    }

    public static ArtifactRegistry.ArtifactRegistryBuilderBase builder() {
        return new ArtifactRegistry.ArtifactRegistryBuilder();
    }

    /**
     * Set of formats - in upper case- to create artifact registries for, as defined in https://cloud.google.com/artifact-registry/docs/supported-formats . Examples is DOCKER, PYTHON
     * 
     */
    @JsonProperty("formats")
    public List<String> getFormats() {
        return formats;
    }

    /**
     * Set of formats - in upper case- to create artifact registries for, as defined in https://cloud.google.com/artifact-registry/docs/supported-formats . Examples is DOCKER, PYTHON
     * 
     */
    @JsonProperty("formats")
    public void setFormats(List<String> formats) {
        this.formats = formats;
    }

    /**
     * A list of github repos that should be able to push to artifact registry
     * 
     */
    @JsonProperty("repos")
    public List<Object> getRepos() {
        return repos;
    }

    /**
     * A list of github repos that should be able to push to artifact registry
     * 
     */
    @JsonProperty("repos")
    public void setRepos(List<Object> repos) {
        this.repos = repos;
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
        sb.append(ArtifactRegistry.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("formats");
        sb.append('=');
        sb.append(((this.formats == null)?"<null>":this.formats));
        sb.append(',');
        sb.append("repos");
        sb.append('=');
        sb.append(((this.repos == null)?"<null>":this.repos));
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
        result = ((result* 31)+((this.formats == null)? 0 :this.formats.hashCode()));
        result = ((result* 31)+((this.repos == null)? 0 :this.repos.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ArtifactRegistry) == false) {
            return false;
        }
        ArtifactRegistry rhs = ((ArtifactRegistry) other);
        return ((((this.formats == rhs.formats)||((this.formats!= null)&&this.formats.equals(rhs.formats)))&&((this.repos == rhs.repos)||((this.repos!= null)&&this.repos.equals(rhs.repos))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    public static class ArtifactRegistryBuilder
        extends ArtifactRegistry.ArtifactRegistryBuilderBase<ArtifactRegistry>
    {


        public ArtifactRegistryBuilder() {
            super();
        }

        public ArtifactRegistryBuilder(List<String> formats, List<Object> repos) {
            super(formats, repos);
        }

    }

    public static abstract class ArtifactRegistryBuilderBase<T extends ArtifactRegistry >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public ArtifactRegistryBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(ArtifactRegistry.ArtifactRegistryBuilder.class)) {
                this.instance = ((T) new ArtifactRegistry());
            }
        }

        @SuppressWarnings("unchecked")
        public ArtifactRegistryBuilderBase(List<String> formats, List<Object> repos) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(ArtifactRegistry.ArtifactRegistryBuilder.class)) {
                this.instance = ((T) new ArtifactRegistry(formats, repos));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public ArtifactRegistry.ArtifactRegistryBuilderBase withFormats(List<String> formats) {
            ((ArtifactRegistry) this.instance).formats = formats;
            return this;
        }

        public ArtifactRegistry.ArtifactRegistryBuilderBase withRepos(List<Object> repos) {
            ((ArtifactRegistry) this.instance).repos = repos;
            return this;
        }

        public ArtifactRegistry.ArtifactRegistryBuilderBase withAdditionalProperty(String name, Object value) {
            ((ArtifactRegistry) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
