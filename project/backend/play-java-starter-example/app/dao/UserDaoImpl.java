package dao;

import models.UserDetails;
import play.db.jpa.JPAApi;

import javax.inject.Inject;

public class UserDaoImpl implements UserDao {

    final JPAApi jpaApi;

    @Inject
    public UserDaoImpl(JPAApi jpaApi) {
        this.jpaApi = jpaApi;
    }

    public UserDetails create (UserDetails userDetails) {

        if (null == userDetails) {
            throw new IllegalArgumentException("ID must be provided");
        }

        jpaApi.em().persist(userDetails);
        return userDetails;

    }


    @Override
    public UserDetails findUserByName(String username) {
        return null;
    }

    @Override
    public UserDetails findUserByAuthToken(String authToken) {
        return null;
    }
}