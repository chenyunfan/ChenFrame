package com.cyf.chendemo.builder.older;

import com.cyf.chendemo.builder.nnew.MacBookBuilder;

/**
 * Builderģʽ�ĵ��÷���������+���ã�
 * 
 * @author mrsimple
 * 
 */
public class Test {
	public static void main(String[] args) {

		// buildertest();
		buildertest2();
	}

	/**
	 * ���ڳ��õ�Builderģʽ
	 */
	private static void buildertest2() {

		Computer computer = new MacBookBuilder().buildCPU(1).buildOs("OS")
				.buildRAM(10).create();// ����ھ���ģʽ��ʡ����Director��ͬһ��װ���̣������Ҽ���Builder���ĳ���ʽ���ã�

		System.out.println("Computer Info : " + computer.toString());

	}

	/**
	 * ����Builderģʽ
	 */
	private static void buildertest() {
		// ������
		Builder builder = new ApplePCBuilder();
		// Director
		Director pcDirector = new Director(builder);
		// ��װ��������, 4��, �ڴ�2GB, Macϵͳ
		pcDirector.construct(4, 2, "Mac OS X 10.9.1");
		// ��������, ��������Ϣ
		System.out.println("Computer Info : " + builder.create().toString());

	}
}