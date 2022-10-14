package com.example.demoapi.repository;

import com.example.demoapi.entitiy.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Long> {
}
