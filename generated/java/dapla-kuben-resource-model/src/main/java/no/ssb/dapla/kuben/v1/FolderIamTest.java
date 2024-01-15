
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
 * Map of role and list of AD groups to have this role
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
@Generated("jsonschema2pojo")
public class FolderIamTest implements Serializable
{

    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -3477123874579093204L;

    public static FolderIamTest.FolderIamTestBuilderBase builder() {
        return new FolderIamTest.FolderIamTestBuilder();
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
        sb.append(FolderIamTest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof FolderIamTest) == false) {
            return false;
        }
        FolderIamTest rhs = ((FolderIamTest) other);
        return ((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)));
    }

    public static class FolderIamTestBuilder
        extends FolderIamTest.FolderIamTestBuilderBase<FolderIamTest>
    {


        public FolderIamTestBuilder() {
            super();
        }

    }

    public static abstract class FolderIamTestBuilderBase<T extends FolderIamTest >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public FolderIamTestBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(FolderIamTest.FolderIamTestBuilder.class)) {
                this.instance = ((T) new FolderIamTest());
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public FolderIamTest.FolderIamTestBuilderBase withAdditionalProperty(String name, Object value) {
            ((FolderIamTest) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
