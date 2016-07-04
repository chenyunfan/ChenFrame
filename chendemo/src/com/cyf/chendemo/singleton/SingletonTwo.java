package com.cyf.chendemo.singleton;

/**
 * ��̬�ڲ��൥��ģʽ��Ĭ�ϵ�����£������л���ʱ�򣬻��ᴴ��ʵ�����������Ļ����Ϳ��Ա��ⴴ��ʵ�� ��
 * @author Administrator
 *
 */
public class SingletonTwo {
	
	/**
	 * ˽�й��캯��
	 */
	private SingletonTwo() {
	}
	
	public static SingletonTwo getInstance(){
		return SingletonHolder.s;
	}
	
	/**
	 * ��̬�ڲ���
	 * @author Administrator
	 *
	 */
	private static class SingletonHolder{
		private static final SingletonTwo s = new SingletonTwo();
	}
	
	/**
	 * ����ǽ�������л������⣬����д�Ĳ��ԡ�����д�����л���readResolve������
	 * @return
	 */
	private SingletonTwo readResolve(){
		return SingletonHolder.s;
	}

}
