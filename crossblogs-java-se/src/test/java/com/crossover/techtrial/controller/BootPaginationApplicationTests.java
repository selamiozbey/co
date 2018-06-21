package com.crossover.techtrial.controller;


import com.crossover.techtrial.CrossBlogsApplication;
import com.crossover.techtrial.model.Article;
import com.crossover.techtrial.repository.ArticleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)   // 1
public class BootPaginationApplicationTests {

    @Autowired
    ArticleRepository articleService;

    public BootPaginationApplicationTests(){};
    @Test
    public void contextLoads() {
        Article article = new Article();
        article.setEmail("Merve@ff.com");
        article.setTitle("title for Merve");
        article.setContent("content for Merve");
        articleService.save(article);
    }
}

