package br.com.weswerikis.springcrud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.weswerikis.springcrud.dto.UserDTO;
import br.com.weswerikis.springcrud.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDTO> listAll(){
        return userService.listAll();
    }

    @PostMapping
    public void create(@RequestBody UserDTO userDTO){
        userService.create(userDTO);
    }

    @PutMapping
    public UserDTO update(@RequestBody UserDTO userDTO){
        return userService.update(userDTO);
    }

}
