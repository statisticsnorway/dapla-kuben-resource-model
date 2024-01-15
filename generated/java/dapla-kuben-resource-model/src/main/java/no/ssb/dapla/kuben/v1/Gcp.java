
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
    "folder_iam"
})
@Generated("jsonschema2pojo")
public class Gcp implements Serializable
{

    @JsonProperty("folder_iam")
    @Valid
    private FolderIam folderIam;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -4689779115871718497L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Gcp() {
    }

    public Gcp(FolderIam folderIam) {
        super();
        this.folderIam = folderIam;
    }

    public static Gcp.GcpBuilderBase builder() {
        return new Gcp.GcpBuilder();
    }

    @JsonProperty("folder_iam")
    public FolderIam getFolderIam() {
        return folderIam;
    }

    @JsonProperty("folder_iam")
    public void setFolderIam(FolderIam folderIam) {
        this.folderIam = folderIam;
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
        sb.append(Gcp.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("folderIam");
        sb.append('=');
        sb.append(((this.folderIam == null)?"<null>":this.folderIam));
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
        result = ((result* 31)+((this.folderIam == null)? 0 :this.folderIam.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Gcp) == false) {
            return false;
        }
        Gcp rhs = ((Gcp) other);
        return (((this.folderIam == rhs.folderIam)||((this.folderIam!= null)&&this.folderIam.equals(rhs.folderIam)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    public static class GcpBuilder
        extends Gcp.GcpBuilderBase<Gcp>
    {


        public GcpBuilder() {
            super();
        }

        public GcpBuilder(FolderIam folderIam) {
            super(folderIam);
        }

    }

    public static abstract class GcpBuilderBase<T extends Gcp >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public GcpBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(Gcp.GcpBuilder.class)) {
                this.instance = ((T) new Gcp());
            }
        }

        @SuppressWarnings("unchecked")
        public GcpBuilderBase(FolderIam folderIam) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(Gcp.GcpBuilder.class)) {
                this.instance = ((T) new Gcp(folderIam));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public Gcp.GcpBuilderBase withFolderIam(FolderIam folderIam) {
            ((Gcp) this.instance).folderIam = folderIam;
            return this;
        }

        public Gcp.GcpBuilderBase withAdditionalProperty(String name, Object value) {
            ((Gcp) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
