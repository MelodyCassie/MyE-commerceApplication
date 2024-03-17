package africa.semicolon.EcommerceApplication.repositories;

import africa.semicolon.EcommerceApplication.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
