package com.example.proj1.repo;

import com.example.proj1.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;

public interface Repo extends JpaRepository<Article,Integer>{    
   
}

