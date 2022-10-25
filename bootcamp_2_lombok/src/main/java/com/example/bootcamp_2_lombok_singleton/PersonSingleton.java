package com.example.bootcamp_2_lombok_singleton;

public class PersonSingleton {
	private static PersonSingleton Instance;
	private String name;
	private int age;
	public static PersonSingleton getInstance() {
		if(Instance==null) {
			Instance= new PersonSingleton();
		}
		return Instance;
	}
	public void singletonOperation() {
		System.out.println("Mi nombre es:"+name+" y mi edad es: "+age);
	}
	public void Singleton() {
		
	}
}
