package love.hazy.monster.dtos.product;

import love.hazy.monster.models.Product;

public class ProductMapper {
    public static ProductDto toDto(Product p) {
        return new ProductDto(
                p.getId(), p.getName(), p.getDescription(),
                p.getPrice(), p.getImageUrl(), p.getRating(),
                p.getReviewCount(), p.isFeatured()
        );
    }

    public static Product toEntity(ProductDto dto) {
        var p = new Product();
        p.setName(dto.name());
        p.setDescription(dto.description());
        p.setPrice(dto.price());
        p.setImageUrl(dto.imageUrl());
        p.setRating(dto.rating());
        p.setReviewCount(dto.reviewCount());
        p.setFeatured(dto.featured());
        return p;
    }
}