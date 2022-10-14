package com.example.demoapi.dto;

import com.example.demoapi.vo.Author;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Builder
//@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Getter
public class ArticleDtoResponse {

    private String slug;
    private String title;
    private String description;
    private String body;
    private List tagList;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
    private boolean favorited;
    private int favoritesCount;
    private Author author;

}
