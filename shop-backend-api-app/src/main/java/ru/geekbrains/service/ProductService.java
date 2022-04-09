package ru.geekbrains.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import ru.geekbrains.service.dto.ProductDto;

import java.math.BigDecimal;
import java.util.Optional;

public interface ProductService {

    Page<ProductDto> findAll(
            Optional<String> nameFilter,
            Optional<BigDecimal> minPrice,
            Optional<BigDecimal> maxPrice,
            Optional<Long> categoryId,
            Integer page,
            Integer size,
            String sortField,
            Sort.Direction direction);

    Optional<ProductDto> findById(Long id);

}
