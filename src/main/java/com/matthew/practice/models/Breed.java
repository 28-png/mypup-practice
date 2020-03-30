package com.matthew.practice.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "breed")
public class Breed {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(nullable = false, columnDefinition = "INT UNSIGNED")
private long id;
@Column(nullable = false, unique = true)
private String name;
@ManyToMany(mappedBy = "breeds")
private List<DogPost> dogPosts;


public Breed() {}

public Breed(String name, List<DogPost> dogPosts) {
    this.name = name;
    this.dogPosts = dogPosts;
}


    public List<DogPost> getDogPosts() {
        return dogPosts;
    }

    public void setDogPosts(List<DogPost> dogPosts) {
        this.dogPosts = dogPosts;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }






}
