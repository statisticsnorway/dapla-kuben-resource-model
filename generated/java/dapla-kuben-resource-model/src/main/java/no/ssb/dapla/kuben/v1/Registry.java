
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
    "format",
    "location"
})
@Generated("jsonschema2pojo")
public class Registry implements Serializable
{

    /**
     * The format of the registry, in upper case. See https://cloud.google.com/artifact-registry/docs/supported-formats.
     * 
     */
    @JsonProperty("format")
    @JsonPropertyDescription("The format of the registry, in upper case. See https://cloud.google.com/artifact-registry/docs/supported-formats.")
    private String format;
    /**
     * The location for the registry.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("The location for the registry.")
    private String location;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 4121737796544565051L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Registry() {
    }

    /**
     * 
     * @param format
     *     The format of the registry, in upper case. See https://cloud.google.com/artifact-registry/docs/supported-formats.
     * @param location
     *     The location for the registry.
     */
    public Registry(String format, String location) {
        super();
        this.format = format;
        this.location = location;
    }

    public static Registry.RegistryBuilderBase builder() {
        return new Registry.RegistryBuilder();
    }

    /**
     * The format of the registry, in upper case. See https://cloud.google.com/artifact-registry/docs/supported-formats.
     * 
     */
    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    /**
     * The format of the registry, in upper case. See https://cloud.google.com/artifact-registry/docs/supported-formats.
     * 
     */
    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * The location for the registry.
     * 
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * The location for the registry.
     * 
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
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
        sb.append(Registry.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("format");
        sb.append('=');
        sb.append(((this.format == null)?"<null>":this.format));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
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
        result = ((result* 31)+((this.format == null)? 0 :this.format.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Registry) == false) {
            return false;
        }
        Registry rhs = ((Registry) other);
        return ((((this.format == rhs.format)||((this.format!= null)&&this.format.equals(rhs.format)))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    public static class RegistryBuilder
        extends Registry.RegistryBuilderBase<Registry>
    {


        public RegistryBuilder() {
            super();
        }

        public RegistryBuilder(String format, String location) {
            super(format, location);
        }

    }

    public static abstract class RegistryBuilderBase<T extends Registry >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public RegistryBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(Registry.RegistryBuilder.class)) {
                this.instance = ((T) new Registry());
            }
        }

        @SuppressWarnings("unchecked")
        public RegistryBuilderBase(String format, String location) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(Registry.RegistryBuilder.class)) {
                this.instance = ((T) new Registry(format, location));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public Registry.RegistryBuilderBase withFormat(String format) {
            ((Registry) this.instance).format = format;
            return this;
        }

        public Registry.RegistryBuilderBase withLocation(String location) {
            ((Registry) this.instance).location = location;
            return this;
        }

        public Registry.RegistryBuilderBase withAdditionalProperty(String name, Object value) {
            ((Registry) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
