
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
 * Custom fields/metadata for the team. All keys must be lowercase (a-z), may contain _
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
@Generated("jsonschema2pojo")
public class AdditionalTeamInfoSpec implements Serializable
{

    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 5479286756618148593L;

    public static AdditionalTeamInfoSpec.AdditionalTeamInfoSpecBuilderBase builder() {
        return new AdditionalTeamInfoSpec.AdditionalTeamInfoSpecBuilder();
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
        sb.append(AdditionalTeamInfoSpec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof AdditionalTeamInfoSpec) == false) {
            return false;
        }
        AdditionalTeamInfoSpec rhs = ((AdditionalTeamInfoSpec) other);
        return ((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)));
    }

    public static class AdditionalTeamInfoSpecBuilder
        extends AdditionalTeamInfoSpec.AdditionalTeamInfoSpecBuilderBase<AdditionalTeamInfoSpec>
    {


        public AdditionalTeamInfoSpecBuilder() {
            super();
        }

    }

    public static abstract class AdditionalTeamInfoSpecBuilderBase<T extends AdditionalTeamInfoSpec >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public AdditionalTeamInfoSpecBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(AdditionalTeamInfoSpec.AdditionalTeamInfoSpecBuilder.class)) {
                this.instance = ((T) new AdditionalTeamInfoSpec());
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public AdditionalTeamInfoSpec.AdditionalTeamInfoSpecBuilderBase withAdditionalProperty(String name, Object value) {
            ((AdditionalTeamInfoSpec) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
