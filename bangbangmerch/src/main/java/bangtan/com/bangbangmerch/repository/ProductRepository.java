package bangtan.com.bangbangmerch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bangtan.com.bangbangmerch.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
