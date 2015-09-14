
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
    "rating_image_url",
    "name",
    "value",
    "localized_name"
})
public class Subrating {

    @JsonProperty("rating_image_url")
    private String ratingImageUrl;
    @JsonProperty("name")
    private String name;
    @JsonProperty("value")
    private String value;
    @JsonProperty("localized_name")
    private String localizedName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The ratingImageUrl
     */
    @JsonProperty("rating_image_url")
    public String getRatingImageUrl() {
        return ratingImageUrl;
    }

    /**
     * 
     * @param ratingImageUrl
     *     The rating_image_url
     */
    @JsonProperty("rating_image_url")
    public void setRatingImageUrl(String ratingImageUrl) {
        this.ratingImageUrl = ratingImageUrl;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The localizedName
     */
    @JsonProperty("localized_name")
    public String getLocalizedName() {
        return localizedName;
    }

    /**
     * 
     * @param localizedName
     *     The localized_name
     */
    @JsonProperty("localized_name")
    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
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
