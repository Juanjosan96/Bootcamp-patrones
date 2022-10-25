package com.example.bootcamp_2_lombok_singleton;

import Prototye.Icloneable;

public class Persona implements Icloneable{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
}
