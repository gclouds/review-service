
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
    "street1",
    "street2",
    "city",
    "state",
    "country",
    "postalcode",
    "address_string"
})
public class AddressObj {

    @JsonProperty("street1")
    private String street1;
    @JsonProperty("street2")
    private String street2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("country")
    private String country;
    @JsonProperty("postalcode")
    private String postalcode;
    @JsonProperty("address_string")
    private String addressString;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The street1
     */
    @JsonProperty("street1")
    public String getStreet1() {
        return street1;
    }

    /**
     * 
     * @param street1
     *     The street1
     */
    @JsonProperty("street1")
    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    /**
     * 
     * @return
     *     The street2
     */
    @JsonProperty("street2")
    public String getStreet2() {
        return street2;
    }

    /**
     * 
     * @param street2
     *     The street2
     */
    @JsonProperty("street2")
    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    /**
     * 
     * @return
     *     The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The country
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The postalcode
     */
    @JsonProperty("postalcode")
    public String getPostalcode() {
        return postalcode;
    }

    /**
     * 
     * @param postalcode
     *     The postalcode
     */
    @JsonProperty("postalcode")
    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    /**
     * 
     * @return
     *     The addressString
     */
    @JsonProperty("address_string")
    public String getAddressString() {
        return addressString;
    }

    /**
     * 
     * @param addressString
     *     The address_string
     */
    @JsonProperty("address_string")
    public void setAddressString(String addressString) {
        this.addressString = addressString;
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
