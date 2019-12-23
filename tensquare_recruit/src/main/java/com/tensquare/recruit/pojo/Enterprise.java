package com.tensquare.recruit.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
/**
 * enterprise实体类
 * @author Administrator
 *
 */
@Entity
@Table(name="tb_enterprise")
public class Enterprise implements Serializable{

	@Id
	private String id;//id


	
	private String name;//name
	private String summary;//summary
	private String address;//address
	private String labels;//labels
	private String coordinate;//coordinate
	private String ishot;//ishot
	private String logo;//logo
	private Integer jobcount;//jobcount
	private String url;//url

	
	public String getId() {		
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSummary() {		
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getAddress() {		
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getLabels() {		
		return labels;
	}
	public void setLabels(String labels) {
		this.labels = labels;
	}

	public String getCoordinate() {		
		return coordinate;
	}
	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate;
	}

	public String getIshot() {		
		return ishot;
	}
	public void setIshot(String ishot) {
		this.ishot = ishot;
	}

	public String getLogo() {		
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Integer getJobcount() {		
		return jobcount;
	}
	public void setJobcount(Integer jobcount) {
		this.jobcount = jobcount;
	}

	public String getUrl() {		
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}


	
}