package peaksoft.dto.subcategory.responseSubcategory;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
public class SubcategoryResponse {
    private Long id;
    private String name;

    public SubcategoryResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
