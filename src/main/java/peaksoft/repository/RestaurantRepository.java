package peaksoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import peaksoft.dto.restaurant.responseRestaurant.RestaurantResponse;
import peaksoft.entity.Restaurant;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
    @Query("select new peaksoft.dto.restaurant.responseRestaurant.RestaurantResponse(r.id,r.name,r.location,r.restType,r.numberOfEmployees,r.service) from Restaurant r")
    List<RestaurantResponse>getAll();

}
