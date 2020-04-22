package com.fanfeifan.beans;

import java.sql.Date;

public class Heros {

	private Integer id;
	private String hname;
	private Double price;
	private Date uptime;
	private Integer status;
	private Integer cid;
	private String cname;

	public Heros() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Heros(Integer id, String hname, Double price, Date uptime, Integer status, Integer cid, String cname) {
		super();
		this.id = id;
		this.hname = hname;
		this.price = price;
		this.uptime = uptime;
		this.status = status;
		this.cid = cid;
		this.cname = cname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getUptime() {
		return uptime;
	}

	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Heros [id=" + id + ", hname=" + hname + ", price=" + price + ", uptime=" + uptime + ", status=" + status
				+ ", cid=" + cid + ", cname=" + cname + "]";
	}

}
