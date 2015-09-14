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
    "error",
    "address_obj",
    "latitude",
    "rating",
    "location_id",
    "trip_types",
    "reviews",
    "write_review",
    "ancestors",
    "longitude",
    "percent_recommended",
    "partner_location_id",
    "review_rating_count",
    "subratings",
    "ranking_data",
    "photo_count",
    "location_string",
    "web_url",
    "price_level",
    "rating_image_url",
    "awards",
    "name",
    "num_reviews",
    "category",
    "subcategory",
    "see_all_photos"
})
public class TripAdvisorJSONRS {

    @JsonProperty("error")
    private Error error;
    @JsonProperty("address_obj")
    private AddressObj addressObj;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("location_id")
    private String locationId;
    @JsonProperty("trip_types")
    private List<TripType> tripTypes = new ArrayList<TripType>();
    @JsonProperty("reviews")
    private List<Review> reviews = new ArrayList<Review>();
    @JsonProperty("write_review")
    private String writeReview;
    @JsonProperty("ancestors")
    private List<Ancestor> ancestors = new ArrayList<Ancestor>();
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("percent_recommended")
    private Object percentRecommended;
    @JsonProperty("partner_location_id")
    private List<String> partnerLocationId = new ArrayList<String>();
    @JsonProperty("review_rating_count")
    private ReviewRatingCount reviewRatingCount;
    @JsonProperty("subratings")
    private List<Subrating_> subratings = new ArrayList<Subrating_>();
    @JsonProperty("ranking_data")
    private RankingData rankingData;
    @JsonProperty("photo_count")
    private String photoCount;
    @JsonProperty("location_string")
    private String locationString;
    @JsonProperty("web_url")
    private String webUrl;
    @JsonProperty("price_level")
    private String priceLevel;
    @JsonProperty("rating_image_url")
    private String ratingImageUrl;
    @JsonProperty("awards")
    private List<Award> awards = new ArrayList<Award>();
    @JsonProperty("name")
    private String name;
    @JsonProperty("num_reviews")
    private String numReviews;
    @JsonProperty("category")
    private Category category;
    @JsonProperty("subcategory")
    private List<Subcategory> subcategory = new ArrayList<Subcategory>();
    @JsonProperty("see_all_photos")
    private String seeAllPhotos;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return The error
     */
    @JsonProperty("error")
    public Error getError() {
        return error;
    }

    /**
     *
     * @param error The error
     */
    @JsonProperty("error")
    public void setError(Error error) {
        this.error = error;
    }

    /**
     *
     * @return The addressObj
     */
    @JsonProperty("address_obj")
    public AddressObj getAddressObj() {
        return addressObj;
    }

    /**
     *
     * @param addressObj The address_obj
     */
    @JsonProperty("address_obj")
    public void setAddressObj(AddressObj addressObj) {
        this.addressObj = addressObj;
    }

    /**
     *
     * @return The latitude
     */
    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude The latitude
     */
    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return The rating
     */
    @JsonProperty("rating")
    public String getRating() {
        return rating;
    }

    /**
     *
     * @param rating The rating
     */
    @JsonProperty("rating")
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     *
     * @return The locationId
     */
    @JsonProperty("location_id")
    public String getLocationId() {
        return locationId;
    }

    /**
     *
     * @param locationId The location_id
     */
    @JsonProperty("location_id")
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    /**
     *
     * @return The tripTypes
     */
    @JsonProperty("trip_types")
    public List<TripType> getTripTypes() {
        return tripTypes;
    }

    /**
     *
     * @param tripTypes The trip_types
     */
    @JsonProperty("trip_types")
    public void setTripTypes(List<TripType> tripTypes) {
        this.tripTypes = tripTypes;
    }

    /**
     *
     * @return The reviews
     */
    @JsonProperty("reviews")
    public List<Review> getReviews() {
        return reviews;
    }

    /**
     *
     * @param reviews The reviews
     */
    @JsonProperty("reviews")
    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    /**
     *
     * @return The writeReview
     */
    @JsonProperty("write_review")
    public String getWriteReview() {
        return writeReview;
    }

    /**
     *
     * @param writeReview The write_review
     */
    @JsonProperty("write_review")
    public void setWriteReview(String writeReview) {
        this.writeReview = writeReview;
    }

    /**
     *
     * @return The ancestors
     */
    @JsonProperty("ancestors")
    public List<Ancestor> getAncestors() {
        return ancestors;
    }

    /**
     *
     * @param ancestors The ancestors
     */
    @JsonProperty("ancestors")
    public void setAncestors(List<Ancestor> ancestors) {
        this.ancestors = ancestors;
    }

    /**
     *
     * @return The longitude
     */
    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude The longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     *
     * @return The percentRecommended
     */
    @JsonProperty("percent_recommended")
    public Object getPercentRecommended() {
        return percentRecommended;
    }

