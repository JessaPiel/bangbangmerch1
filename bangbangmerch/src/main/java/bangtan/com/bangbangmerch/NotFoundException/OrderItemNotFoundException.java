package bangtan.com.bangbangmerch.NotFoundException;

public class OrderItemNotFoundException extends RuntimeException {
    public OrderItemNotFoundException(Long id){
         super("Could not found product with" + id);
     }
 
 }
 