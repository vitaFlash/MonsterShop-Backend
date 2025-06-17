package love.hazy.monster.dtos.review;

import love.hazy.monster.models.Review;
import love.hazy.monster.models.Product;

public class ReviewMapper {
    public static ReviewDto toDto(Review r) {
        return new ReviewDto(
                r.getId(), r.getProduct().getId(),
                r.getUsername(), r.getBody(), r.getRating()
        );
    }

    public static Review toEntity(ReviewDto dto, Product product) {
        var r = new Review();
        r.setUsername(dto.username());
        r.setBody(dto.body());
        r.setRating(dto.rating());
        r.setProduct(product);
        return r;
    }
}