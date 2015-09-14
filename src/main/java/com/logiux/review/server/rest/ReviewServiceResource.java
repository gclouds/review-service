/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logiux.review.server.rest;

/**
 *
 * @author rvarghes
 */
import com.codahale.metrics.annotation.Timed;
import com.logiux.generated.json2pojo_v2.TripAdvisorJSONRS;
import com.logiux.generated.json2pojo_v2.Error;
import com.logiux.review.rest.client.TripAdvisorRestClient;
import com.logiux.review.rest.transform.TripAdvisor_OTAResponseTransformer;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import javax.ws.rs.Consumes;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.MediaType;
import org.opentravel.ota._2003._05.AddressesType;
import org.opentravel.ota._2003._05.AddressesType.Address;

//import org.opentravel.ota._2003._05.AddressesType;
//import org.opentravel.ota._2003._05.AddressesType.Address;
import org.opentravel.ota._2003._05.AggregationType;
import org.opentravel.ota._2003._05.AggregationType.Aggregation;
import org.opentravel.ota._2003._05.EmailsType;
import org.opentravel.ota._2003._05.EmailsType.Email;
import org.opentravel.ota._2003._05.ErrorType;
import org.opentravel.ota._2003._05.ErrorsType;
import org.opentravel.ota._2003._05.ListQuestionCategory;
import org.opentravel.ota._2003._05.OTAReviewsRQ;
import org.opentravel.ota._2003._05.OTAReviewsRQ.ReviewRequest;

import org.opentravel.ota._2003._05.OTAReviewsRS;
import org.opentravel.ota._2003._05.PersonNameType;
import org.opentravel.ota._2003._05.ResponseGroupType.Response;
import org.opentravel.ota._2003._05.ReviewsType;
import org.opentravel.ota._2003._05.ReviewsType.Questions;
import org.opentravel.ota._2003._05.ReviewsType.Questions.QuestionCategory;
import org.opentravel.ota._2003._05.ReviewsType.ReviewSubject;
import org.opentravel.ota._2003._05.ReviewsType.ReviewSubject.Review;
import org.opentravel.ota._2003._05.ReviewsType.ReviewSubject.Review.ResponseGroups;
import org.opentravel.ota._2003._05.ReviewsType.ReviewSubject.Review.ResponseGroups.ResponseGroup;
import org.opentravel.ota._2003._05.TravelerType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/review")
@Produces(MediaType.APPLICATION_JSON)
public class ReviewServiceResource {

    private final String tripAdvisorEndPoint;
    private final Client client;
    private final String key;
    private final HashMap hotelMap;
    private final static Logger LOGGER = LoggerFactory.getLogger(ReviewServiceResource.class);

    public ReviewServiceResource(Client cli, String endpoint, String key, HashMap hotelMap) {
        this.tripAdvisorEndPoint = endpoint;
        this.client = cli;
        this.key = key;
        this.hotelMap = hotelMap;
    }

    @Path("/mock-review")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @GET
    @Timed
    //OTAReviewsRS
    public OTAReviewsRS mockReview() {
        OTAReviewsRS mockReviewResponse = new OTAReviewsRS();
        mockReviewResponse.setCorrelationID("0123456789");
        //mockReviewResponse
        ReviewsType reviews = new ReviewsType();

        Questions questions = new Questions();
        ListQuestionCategory lqCat = new ListQuestionCategory();
        QuestionCategory qCat = new QuestionCategory();
        AggregationType aggregations = new AggregationType();
        Aggregation aggregation = new Aggregation();
        aggregation.setAggregateRating(new BigDecimal(5.0));
        aggregations.getAggregation().add(0, aggregation);
        qCat.setRPH("1");
        qCat.setAggregations(aggregations);
        questions.setAggregations(aggregations);

        ReviewSubject rs = new ReviewSubject();

        org.opentravel.ota._2003._05.ReviewsType.ReviewSubject.Hotel hotel = new org.opentravel.ota._2003._05.ReviewsType.ReviewSubject.Hotel();
        hotel.setHotelName("Secrets Maroma Beach Riviera Cancun");
        hotel.setHotelCode("210641");
        hotel.setTTIcode(BigInteger.valueOf(1007582));
        hotel.setHotelCodeContext("TripAdvisor");
        rs.setHotel(hotel);

        Review review = new Review();

        //Add ReiviewerInfo
        TravelerType rInfo = new TravelerType();

        rInfo.setTravelType("Couples");

        AddressesType addType = new AddressesType();
        Address address = new Address();
        address.setRemark("Charleston, South Carolina");
        addType.getAddress().add(address);

        rInfo.setReviewerAddress(addType);

        PersonNameType person = new PersonNameType();
        person.setNameType("MrsDTF");
        rInfo.setReviewerName(person);

        EmailsType emailsType = new EmailsType();
        Email email = new Email();
        email.setID("abc@abc.com");
        emailsType.getEmail().add(email);
        rInfo.setReviewerEmail(emailsType);

        review.setReviewerInfo(rInfo);

        //Add ResponseGroup
        ResponseGroups resGroups = new ResponseGroups();
        ResponseGroup resGroup = new ResponseGroup();
        Response resp = new Response();
        resp.setComments("My husband and I have been to this secrets resort 3 times in the past 18 months and absolutely love it. When they approach you during check in and say \"welcome home\" it's the absolute truth! We're so happy to say we have found a second home in secrets maroma. The staff is wonderful, food is excellent for an all inclusive. We typically travel in December, but this time went in June / July which was nice- but a very different clientele than the winter months. Lots of honeymooners and a little more rowdy- but nothing I wouldn't come back to again. We loved Cecelia in the lobby bar, she always took excellent care of us and is as sweet as can be. Our pool concierge, Alejandro always made sure to find us the perfect poolside spot and greeted us with a smile. Our favorite restaurant is the Mexican- can't get enough of those special margaritas and lobster tacos! We loved to see some improvements in the resort (although we didn't think it could get any better.. and it did!). The live music poolside and the beach party with music and  a bondfire were special touches that made it even more enjoyable. Don't miss the shows- they are all excellent! We're looking forward to many more trips to come- see you in December!");
        resGroup.getResponse().add(resp);
        resGroups.getResponseGroup().add(resGroup);

        review.setResponseGroups(resGroups);
        rs.getReview().add(review);

        //Add Questions, ReviewSubject to final response
        reviews.setQuestions(questions);
        reviews.getReviewSubject().add(rs);
        mockReviewResponse.setReviews(reviews);
        return mockReviewResponse;
        //return javax.ws.rs.core.Response.ok(mockReviewResponse).header(HttpHeaders.CONTENT_TYPE, "json".equals(format) ? MediaType.APPLICATION_JSON : MediaType.APPLICATION_XML)
        //    .build();
    }

