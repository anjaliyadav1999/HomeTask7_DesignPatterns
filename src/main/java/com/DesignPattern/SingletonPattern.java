package com.DesignPattern;
public class SingletonPattern {
	private static SingletonPattern obj;
	public static SingletonPattern getInstance() {
		if(obj == null){
			obj = new SingletonPattern();
		}
		return obj;
	}
	
}