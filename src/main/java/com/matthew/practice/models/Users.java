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
@Column(columnDefinition = "VARCHAR(20)", name = "phone_number")
private String phoneNumber;
@Column(columnDefinition = "VARCHAR(20)")
private String city;
@Column(columnDefinition = "VARCHAR(20)")
private String state;
@Column(columnDefinition = "VARCHAR(12)")
private String zipcode;

    public Users() {}

    public Users(String userRole, String username, String password, String email, String phoneNumber, String city, String state, String zipcode) {
        this.userRole = userRole;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
