package love.hazy.monster.controllers;

import love.hazy.monster.dtos.review.ReviewDto;
import love.hazy.monster.services.ReviewService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    private final ReviewService service;
    public ReviewController(ReviewService service) { this.service = service; }

    @GetMapping("/{productId}")
    public List<ReviewDto> byProduct(@PathVariable Long productId) {
        return service.getByProductId(productId);
    }

    @PostMapping
    public ReviewDto create(@RequestParam Long productId, @RequestBody ReviewDto dto) {
        return service.save(productId, dto);
    }
}
