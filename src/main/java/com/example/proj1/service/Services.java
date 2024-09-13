package com.example.proj1.service;

import com.example.proj1.entity.Article;
import com.example.proj1.repo.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Services {
    @Autowired
    private Repo articleRepository;

    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    // public Article getArticleById(Long id) {
    //     return articleRepository.findById(id).orElse(null);
    // }

    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

    // public void deleteArticle(Long id) {
    //     articleRepository.deleteById(id);
    // }
    
}
