
package no.ssb.dapla.kuben.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * CONSENT_BASED = (samtykkebasert undersøkelse)
 * 
 */
@Generated("jsonschema2pojo")
public enum SourceDataClassification {

    OPEN("OPEN"),
    PII("PII"),
    CONSENT_BASED("CONSENT_BASED"),
    MARKET_SENSITIVE("MARKET_SENSITIVE"),
    OTHER_SENSITIVE("OTHER_SENSITIVE");
    private final String value;
    private final static Map<String, SourceDataClassification> CONSTANTS = new HashMap<String, SourceDataClassification>();

    static {
        for (SourceDataClassification c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SourceDataClassification(String value) {
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
    public static SourceDataClassification fromValue(String value) {
        SourceDataClassification constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
