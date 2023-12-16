package br.com.weswerikis.springcrud.entity;

import org.springframework.beans.BeanUtils;

import br.com.weswerikis.springcrud.dto.UserDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_user")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String login;

    @Column(nullable = false)
    private String passwoerd;

    @Column(nullable = false)
    private String email;

    public User(UserDTO dto) {
        BeanUtils.copyProperties(dto, this);
    }

}