    /**
     *
     * @param percentRecommended The percent_recommended
     */
    @JsonProperty("percent_recommended")
    public void setPercentRecommended(Object percentRecommended) {
        this.percentRecommended = percentRecommended;
    }

    /**
     *
     * @return The partnerLocationId
     */
    @JsonProperty("partner_location_id")
    public List<String> getPartnerLocationId() {
        return partnerLocationId;
    }

    /**
     *
     * @param partnerLocationId The partner_location_id
     */
    @JsonProperty("partner_location_id")
    public void setPartnerLocationId(List<String> partnerLocationId) {
        this.partnerLocationId = partnerLocationId;
    }

    /**
     *
     * @return The reviewRatingCount
     */
    @JsonProperty("review_rating_count")
    public ReviewRatingCount getReviewRatingCount() {
        return reviewRatingCount;
    }

    /**
     *
     * @param reviewRatingCount The review_rating_count
     */
    @JsonProperty("review_rating_count")
    public void setReviewRatingCount(ReviewRatingCount reviewRatingCount) {
        this.reviewRatingCount = reviewRatingCount;
    }

    /**
     *
     * @return The subratings
     */
    @JsonProperty("subratings")
    public List<Subrating_> getSubratings() {
        return subratings;
    }

    /**
     *
     * @param subratings The subratings
     */
    @JsonProperty("subratings")
    public void setSubratings(List<Subrating_> subratings) {
        this.subratings = subratings;
    }

    /**
     *
     * @return The rankingData
     */
    @JsonProperty("ranking_data")
    public RankingData getRankingData() {
        return rankingData;
    }

    /**
     *
     * @param rankingData The ranking_data
     */
    @JsonProperty("ranking_data")
    public void setRankingData(RankingData rankingData) {
        this.rankingData = rankingData;
    }

    /**
     *
     * @return The photoCount
     */
    @JsonProperty("photo_count")
    public String getPhotoCount() {
        return photoCount;
    }

    /**
     *
     * @param photoCount The photo_count
     */
    @JsonProperty("photo_count")
    public void setPhotoCount(String photoCount) {
        this.photoCount = photoCount;
    }

    /**
     *
     * @return The locationString
     */
    @JsonProperty("location_string")
    public String getLocationString() {
        return locationString;
    }

    /**
     *
     * @param locationString The location_string
     */
    @JsonProperty("location_string")
    public void setLocationString(String locationString) {
        this.locationString = locationString;
    }

    /**
     *
     * @return The webUrl
     */
    @JsonProperty("web_url")
    public String getWebUrl() {
        return webUrl;
    }

    /**
     *
     * @param webUrl The web_url
     */
    @JsonProperty("web_url")
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    /**
     *
     * @return The priceLevel
     */
    @JsonProperty("price_level")
    public String getPriceLevel() {
        return priceLevel;
    }

    /**
     *
     * @param priceLevel The price_level
     */
    @JsonProperty("price_level")
    public void setPriceLevel(String priceLevel) {
        this.priceLevel = priceLevel;
    }

    /**
     *
     * @return The ratingImageUrl
     */
    @JsonProperty("rating_image_url")
    public String getRatingImageUrl() {
        return ratingImageUrl;
    }

    /**
     *
     * @param ratingImageUrl The rating_image_url
     */
    @JsonProperty("rating_image_url")
    public void setRatingImageUrl(String ratingImageUrl) {
        this.ratingImageUrl = ratingImageUrl;
    }

    /**
     *
     * @return The awards
     */
    @JsonProperty("awards")
    public List<Award> getAwards() {
        return awards;
    }

    /**
     *
     * @param awards The awards
     */
    @JsonProperty("awards")
    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }

    /**
     *
     * @return The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return The numReviews
     */
    @JsonProperty("num_reviews")
    public String getNumReviews() {
        return numReviews;
    }

    /**
     *
     * @param numReviews The num_reviews
     */
    @JsonProperty("num_reviews")
    public void setNumReviews(String numReviews) {
        this.numReviews = numReviews;
    }

    /**
     *
     * @return The category
     */
    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    /**
     *
     * @param category The category
     */
    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     *
     * @return The subcategory
     */
    @JsonProperty("subcategory")
    public List<Subcategory> getSubcategory() {
        return subcategory;
    }

    /**
     *
     * @param subcategory The subcategory
     */
    @JsonProperty("subcategory")
    public void setSubcategory(List<Subcategory> subcategory) {
        this.subcategory = subcategory;
    }

    /**
     *
     * @return The seeAllPhotos
     */
    @JsonProperty("see_all_photos")
    public String getSeeAllPhotos() {
        return seeAllPhotos;
    }

    /**
     *
     * @param seeAllPhotos The see_all_photos
     */
    @JsonProperty("see_all_photos")
    public void setSeeAllPhotos(String seeAllPhotos) {
        this.seeAllPhotos = seeAllPhotos;
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