    @Path("/trip-advisor")
    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Timed
    public OTAReviewsRS processTripAdvisorReview(OTAReviewsRQ reviewRequest) {
        LOGGER.info("Request Received" + reviewRequest);
        String avHotelID = reviewRequest.getReviewRequest().get(0).getHotel().getHotelCode();
        //hotelMap.get(avHotelID).toString()
        TripAdvisorRestClient taClient = new TripAdvisorRestClient.Builder(client, tripAdvisorEndPoint, key).tripAdvisorHotelID(avHotelID).build();//  (client, tripAdvisorEndPoint, key, hotelMap.get(avHotelID).toString());
        TripAdvisor_OTAResponseTransformer transformer = new TripAdvisor_OTAResponseTransformer();
        return (transformer.transform(taClient.processRequest()));
        //return null;
    }

    @Path("/mock-response")
    @GET
    @Timed
    public TripAdvisorJSONRS mockResponse() {
        //TripAdvisorRestClient taClient = new TripAdvisorRestClient(client, tripAdvisorEndPoint, key, hotelMap.get("217044").toString());
        TripAdvisorRestClient taClient = new TripAdvisorRestClient.Builder(client, tripAdvisorEndPoint, key).tripAdvisorHotelID((String) hotelMap.get("217044")).build();
        return (taClient.run().readEntity(TripAdvisorJSONRS.class));
    }

    @Path("/mock-request")
    @GET
    @Timed
    public OTAReviewsRQ mockRequest() {
        OTAReviewsRQ reviewsRQ = new OTAReviewsRQ();
        reviewsRQ.setVersion(BigDecimal.ZERO);
        ReviewRequest req = new ReviewRequest();
        org.opentravel.ota._2003._05.OTAReviewsRQ.ReviewRequest.Hotel hotel = new org.opentravel.ota._2003._05.OTAReviewsRQ.ReviewRequest.Hotel();
        hotel.setHotelCode("217044");
        req.setHotel(hotel);
        reviewsRQ.getReviewRequest().add(req);
        LOGGER.info("Request>" + reviewsRQ);
        return (reviewsRQ);
    }

    @Path("/mock-error")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @GET
    @Timed
    //OTAReviewsRS
    public OTAReviewsRS mockError() {
        TripAdvisorJSONRS jsonRS = new TripAdvisorJSONRS();
        Error error = new Error();
        error.setCode("10");
        error.setMessage("Test Error");
        error.setType("TestErrorType");
        jsonRS.setError(error);
        OTAReviewsRS otaResponse = new OTAReviewsRS();
        otaResponse.setCorrelationID("0123456789");
        ErrorsType ota_error_list = new ErrorsType();
        ErrorType ota_error = new ErrorType();
        ota_error.setCode(jsonRS.getError().getCode());
        ota_error.setShortText(jsonRS.getError().getMessage());
        ota_error.setType(jsonRS.getError().getType());
        ota_error_list.getError().add(ota_error);
        otaResponse.setErrors(ota_error_list);
        return otaResponse;
    }
}
