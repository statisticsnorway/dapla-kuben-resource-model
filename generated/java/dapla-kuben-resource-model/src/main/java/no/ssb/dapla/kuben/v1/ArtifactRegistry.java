
package no.ssb.dapla.kuben.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "registries",
    "repos"
})
@Generated("jsonschema2pojo")
public class ArtifactRegistry implements Serializable
{

    /**
     * A list of registries/repositories to create
     * 
     */
    @JsonProperty("registries")
    @JsonPropertyDescription("A list of registries/repositories to create")
    @Valid
    private List<Registry> registries = new ArrayList<Registry>();
    /**
     * A list of github repositories under Statistics Norway-organisation that is allowed to push to Artifact Registry repositories of the team.
     * 
     */
    @JsonProperty("repos")
    @JsonPropertyDescription("A list of github repositories under Statistics Norway-organisation that is allowed to push to Artifact Registry repositories of the team.")
    @Valid
    private List<String> repos = new ArrayList<String>();
    private final static long serialVersionUID = 3072931046995312614L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ArtifactRegistry() {
    }

    /**
     * 
     * @param repos
     *     A list of github repositories under Statistics Norway-organisation that is allowed to push to Artifact Registry repositories of the team.
     * @param registries
     *     A list of registries/repositories to create.
     */
    public ArtifactRegistry(List<Registry> registries, List<String> repos) {
        super();
        this.registries = registries;
        this.repos = repos;
    }

    public static ArtifactRegistry.ArtifactRegistryBuilderBase builder() {
        return new ArtifactRegistry.ArtifactRegistryBuilder();
    }

    /**
     * A list of registries/repositories to create
     * 
     */
    @JsonProperty("registries")
    public List<Registry> getRegistries() {
        return registries;
    }

    /**
     * A list of registries/repositories to create
     * 
     */
    @JsonProperty("registries")
    public void setRegistries(List<Registry> registries) {
        this.registries = registries;
    }

    /**
     * A list of github repositories under Statistics Norway-organisation that is allowed to push to Artifact Registry repositories of the team.
     * 
     */
    @JsonProperty("repos")
    public List<String> getRepos() {
        return repos;
    }

    /**
     * A list of github repositories under Statistics Norway-organisation that is allowed to push to Artifact Registry repositories of the team.
     * 
     */
    @JsonProperty("repos")
    public void setRepos(List<String> repos) {
        this.repos = repos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ArtifactRegistry.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("registries");
        sb.append('=');
        sb.append(((this.registries == null)?"<null>":this.registries));
        sb.append(',');
        sb.append("repos");
        sb.append('=');
        sb.append(((this.repos == null)?"<null>":this.repos));
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
        result = ((result* 31)+((this.registries == null)? 0 :this.registries.hashCode()));
        result = ((result* 31)+((this.repos == null)? 0 :this.repos.hashCode()));
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
        return (((this.registries == rhs.registries)||((this.registries!= null)&&this.registries.equals(rhs.registries)))&&((this.repos == rhs.repos)||((this.repos!= null)&&this.repos.equals(rhs.repos))));
    }

    public static class ArtifactRegistryBuilder
        extends ArtifactRegistry.ArtifactRegistryBuilderBase<ArtifactRegistry>
    {


        public ArtifactRegistryBuilder() {
            super();
        }

        public ArtifactRegistryBuilder(List<Registry> registries, List<String> repos) {
            super(registries, repos);
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
        public ArtifactRegistryBuilderBase(List<Registry> registries, List<String> repos) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(ArtifactRegistry.ArtifactRegistryBuilder.class)) {
                this.instance = ((T) new ArtifactRegistry(registries, repos));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public ArtifactRegistry.ArtifactRegistryBuilderBase withRegistries(List<Registry> registries) {
            ((ArtifactRegistry) this.instance).registries = registries;
            return this;
        }

        public ArtifactRegistry.ArtifactRegistryBuilderBase withRepos(List<String> repos) {
            ((ArtifactRegistry) this.instance).repos = repos;
            return this;
        }

    }

}
