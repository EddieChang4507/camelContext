package com.eddie.vo;

public class test001ResponseVO {
	String name;
	int phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "test001ResponseVO [name=" + name + ", phone=" + phone + "]";
	}
}
