package com.cyf.chendemo.singleton;

/**
 * ����ʽ��Ĭ�ϵ�����£������л���ʱ�򣬻��ᴴ��ʵ�����������Ļ����Ϳ��Ա��ⴴ��ʵ�� ��
 * @author Administrator
 *
 */
public class SingletonOne {
	
	private static final SingletonOne s = new SingletonOne();
	/**
	 * ˽�й��캯��
	 */
	private SingletonOne() {
	}
	
	public static SingletonOne getInstance(){
		return s;
	}
	
	

}
