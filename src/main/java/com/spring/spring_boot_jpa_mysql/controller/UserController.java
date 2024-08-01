package com.spring.spring_boot_jpa_mysql.controller;

import com.spring.spring_boot_jpa_mysql.models.UserModel;
import com.spring.spring_boot_jpa_mysql.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

   @Autowired
   UserService userService;

   @GetMapping
   public ArrayList<UserModel> obtainUsers(){
      return userService.userObtain();
   }

   @PostMapping
   public UserModel saveUser(@RequestBody UserModel user){
      return this.userService.saveUser(user);
   }

   @GetMapping( path = "/{id}")
   public Optional<UserModel> obtainUserById(@PathVariable("id") Long id) {
      return this.userService.obtainById(id);
   }

   @GetMapping("/query")
   public ArrayList<UserModel> obtainUserByPriority(@RequestParam("priority") Integer priority) {
      return this.userService.obtainByPriority(priority);
   }

   @DeleteMapping( path = "/{id}")
   public String eliminateById(@PathVariable("id") Long id) {
      boolean ok = this.userService.deleteUser(id);
      if(ok){
         return "Se elimino el usuario con id" + id;
      } else {
         return "No se pudo eliminar el usuario con id" + id;
      }
   }
}
