/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logiux.review.configuration;

/**
 *
 * @author rvarghes
 */
import io.dropwizard.Configuration;
import io.dropwizard.client.JerseyClientConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.tenacity.core.config.BreakerboxConfiguration;
import com.yammer.tenacity.core.config.TenacityConfiguration;
import io.dropwizard.util.Duration;
import java.util.HashMap;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
//import org.hibernate.validator.constraints.URL;

public class ReviewServiceConfiguration extends Configuration {

    @Valid
    @NotNull
    private final JerseyClientConfiguration httpClient = new JerseyClientConfiguration();
    //@URL(protocol="http")
    @NotEmpty
    private String endpoint;
    @NotEmpty
    private String key;

    @NotEmpty
    private HashMap<String, String> apple_tripadvisor_hotel_map = new HashMap<>();

    @Min(500)   //Minimum is set to Default for httpclient i.e. 1/2 second
    @Max(30000) //unreasonable to insert timeout > 30 seconds
    private int timeout;

    @NotNull
    private TenacityConfiguration tripadvisorTenacityConfig;
    
    private BreakerboxConfiguration breakerbox;
    
    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
        this.httpClient.setTimeout(Duration.milliseconds(timeout));
    }

    @JsonProperty
    public HashMap<String, String> getApple_tripadvisor_hotel_map() {
        return apple_tripadvisor_hotel_map;
    }

    @JsonProperty
    public void setApple_tripadvisor_hotel_map(HashMap<String, String> apple_tripadvisor_hotel_map) {
        this.apple_tripadvisor_hotel_map = apple_tripadvisor_hotel_map;
    }

    @JsonProperty
    public String getKey() {
        return key;
    }

    @JsonProperty
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("httpClient")
    public JerseyClientConfiguration getJerseyClientConfiguration() {
        return httpClient;
    }

    @JsonProperty
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    @JsonProperty
    public String getEndpoint() {
        return endpoint;
    }

    @JsonProperty
    public TenacityConfiguration getTripadvisorTenacityConfig() {
        return tripadvisorTenacityConfig;
    }
    
    @JsonProperty
    public BreakerboxConfiguration getBreakerbox(){
        return breakerbox;
    }
}
