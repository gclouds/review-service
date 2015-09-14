
package com.logiux.generated.json2pojo_v2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "award_type",
    "year",
    "images",
    "categories",
    "display_name"
})
public class Award {

    @JsonProperty("award_type")
    private String awardType;
    @JsonProperty("year")
    private String year;
    @JsonProperty("images")
    private Images images;
    @JsonProperty("categories")
    private List<String> categories = new ArrayList<String>();
    @JsonProperty("display_name")
    private String displayName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The awardType
     */
    @JsonProperty("award_type")
    public String getAwardType() {
        return awardType;
    }

    /**
     * 
     * @param awardType
     *     The award_type
     */
    @JsonProperty("award_type")
    public void setAwardType(String awardType) {
        this.awardType = awardType;
    }

    /**
     * 
     * @return
     *     The year
     */
    @JsonProperty("year")
    public String getYear() {
        return year;
    }

    /**
     * 
     * @param year
     *     The year
     */
    @JsonProperty("year")
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 
     * @return
     *     The images
     */
    @JsonProperty("images")
    public Images getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    @JsonProperty("images")
    public void setImages(Images images) {
        this.images = images;
    }

    /**
     * 
     * @return
     *     The categories
     */
    @JsonProperty("categories")
    public List<String> getCategories() {
        return categories;
    }

    /**
     * 
     * @param categories
     *     The categories
     */
    @JsonProperty("categories")
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    /**
     * 
     * @return
     *     The displayName
     */
    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 
     * @param displayName
     *     The display_name
     */
    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
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
