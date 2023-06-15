package peaksoft.dto.restaurant.responseRestaurant;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter@Setter
@NoArgsConstructor
public class RestaurantResponse {
    private Long id;
    private String name;
    private String location;
    private String restType;
    private int numberOfEmployees;
    private String service;

    public RestaurantResponse(Long id, String name, String location, String restType, int numberOfEmployees, String service) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.restType = restType;
        this.numberOfEmployees = numberOfEmployees;
        this.service = service;
    }
}
