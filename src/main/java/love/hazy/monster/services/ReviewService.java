package love.hazy.monster.services;

import love.hazy.monster.dtos.review.ReviewDto;
import love.hazy.monster.dtos.review.ReviewMapper;
import love.hazy.monster.models.Product;
import love.hazy.monster.models.Review;
import love.hazy.monster.repositories.ProductRepository;
import love.hazy.monster.repositories.ReviewRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepo;
    private final ProductRepository productRepo;
    public ReviewService(ReviewRepository rr, ProductRepository pr) {
        this.reviewRepo = rr;
        this.productRepo = pr;
    }

    public List<ReviewDto> getByProductId(Long productId) {
        return reviewRepo.findByProductId(productId).stream()
                .map(ReviewMapper::toDto)
                .collect(Collectors.toList());
    }

    public ReviewDto save(Long productId, ReviewDto dto) {
        Product product = productRepo.findById(productId).orElseThrow();
        Review r = ReviewMapper.toEntity(dto, product);
        return ReviewMapper.toDto(reviewRepo.save(r));
    }
}
