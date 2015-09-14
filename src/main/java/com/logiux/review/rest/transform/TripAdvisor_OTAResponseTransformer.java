/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logiux.review.rest.transform;

import com.logiux.generated.json2pojo_v2.Subrating_;
import com.logiux.generated.json2pojo_v2.TripAdvisorJSONRS;
import com.logiux.generated.json2pojo_v2.User;
import com.logiux.generated.json2pojo_v2.UserLocation;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import org.opentravel.ota._2003._05.AddressesType;
import org.opentravel.ota._2003._05.AggregationType;
import org.opentravel.ota._2003._05.EmailsType;
import org.opentravel.ota._2003._05.ErrorType;
import org.opentravel.ota._2003._05.ErrorsType;
//import org.opentravel.ota._2003._05.ListQuestionCategory;
import org.opentravel.ota._2003._05.OTAReviewsRS;
import org.opentravel.ota._2003._05.PersonNameType;
import org.opentravel.ota._2003._05.ResponseGroupType;
import org.opentravel.ota._2003._05.ReviewsType;
import org.opentravel.ota._2003._05.TravelerType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.Response;

/**
 *
 * @author rvarghes
 */
public class TripAdvisor_OTAResponseTransformer {

    private final static Logger LOGGER = LoggerFactory.getLogger(TripAdvisor_OTAResponseTransformer.class);

    public OTAReviewsRS transform(Response dataInGenType) {
        OTAReviewsRS otaResponse = new OTAReviewsRS();
        TripAdvisorJSONRS dataIn = dataInGenType.readEntity(TripAdvisorJSONRS.class);
        otaResponse.setCorrelationID("0123456789");
        if (dataIn.getError() != null) {
            ErrorsType ota_error_list = new ErrorsType();
            ErrorType ota_error = new ErrorType();
            ota_error.setCode(dataIn.getError().getCode());
            ota_error.setShortText(dataIn.getError().getMessage());
            ota_error.setType(dataIn.getError().getType());
            ota_error_list.getError().add(ota_error);
            otaResponse.setErrors(ota_error_list);
            return otaResponse;
        } else {
            ReviewsType reviews = new ReviewsType();
            ReviewsType.Questions questions = new ReviewsType.Questions();
            AggregationType aggregations = new AggregationType();
            List<Subrating_> subrating = dataIn.getSubratings();
            for (int i = 0; i < subrating.size(); i++) {
                Subrating_ subRating = subrating.get(i);
                //ListQuestionCategory lqCat = new ListQuestionCategory();
                //ReviewsType.Questions.QuestionCategory qCat = new ReviewsType.Questions.QuestionCategory();
                //AggregationType aggregations = new AggregationType();
                AggregationType.Aggregation aggregation = new AggregationType.Aggregation();
                aggregation.setAggregateRating(new BigDecimal(subRating.getValue()));
                aggregation.setAggregationRef(subRating.getName());
                aggregations.getAggregation().add(aggregation);
                //qCat.setRPH(Integer.toString(i + 1));
                //qCat.setAggregations(aggregations);           
            }
            questions.setAggregations(aggregations);

            ReviewsType.ReviewSubject rs = new ReviewsType.ReviewSubject();

            org.opentravel.ota._2003._05.ReviewsType.ReviewSubject.Hotel hotel = new org.opentravel.ota._2003._05.ReviewsType.ReviewSubject.Hotel();
            hotel.setHotelName(dataIn.getName());
            hotel.setHotelCode(dataIn.getPartnerLocationId().get(0));
            hotel.setTTIcode(new BigInteger(dataIn.getLocationId()));
            hotel.setHotelCodeContext("TripAdvisor");
            rs.setHotel(hotel);

            List<com.logiux.generated.json2pojo_v2.Review> reviewsList = dataIn.getReviews();
            for (com.logiux.generated.json2pojo_v2.Review reviewJson : reviewsList) {
                ReviewsType.ReviewSubject.Review review = new ReviewsType.ReviewSubject.Review();
                //Add ReiviewerInfo
                TravelerType rInfo = new TravelerType();

                rInfo.setTravelType(reviewJson.getTripType());

                AddressesType addType = new AddressesType();
                AddressesType.Address address = new AddressesType.Address();
                User user = reviewJson.getUser();
                UserLocation userLocation = user.getUserLocation();
                address.setRemark(userLocation.getName());
                addType.getAddress().add(address);

                rInfo.setReviewerAddress(addType);

                PersonNameType person = new PersonNameType();
                person.setNameType(user.getUsername());
                rInfo.setReviewerName(person);

                EmailsType emailsType = new EmailsType();
                EmailsType.Email email = new EmailsType.Email();
                email.setID("abc@abc.com");
                emailsType.getEmail().add(email);
                rInfo.setReviewerEmail(emailsType);

                review.setReviewerInfo(rInfo);
                review.setReviewDate(reviewJson.getPublishedDate());
                review.setReviewID(reviewJson.getId());
                review.setMonthYearOfTravel(reviewJson.getTravelDate());

                //Add ResponseGroup
                ReviewsType.ReviewSubject.Review.ResponseGroups resGroups = new ReviewsType.ReviewSubject.Review.ResponseGroups();
                ReviewsType.ReviewSubject.Review.ResponseGroups.ResponseGroup resGroup = new ReviewsType.ReviewSubject.Review.ResponseGroups.ResponseGroup();
                ResponseGroupType.Response resp = new ResponseGroupType.Response();
                resp.setComments(reviewJson.getText());
                resGroup.getResponse().add(resp);
                resGroups.getResponseGroup().add(resGroup);

                review.setResponseGroups(resGroups);
                rs.getReview().add(review);
            }

            //Add Questions, ReviewSubject to final response
            reviews.setQuestions(questions);
            reviews.getReviewSubject().add(rs);
            otaResponse.setReviews(reviews);
            return otaResponse;
        }
    }

}
