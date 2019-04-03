package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Integer Id;

    @Basic
    @JsonProperty("name")
    private String name;

    @Basic
    @JsonProperty("address")
    private String address;

    @Basic
    @JsonProperty("phno")
    private String phno;

    @Basic
    @JsonProperty("workinghrs")
    private String workinghrs;

    @Basic
    @JsonProperty("cost")
    private String cost;

    @Basic
    @JsonProperty("cuisines")
    private String[] cuisines;

    @Basic
    @JsonProperty("featured_in")
    private String[] featured_in;

    @Basic
    @JsonProperty("type")
    private String type;

    @Basic
    @JsonProperty("latitude")
    private float latitude;

    @Basic
    @JsonProperty("longitude")
    private float longitude;

    @Transient
    @JsonIgnore
    @JsonProperty("menuUrls")
    private String[] menuUrls;

    @Transient
    @JsonIgnore
    @JsonProperty("imageUrls")
    private String[] imageUrls;

    public Restaurant() {
    }


    public Restaurant(Integer res_id, String name, String address, String phno, String workinghrs, String cost, String[] cuisines, String[] featured_in, String type, float latitude, float longitude, String[] menuUrls, String[] imageUrls) {
        this.Id = res_id;
        this.name = name;
        this.address = address;
        this.phno = phno;
        this.workinghrs = workinghrs;
        this.cost = cost;
        this.cuisines = cuisines;
        this.featured_in = featured_in;
        this.type = type;
        this.latitude = latitude;
        this.longitude = longitude;
        this.menuUrls = menuUrls;
        this.imageUrls = imageUrls;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getWorkinghrs() {
        return workinghrs;
    }

    public void setWorkinghrs(String workinghrs) {
        this.workinghrs = workinghrs;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String[] getCuisines() {
        return cuisines;
    }

    public void setCuisines(String[] cuisines) {
        this.cuisines = cuisines;
    }

    public String[] getFeatured_in() {
        return featured_in;
    }

    public void setFeatured_in(String[] featured_in) {
        this.featured_in = featured_in;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String[] getMenuUrls() {
        return menuUrls;
    }

    public void setMenuUrls(String[] menuUrls) {
        this.menuUrls = menuUrls;
    }

    public String[] getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(String[] imageUrls) {
        this.imageUrls = imageUrls;
    }
}