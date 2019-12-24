package com.sccba.knowledge.service.impl;

import com.sccba.knowledge.artity.entity.Article;
import com.sccba.knowledge.dao.article.ArticleMapper;
import com.sccba.knowledge.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Hello on 2019/12/23.
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    public Article queryById(Integer id) {
        return articleMapper.selectByPrimaryKey(id);
    }
}
