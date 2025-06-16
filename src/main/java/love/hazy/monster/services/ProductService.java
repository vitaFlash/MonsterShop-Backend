package love.hazy.monster.services;

import love.hazy.monster.models.Product;
import love.hazy.monster.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepo;

    public List<Product> getAll() {
        return productRepo.findAll();
    }

    public Product getById(Long id) {
        return productRepo.findById(id).orElseThrow();
    }

    public Product save(Product p) {
        return productRepo.save(p);
    }

    public Product update(Long id, Product updated) {
        Product p = getById(id);
        // Update fields manually
        p.setName(updated.getName());
        // ... other setters
        return productRepo.save(p);
    }

    public void delete(Long id) {
        productRepo.deleteById(id);
    }
}