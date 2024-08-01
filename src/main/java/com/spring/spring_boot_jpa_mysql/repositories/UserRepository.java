package com.spring.spring_boot_jpa_mysql.repositories;

import com.spring.spring_boot_jpa_mysql.models.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {
   public abstract ArrayList<UserModel> findByPriority(Integer priority);
}
