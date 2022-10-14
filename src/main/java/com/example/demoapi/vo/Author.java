package com.example.demoapi.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity
@Getter
@NoArgsConstructor
public class Author {
//    @Id @GeneratedValue
//    private Long id;

    private String username;
    private String bio;
    private String image;
    private boolean following;

    @Builder
    public Author(String username, String bio, String image, boolean following){
        this.username = username;
        this.bio = bio;
        this.image = image;
        this.following = following;
    }

}
