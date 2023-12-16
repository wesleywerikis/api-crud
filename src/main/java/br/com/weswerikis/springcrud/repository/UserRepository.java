package br.com.weswerikis.springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.weswerikis.springcrud.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
