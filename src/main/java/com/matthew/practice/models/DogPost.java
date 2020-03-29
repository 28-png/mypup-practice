package com.matthew.practice.models;
import javax.persistence.*;

@Entity
@Table(name = "dog_posts")
public class DogPost {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(nullable = false, columnDefinition = "INT(10) UNSIGNED")
private long id;
@Column(columnDefinition = "VARCHAR(200)", name = "dog_breed")
private String dogBreed;
@Column(nullable = false, columnDefinition = "VARCHAR(200)", name = "dog_group")
private String dogGroup;
@Column(columnDefinition = "VARCHAR(200)", name = "dog_description")
private String dogDescription;
@Column(columnDefinition = "VARCHAR(45)", name = "dog_price")
private String dogPrice;
@ManyToOne
//        (fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
@JoinColumn(name="user_id")
private Users user;

    public DogPost(String dogBreed, String dogGroup, String dogDescription, String dogPrice) {
        this.dogBreed = dogBreed;
        this.dogGroup = dogGroup;
        this.dogDescription = dogDescription;
        this.dogPrice = dogPrice;
//        this.user = user;
    }
    public DogPost() {}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public String getDogGroup() {
        return dogGroup;
    }

    public void setDogGroup(String dogGroup) {
        this.dogGroup = dogGroup;
    }

    public String getDogDescription() {
        return dogDescription;
    }

    public void setDogDescription(String dogDescription) {
        this.dogDescription = dogDescription;
    }

    public String getDogPrice() {
        return dogPrice;
    }

    public void setDogPrice(String dogPrice) {
        this.dogPrice = dogPrice;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
