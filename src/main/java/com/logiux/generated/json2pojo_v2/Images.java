
package com.logiux.generated.json2pojo_v2;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "tiny",
    "small",
    "large"
})
public class Images {

    @JsonProperty("tiny")
    private String tiny;
    @JsonProperty("small")
    private String small;
    @JsonProperty("large")
    private String large;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The tiny
     */
    @JsonProperty("tiny")
    public String getTiny() {
        return tiny;
    }

    /**
     * 
     * @param tiny
     *     The tiny
     */
    @JsonProperty("tiny")
    public void setTiny(String tiny) {
        this.tiny = tiny;
    }

    /**
     * 
     * @return
     *     The small
     */
    @JsonProperty("small")
    public String getSmall() {
        return small;
    }

    /**
     * 
     * @param small
     *     The small
     */
    @JsonProperty("small")
    public void setSmall(String small) {
        this.small = small;
    }

    /**
     * 
     * @return
     *     The large
     */
    @JsonProperty("large")
    public String getLarge() {
        return large;
    }

    /**
     * 
     * @param large
     *     The large
     */
    @JsonProperty("large")
    public void setLarge(String large) {
        this.large = large;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
