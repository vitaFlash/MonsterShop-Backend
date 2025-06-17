package love.hazy.monster.dtos.product;

public record ProductDto(
        Long id,
        String name,
        String description,
        double price,
        String imageUrl,
        double rating,
        int reviewCount,
        boolean featured
) {}