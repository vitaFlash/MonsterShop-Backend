package love.hazy.monster.services;

import love.hazy.monster.dtos.product.ProductDto;
import love.hazy.monster.dtos.product.ProductMapper;
import love.hazy.monster.models.Product;
import love.hazy.monster.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private final ProductRepository repo;
    public ProductService(ProductRepository repo) { this.repo = repo; }

    public List<ProductDto> getAll() {
        return repo.findAll()
                .stream()
                .map(ProductMapper::toDto)
                .collect(Collectors.toList());
    }

    public ProductDto getById(Long id) {
        Product p = repo.findById(id).orElseThrow();
        return ProductMapper.toDto(p);
    }

    public ProductDto save(ProductDto dto) {
        Product p = ProductMapper.toEntity(dto);
        return ProductMapper.toDto(repo.save(p));
    }

    public ProductDto update(Long id, ProductDto dto) {
        Product existing = repo.findById(id).orElseThrow();
        existing.setName(dto.name());
        existing.setDescription(dto.description());
        existing.setPrice(dto.price());
        existing.setImageUrl(dto.imageUrl());
        existing.setRating(dto.rating());
        existing.setReviewCount(dto.reviewCount());
        existing.setFeatured(dto.featured());
        return ProductMapper.toDto(repo.save(existing));
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
