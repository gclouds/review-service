/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logiux.review.application;

/**
 *
 * @author rvarghes
 */
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.logiux.review.configuration.HystrixTenacityBundleConfigurationFactory;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.logiux.review.configuration.ReviewServiceConfiguration;
import com.logiux.review.rest.transform.RuntimeExceptionMapper;
import com.logiux.review.server.rest.ReviewServiceResource;
import com.yammer.tenacity.core.bundle.TenacityBundleBuilder;
import io.dropwizard.client.JerseyClientBuilder;
import java.math.BigInteger;
import javax.ws.rs.client.Client;
import javax.xml.datatype.XMLGregorianCalendar;

public class ReviewApplication extends Application<ReviewServiceConfiguration> {

    public static void main(String args[]) throws Exception {
        new ReviewApplication().run(args);
    }

    @Override
    public String getName() {
        return "review-service";
    }

    @Override
    public void initialize(Bootstrap<ReviewServiceConfiguration> bootstrap) {
        /* Added to eliminate JAXB to JSON issue
         java.lang.IllegalArgumentException: Conflicting setter definitions for property "year": javax.xml.datatype.XMLGregorianCalendar#setYear(1
         params) vs javax.xml.datatype.XMLGregorianCalendar#setYear(1 params)
         */
        bootstrap.getObjectMapper().addMixIn(XMLGregorianCalendar.class, MixIn.class);
        bootstrap.addBundle(TenacityBundleBuilder
                                        .<ReviewServiceConfiguration> newBuilder()
                                        .configurationFactory(new HystrixTenacityBundleConfigurationFactory())
                                        .build());
    }

    @Override
    public void run(ReviewServiceConfiguration configuration,
            Environment environment) {
        final Client client = new JerseyClientBuilder(environment).using(configuration.getJerseyClientConfiguration()).build(getName());
        final ReviewServiceResource resource = new ReviewServiceResource(
                client, configuration.getEndpoint(), configuration.getKey(), configuration.getApple_tripadvisor_hotel_map()
        );
        environment.jersey().register(resource);
        //environment.jersey().register(new TripAdvisorRestClient(client));
        environment.jersey().register(new RuntimeExceptionMapper());
    }

    public static interface MixIn {
        @JsonIgnore
        public void setYear(BigInteger year);
    }
}
