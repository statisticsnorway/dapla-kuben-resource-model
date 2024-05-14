
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
import jakarta.validation.constraints.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "repos",
    "repo_config_override",
    "folder_iam"
})
@Generated("jsonschema2pojo")
public class Atlantis implements Serializable
{

    /**
     * The name of the atlantis instance
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the atlantis instance")
    @NotNull
    private String name;
    /**
     * Which repositories under Statistics Norway-organisation this team atlantis instance will monitor.
     * 
     */
    @JsonProperty("repos")
    @JsonPropertyDescription("Which repositories under Statistics Norway-organisation this team atlantis instance will monitor.")
    @Valid
    private List<String> repos = new ArrayList<String>();
    /**
     * Override values in this Atlantis' repos.yaml config. Values get merged on top of default values. Should be a valid YAML string.
     * 
     */
    @JsonProperty("repo_config_override")
    @JsonPropertyDescription("Override values in this Atlantis' repos.yaml config. Values get merged on top of default values. Should be a valid YAML string.")
    private String repoConfigOverride;
    /**
     * Array of folder bindings to set for the Atlantis SA.
     * 
     */
    @JsonProperty("folder_iam")
    @JsonPropertyDescription("Array of folder bindings to set for the Atlantis SA.")
    @Valid
    private List<FolderIam__1> folderIam = new ArrayList<FolderIam__1>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -2127862757532224175L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Atlantis() {
    }

    /**
     * 
     * @param repos
     *     Which repositories under Statistics Norway-organisation this team atlantis instance will monitor.
     * @param folderIam
     *     Array of folder bindings to set for the Atlantis SA.
     * @param name
     *     The name of the atlantis instance.
     * @param repoConfigOverride
     *     Override values in this Atlantis' repos.yaml config. Values get merged on top of default values. Should be a valid YAML string.
     */
    public Atlantis(String name, List<String> repos, String repoConfigOverride, List<FolderIam__1> folderIam) {
        super();
        this.name = name;
        this.repos = repos;
        this.repoConfigOverride = repoConfigOverride;
        this.folderIam = folderIam;
    }

    public static Atlantis.AtlantisBuilderBase builder() {
        return new Atlantis.AtlantisBuilder();
    }

    /**
     * The name of the atlantis instance
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of the atlantis instance
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Which repositories under Statistics Norway-organisation this team atlantis instance will monitor.
     * 
     */
    @JsonProperty("repos")
    public List<String> getRepos() {
        return repos;
    }

    /**
     * Which repositories under Statistics Norway-organisation this team atlantis instance will monitor.
     * 
     */
    @JsonProperty("repos")
    public void setRepos(List<String> repos) {
        this.repos = repos;
    }

    /**
     * Override values in this Atlantis' repos.yaml config. Values get merged on top of default values. Should be a valid YAML string.
     * 
     */
    @JsonProperty("repo_config_override")
    public String getRepoConfigOverride() {
        return repoConfigOverride;
    }

    /**
     * Override values in this Atlantis' repos.yaml config. Values get merged on top of default values. Should be a valid YAML string.
     * 
     */
    @JsonProperty("repo_config_override")
    public void setRepoConfigOverride(String repoConfigOverride) {
        this.repoConfigOverride = repoConfigOverride;
    }

    /**
     * Array of folder bindings to set for the Atlantis SA.
     * 
     */
    @JsonProperty("folder_iam")
    public List<FolderIam__1> getFolderIam() {
        return folderIam;
    }

    /**
     * Array of folder bindings to set for the Atlantis SA.
     * 
     */
    @JsonProperty("folder_iam")
    public void setFolderIam(List<FolderIam__1> folderIam) {
        this.folderIam = folderIam;
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
        sb.append(Atlantis.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("repos");
        sb.append('=');
        sb.append(((this.repos == null)?"<null>":this.repos));
        sb.append(',');
        sb.append("repoConfigOverride");
        sb.append('=');
        sb.append(((this.repoConfigOverride == null)?"<null>":this.repoConfigOverride));
        sb.append(',');
        sb.append("folderIam");
        sb.append('=');
        sb.append(((this.folderIam == null)?"<null>":this.folderIam));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.repoConfigOverride == null)? 0 :this.repoConfigOverride.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.repos == null)? 0 :this.repos.hashCode()));
        result = ((result* 31)+((this.folderIam == null)? 0 :this.folderIam.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Atlantis) == false) {
            return false;
        }
        Atlantis rhs = ((Atlantis) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.repoConfigOverride == rhs.repoConfigOverride)||((this.repoConfigOverride!= null)&&this.repoConfigOverride.equals(rhs.repoConfigOverride))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.repos == rhs.repos)||((this.repos!= null)&&this.repos.equals(rhs.repos))))&&((this.folderIam == rhs.folderIam)||((this.folderIam!= null)&&this.folderIam.equals(rhs.folderIam))));
    }

    public static class AtlantisBuilder
        extends Atlantis.AtlantisBuilderBase<Atlantis>
    {


        public AtlantisBuilder() {
            super();
        }

        public AtlantisBuilder(String name, List<String> repos, String repoConfigOverride, List<FolderIam__1> folderIam) {
            super(name, repos, repoConfigOverride, folderIam);
        }

    }

    public static abstract class AtlantisBuilderBase<T extends Atlantis >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public AtlantisBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(Atlantis.AtlantisBuilder.class)) {
                this.instance = ((T) new Atlantis());
            }
        }

        @SuppressWarnings("unchecked")
        public AtlantisBuilderBase(String name, List<String> repos, String repoConfigOverride, List<FolderIam__1> folderIam) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(Atlantis.AtlantisBuilder.class)) {
                this.instance = ((T) new Atlantis(name, repos, repoConfigOverride, folderIam));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public Atlantis.AtlantisBuilderBase withName(String name) {
            ((Atlantis) this.instance).name = name;
            return this;
        }

        public Atlantis.AtlantisBuilderBase withRepos(List<String> repos) {
            ((Atlantis) this.instance).repos = repos;
            return this;
        }

        public Atlantis.AtlantisBuilderBase withRepoConfigOverride(String repoConfigOverride) {
            ((Atlantis) this.instance).repoConfigOverride = repoConfigOverride;
            return this;
        }

        public Atlantis.AtlantisBuilderBase withFolderIam(List<FolderIam__1> folderIam) {
            ((Atlantis) this.instance).folderIam = folderIam;
            return this;
        }

        public Atlantis.AtlantisBuilderBase withAdditionalProperty(String name, Object value) {
            ((Atlantis) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
