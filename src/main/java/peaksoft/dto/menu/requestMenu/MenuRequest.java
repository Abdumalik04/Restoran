package peaksoft.dto.menu.requestMenu;

import lombok.Builder;

@Builder
public record MenuRequest(String image,int price,String description,Boolean isVegetarian) {
}
