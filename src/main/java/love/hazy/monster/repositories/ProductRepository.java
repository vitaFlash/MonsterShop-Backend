package love.hazy.monster.repositories;

import love.hazy.monster.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}