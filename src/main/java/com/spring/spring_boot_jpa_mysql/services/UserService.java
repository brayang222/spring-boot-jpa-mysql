package com.spring.spring_boot_jpa_mysql.services;

import com.spring.spring_boot_jpa_mysql.models.UserModel;
import com.spring.spring_boot_jpa_mysql.repositories.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {
   @Autowired
   UserRepository userRepository;

   public ArrayList<UserModel> userObtain() {
      return (ArrayList<UserModel>) userRepository.findAll();
   }

   public UserModel saveUser(UserModel user) {
      return userRepository.save(user);
   }

   public Optional<UserModel> obtainById(Long id) {
      return userRepository.findById(id);
   }

   public ArrayList<UserModel> obtainByPriority(Integer priority) {
      return userRepository.findByPriority(priority);
   }

   public boolean deleteUser(Long id) {
      try {
         userRepository.deleteById(id);
         return true;
      } catch (Exception err){
         return false;
      }
   }
 }
