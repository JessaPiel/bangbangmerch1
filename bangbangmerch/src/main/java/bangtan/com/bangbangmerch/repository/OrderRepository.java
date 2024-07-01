package bangtan.com.bangbangmerch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bangtan.com.bangbangmerch.Model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
