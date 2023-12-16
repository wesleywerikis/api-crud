package br.com.weswerikis.springcrud.dto;

import org.springframework.beans.BeanUtils;

import br.com.weswerikis.springcrud.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    
    private Long id;
    private String name;
    private String login;
    private String password;
    private String email;
    
    public UserDTO() {
    }
    
    public UserDTO(User user) {
        BeanUtils.copyProperties(user, this);
    }
}
