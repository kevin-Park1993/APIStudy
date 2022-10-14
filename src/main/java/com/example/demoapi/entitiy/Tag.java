package com.example.demoapi.entitiy;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Tag {
    @Id @GeneratedValue
    private Long id;

    private String tagName;

    public Tag(String tagName){
        this.tagName = tagName;
    }
//    @ManyToOne
//    @JoinColumn(name = "article_id")
//    private Article article;

//    public void setArticle(Article article) {
//        this.article = article;
//    }

}
