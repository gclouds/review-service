
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
    "id",
    "lang",
    "location_id",
    "published_date",
    "rating",
    "helpful_votes",
    "rating_image_url",
    "url",
    "trip_type",
    "travel_date",
    "text",
    "user",
    "title",
    "owner_response",
    "subratings"
})
public class Review {

    @JsonProperty("id")
    private String id;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("location_id")
    private String locationId;
    @JsonProperty("published_date")
    private String publishedDate;
    @JsonProperty("rating")
    private Integer rating;
    @JsonProperty("helpful_votes")
    private String helpfulVotes;
    @JsonProperty("rating_image_url")
    private String ratingImageUrl;
    @JsonProperty("url")
    private String url;
    @JsonProperty("trip_type")
    private String tripType;
    @JsonProperty("travel_date")
    private String travelDate;
    @JsonProperty("text")
    private String text;
    @JsonProperty("user")
    private User user;
    @JsonProperty("title")
    private String title;
    @JsonProperty("owner_response")
    private Object ownerResponse;
    @JsonProperty("subratings")
    private List<Subrating> subratings = new ArrayList<Subrating>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The lang
     */
    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    /**
     * 
     * @param lang
     *     The lang
     */
    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
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

    /**
     * 
     * @return
     *     The publishedDate
     */
    @JsonProperty("published_date")
    public String getPublishedDate() {
        return publishedDate;
    }

    /**
     * 
     * @param publishedDate
     *     The published_date
     */
    @JsonProperty("published_date")
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    /**
     * 
     * @return
     *     The rating
     */
    @JsonProperty("rating")
    public Integer getRating() {
        return rating;
    }

    /**
     * 
     * @param rating
     *     The rating
     */
    @JsonProperty("rating")
    public void setRating(Integer rating) {
        this.rating = rating;
    }

    /**
     * 
     * @return
     *     The helpfulVotes
     */
    @JsonProperty("helpful_votes")
    public String getHelpfulVotes() {
        return helpfulVotes;
    }

    /**
     * 
     * @param helpfulVotes
     *     The helpful_votes
     */
    @JsonProperty("helpful_votes")
    public void setHelpfulVotes(String helpfulVotes) {
        this.helpfulVotes = helpfulVotes;
    }

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
     *     The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The tripType
     */
    @JsonProperty("trip_type")
    public String getTripType() {
        return tripType;
    }

    /**
     * 
     * @param tripType
     *     The trip_type
     */
    @JsonProperty("trip_type")
    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    /**
     * 
     * @return
     *     The travelDate
     */
    @JsonProperty("travel_date")
    public String getTravelDate() {
        return travelDate;
    }

    /**
     * 
     * @param travelDate
     *     The travel_date
     */
    @JsonProperty("travel_date")
    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    /**
     * 
     * @return
     *     The text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The user
     */
    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The ownerResponse
     */
    @JsonProperty("owner_response")
    public Object getOwnerResponse() {
        return ownerResponse;
    }

    /**
     * 
     * @param ownerResponse
     *     The owner_response
     */
    @JsonProperty("owner_response")
    public void setOwnerResponse(Object ownerResponse) {
        this.ownerResponse = ownerResponse;
    }

    /**
     * 
     * @return
     *     The subratings
     */
    @JsonProperty("subratings")
    public List<Subrating> getSubratings() {
        return subratings;
    }

    /**
     * 
     * @param subratings
     *     The subratings
     */
    @JsonProperty("subratings")
    public void setSubratings(List<Subrating> subratings) {
        this.subratings = subratings;
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
