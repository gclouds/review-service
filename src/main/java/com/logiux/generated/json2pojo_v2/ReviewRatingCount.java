
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
    "1",
    "2",
    "3",
    "4",
    "5"
})
public class ReviewRatingCount {

    @JsonProperty("1")
    private String _1;
    @JsonProperty("2")
    private String _2;
    @JsonProperty("3")
    private String _3;
    @JsonProperty("4")
    private String _4;
    @JsonProperty("5")
    private String _5;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The _1
     */
    @JsonProperty("1")
    public String get1() {
        return _1;
    }

    /**
     * 
     * @param _1
     *     The 1
     */
    @JsonProperty("1")
    public void set1(String _1) {
        this._1 = _1;
    }

    /**
     * 
     * @return
     *     The _2
     */
    @JsonProperty("2")
    public String get2() {
        return _2;
    }

    /**
     * 
     * @param _2
     *     The 2
     */
    @JsonProperty("2")
    public void set2(String _2) {
        this._2 = _2;
    }

    /**
     * 
     * @return
     *     The _3
     */
    @JsonProperty("3")
    public String get3() {
        return _3;
    }

    /**
     * 
     * @param _3
     *     The 3
     */
    @JsonProperty("3")
    public void set3(String _3) {
        this._3 = _3;
    }

    /**
     * 
     * @return
     *     The _4
     */
    @JsonProperty("4")
    public String get4() {
        return _4;
    }

    /**
     * 
     * @param _4
     *     The 4
     */
    @JsonProperty("4")
    public void set4(String _4) {
        this._4 = _4;
    }

    /**
     * 
     * @return
     *     The _5
     */
    @JsonProperty("5")
    public String get5() {
        return _5;
    }

    /**
     * 
     * @param _5
     *     The 5
     */
    @JsonProperty("5")
    public void set5(String _5) {
        this._5 = _5;
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
