package bangtan.com.bangbangmerch.Controllers;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import bangtan.com.bangbangmerch.Model.User;
import bangtan.com.bangbangmerch.NotFoundException.UserNotFoundException;
import bangtan.com.bangbangmerch.repository.UserRepository;

@RestController
public class UserController{
    
    UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/user")
    public List<User> getUser(){
        return repo.findAll();
        }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
           return repo.findById(id).orElseThrow(
            () -> new UserNotFoundException(id)
           );
         }

    @PostMapping("/user/new")
    public String postMethodName(@RequestBody User newUser){
        repo.save(newUser);
        return "A new user is created";
        }

    @PutMapping("/user/edit/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User newUser){
        return repo.findById(id)
        .map(user ->{
            user.setName(newUser.getName());
            user.setEmail(newUser.getEmail());
            user.setPassword(newUser.getPassword());
            return repo.save(user);
        }).orElseGet(()->{
            return repo.save(newUser);
        });
    }

    @DeleteMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        repo.deleteById(id);
        return "the user is deleted";
    }
}