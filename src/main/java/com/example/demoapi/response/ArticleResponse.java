package com.example.demoapi.response;

import com.example.demoapi.dto.ArticleDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ArticleResponse<T> {
    private T article;
}
