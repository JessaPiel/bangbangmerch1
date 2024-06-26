package bangtan.com.bangbangmerch.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import bangtan.com.bangbangmerch.Model.UserModel;

@RestController
public class UserController{
    
    // http:localhost:8080/user
    @GetMapping("/user")
    public UserModel getUser(){
        return new UserModel(1, "Jimin", "PJM0613@gmail.com", "Lachimolala");
    }

    public String getMethodName(@RequestParam String param){
        return new String();
    }

    // http:localhost:8080/users
    @GetMapping("/users")
    public List<UserModel> getUsers(){
        List <UserModel> users= new ArrayList<>();
        users.add(new UserModel(1, "Jin", "Seokjin@gmail.com", "WorldWideHandsome"));
        users.add(new UserModel(2, "Jungkook", "JeonJK@gmail.com", "GoldenMaknae"));
        users.add(new UserModel(3, "J-Hope", "JungHope@gmail.com", "Mang"));
        return users;
    }

    // http:localhost:8080/user/Taehyung
    @GetMapping ("/user/{name}")
    public UserModel getUserFromName(@PathVariable("name")String name){
        return new UserModel(1, "Taehyung", "KimV@gmail.com", "WinterBear");
    }


}