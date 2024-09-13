package com.example.proj1.controller;

import com.example.proj1.entity.Article;
// import com.example.proj1.repo.Repo;
import com.example.proj1.service.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/articles")

public class Controllers {
    @Autowired
    private Services articleService;

    @GetMapping
    public String listArticles(Model model) {
        model.addAttribute("articles", articleService.getAllArticles());
        return "article/list";
    }

    @GetMapping("/new")
    public String newArticleForm(Model model) {
        model.addAttribute("article", new Article());
        return "article/form";
    }

    @PostMapping
    public String saveArticle(Article article) {
        articleService.saveArticle(article);
        return "redirect:/articles";
    }

    // @GetMapping("/delete")
    // public String deleteArticle(@RequestParam Long id) {
    //     articleService.deleteArticle(id);
    //     return "redirect:/articles";
    // }
    
}
