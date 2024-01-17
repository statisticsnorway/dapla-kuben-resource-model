
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
public class FolderIamProd implements Serializable
{

    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 4119479163597354306L;

    public static FolderIamProd.FolderIamProdBuilderBase builder() {
        return new FolderIamProd.FolderIamProdBuilder();
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
        sb.append(FolderIamProd.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof FolderIamProd) == false) {
            return false;
        }
        FolderIamProd rhs = ((FolderIamProd) other);
        return ((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)));
    }

    public static class FolderIamProdBuilder
        extends FolderIamProd.FolderIamProdBuilderBase<FolderIamProd>
    {


        public FolderIamProdBuilder() {
            super();
        }

    }

    public static abstract class FolderIamProdBuilderBase<T extends FolderIamProd >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public FolderIamProdBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(FolderIamProd.FolderIamProdBuilder.class)) {
                this.instance = ((T) new FolderIamProd());
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public FolderIamProd.FolderIamProdBuilderBase withAdditionalProperty(String name, Object value) {
            ((FolderIamProd) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
