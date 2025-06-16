package love.hazy.monster.services;

import love.hazy.monster.models.Product;
import love.hazy.monster.models.Review;
import love.hazy.monster.repositories.ProductRepository;
import love.hazy.monster.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepo;
    @Autowired private ProductRepository productRepo;

    public List<Review> getByProductId(Long productId) {
        return reviewRepo.findByProductId(productId);
    }

    public Review addReview(Long productId, Review review) {
        Product p = productRepo.findById(productId).orElseThrow();
        review.setProduct(p);
        return reviewRepo.save(review);
    }
}
