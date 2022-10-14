package com.example.demoapi.request;

import com.example.demoapi.dto.ArticleDto;
import lombok.Builder;
import lombok.Getter;
import org.springframework.lang.Nullable;

import javax.swing.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
public class createArticle {
    @Valid
    ArticleDto article;

}

