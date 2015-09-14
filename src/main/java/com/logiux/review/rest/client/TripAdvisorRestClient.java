/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logiux.review.rest.client;

import com.logiux.generated.json2pojo_v2.TripAdvisorJSONRS;
import com.logiux.review.configuration.HystrixDashboardKey;
import com.logiux.review.service.IReviewService;
import com.logiux.review.service.IReviewServiceProvider;
import com.logiux.review.service.ReviewServices;
import com.yammer.tenacity.core.TenacityCommand;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;

/**
 *
 * @author rvarghes
 */
public class TripAdvisorRestClient extends TenacityCommand<Response> implements IReviewServiceProvider {

    private final String endpoint;
    private final Client client;
    private final String key;
    private final String hotelID;

    public static class Builder {

        //Required parameters

        Client client;
        String endpoint;
        String key;
        //Optional TripAdvisor hotelid
        String hotelID;

        public Builder(Client client, String endpoint, String key) {
            this.client = client;
            this.endpoint = endpoint;
            this.key = key;
        }

        public Builder tripAdvisorHotelID(String id) {
            hotelID = id;
            return this;
        }

        public TripAdvisorRestClient build() {
            return new TripAdvisorRestClient(this);
        }
    }

    private TripAdvisorRestClient(Builder builder) {
        super(HystrixDashboardKey.TRIPADVISOR_REVIEW_API);
        client = builder.client;
        endpoint = builder.endpoint;
        key = builder.key;
        hotelID = builder.hotelID;
    }

    //Deprecate this. Instead use Builder pattern
    private TripAdvisorRestClient(Client client, String endpoint, String key, String hotelID) {
        super(HystrixDashboardKey.TRIPADVISOR_REVIEW_API);
        this.endpoint = endpoint;
        this.client = client;
        this.key = key;
        this.hotelID = hotelID;
        //ReviewServices.registerDefaultProvider( this);
    }

    public Response processRequest() {
        //String REST_SERVICE_URL = "http://api.tripadvisor.com/api/partner/2.0/location/1007582?key=69706C2DF564440CAF4CE0D435D4ADEC&fulltext=true";
        //TripAdvisorJSONRS jsonRS = 
        Response response = client.target(endpoint)
                .path("/{hotelID}")
                .queryParam("key", key).queryParam("fulltext", "true")
                .resolveTemplate("hotelID", hotelID)
                .request().get();
                //.get(TripAdvisorJSONRS.class);
        //return jsonRS;
        return response;
    }
    
    @Override
    public Response run() {
        //String REST_SERVICE_URL = "http://api.tripadvisor.com/api/partner/2.0/location/1007582?key=69706C2DF564440CAF4CE0D435D4ADEC&fulltext=true";
        //TripAdvisorJSONRS jsonRS = 
        Response response = client.target(endpoint)
                .path("/{hotelID}")
                .queryParam("key", key).queryParam("fulltext", "true")
                .resolveTemplate("hotelID", hotelID)
                .request().get();
                //.get(TripAdvisorJSONRS.class);
        //return jsonRS;
        return response;
    }

    @Override
    public IReviewService ReviewService() {
        ReviewServices.registerDefaultProvider(this);
        return (ReviewServices.newInstance());
    }
}
