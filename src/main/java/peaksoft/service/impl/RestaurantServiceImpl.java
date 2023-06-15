package peaksoft.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import peaksoft.dto.SimpleResponse;
import peaksoft.dto.restaurant.requestRestaurant.RestaurantRequest;
import peaksoft.dto.restaurant.responseRestaurant.RestaurantResponse;
import peaksoft.entity.Restaurant;
import peaksoft.repository.RestaurantRepository;
import peaksoft.service.RestaurantService;
import java.util.List;
@RequiredArgsConstructor
@Transactional
@Service
public class RestaurantServiceImpl implements RestaurantService {
    private final RestaurantRepository restaurantRepository;

    @Override
    public SimpleResponse saveRestaurant(RestaurantRequest request) {
        Restaurant restaurant=Restaurant.builder()
                .name(request.name())
                .location(request.location())
                .restType(request.resType())
                .numberOfEmployees(request.numberOfEmployees())
                .service(request.service())
                .build();
restaurantRepository.save(restaurant);
        return SimpleResponse.builder()
                .status(HttpStatus.OK).message("Successfully Saved Restaurant").build();
    }

    @Override
    public List<RestaurantResponse> getAll() {
        return restaurantRepository.getAll();
    }

    @Override
    public SimpleResponse getByd(Long id) {
        restaurantRepository.findById(id).orElseThrow(()->new NullPointerException("Restaurant with id: "+id+" is not found"));
        return SimpleResponse.builder()
                .status(HttpStatus.OK).message("Successfully Restaurant").build();
    }

    @Override
    public SimpleResponse update(Long id, RestaurantRequest request) {
       Restaurant restaurant= restaurantRepository.findById(id).orElseThrow(()->new NullPointerException("Restaurant with id: "+id+" is not found"));
        restaurant.setName(request.name());
        restaurant.setLocation(request.location());
        restaurant.setRestType(request.resType());
        restaurant.setNumberOfEmployees(request.numberOfEmployees());
        restaurant.setService(request.service());
        restaurantRepository.save(restaurant);
        return SimpleResponse.builder()
                .status(HttpStatus.OK).message("Successfully Updated").build();
    }

    @Override
    public SimpleResponse delete(Long id) {
        Restaurant restaurant= restaurantRepository.findById(id).orElseThrow(()->new NullPointerException("Restaurant with id: "+id+" is not found"));
restaurantRepository.delete(restaurant);
        return SimpleResponse.builder().status(HttpStatus.OK).message("Successfully Deleted").build();
    }
}
