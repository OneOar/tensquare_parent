package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import entity.PageResult;
import entity.Result;
import entity.StatusCode;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/label")
@RefreshScope      //自定义注解要加入这个可以使消息队列监听最新配置文件并获取
public class LabelController {

    @Autowired
    private LabelService labelService;

    @Autowired
    private HttpServletRequest request;

    @Value("${ip}") //自定义注解
    private String ip;

    @GetMapping
    public Result findAll(){
        System.out.println("ip为 "+ip);
        return new Result(true, StatusCode.OK,"查询成功",labelService.findAll());
    }

    @GetMapping("/{labelId}")
    public Result findById(@PathVariable String labelId){

        return new Result(true, StatusCode.OK,"查询成功",labelService.findById(labelId));
    }

    @PostMapping
    public Result save(@RequestBody Label label){
        Claims claims =(Claims)request.getAttribute("claims_user");
        if (claims==null){
            return  new Result(false,StatusCode.ACCESSERROR,"权限不足");
        }
        labelService.save(label);
        return new Result(true, StatusCode.OK,"添加成功");
    }

    @DeleteMapping("/{labelId}")
    public Result deleteById(@PathVariable String labelId){
        Claims claims =(Claims)request.getAttribute("claims_user");
        if (claims==null){
            return  new Result(false,StatusCode.ACCESSERROR,"权限不足");
        }
        labelService.deleteById(labelId);
        return new Result(true, StatusCode.OK,"删除成功");
    }

    @PutMapping("/{labelId}")
    public Result  update(@PathVariable String labelId,@RequestBody Label label){
        Claims claims =(Claims)request.getAttribute("claims_user");
        if (claims==null){
            return  new Result(false,StatusCode.ACCESSERROR,"权限不足");
        }
        label.setId(labelId);
        labelService.update(label);
        return new Result(true, StatusCode.OK,"修改成功");
    }

    @PostMapping("/search")
    public Result findSearch(@RequestBody Label label){
        List<Label> list =labelService.findSearch(label);
        return new Result(true, StatusCode.OK,"查询成功",list);
    }

    @PostMapping("/search/{page}/{size}")
    public Result pageQuery(@RequestBody Label label, @PathVariable int page, @PathVariable int size){
        Page<Label> pageData =labelService.pageQuery(label,page,size);
        return new Result(true, StatusCode.OK,"查询成功",new PageResult<Label>(pageData.getTotalElements(),pageData.getContent()));
    }


}
