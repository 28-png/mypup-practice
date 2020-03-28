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
@Column(nullable = false)
private long id;





}
