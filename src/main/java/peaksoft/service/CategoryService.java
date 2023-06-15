package peaksoft.service;

import peaksoft.dto.SimpleResponse;
import peaksoft.dto.category.requestCategory.CategoryRequest;
import peaksoft.dto.category.responseCategory.CategoryResponse;

import java.util.List;

public interface CategoryService {
    SimpleResponse saveCategory(CategoryRequest categoryRequest);
    List<CategoryResponse>getAll();
    SimpleResponse getById(Long id);
    SimpleResponse update(Long id,CategoryRequest categoryRequest);
    SimpleResponse delete(Long id);


}
