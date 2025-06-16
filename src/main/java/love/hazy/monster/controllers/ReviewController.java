package love.hazy.monster.controllers;

import love.hazy.monster.models.Review;
import love.hazy.monster.services.ReviewService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    @Autowired
    private ReviewService service;

    @GetMapping("/{productId}")
    public List<Review> reviewsByProduct(@PathVariable Long productId) {
        return service.getByProductId(productId);
    }

    @PostMapping
    public Review createReview(@RequestParam Long productId, @RequestBody Review review) {
        return service.addReview(productId, review);
    }
}
