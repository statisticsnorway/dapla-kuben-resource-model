
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "folder",
    "role"
})
@Generated("jsonschema2pojo")
public class FolderIam__1 implements Serializable
{

    /**
     * The folder number
     * 
     */
    @JsonProperty("folder")
    @JsonPropertyDescription("The folder number")
    private String folder;
    /**
     * The role to grant
     * 
     */
    @JsonProperty("role")
    @JsonPropertyDescription("The role to grant")
    private String role;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 4921122945890958437L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FolderIam__1() {
    }

    /**
     * 
     * @param folder
     *     The folder number.
     * @param role
     *     The role to grant.
     */
    public FolderIam__1(String folder, String role) {
        super();
        this.folder = folder;
        this.role = role;
    }

    public static FolderIam__1 .FolderIam__1BuilderBase builder() {
        return new FolderIam__1 .FolderIam__1Builder();
    }

    /**
     * The folder number
     * 
     */
    @JsonProperty("folder")
    public String getFolder() {
        return folder;
    }

    /**
     * The folder number
     * 
     */
    @JsonProperty("folder")
    public void setFolder(String folder) {
        this.folder = folder;
    }

    /**
     * The role to grant
     * 
     */
    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    /**
     * The role to grant
     * 
     */
    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
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
        sb.append(FolderIam__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("folder");
        sb.append('=');
        sb.append(((this.folder == null)?"<null>":this.folder));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
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
        result = ((result* 31)+((this.folder == null)? 0 :this.folder.hashCode()));
        result = ((result* 31)+((this.role == null)? 0 :this.role.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FolderIam__1) == false) {
            return false;
        }
        FolderIam__1 rhs = ((FolderIam__1) other);
        return ((((this.folder == rhs.folder)||((this.folder!= null)&&this.folder.equals(rhs.folder)))&&((this.role == rhs.role)||((this.role!= null)&&this.role.equals(rhs.role))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    public static class FolderIam__1Builder
        extends FolderIam__1 .FolderIam__1BuilderBase<FolderIam__1>
    {


        public FolderIam__1Builder() {
            super();
        }

        public FolderIam__1Builder(String folder, String role) {
            super(folder, role);
        }

    }

    public static abstract class FolderIam__1BuilderBase<T extends FolderIam__1 >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public FolderIam__1BuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(FolderIam__1 .FolderIam__1Builder.class)) {
                this.instance = ((T) new FolderIam__1());
            }
        }

        @SuppressWarnings("unchecked")
        public FolderIam__1BuilderBase(String folder, String role) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(FolderIam__1 .FolderIam__1Builder.class)) {
                this.instance = ((T) new FolderIam__1(folder, role));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public FolderIam__1 .FolderIam__1BuilderBase withFolder(String folder) {
            ((FolderIam__1) this.instance).folder = folder;
            return this;
        }

        public FolderIam__1 .FolderIam__1BuilderBase withRole(String role) {
            ((FolderIam__1) this.instance).role = role;
            return this;
        }

        public FolderIam__1 .FolderIam__1BuilderBase withAdditionalProperty(String name, Object value) {
            ((FolderIam__1) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
