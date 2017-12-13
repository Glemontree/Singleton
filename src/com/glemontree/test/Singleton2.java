package com.glemontree.test;

public class Singleton2 {

	private final static Singleton2 mInstance = new Singleton2();

	private Singleton2() {}

	public static Singleton2 getInstance() { // 饿汉模式
		return mInstance;
	}
}
