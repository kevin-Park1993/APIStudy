package com.example.demoapi.controller;


import com.example.demoapi.dto.ArticleDto;
import com.example.demoapi.dto.ArticleDtoResponse;
import com.example.demoapi.request.createArticle;
import com.example.demoapi.response.ArticleResponse;
import com.example.demoapi.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;

    @PostMapping(value = "/articles")
    public ArticleResponse<ArticleDtoResponse> createArticle(@RequestBody @Valid createArticle request){

        ArticleDtoResponse articleDtoResponse = articleService.createArticle(request.getArticle());
        ArticleResponse<ArticleDtoResponse> response = new ArticleResponse<>(articleDtoResponse);
        return response;
    }
}
