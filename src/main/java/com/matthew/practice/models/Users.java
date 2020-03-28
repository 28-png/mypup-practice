package com.matthew.practice.models;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(nullable = false, unique = true)
private long id;
@Column(nullable = false, name = "user_role")
private String userRole;
@Column(nullable = false)
private String username;
@Column(nullable = false)
private String password;
@Column(nullable = false, unique = true)
private String email;
@Column(nullable = false, columnDefinition = "VARCHAR(20)", name = "phone_number")
private String phoneNumber;




}
