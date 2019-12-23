package com.tensquare.friend.controller;

import com.tensquare.friend.Interface.UserClient;
import com.tensquare.friend.service.FriendService;
import entity.Result;
import entity.StatusCode;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin
@RequestMapping("/friend")
public class FriendController {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private FriendService friendService;

    @Autowired
    private UserClient userClient;



    @PutMapping("/like/{friendid}/{type}")
    public Result addFriend(@PathVariable String friendid,@PathVariable String type ){
        Claims claims  =(Claims)request.getAttribute("claims_user");
        if (claims==null){
            return new Result(false, StatusCode.ACCESSERROR,"权限不足！");
        }
        if(type!=null){
            String userid=claims.getId();
            if (type.equals("1")){
                //添加好友
                int flag=friendService.addFriend(userid,friendid);
                if(flag==0){
                    return  new Result(false,StatusCode.ERROR,"不能重复添加好友");
                }else if(flag==1){
                    userClient.updateFanscountandFollowcount(userid,friendid,1);
                    return  new Result(true,StatusCode.OK,"添加好友成功");
                }
            }else if(type.equals("2")){
                //添加非好友
                int flag=friendService.addNoFriend(userid,friendid);
                if (flag==0){
                    return  new Result(false,StatusCode.ERROR,"不能重复添加非好友");
                }
                return  new Result(true,StatusCode.OK,"添加非好友成功");
            }else{
                return  new Result(false,StatusCode.ERROR,"参数异常");
            }
        }
        return  new Result(false,StatusCode.ERROR,"参数异常");
    }

    @DeleteMapping("/{friendid}")
    public Result deleteFriend(@PathVariable String friendid){
        Claims claims  =(Claims)request.getAttribute("claims_user");
        if (claims==null){
            return new Result(false, StatusCode.ACCESSERROR,"权限不足！");
        }
        String userid=claims.getId();
        friendService.deleteFriend(userid,friendid);
        userClient.updateFanscountandFollowcount(userid,friendid,-1);
        return new Result(true,StatusCode.OK,"删除成功");
    }
}
