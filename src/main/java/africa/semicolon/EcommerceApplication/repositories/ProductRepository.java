package africa.semicolon.EcommerceApplication.repositories;

import africa.semicolon.EcommerceApplication.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
