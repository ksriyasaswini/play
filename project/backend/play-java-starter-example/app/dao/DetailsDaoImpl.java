package dao;

import  models.RestaurantDetails;
import play.db.jpa.JPAApi;

import javax.inject.Inject;


public class DetailsDaoImpl implements DetailsDao {

    final JPAApi jpaApi;

    @Inject
    public DetailsDaoImpl(JPAApi jpaApi) {
        this.jpaApi=jpaApi;
    }

    @Override
    public RestaurantDetails create(RestaurantDetails restaurantDetails) {

        if(null == restaurantDetails) {
            throw new IllegalArgumentException("name must be provided");

        }

        jpaApi.em().persist(restaurantDetails);
        return restaurantDetails;
    }
}
