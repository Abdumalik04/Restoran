package peaksoft.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import peaksoft.dto.SimpleResponse;
import peaksoft.dto.category.requestCategory.CategoryRequest;
import peaksoft.dto.category.responseCategory.CategoryResponse;
import peaksoft.entity.Category;
import peaksoft.repository.CategoryRepository;
import peaksoft.service.CategoryService;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public SimpleResponse saveCategory(CategoryRequest categoryRequest) {
        Category category = Category.builder().name(categoryRequest.name()).build();
        categoryRepository.save(category);
        return SimpleResponse.builder().status(HttpStatus.OK).message("Successfully Saved").build();
    }

    @Override
    public List<CategoryResponse> getAll() {
        return categoryRepository.getAll();
    }

    @Override
    public SimpleResponse getById(Long id) {
        categoryRepository.findById(id).orElseThrow(() -> new NullPointerException("Category with id: " + id + " id is not found"));
        return SimpleResponse.builder().status(HttpStatus.OK).message("Successfully id: " + id).build();
    }

    @Override
    public SimpleResponse update(Long id, CategoryRequest categoryRequest) {
        Category category = categoryRepository.findById(id).orElseThrow(() -> new NullPointerException("Category with id: " + id + " id is not found"));
        category.setName(category.getName());
        categoryRepository.save(category);
        return SimpleResponse.builder().status(HttpStatus.OK).message("Successfully Updated").build();
    }

    @Override
    public SimpleResponse delete(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow(() -> new NullPointerException("Category with id: " + id + " id is not found"));
categoryRepository.delete(category);
        return SimpleResponse.builder().status(HttpStatus.OK).message("Successfully Deleted").build();
    }
}
