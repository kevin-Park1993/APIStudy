package com.example.demoapi.dto;

import com.example.demoapi.entitiy.Article;
import lombok.Builder;
import lombok.Getter;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
public class ArticleDto {
//    @Valid
//    private Article article;
    @NotBlank
    private String title;
    @NotBlank
    private String description;
    @NotBlank
    private String body;
    @Nullable
    private List tagList;

    @Builder
    public ArticleDto(String title, String description, String body, List tagList){
        this.title = title;
        this.description = description;
        this.body = body;
        this.tagList = tagList==null ? null: tagList;
    }

}

