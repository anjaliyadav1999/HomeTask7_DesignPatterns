package com.DesignPattern;

public class SinglePatternMain {

	public static void main(String[] args) {
		SingletonPattern s = SingletonPattern.getInstance();
		System.out.println("The hashcode of singleton object is ");
		System.out.println(s.hashCode());
		SinglePatternMain obj = new SinglePatternMain();
		System.out.println("The hashcode of non singleton object is ");
		System.out.println(obj.hashCode());
	}

}
