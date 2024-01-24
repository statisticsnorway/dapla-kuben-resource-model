
package no.ssb.dapla.kuben.v1;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


/**
 * The specification of the concrete metadata for the team. All keys must be lowercase (a-z), may contain _
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "section_code",
    "autonomy_level"
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
    /**
     * The level of autonomy the team has.. This says something about the level of control and responsibility the team has over their own resources.
     * 
     */
    @JsonProperty("autonomy_level")
    @JsonPropertyDescription("The level of autonomy the team has.. This says something about the level of control and responsibility the team has over their own resources.")
    private PlatformManagedTeamInfoSpec.AutonomyLevel autonomyLevel;
    private final static long serialVersionUID = -1536793031518413103L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PlatformManagedTeamInfoSpec() {
    }

    /**
     * 
     * @param autonomyLevel
     *     The level of autonomy the team has.. This says something about the level of control and responsibility the team has over their own resources.
     * @param sectionCode
     *     The code of the section this teams belong to.
     */
    public PlatformManagedTeamInfoSpec(String sectionCode, PlatformManagedTeamInfoSpec.AutonomyLevel autonomyLevel) {
        super();
        this.sectionCode = sectionCode;
        this.autonomyLevel = autonomyLevel;
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

    /**
     * The level of autonomy the team has.. This says something about the level of control and responsibility the team has over their own resources.
     * 
     */
    @JsonProperty("autonomy_level")
    public PlatformManagedTeamInfoSpec.AutonomyLevel getAutonomyLevel() {
        return autonomyLevel;
    }

    /**
     * The level of autonomy the team has.. This says something about the level of control and responsibility the team has over their own resources.
     * 
     */
    @JsonProperty("autonomy_level")
    public void setAutonomyLevel(PlatformManagedTeamInfoSpec.AutonomyLevel autonomyLevel) {
        this.autonomyLevel = autonomyLevel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PlatformManagedTeamInfoSpec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sectionCode");
        sb.append('=');
        sb.append(((this.sectionCode == null)?"<null>":this.sectionCode));
        sb.append(',');
        sb.append("autonomyLevel");
        sb.append('=');
        sb.append(((this.autonomyLevel == null)?"<null>":this.autonomyLevel));
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
        result = ((result* 31)+((this.autonomyLevel == null)? 0 :this.autonomyLevel.hashCode()));
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
        return (((this.sectionCode == rhs.sectionCode)||((this.sectionCode!= null)&&this.sectionCode.equals(rhs.sectionCode)))&&((this.autonomyLevel == rhs.autonomyLevel)||((this.autonomyLevel!= null)&&this.autonomyLevel.equals(rhs.autonomyLevel))));
    }


    /**
     * The level of autonomy the team has.. This says something about the level of control and responsibility the team has over their own resources.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AutonomyLevel {

        MANAGED("MANAGED"),
        SEMI_MANAGED("SEMI_MANAGED"),
        SELF_MANAGED("SELF_MANAGED");
        private final String value;
        private final static Map<String, PlatformManagedTeamInfoSpec.AutonomyLevel> CONSTANTS = new HashMap<String, PlatformManagedTeamInfoSpec.AutonomyLevel>();

        static {
            for (PlatformManagedTeamInfoSpec.AutonomyLevel c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AutonomyLevel(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static PlatformManagedTeamInfoSpec.AutonomyLevel fromValue(String value) {
            PlatformManagedTeamInfoSpec.AutonomyLevel constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public static class PlatformManagedTeamInfoSpecBuilder
        extends PlatformManagedTeamInfoSpec.PlatformManagedTeamInfoSpecBuilderBase<PlatformManagedTeamInfoSpec>
    {


        public PlatformManagedTeamInfoSpecBuilder() {
            super();
        }

        public PlatformManagedTeamInfoSpecBuilder(String sectionCode, PlatformManagedTeamInfoSpec.AutonomyLevel autonomyLevel) {
            super(sectionCode, autonomyLevel);
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
        public PlatformManagedTeamInfoSpecBuilderBase(String sectionCode, PlatformManagedTeamInfoSpec.AutonomyLevel autonomyLevel) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(PlatformManagedTeamInfoSpec.PlatformManagedTeamInfoSpecBuilder.class)) {
                this.instance = ((T) new PlatformManagedTeamInfoSpec(sectionCode, autonomyLevel));
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

        public PlatformManagedTeamInfoSpec.PlatformManagedTeamInfoSpecBuilderBase withAutonomyLevel(PlatformManagedTeamInfoSpec.AutonomyLevel autonomyLevel) {
            ((PlatformManagedTeamInfoSpec) this.instance).autonomyLevel = autonomyLevel;
            return this;
        }

    }

}
