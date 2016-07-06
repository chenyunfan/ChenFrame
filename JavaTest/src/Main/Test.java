package Main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import Main.builder.ApplePCBuilder;
import Main.builder.Builder;
import Main.builder.Computer;
import Main.builder.Director;
import Main.builder.MacBookBuilder;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
//		timetest();
		
//		buildertest();
		buildertest2();

	}

	private static void buildertest2() {
		
		Computer computer = new MacBookBuilder().buildCPU(1).buildOs("OS").buildRAM(10).create();//相对于经典模式，省略了Director（同一组装过程），并且简化了Builder（改成链式调用）
		
		System.out.println("Computer Info : " + computer.toString());  
		
	}
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

	private static void timetest() {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss"); 
//		String time = formatter.format(new Date());
		String time = formatter.format(new Date(1467563550000L));
		System.out.println("time=="+time);
		
	}

}
