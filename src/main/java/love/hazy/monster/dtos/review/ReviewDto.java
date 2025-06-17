package love.hazy.monster.dtos.review;

public record ReviewDto(
        Long id,
        Long productId,
        String username,
        String body,
        double rating
) {}