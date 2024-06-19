package bangtan.com.bangbangmerch.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import bangtan.com.bangbangmerch.Model.UserModel;

@RestController
public class UserController {
    
@GetMapping("/User")
    public UserModel getUser(){
        return new UserModel(1, "Jessa", "jessaflores@gmail.com", "bangtan13");
    }
}
