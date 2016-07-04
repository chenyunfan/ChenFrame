package com.cyf.chendemo.singleton;

/**
 * 饿汉式（默认的情况下，反序列化的时候，还会创建实例，如果处理的话，就可以避免创建实例 ）
 * @author Administrator
 *
 */
public class SingletonOne {
	
	private static final SingletonOne s = new SingletonOne();
	/**
	 * 私有构造函数
	 */
	private SingletonOne() {
	}
	
	public static SingletonOne getInstance(){
		return s;
	}
	
	

}
