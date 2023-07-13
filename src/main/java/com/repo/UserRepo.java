package com.repo;

/*import org.springframework.data.jpa.repository.JpaRepository;
import com.entity.Users;


public interface UserRepo extends JpaRepository<Users,String> {

}*/



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.entity.Users;

@EnableJpaRepositories(basePackages = "com.repo") // Specify the base package for JPA repositories
public interface UserRepo extends JpaRepository<Users,String> {

}

