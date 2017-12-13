package com.glemontree.test;

public class Singleton1 {
	private static Singleton1 mInstance;
	private Singleton1() {}
	public static Singleton1 getInstance() { // 懒汉
		if (mInstance == null) {
			synchronized (Singleton1.class) {
				if (mInstance == null) {
					mInstance = new Singleton1();
				}
			}
		}
		return mInstance;
	}
}
