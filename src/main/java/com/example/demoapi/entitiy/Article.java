package com.example.demoapi.entitiy;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Getter
public class Article {
    @Id @GeneratedValue
    private Long id;

    private String slug;

    private String title;
    private String desciption;
    private String body;

    private ZonedDateTime createdAt;

    private ZonedDateTime updatedAt;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Tag> tagList;

    @Builder
    public Article(String slug, String title, String desciption, String body, List<String> tagList){
        this.slug = slug;
        this.title = title;
        this.desciption = desciption;
        this.body = body;
        this.createdAt = ZonedDateTime.now();
        this.updatedAt = ZonedDateTime.now();
        this.tagList = tagList==null? null : tagList.stream().map(tagName -> {return new Tag(tagName);}).collect(Collectors.toList());
    }

    protected Article() {

    }
}
