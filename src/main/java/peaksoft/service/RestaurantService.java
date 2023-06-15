package peaksoft.service;

import peaksoft.dto.SimpleResponse;
import peaksoft.dto.restaurant.requestRestaurant.RestaurantRequest;
import peaksoft.dto.restaurant.responseRestaurant.RestaurantResponse;

import java.util.List;

public interface RestaurantService {

    SimpleResponse saveRestaurant(RestaurantRequest request);
    List<RestaurantResponse> getAll();
    SimpleResponse getByd(Long id);
    SimpleResponse update(Long id,RestaurantRequest request);
    SimpleResponse delete(Long id);
}
