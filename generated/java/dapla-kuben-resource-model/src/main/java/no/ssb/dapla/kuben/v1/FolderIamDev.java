
package no.ssb.dapla.kuben.v1;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;


/**
 * Map of role and list of roles to entities to have this role. Group name or fully qualified email address, e.g. user:someuser@ssb.no
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
@Generated("jsonschema2pojo")
public class FolderIamDev implements Serializable
{

    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 6112825978405078464L;

    public static FolderIamDev.FolderIamDevBuilderBase builder() {
        return new FolderIamDev.FolderIamDevBuilder();
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
        sb.append(FolderIamDev.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FolderIamDev) == false) {
            return false;
        }
        FolderIamDev rhs = ((FolderIamDev) other);
        return ((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)));
    }

    public static class FolderIamDevBuilder
        extends FolderIamDev.FolderIamDevBuilderBase<FolderIamDev>
    {


        public FolderIamDevBuilder() {
            super();
        }

    }

    public static abstract class FolderIamDevBuilderBase<T extends FolderIamDev >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public FolderIamDevBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(FolderIamDev.FolderIamDevBuilder.class)) {
                this.instance = ((T) new FolderIamDev());
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public FolderIamDev.FolderIamDevBuilderBase withAdditionalProperty(String name, Object value) {
            ((FolderIamDev) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
