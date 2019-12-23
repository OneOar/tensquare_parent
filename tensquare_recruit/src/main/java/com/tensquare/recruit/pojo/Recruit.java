package com.tensquare.recruit.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
/**
 * recruit实体类
 * @author Administrator
 *
 */
@Entity
@Table(name="tb_recruit")
public class Recruit implements Serializable{

	@Id
	private String id;//id


	
	private String jobname;//jobname
	private String salary;//salary
	private String condition;//condition
	private String education;//education
	private String type;//type
	private String address;//address
	private Integer eid;//eid
	private java.util.Date createtime;//createtime
	private String state;//state
	private String url;//url
	private String label;//label
	private String content1;//content1
	private String content2;//content2

	
	public String getId() {		
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getJobname() {		
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}

	public String getSalary() {		
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getCondition() {		
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getEducation() {		
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}

	public String getType() {		
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getAddress() {		
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getEid() {		
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public java.util.Date getCreatetime() {		
		return createtime;
	}
	public void setCreatetime(java.util.Date createtime) {
		this.createtime = createtime;
	}

	public String getState() {		
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getUrl() {		
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getLabel() {		
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public String getContent1() {		
		return content1;
	}
	public void setContent1(String content1) {
		this.content1 = content1;
	}

	public String getContent2() {		
		return content2;
	}
	public void setContent2(String content2) {
		this.content2 = content2;
	}


	
}
