package com.cgi.template;

public class Course {
	
	private int cid;
	private String name;
	private String duration;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int cid, String name, String duration) {
		super();
		this.cid = cid;
		this.name = name;
		this.duration = duration;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", name=" + name + ", duration=" + duration + "]";
	}
	
	
}
