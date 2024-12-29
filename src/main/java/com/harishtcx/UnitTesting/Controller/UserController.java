package com.harishtcx.UnitTesting.Controller;

import com.harishtcx.UnitTesting.DTO.UserDTO;
import com.harishtcx.UnitTesting.Entity.User;
import com.harishtcx.UnitTesting.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable long id){
        return userService.getById(id);
    }

    @PostMapping
    public ResponseEntity<User> add(@RequestBody User user){
        return new ResponseEntity<>(userService.add(user), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<User> update(@RequestBody User user){
        User newUser = userService.update(user);
        if(newUser != null) return new ResponseEntity<>(newUser,HttpStatus.OK);
        else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        userService.delete(id);
        return new ResponseEntity<>("User Deleted",HttpStatus.OK);
    }
}
