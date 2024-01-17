
package no.ssb.dapla.kuben.core.v1;

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
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


/**
 * KubenResource
 * <p>
 * Base definition of how Kuben resources should be defined.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "version",
    "kind",
    "metadata",
    "spec"
})
@Generated("jsonschema2pojo")
public class KubenResource implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    @Pattern(regexp = "^[a-z/]*[a-z]/v[0-9]+$")
    @NotNull
    private String version;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kind")
    @NotNull
    private String kind;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("metadata")
    @Valid
    @NotNull
    private Metadata metadata;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("spec")
    @Valid
    @NotNull
    private Spec spec;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 4320247791927675196L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public KubenResource() {
    }

    public KubenResource(String version, String kind, Metadata metadata, Spec spec) {
        super();
        this.version = version;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
    }

    public static KubenResource.KubenResourceBuilderBase builder() {
        return new KubenResource.KubenResourceBuilder();
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("spec")
    public Spec getSpec() {
        return spec;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("spec")
    public void setSpec(Spec spec) {
        this.spec = spec;
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
        sb.append(KubenResource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
        sb.append(',');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("spec");
        sb.append('=');
        sb.append(((this.spec == null)?"<null>":this.spec));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.kind == null)? 0 :this.kind.hashCode()));
        result = ((result* 31)+((this.spec == null)? 0 :this.spec.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KubenResource) == false) {
            return false;
        }
        KubenResource rhs = ((KubenResource) other);
        return ((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind))))&&((this.spec == rhs.spec)||((this.spec!= null)&&this.spec.equals(rhs.spec))));
    }

    public static class KubenResourceBuilder
        extends KubenResource.KubenResourceBuilderBase<KubenResource>
    {


        public KubenResourceBuilder() {
            super();
        }

        public KubenResourceBuilder(String version, String kind, Metadata metadata, Spec spec) {
            super(version, kind, metadata, spec);
        }

    }

    public static abstract class KubenResourceBuilderBase<T extends KubenResource >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public KubenResourceBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(KubenResource.KubenResourceBuilder.class)) {
                this.instance = ((T) new KubenResource());
            }
        }

        @SuppressWarnings("unchecked")
        public KubenResourceBuilderBase(String version, String kind, Metadata metadata, Spec spec) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(KubenResource.KubenResourceBuilder.class)) {
                this.instance = ((T) new KubenResource(version, kind, metadata, spec));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public KubenResource.KubenResourceBuilderBase withVersion(String version) {
            ((KubenResource) this.instance).version = version;
            return this;
        }

        public KubenResource.KubenResourceBuilderBase withKind(String kind) {
            ((KubenResource) this.instance).kind = kind;
            return this;
        }

        public KubenResource.KubenResourceBuilderBase withMetadata(Metadata metadata) {
            ((KubenResource) this.instance).metadata = metadata;
            return this;
        }

        public KubenResource.KubenResourceBuilderBase withSpec(Spec spec) {
            ((KubenResource) this.instance).spec = spec;
            return this;
        }

        public KubenResource.KubenResourceBuilderBase withAdditionalProperty(String name, Object value) {
            ((KubenResource) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
