package com.spring.spring_boot_jpa_mysql.models;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class UserModel {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(unique = true, nullable = false)
   private Long id;
   private String nombre;
   private String email;
   private Integer priority;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public Integer getPriority() {
      return priority;
   }

   public void setPriority(Integer priority) {
      this.priority = priority;
   }
}
