package com.cgi.model;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String name;
	private String duration;

	public Course() {
		super();
		
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

	public void setId(int cid) {
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
		return "Course [id=" + cid + ", name=" + name + ", duration=" + duration + "]";
	}
	
}