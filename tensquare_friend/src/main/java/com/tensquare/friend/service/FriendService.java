package com.tensquare.friend.service;

import com.tensquare.friend.dao.FriendDao;
import com.tensquare.friend.dao.NoFriendDao;
import com.tensquare.friend.pojo.Friend;
import com.tensquare.friend.pojo.NoFriend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FriendService {
    @Autowired
    private FriendDao friendDao;

    @Autowired
    private NoFriendDao noFriendDao;

    public int addFriend(String userid, String friendid) {
        //先判断userid到friendid是否有数据，返回0
        Friend friend = friendDao.findByUseridAndFriendid(userid, friendid);
        if (friend!=null)return 0;
        //直接添加好友，让好友表中userid到friend方向为0
        Friend newfriend=new Friend();
        newfriend.setUserid(userid);
        newfriend.setFriendid(friendid);
        newfriend.setIslike("0");
        friendDao.save(newfriend);
        //判断friendid到userid是否有数据 。如果有 把双方状态都改为1
        if(friendDao.findByUseridAndFriendid(friendid,userid)!=null){
            friendDao.updateIslike("1",userid,friendid);
            friendDao.updateIslike("1",friendid,userid);
        }
        return 1;
    }

    public int addNoFriend(String userid, String friendid) {
        NoFriend noFriend=noFriendDao.findByUseridAndFriendid(userid, friendid);
        if (noFriend!=null){
            return 0;
        }
         NoFriend newnoFriend=new NoFriend();
        newnoFriend.setUserid(userid);
        newnoFriend.setFriendid(friendid);
        noFriendDao.save(newnoFriend);
        Friend friend=friendDao.findByUseridAndFriendid(userid, friendid);
        if(friend!=null){
            friendDao.updateIslike("",userid,friendid);
            if (friend.getIslike().equals("1")){
                friendDao.updateIslike("0",friendid,userid);
            }
        }
        return 1;
    }

    public void deleteFriend(String userid, String friendid) {
        //删除好友表中userid到friendid这条数据
        friendDao.deleteFriend(userid,friendid);
        //更新friendid到userid的islike为0
        friendDao.updateIslike("0",friendid,userid);
        //非好友表中添加
        NoFriend nofriend=new NoFriend();
        nofriend.setUserid(userid);
        nofriend.setFriendid(friendid);
        noFriendDao.save(nofriend);
    }
}
