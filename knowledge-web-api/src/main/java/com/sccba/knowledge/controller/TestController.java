package com.sccba.knowledge.controller;

import com.sccba.knowledge.artity.entity.Article;
import com.sccba.knowledge.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hello on 2019/12/23.
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/article/{id}")
    public Object queryArticleById(@PathVariable(value = "id") int id){
        Article article = articleService.queryById(id);
        return article;
    }

    @GetMapping("/error")
    public Object queryArticleById() throws Exception{
        int a = 0;
        try {
            a =  1/0;
        } catch (Exception e) {
            throw new Exception(e);
        }
        return a;
    }


}
