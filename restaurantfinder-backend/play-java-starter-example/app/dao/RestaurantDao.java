package dao;

import models.Restaurant;

import java.util.Collection;

public interface RestaurantDao extends CrudDAO<Restaurant, Integer>{

    Collection<Restaurant> findRestaurantByName(String name);
    Collection<Restaurant> findRestaurantByLocation(Double lat, Double lng);
    Collection<Restaurant> findRestaurantByFilters(String type, String[] cost, String[] cuisines, Integer Sort,String Open);


}