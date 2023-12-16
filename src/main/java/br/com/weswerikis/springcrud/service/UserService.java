package br.com.weswerikis.springcrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.weswerikis.springcrud.dto.UserDTO;
import br.com.weswerikis.springcrud.entity.User;
import br.com.weswerikis.springcrud.repository.UserRepository;

@Service
public class UserService {
    
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDTO> listAll(){
        List<User> users = userRepository.findAll();
        return users.stream().map(UserDTO::new).toList();
    }

    public void create(UserDTO userDTO){
        User user = new User(userDTO);
        userRepository.save(user);
    }

    public UserDTO update(UserDTO userDTO){
        User user = new User(userDTO);
        return new UserDTO(userRepository.save(user));
    }

    public void delete (Long id){
        User user = userRepository.findById(id).get();
        userRepository.delete(user);
    }   

}
