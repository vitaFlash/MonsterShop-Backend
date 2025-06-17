package love.hazy.monster.controllers;

import love.hazy.monster.dtos.product.ProductDto;
import love.hazy.monster.services.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService service;
    public ProductController(ProductService service) { this.service = service; }

    @GetMapping
    public List<ProductDto> all() { return service.getAll(); }

    @GetMapping("/{id}")
    public ProductDto one(@PathVariable Long id) { return service.getById(id); }

    @PostMapping
    public ProductDto create(@RequestBody ProductDto dto) { return service.save(dto); }

    @PutMapping("/{id}")
    public ProductDto update(@PathVariable Long id, @RequestBody ProductDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
