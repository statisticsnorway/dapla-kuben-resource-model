
package no.ssb.dapla.kuben.v1;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


/**
 * The specification of the concrete metadata for the team. All keys must be lowercase (a-z), may contain _
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "section_code"
})
@Generated("jsonschema2pojo")
public class PlatformManagedTeamInfoSpec implements Serializable
{

    /**
     * The code of the section this teams belong to
     * (Required)
     * 
     */
    @JsonProperty("section_code")
    @JsonPropertyDescription("The code of the section this teams belong to")
    @Pattern(regexp = "[0-9]{3}")
    @NotNull
    private String sectionCode;
    private final static long serialVersionUID = -4116034070535887052L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PlatformManagedTeamInfoSpec() {
    }

    /**
     * 
     * @param sectionCode
     *     The code of the section this teams belong to.
     */
    public PlatformManagedTeamInfoSpec(String sectionCode) {
        super();
        this.sectionCode = sectionCode;
    }

    public static PlatformManagedTeamInfoSpec.PlatformManagedTeamInfoSpecBuilderBase builder() {
        return new PlatformManagedTeamInfoSpec.PlatformManagedTeamInfoSpecBuilder();
    }

    /**
     * The code of the section this teams belong to
     * (Required)
     * 
     */
    @JsonProperty("section_code")
    public String getSectionCode() {
        return sectionCode;
    }

    /**
     * The code of the section this teams belong to
     * (Required)
     * 
     */
    @JsonProperty("section_code")
    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PlatformManagedTeamInfoSpec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sectionCode");
        sb.append('=');
        sb.append(((this.sectionCode == null)?"<null>":this.sectionCode));
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
        result = ((result* 31)+((this.sectionCode == null)? 0 :this.sectionCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlatformManagedTeamInfoSpec) == false) {
            return false;
        }
        PlatformManagedTeamInfoSpec rhs = ((PlatformManagedTeamInfoSpec) other);
        return ((this.sectionCode == rhs.sectionCode)||((this.sectionCode!= null)&&this.sectionCode.equals(rhs.sectionCode)));
    }

    public static class PlatformManagedTeamInfoSpecBuilder
        extends PlatformManagedTeamInfoSpec.PlatformManagedTeamInfoSpecBuilderBase<PlatformManagedTeamInfoSpec>
    {


        public PlatformManagedTeamInfoSpecBuilder() {
            super();
        }

        public PlatformManagedTeamInfoSpecBuilder(String sectionCode) {
            super(sectionCode);
        }

    }

    public static abstract class PlatformManagedTeamInfoSpecBuilderBase<T extends PlatformManagedTeamInfoSpec >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public PlatformManagedTeamInfoSpecBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(PlatformManagedTeamInfoSpec.PlatformManagedTeamInfoSpecBuilder.class)) {
                this.instance = ((T) new PlatformManagedTeamInfoSpec());
            }
        }

        @SuppressWarnings("unchecked")
        public PlatformManagedTeamInfoSpecBuilderBase(String sectionCode) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(PlatformManagedTeamInfoSpec.PlatformManagedTeamInfoSpecBuilder.class)) {
                this.instance = ((T) new PlatformManagedTeamInfoSpec(sectionCode));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public PlatformManagedTeamInfoSpec.PlatformManagedTeamInfoSpecBuilderBase withSectionCode(String sectionCode) {
            ((PlatformManagedTeamInfoSpec) this.instance).sectionCode = sectionCode;
            return this;
        }

    }

}
