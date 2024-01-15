
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
    "name",
    "access"
})
@Generated("jsonschema2pojo")
public class IacRepo implements Serializable
{

    /**
     * The name of the iac repo for this team
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the iac repo for this team")
    private String name;
    /**
     * Map of AD group to github role
     * 
     */
    @JsonProperty("access")
    @JsonPropertyDescription("Map of AD group to github role")
    @Valid
    private Access access;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -455679121666188717L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public IacRepo() {
    }

    /**
     * 
     * @param access
     *     Map of AD group to github role.
     * @param name
     *     The name of the iac repo for this team.
     */
    public IacRepo(String name, Access access) {
        super();
        this.name = name;
        this.access = access;
    }

    public static IacRepo.IacRepoBuilderBase builder() {
        return new IacRepo.IacRepoBuilder();
    }

    /**
     * The name of the iac repo for this team
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of the iac repo for this team
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Map of AD group to github role
     * 
     */
    @JsonProperty("access")
    public Access getAccess() {
        return access;
    }

    /**
     * Map of AD group to github role
     * 
     */
    @JsonProperty("access")
    public void setAccess(Access access) {
        this.access = access;
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
        sb.append(IacRepo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("access");
        sb.append('=');
        sb.append(((this.access == null)?"<null>":this.access));
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
        result = ((result* 31)+((this.access == null)? 0 :this.access.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IacRepo) == false) {
            return false;
        }
        IacRepo rhs = ((IacRepo) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.access == rhs.access)||((this.access!= null)&&this.access.equals(rhs.access))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    public static class IacRepoBuilder
        extends IacRepo.IacRepoBuilderBase<IacRepo>
    {


        public IacRepoBuilder() {
            super();
        }

        public IacRepoBuilder(String name, Access access) {
            super(name, access);
        }

    }

    public static abstract class IacRepoBuilderBase<T extends IacRepo >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public IacRepoBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(IacRepo.IacRepoBuilder.class)) {
                this.instance = ((T) new IacRepo());
            }
        }

        @SuppressWarnings("unchecked")
        public IacRepoBuilderBase(String name, Access access) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(IacRepo.IacRepoBuilder.class)) {
                this.instance = ((T) new IacRepo(name, access));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public IacRepo.IacRepoBuilderBase withName(String name) {
            ((IacRepo) this.instance).name = name;
            return this;
        }

        public IacRepo.IacRepoBuilderBase withAccess(Access access) {
            ((IacRepo) this.instance).access = access;
            return this;
        }

        public IacRepo.IacRepoBuilderBase withAdditionalProperty(String name, Object value) {
            ((IacRepo) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
