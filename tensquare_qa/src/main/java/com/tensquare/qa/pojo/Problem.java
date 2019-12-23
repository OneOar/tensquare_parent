package com.tensquare.qa.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
/**
 * problem实体类
 * @author Administrator
 *
 */
@Entity
@Table(name="tb_problem")
public class Problem implements Serializable{

	@Id
	private String id;//id


	
	private String title;//title
	private String content;//content
	private java.util.Date createtime;//createtime
	private java.util.Date updatetime;//updatetime
	private String userid;//userid
	private String nickname;//nickname
	private Integer visits;//visits
	private Integer thumbup;//thumbup
	private Integer reply;//reply
	private String solve;//solve
	private String replyname;//replyname
	private java.util.Date replytime;//replytime

	
	public String getId() {		
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {		
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {		
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public java.util.Date getCreatetime() {		
		return createtime;
	}
	public void setCreatetime(java.util.Date createtime) {
		this.createtime = createtime;
	}

	public java.util.Date getUpdatetime() {		
		return updatetime;
	}
	public void setUpdatetime(java.util.Date updatetime) {
		this.updatetime = updatetime;
	}

	public String getUserid() {		
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getNickname() {		
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getVisits() {		
		return visits;
	}
	public void setVisits(Integer visits) {
		this.visits = visits;
	}

	public Integer getThumbup() {		
		return thumbup;
	}
	public void setThumbup(Integer thumbup) {
		this.thumbup = thumbup;
	}

	public Integer getReply() {		
		return reply;
	}
	public void setReply(Integer reply) {
		this.reply = reply;
	}

	public String getSolve() {		
		return solve;
	}
	public void setSolve(String solve) {
		this.solve = solve;
	}

	public String getReplyname() {		
		return replyname;
	}
	public void setReplyname(String replyname) {
		this.replyname = replyname;
	}

	public java.util.Date getReplytime() {		
		return replytime;
	}
	public void setReplytime(java.util.Date replytime) {
		this.replytime = replytime;
	}


	
}
