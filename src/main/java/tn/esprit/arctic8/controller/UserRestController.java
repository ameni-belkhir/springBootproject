package tn.esprit.arctic8.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic8.entity.User;
import tn.esprit.arctic8.service.IUserService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/user")
//@AllArgsConstructor
public class UserRestController {

    IUserService userService;

    public UserRestController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/")
    User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PutMapping(path = "/{first-name}/{id}")
    User updateUser(@PathVariable ("id") Long idUser, @PathVariable ("first-name") String firstName){
        return userService.updateUser(idUser, firstName);
    }

    @DeleteMapping(path = "/{idUser}")
    void deleteUser(@PathVariable() Long idUser){
       userService.deleteUser(idUser);
    }

    @GetMapping(path = "/users")
    List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(path = "/{idUser}")
    User getUserById(@PathVariable () Long idUser){
        return userService.getUserById(idUser);
    }

    @GetMapping(path = "/users/{cin}/{start}/{end}")
    List<User> getUserByCinAndDateOfBirth(@PathVariable("cin") Long cin, @PathVariable("start") LocalDate start, @PathVariable("end") LocalDate end){
        return userService.getUserByCinAndDateOfBirth(cin, start, end);
    }
    @PutMapping(path="/{id-user}/{id-user-details}")
    void assignUserToUserDetails(@PathVariable Long idUser, @PathVariable Long idDetails){
        userService.assignUserToUserDetails(idUser, idDetails);
    }
}
