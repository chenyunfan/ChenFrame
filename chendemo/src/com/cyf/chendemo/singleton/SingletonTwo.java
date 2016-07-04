package com.cyf.chendemo.singleton;

/**
 * 静态内部类单例模式（默认的情况下，反序列化的时候，还会创建实例，如果处理的话，就可以避免创建实例 ）
 * @author Administrator
 *
 */
public class SingletonTwo {
	
	/**
	 * 私有构造函数
	 */
	private SingletonTwo() {
	}
	
	public static SingletonTwo getInstance(){
		return SingletonHolder.s;
	}
	
	/**
	 * 静态内部类
	 * @author Administrator
	 *
	 */
	private static class SingletonHolder{
		private static final SingletonTwo s = new SingletonTwo();
	}
	
	/**
	 * 这个是解决反序列化的问题，可能写的不对。（重写反序列化的readResolve方法）
	 * @return
	 */
	private SingletonTwo readResolve(){
		return SingletonHolder.s;
	}

}
