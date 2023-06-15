package peaksoft.dto.restaurant.requestRestaurant;

import lombok.Builder;

@Builder
public record RestaurantRequest(String name,String location,String resType,int numberOfEmployees, String service) {
}
