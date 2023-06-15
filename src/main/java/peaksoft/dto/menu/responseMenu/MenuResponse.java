package peaksoft.dto.menu.responseMenu;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter@Setter
public class MenuResponse {
    private Long id;
    private String image;
    private int price;
    private String description;
    private Boolean isVegetarian;

    public MenuResponse(Long id, String image, int price, String description, Boolean isVegetarian) {
        this.id = id;
        this.image = image;
        this.price = price;
        this.description = description;
        this.isVegetarian = isVegetarian;
    }
}
