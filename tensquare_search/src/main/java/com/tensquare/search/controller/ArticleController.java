package com.tensquare.search.controller;

import com.tensquare.search.pojo.Article;
import com.tensquare.search.service.ArticleService;
import entity.PageResult;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RefreshScope
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping
    public Result save(@RequestBody Article article){
        articleService.save(article);
        return  new Result(true, StatusCode.OK,"添加成功");
    }

    @GetMapping("/{key}/{page}/{size}")
    public Result findByKey(@PathVariable String key,@PathVariable int page,@PathVariable int size){

        Page<Article> pagedata=articleService.findByKey(key,page,size);
        return new Result(true,StatusCode.OK,"查询成功",new PageResult<Article>(pagedata.getTotalElements(),pagedata.getContent()));
    }

}
