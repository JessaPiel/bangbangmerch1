package bangtan.com.bangbangmerch.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import bangtan.com.bangbangmerch.NotFoundException.UserNotFoundException;

public class UserExceptionHandler {
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
      String UserNotFoundHandler(UserNotFoundException e){
        return e.getMessage();
    }
}
