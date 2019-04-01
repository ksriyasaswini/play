package Doas;

import module.Restaurant;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.persistence.TypedQuery;
import java.util.Collection;
import java.util.List;
import java.util.Optional;


public class RestaurantDaoImpl implements RestaurantDao{

    final JPAApi jpaApi;

    @Inject
    public RestaurantDaoImpl(JPAApi jpaApi) {

        this.jpaApi = jpaApi;

    }


    public Restaurant create(Restaurant restaurant) {

        if(null == restaurant) {
            throw new IllegalArgumentException("Book must be provided");
        }

        jpaApi.em().persist(restaurant);

        return restaurant;

    }

}
