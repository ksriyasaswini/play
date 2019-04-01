package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import dao.DetailsDao;
import models.RestaurantDetails;
import org.springframework.beans.factory.annotation.Autowired;
import play.Logger;
import play.libs.Json;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

public class DetailsController extends Controller {

    private final static Logger.ALogger LOGGER = Logger.of(DetailsController.class);


    @Inject
    public DetailsController(DetailsDao detailsDao) {
        this.detailsDao = detailsDao;
    }

    @Autowired
    final DetailsDao detailsDao;

    @Transactional
    public Result createRestaurantDetails() {

        final JsonNode json = request().body().asJson();

        final RestaurantDetails restaurantDetails = Json.fromJson(json, RestaurantDetails.class);

        if (null == restaurantDetails.getRestaurantName()) {
            return badRequest("Restaurantname  must be provided");
        }



        detailsDao.create(restaurantDetails);

        final JsonNode result = Json.toJson(restaurantDetails);

        return ok(result);
    }
}
