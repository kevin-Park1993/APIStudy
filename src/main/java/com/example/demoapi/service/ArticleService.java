package com.example.demoapi.service;

import com.example.demoapi.dto.ArticleDto;
import com.example.demoapi.dto.ArticleDtoResponse;
import com.example.demoapi.entitiy.Article;
import com.example.demoapi.repository.ArticleRepository;
import com.example.demoapi.vo.Author;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleDtoResponse createArticle(ArticleDto articleDto){
        Article article = Article.builder()
                            .title(articleDto.getTitle())
                            .desciption(articleDto.getDescription())
                            .body(articleDto.getBody())
                            .tagList(articleDto.getTagList())
                            .build();

        articleRepository.save(article);

        Author author = new Author();

        ArticleDtoResponse articleResponse = ArticleDtoResponse.builder()
//                .slug()
                .title(article.getTitle())
                .description(article.getDesciption())
                .body(article.getBody())
                .tagList(article.getTagList().stream().map(tag -> {
                    return tag.getTagName();
                }).collect(Collectors.toList()))
                .createdAt(article.getCreatedAt())
                .updatedAt(article.getUpdatedAt())
//                .favorieted()
//                .favoritesCount()
                .author(author)
                .build();

        return articleResponse;
    }

}
