package com.cyf.chendemo.builder.older;

import com.cyf.chendemo.builder.nnew.MacBookBuilder;

/**
 * Builder模式的调用方法（经典+常用）
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
	 * 现在常用的Builder模式
	 */
	private static void buildertest2() {

		Computer computer = new MacBookBuilder().buildCPU(1).buildOs("OS")
				.buildRAM(10).create();// 相对于经典模式，省略了Director（同一组装过程），并且简化了Builder（改成链式调用）

		System.out.println("Computer Info : " + computer.toString());

	}

	/**
	 * 经典Builder模式
	 */
	private static void buildertest() {
		// 构建器
		Builder builder = new ApplePCBuilder();
		// Director
		Director pcDirector = new Director(builder);
		// 封装构建过程, 4核, 内存2GB, Mac系统
		pcDirector.construct(4, 2, "Mac OS X 10.9.1");
		// 构建电脑, 输出相关信息
		System.out.println("Computer Info : " + builder.create().toString());

	}
}