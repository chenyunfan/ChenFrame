package com.cyf.chendemo.singleton;

/**
 * 两次检查单例模式（这种方法虽然在高并发的情况下，有一定几率出错，但是Android的客户端开发，基本没有高并发的情况，所以一般可以使用这种方法 ）
 * @author Administrator
 *
 */
public class SingletonThree {
	private static SingletonThree singletonThree = null;
	
	/**
	 * 私有构造函数
	 */
	private SingletonThree() {
	}
	
	public static SingletonThree getInstance(){
		//这次检查为了避免：每次执行getInstance()方法，都执行同步，浪费性能。
		if(singletonThree==null){
			synchronized (SingletonThree.class) {
				//这次检查为了避免：重复创建类实例。
				if(singletonThree==null){
					singletonThree = new SingletonThree();
				}
			}
		}
		
		return singletonThree;
	}
	

}
