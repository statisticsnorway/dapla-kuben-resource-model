
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "iac_repo"
})
@Generated("jsonschema2pojo")
public class Github implements Serializable
{

    @JsonProperty("iac_repo")
    @Valid
    private IacRepo iacRepo;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 254734117842714625L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Github() {
    }

    public Github(IacRepo iacRepo) {
        super();
        this.iacRepo = iacRepo;
    }

    public static Github.GithubBuilderBase builder() {
        return new Github.GithubBuilder();
    }

    @JsonProperty("iac_repo")
    public IacRepo getIacRepo() {
        return iacRepo;
    }

    @JsonProperty("iac_repo")
    public void setIacRepo(IacRepo iacRepo) {
        this.iacRepo = iacRepo;
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
        sb.append(Github.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("iacRepo");
        sb.append('=');
        sb.append(((this.iacRepo == null)?"<null>":this.iacRepo));
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
        result = ((result* 31)+((this.iacRepo == null)? 0 :this.iacRepo.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Github) == false) {
            return false;
        }
        Github rhs = ((Github) other);
        return (((this.iacRepo == rhs.iacRepo)||((this.iacRepo!= null)&&this.iacRepo.equals(rhs.iacRepo)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    public static class GithubBuilder
        extends Github.GithubBuilderBase<Github>
    {


        public GithubBuilder() {
            super();
        }

        public GithubBuilder(IacRepo iacRepo) {
            super(iacRepo);
        }

    }

    public static abstract class GithubBuilderBase<T extends Github >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public GithubBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(Github.GithubBuilder.class)) {
                this.instance = ((T) new Github());
            }
        }

        @SuppressWarnings("unchecked")
        public GithubBuilderBase(IacRepo iacRepo) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(Github.GithubBuilder.class)) {
                this.instance = ((T) new Github(iacRepo));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public Github.GithubBuilderBase withIacRepo(IacRepo iacRepo) {
            ((Github) this.instance).iacRepo = iacRepo;
            return this;
        }

        public Github.GithubBuilderBase withAdditionalProperty(String name, Object value) {
            ((Github) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
