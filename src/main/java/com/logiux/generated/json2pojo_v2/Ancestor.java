
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
    "abbrv",
    "level",
    "name",
    "location_id"
})
public class Ancestor {

    @JsonProperty("abbrv")
    private Object abbrv;
    @JsonProperty("level")
    private String level;
    @JsonProperty("name")
    private String name;
    @JsonProperty("location_id")
    private String locationId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The abbrv
     */
    @JsonProperty("abbrv")
    public Object getAbbrv() {
        return abbrv;
    }

    /**
     * 
     * @param abbrv
     *     The abbrv
     */
    @JsonProperty("abbrv")
    public void setAbbrv(Object abbrv) {
        this.abbrv = abbrv;
    }

    /**
     * 
     * @return
     *     The level
     */
    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The level
     */
    @JsonProperty("level")
    public void setLevel(String level) {
        this.level = level;
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
     *     The locationId
     */
    @JsonProperty("location_id")
    public String getLocationId() {
        return locationId;
    }

    /**
     * 
     * @param locationId
     *     The location_id
     */
    @JsonProperty("location_id")
    public void setLocationId(String locationId) {
        this.locationId = locationId;
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
