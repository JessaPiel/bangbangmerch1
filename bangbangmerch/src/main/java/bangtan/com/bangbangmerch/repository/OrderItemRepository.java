package bangtan.com.bangbangmerch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bangtan.com.bangbangmerch.Model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
