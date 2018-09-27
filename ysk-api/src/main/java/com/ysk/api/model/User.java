package com.ysk.api.model;

import java.io.Serializable;

/**
 * @author Bob Simon
 * @desc 用户实体类
 */
public class User implements Serializable {

	private static final long serialVersionUID = -459993263361085318L;

	/**
	 * id
	 */
	private long id;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 年龄
	 */
	private Integer age;

	/**
	 * 地址
	 */
	private String address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}