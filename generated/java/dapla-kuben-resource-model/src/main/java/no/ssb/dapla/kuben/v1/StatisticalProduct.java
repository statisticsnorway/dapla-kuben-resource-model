
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
import jakarta.validation.constraints.Pattern;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "short_name"
})
@Generated("jsonschema2pojo")
public class StatisticalProduct implements Serializable
{

    /**
     * The short name of the statistical product, e.g. eiendom_kostra, elkraftpris, arkpi
     * 
     */
    @JsonProperty("short_name")
    @JsonPropertyDescription("The short name of the statistical product, e.g. eiendom_kostra, elkraftpris, arkpi")
    @Pattern(regexp = "^[a-z_]*$")
    private String shortName;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -47375210836414946L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public StatisticalProduct() {
    }

    /**
     * 
     * @param shortName
     *     The short name of the statistical product, e.g. eiendom_kostra, elkraftpris, arkpi.
     */
    public StatisticalProduct(String shortName) {
        super();
        this.shortName = shortName;
    }

    public static StatisticalProduct.StatisticalProductBuilderBase builder() {
        return new StatisticalProduct.StatisticalProductBuilder();
    }

    /**
     * The short name of the statistical product, e.g. eiendom_kostra, elkraftpris, arkpi
     * 
     */
    @JsonProperty("short_name")
    public String getShortName() {
        return shortName;
    }

    /**
     * The short name of the statistical product, e.g. eiendom_kostra, elkraftpris, arkpi
     * 
     */
    @JsonProperty("short_name")
    public void setShortName(String shortName) {
        this.shortName = shortName;
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
        sb.append(StatisticalProduct.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shortName");
        sb.append('=');
        sb.append(((this.shortName == null)?"<null>":this.shortName));
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
        result = ((result* 31)+((this.shortName == null)? 0 :this.shortName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StatisticalProduct) == false) {
            return false;
        }
        StatisticalProduct rhs = ((StatisticalProduct) other);
        return (((this.shortName == rhs.shortName)||((this.shortName!= null)&&this.shortName.equals(rhs.shortName)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    public static class StatisticalProductBuilder
        extends StatisticalProduct.StatisticalProductBuilderBase<StatisticalProduct>
    {


        public StatisticalProductBuilder() {
            super();
        }

        public StatisticalProductBuilder(String shortName) {
            super(shortName);
        }

    }

    public static abstract class StatisticalProductBuilderBase<T extends StatisticalProduct >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public StatisticalProductBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(StatisticalProduct.StatisticalProductBuilder.class)) {
                this.instance = ((T) new StatisticalProduct());
            }
        }

        @SuppressWarnings("unchecked")
        public StatisticalProductBuilderBase(String shortName) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(StatisticalProduct.StatisticalProductBuilder.class)) {
                this.instance = ((T) new StatisticalProduct(shortName));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public StatisticalProduct.StatisticalProductBuilderBase withShortName(String shortName) {
            ((StatisticalProduct) this.instance).shortName = shortName;
            return this;
        }

        public StatisticalProduct.StatisticalProductBuilderBase withAdditionalProperty(String name, Object value) {
            ((StatisticalProduct) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
