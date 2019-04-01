package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Basic;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class RestaurantDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Integer id;

    @Basic
    @JsonProperty("RestaurantName")
    private String RestaurantName;

    @Basic
    @JsonProperty("RestaurantAddress")
    private String RestaurantAddress;

    @Basic
    @JsonProperty("RestaurantNo")
    private String RestaurantNo;

    @Basic
    @JsonProperty("RestaurantHrs")
    private String RestaurantHrs;

    public RestaurantDetails(Integer id, String restaurantName, String restaurantAddress, String restaurantNo, String restaurantHrs) {
        this.id = id;
        RestaurantName = restaurantName;
        RestaurantAddress = restaurantAddress;
        RestaurantNo = restaurantNo;
        RestaurantHrs = restaurantHrs;
    }

    public RestaurantDetails() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        RestaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return RestaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        RestaurantAddress = restaurantAddress;
    }

    public String getRestaurantNo() {
        return RestaurantNo;
    }

    public void setRestaurantNo(String restaurantNo) {
        RestaurantNo = restaurantNo;
    }

    public String getRestaurantHrs() {
        return RestaurantHrs;
    }

    public void setRestaurantHrs(String restaurantHrs) {
        RestaurantHrs = restaurantHrs;
    }
}

