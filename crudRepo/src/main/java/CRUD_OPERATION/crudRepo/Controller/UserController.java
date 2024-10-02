package CRUD_OPERATION.crudRepo.Controller;


import CRUD_OPERATION.crudRepo.Model.User;
import CRUD_OPERATION.crudRepo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/Adduser")
    public ResponseEntity<User> AddUserDetails(@RequestBody User user){
        User newUser = userService.AddUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);

    }

    @GetMapping("/getUser")
    public List<User> GetUserDetails(){
        List<User> user=this.userService.GetUser();
        return user;
    }

    @GetMapping("/getUser/{Id}")
    public Optional<User> GetUserById(@PathVariable String Id){
        return this.userService.GetUserById(Long.parseLong(Id));

    }

    @PutMapping("User/Update")
    public User UpdateUser(@RequestBody User user){
        return this.userService.UpdateUser(user);
    }

    @DeleteMapping("/DelUser/{Id}")
    public boolean DeleteUser(@PathVariable String Id){
        this.userService.DeleteUser(Long.parseLong(Id));
        return true;
    }
}
