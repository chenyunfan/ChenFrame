package com.cyf.chendemo.singleton;

/**
 * ���μ�鵥��ģʽ�����ַ�����Ȼ�ڸ߲���������£���һ�����ʳ�������Android�Ŀͻ��˿���������û�и߲��������������һ�����ʹ�����ַ��� ��
 * @author Administrator
 *
 */
public class SingletonThree {
	private static SingletonThree singletonThree = null;
	
	/**
	 * ˽�й��캯��
	 */
	private SingletonThree() {
	}
	
	public static SingletonThree getInstance(){
		//��μ��Ϊ�˱��⣺ÿ��ִ��getInstance()��������ִ��ͬ�����˷����ܡ�
		if(singletonThree==null){
			synchronized (SingletonThree.class) {
				//��μ��Ϊ�˱��⣺�ظ�������ʵ����
				if(singletonThree==null){
					singletonThree = new SingletonThree();
				}
			}
		}
		
		return singletonThree;
	}
	

}
