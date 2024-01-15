
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
    "dev",
    "test",
    "prod"
})
@Generated("jsonschema2pojo")
public class FolderIam implements Serializable
{

    /**
     * 
     * Corresponds to the "dev" property.Map of role and list of AD groups to have this role
     * 
     */
    @JsonProperty("dev")
    @JsonPropertyDescription("Map of role and list of AD groups to have this role")
    @Valid
    private FolderIamDev folderIamDev;
    /**
     * 
     * Corresponds to the "test" property.Map of role and list of AD groups to have this role
     * 
     */
    @JsonProperty("test")
    @JsonPropertyDescription("Map of role and list of AD groups to have this role")
    @Valid
    private FolderIamTest folderIamTest;
    /**
     * 
     * Corresponds to the "prod" property.Map of role and list of AD groups to have this role
     * 
     */
    @JsonProperty("prod")
    @JsonPropertyDescription("Map of role and list of AD groups to have this role")
    @Valid
    private FolderIamProd folderIamProd;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 6582585455458302290L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FolderIam() {
    }

    /**
     * 
     * @param folderIamProd
     *     Map of role and list of AD groups to have this role.
     * @param folderIamTest
     *     Map of role and list of AD groups to have this role.
     * @param folderIamDev
     *     Map of role and list of AD groups to have this role.
     */
    public FolderIam(FolderIamDev folderIamDev, FolderIamTest folderIamTest, FolderIamProd folderIamProd) {
        super();
        this.folderIamDev = folderIamDev;
        this.folderIamTest = folderIamTest;
        this.folderIamProd = folderIamProd;
    }

    public static FolderIam.FolderIamBuilderBase builder() {
        return new FolderIam.FolderIamBuilder();
    }

    /**
     * 
     * Corresponds to the "dev" property.Map of role and list of AD groups to have this role
     * 
     */
    @JsonProperty("dev")
    public FolderIamDev getFolderIamDev() {
        return folderIamDev;
    }

    /**
     * 
     * Corresponds to the "dev" property.Map of role and list of AD groups to have this role
     * 
     */
    @JsonProperty("dev")
    public void setFolderIamDev(FolderIamDev folderIamDev) {
        this.folderIamDev = folderIamDev;
    }

    /**
     * 
     * Corresponds to the "test" property.Map of role and list of AD groups to have this role
     * 
     */
    @JsonProperty("test")
    public FolderIamTest getFolderIamTest() {
        return folderIamTest;
    }

    /**
     * 
     * Corresponds to the "test" property.Map of role and list of AD groups to have this role
     * 
     */
    @JsonProperty("test")
    public void setFolderIamTest(FolderIamTest folderIamTest) {
        this.folderIamTest = folderIamTest;
    }

    /**
     * 
     * Corresponds to the "prod" property.Map of role and list of AD groups to have this role
     * 
     */
    @JsonProperty("prod")
    public FolderIamProd getFolderIamProd() {
        return folderIamProd;
    }

    /**
     * 
     * Corresponds to the "prod" property.Map of role and list of AD groups to have this role
     * 
     */
    @JsonProperty("prod")
    public void setFolderIamProd(FolderIamProd folderIamProd) {
        this.folderIamProd = folderIamProd;
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
        sb.append(FolderIam.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("folderIamDev");
        sb.append('=');
        sb.append(((this.folderIamDev == null)?"<null>":this.folderIamDev));
        sb.append(',');
        sb.append("folderIamTest");
        sb.append('=');
        sb.append(((this.folderIamTest == null)?"<null>":this.folderIamTest));
        sb.append(',');
        sb.append("folderIamProd");
        sb.append('=');
        sb.append(((this.folderIamProd == null)?"<null>":this.folderIamProd));
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
        result = ((result* 31)+((this.folderIamTest == null)? 0 :this.folderIamTest.hashCode()));
        result = ((result* 31)+((this.folderIamProd == null)? 0 :this.folderIamProd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.folderIamDev == null)? 0 :this.folderIamDev.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FolderIam) == false) {
            return false;
        }
        FolderIam rhs = ((FolderIam) other);
        return (((((this.folderIamTest == rhs.folderIamTest)||((this.folderIamTest!= null)&&this.folderIamTest.equals(rhs.folderIamTest)))&&((this.folderIamProd == rhs.folderIamProd)||((this.folderIamProd!= null)&&this.folderIamProd.equals(rhs.folderIamProd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.folderIamDev == rhs.folderIamDev)||((this.folderIamDev!= null)&&this.folderIamDev.equals(rhs.folderIamDev))));
    }

    public static class FolderIamBuilder
        extends FolderIam.FolderIamBuilderBase<FolderIam>
    {


        public FolderIamBuilder() {
            super();
        }

        public FolderIamBuilder(FolderIamDev folderIamDev, FolderIamTest folderIamTest, FolderIamProd folderIamProd) {
            super(folderIamDev, folderIamTest, folderIamProd);
        }

    }

    public static abstract class FolderIamBuilderBase<T extends FolderIam >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public FolderIamBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(FolderIam.FolderIamBuilder.class)) {
                this.instance = ((T) new FolderIam());
            }
        }

        @SuppressWarnings("unchecked")
        public FolderIamBuilderBase(FolderIamDev folderIamDev, FolderIamTest folderIamTest, FolderIamProd folderIamProd) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(FolderIam.FolderIamBuilder.class)) {
                this.instance = ((T) new FolderIam(folderIamDev, folderIamTest, folderIamProd));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public FolderIam.FolderIamBuilderBase withFolderIamDev(FolderIamDev folderIamDev) {
            ((FolderIam) this.instance).folderIamDev = folderIamDev;
            return this;
        }

        public FolderIam.FolderIamBuilderBase withFolderIamTest(FolderIamTest folderIamTest) {
            ((FolderIam) this.instance).folderIamTest = folderIamTest;
            return this;
        }

        public FolderIam.FolderIamBuilderBase withFolderIamProd(FolderIamProd folderIamProd) {
            ((FolderIam) this.instance).folderIamProd = folderIamProd;
            return this;
        }

        public FolderIam.FolderIamBuilderBase withAdditionalProperty(String name, Object value) {
            ((FolderIam) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
