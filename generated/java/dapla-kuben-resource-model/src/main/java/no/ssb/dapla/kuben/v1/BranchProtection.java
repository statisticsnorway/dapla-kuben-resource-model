
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
    "enabled",
    "enforce_admins"
})
@Generated("jsonschema2pojo")
public class BranchProtection implements Serializable
{

    /**
     * Enable the default Kuben set of branch protection rules
     * 
     */
    @JsonProperty("enabled")
    @JsonPropertyDescription("Enable the default Kuben set of branch protection rules")
    private Boolean enabled;
    /**
     * Do not allow repository admins to bypass branch protection rules (false required for Flux2 image update automation)
     * 
     */
    @JsonProperty("enforce_admins")
    @JsonPropertyDescription("Do not allow repository admins to bypass branch protection rules (false required for Flux2 image update automation)")
    private Boolean enforceAdmins;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -571938769444607797L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BranchProtection() {
    }

    /**
     * 
     * @param enforceAdmins
     *     Do not allow repository admins to bypass branch protection rules (false required for Flux2 image update automation).
     * @param enabled
     *     Enable the default Kuben set of branch protection rules.
     */
    public BranchProtection(Boolean enabled, Boolean enforceAdmins) {
        super();
        this.enabled = enabled;
        this.enforceAdmins = enforceAdmins;
    }

    public static BranchProtection.BranchProtectionBuilderBase builder() {
        return new BranchProtection.BranchProtectionBuilder();
    }

    /**
     * Enable the default Kuben set of branch protection rules
     * 
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Enable the default Kuben set of branch protection rules
     * 
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Do not allow repository admins to bypass branch protection rules (false required for Flux2 image update automation)
     * 
     */
    @JsonProperty("enforce_admins")
    public Boolean getEnforceAdmins() {
        return enforceAdmins;
    }

    /**
     * Do not allow repository admins to bypass branch protection rules (false required for Flux2 image update automation)
     * 
     */
    @JsonProperty("enforce_admins")
    public void setEnforceAdmins(Boolean enforceAdmins) {
        this.enforceAdmins = enforceAdmins;
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
        sb.append(BranchProtection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("enabled");
        sb.append('=');
        sb.append(((this.enabled == null)?"<null>":this.enabled));
        sb.append(',');
        sb.append("enforceAdmins");
        sb.append('=');
        sb.append(((this.enforceAdmins == null)?"<null>":this.enforceAdmins));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.enabled == null)? 0 :this.enabled.hashCode()));
        result = ((result* 31)+((this.enforceAdmins == null)? 0 :this.enforceAdmins.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BranchProtection) == false) {
            return false;
        }
        BranchProtection rhs = ((BranchProtection) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.enabled == rhs.enabled)||((this.enabled!= null)&&this.enabled.equals(rhs.enabled))))&&((this.enforceAdmins == rhs.enforceAdmins)||((this.enforceAdmins!= null)&&this.enforceAdmins.equals(rhs.enforceAdmins))));
    }

    public static class BranchProtectionBuilder
        extends BranchProtection.BranchProtectionBuilderBase<BranchProtection>
    {


        public BranchProtectionBuilder() {
            super();
        }

        public BranchProtectionBuilder(Boolean enabled, Boolean enforceAdmins) {
            super(enabled, enforceAdmins);
        }

    }

    public static abstract class BranchProtectionBuilderBase<T extends BranchProtection >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public BranchProtectionBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(BranchProtection.BranchProtectionBuilder.class)) {
                this.instance = ((T) new BranchProtection());
            }
        }

        @SuppressWarnings("unchecked")
        public BranchProtectionBuilderBase(Boolean enabled, Boolean enforceAdmins) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(BranchProtection.BranchProtectionBuilder.class)) {
                this.instance = ((T) new BranchProtection(enabled, enforceAdmins));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public BranchProtection.BranchProtectionBuilderBase withEnabled(Boolean enabled) {
            ((BranchProtection) this.instance).enabled = enabled;
            return this;
        }

        public BranchProtection.BranchProtectionBuilderBase withEnforceAdmins(Boolean enforceAdmins) {
            ((BranchProtection) this.instance).enforceAdmins = enforceAdmins;
            return this;
        }

        public BranchProtection.BranchProtectionBuilderBase withAdditionalProperty(String name, Object value) {
            ((BranchProtection) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
