package peaksoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import peaksoft.dto.category.responseCategory.CategoryResponse;
import peaksoft.entity.Category;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Long> {

    @Query("select new peaksoft.dto.category.responseCategory.CategoryResponse(c.id,c.name) from Category c")
    List<CategoryResponse> getAll();
}
