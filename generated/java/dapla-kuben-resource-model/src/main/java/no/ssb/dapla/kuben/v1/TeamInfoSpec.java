
package no.ssb.dapla.kuben.v1;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;


/**
 * The specification of the concrete metadata for the team. All keys must be lowercase (a-z), may contain _
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "source_data_classification",
    "statistical_products",
    "dpia_links"
})
@Generated("jsonschema2pojo")
public class TeamInfoSpec implements Serializable
{

    /**
     * Which type of source data this team handles
     * 
     */
    @JsonProperty("source_data_classification")
    @JsonPropertyDescription("Which type of source data this team handles")
    @Valid
    private List<SourceDataClassification> sourceDataClassification = new ArrayList<SourceDataClassification>();
    /**
     * A list of all the statistical products this team produces
     * 
     */
    @JsonProperty("statistical_products")
    @JsonPropertyDescription("A list of all the statistical products this team produces")
    @Valid
    private List<StatisticalProduct> statisticalProducts = new ArrayList<StatisticalProduct>();
    /**
     * A list of links to Personal Identifiable Information (PII) agreements are located
     * 
     */
    @JsonProperty("dpia_links")
    @JsonPropertyDescription("A list of links to Personal Identifiable Information (PII) agreements are located")
    @Valid
    private List<URI> dpiaLinks = new ArrayList<URI>();
    private final static long serialVersionUID = 4396638684417242975L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TeamInfoSpec() {
    }

    /**
     * 
     * @param statisticalProducts
     *     A list of all the statistical products this team produces.
     * @param sourceDataClassification
     *     Which type of source data this team handles.
     * @param dpiaLinks
     *     A list of links to Personal Identifiable Information (PII) agreements are located.
     */
    public TeamInfoSpec(List<SourceDataClassification> sourceDataClassification, List<StatisticalProduct> statisticalProducts, List<URI> dpiaLinks) {
        super();
        this.sourceDataClassification = sourceDataClassification;
        this.statisticalProducts = statisticalProducts;
        this.dpiaLinks = dpiaLinks;
    }

    public static TeamInfoSpec.TeamInfoSpecBuilderBase builder() {
        return new TeamInfoSpec.TeamInfoSpecBuilder();
    }

    /**
     * Which type of source data this team handles
     * 
     */
    @JsonProperty("source_data_classification")
    public List<SourceDataClassification> getSourceDataClassification() {
        return sourceDataClassification;
    }

    /**
     * Which type of source data this team handles
     * 
     */
    @JsonProperty("source_data_classification")
    public void setSourceDataClassification(List<SourceDataClassification> sourceDataClassification) {
        this.sourceDataClassification = sourceDataClassification;
    }

    /**
     * A list of all the statistical products this team produces
     * 
     */
    @JsonProperty("statistical_products")
    public List<StatisticalProduct> getStatisticalProducts() {
        return statisticalProducts;
    }

    /**
     * A list of all the statistical products this team produces
     * 
     */
    @JsonProperty("statistical_products")
    public void setStatisticalProducts(List<StatisticalProduct> statisticalProducts) {
        this.statisticalProducts = statisticalProducts;
    }

    /**
     * A list of links to Personal Identifiable Information (PII) agreements are located
     * 
     */
    @JsonProperty("dpia_links")
    public List<URI> getDpiaLinks() {
        return dpiaLinks;
    }

    /**
     * A list of links to Personal Identifiable Information (PII) agreements are located
     * 
     */
    @JsonProperty("dpia_links")
    public void setDpiaLinks(List<URI> dpiaLinks) {
        this.dpiaLinks = dpiaLinks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TeamInfoSpec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sourceDataClassification");
        sb.append('=');
        sb.append(((this.sourceDataClassification == null)?"<null>":this.sourceDataClassification));
        sb.append(',');
        sb.append("statisticalProducts");
        sb.append('=');
        sb.append(((this.statisticalProducts == null)?"<null>":this.statisticalProducts));
        sb.append(',');
        sb.append("dpiaLinks");
        sb.append('=');
        sb.append(((this.dpiaLinks == null)?"<null>":this.dpiaLinks));
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
        result = ((result* 31)+((this.statisticalProducts == null)? 0 :this.statisticalProducts.hashCode()));
        result = ((result* 31)+((this.sourceDataClassification == null)? 0 :this.sourceDataClassification.hashCode()));
        result = ((result* 31)+((this.dpiaLinks == null)? 0 :this.dpiaLinks.hashCode()));
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
        return ((((this.statisticalProducts == rhs.statisticalProducts)||((this.statisticalProducts!= null)&&this.statisticalProducts.equals(rhs.statisticalProducts)))&&((this.sourceDataClassification == rhs.sourceDataClassification)||((this.sourceDataClassification!= null)&&this.sourceDataClassification.equals(rhs.sourceDataClassification))))&&((this.dpiaLinks == rhs.dpiaLinks)||((this.dpiaLinks!= null)&&this.dpiaLinks.equals(rhs.dpiaLinks))));
    }

    public static class TeamInfoSpecBuilder
        extends TeamInfoSpec.TeamInfoSpecBuilderBase<TeamInfoSpec>
    {


        public TeamInfoSpecBuilder() {
            super();
        }

        public TeamInfoSpecBuilder(List<SourceDataClassification> sourceDataClassification, List<StatisticalProduct> statisticalProducts, List<URI> dpiaLinks) {
            super(sourceDataClassification, statisticalProducts, dpiaLinks);
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
        public TeamInfoSpecBuilderBase(List<SourceDataClassification> sourceDataClassification, List<StatisticalProduct> statisticalProducts, List<URI> dpiaLinks) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(TeamInfoSpec.TeamInfoSpecBuilder.class)) {
                this.instance = ((T) new TeamInfoSpec(sourceDataClassification, statisticalProducts, dpiaLinks));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public TeamInfoSpec.TeamInfoSpecBuilderBase withSourceDataClassification(List<SourceDataClassification> sourceDataClassification) {
            ((TeamInfoSpec) this.instance).sourceDataClassification = sourceDataClassification;
            return this;
        }

        public TeamInfoSpec.TeamInfoSpecBuilderBase withStatisticalProducts(List<StatisticalProduct> statisticalProducts) {
            ((TeamInfoSpec) this.instance).statisticalProducts = statisticalProducts;
            return this;
        }

        public TeamInfoSpec.TeamInfoSpecBuilderBase withDpiaLinks(List<URI> dpiaLinks) {
            ((TeamInfoSpec) this.instance).dpiaLinks = dpiaLinks;
            return this;
        }

    }

}
