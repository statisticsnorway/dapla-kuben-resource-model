
package no.ssb.dapla.kuben.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;


/**
 * The specification of the concrete metadata for the team. All keys must be lowercase (a-z), may contain _
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data_content_types",
    "pii_agreements"
})
@Generated("jsonschema2pojo")
public class TeamInfoSpec implements Serializable
{

    /**
     * WIP, which data content this team handles
     * (Required)
     * 
     */
    @JsonProperty("data_content_types")
    @JsonPropertyDescription("WIP, which data content this team handles")
    @Valid
    @NotNull
    private TeamInfoSpec.DataContentTypes dataContentTypes;
    /**
     * A list of links to Personal Identifiable Information (PII) agreements are located
     * 
     */
    @JsonProperty("pii_agreements")
    @JsonPropertyDescription("A list of links to Personal Identifiable Information (PII) agreements are located")
    @Valid
    private List<Object> piiAgreements = new ArrayList<Object>();
    private final static long serialVersionUID = -2334493064795374495L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TeamInfoSpec() {
    }

    /**
     * 
     * @param dataContentTypes
     *     WIP, which data content this team handles.
     * @param piiAgreements
     *     A list of links to Personal Identifiable Information (PII) agreements are located.
     */
    public TeamInfoSpec(TeamInfoSpec.DataContentTypes dataContentTypes, List<Object> piiAgreements) {
        super();
        this.dataContentTypes = dataContentTypes;
        this.piiAgreements = piiAgreements;
    }

    public static TeamInfoSpec.TeamInfoSpecBuilderBase builder() {
        return new TeamInfoSpec.TeamInfoSpecBuilder();
    }

    /**
     * WIP, which data content this team handles
     * (Required)
     * 
     */
    @JsonProperty("data_content_types")
    public TeamInfoSpec.DataContentTypes getDataContentTypes() {
        return dataContentTypes;
    }

    /**
     * WIP, which data content this team handles
     * (Required)
     * 
     */
    @JsonProperty("data_content_types")
    public void setDataContentTypes(TeamInfoSpec.DataContentTypes dataContentTypes) {
        this.dataContentTypes = dataContentTypes;
    }

    /**
     * A list of links to Personal Identifiable Information (PII) agreements are located
     * 
     */
    @JsonProperty("pii_agreements")
    public List<Object> getPiiAgreements() {
        return piiAgreements;
    }

    /**
     * A list of links to Personal Identifiable Information (PII) agreements are located
     * 
     */
    @JsonProperty("pii_agreements")
    public void setPiiAgreements(List<Object> piiAgreements) {
        this.piiAgreements = piiAgreements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TeamInfoSpec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dataContentTypes");
        sb.append('=');
        sb.append(((this.dataContentTypes == null)?"<null>":this.dataContentTypes));
        sb.append(',');
        sb.append("piiAgreements");
        sb.append('=');
        sb.append(((this.piiAgreements == null)?"<null>":this.piiAgreements));
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
        result = ((result* 31)+((this.dataContentTypes == null)? 0 :this.dataContentTypes.hashCode()));
        result = ((result* 31)+((this.piiAgreements == null)? 0 :this.piiAgreements.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TeamInfoSpec) == false) {
            return false;
        }
        TeamInfoSpec rhs = ((TeamInfoSpec) other);
        return (((this.dataContentTypes == rhs.dataContentTypes)||((this.dataContentTypes!= null)&&this.dataContentTypes.equals(rhs.dataContentTypes)))&&((this.piiAgreements == rhs.piiAgreements)||((this.piiAgreements!= null)&&this.piiAgreements.equals(rhs.piiAgreements))));
    }


    /**
     * WIP, which data content this team handles
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DataContentTypes {

        OPEN(null),
        PII(null),
        HEALTH(null),
        STOCK_SENSITIVE(null),
        OTHER_SENSITIVE(null);
        private final List<Object> value;
        private final static Map<List<Object> , TeamInfoSpec.DataContentTypes> CONSTANTS = new HashMap<List<Object> , TeamInfoSpec.DataContentTypes>();

        static {
            for (TeamInfoSpec.DataContentTypes c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DataContentTypes(List<Object> value) {
            this.value = value;
        }

        @JsonValue
        public List<Object> value() {
            return this.value;
        }

        @JsonCreator
        public static TeamInfoSpec.DataContentTypes fromValue(List<Object> value) {
            TeamInfoSpec.DataContentTypes constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public static class TeamInfoSpecBuilder
        extends TeamInfoSpec.TeamInfoSpecBuilderBase<TeamInfoSpec>
    {


        public TeamInfoSpecBuilder() {
            super();
        }

        public TeamInfoSpecBuilder(TeamInfoSpec.DataContentTypes dataContentTypes, List<Object> piiAgreements) {
            super(dataContentTypes, piiAgreements);
        }

    }

    public static abstract class TeamInfoSpecBuilderBase<T extends TeamInfoSpec >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public TeamInfoSpecBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(TeamInfoSpec.TeamInfoSpecBuilder.class)) {
                this.instance = ((T) new TeamInfoSpec());
            }
        }

        @SuppressWarnings("unchecked")
        public TeamInfoSpecBuilderBase(TeamInfoSpec.DataContentTypes dataContentTypes, List<Object> piiAgreements) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(TeamInfoSpec.TeamInfoSpecBuilder.class)) {
                this.instance = ((T) new TeamInfoSpec(dataContentTypes, piiAgreements));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public TeamInfoSpec.TeamInfoSpecBuilderBase withDataContentTypes(TeamInfoSpec.DataContentTypes dataContentTypes) {
            ((TeamInfoSpec) this.instance).dataContentTypes = dataContentTypes;
            return this;
        }

        public TeamInfoSpec.TeamInfoSpecBuilderBase withPiiAgreements(List<Object> piiAgreements) {
            ((TeamInfoSpec) this.instance).piiAgreements = piiAgreements;
            return this;
        }

    }

}
