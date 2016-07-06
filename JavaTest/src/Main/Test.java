package Main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


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
		
		Computer computer = new MacBookBuilder().buildCPU(1).buildOs("OS").buildRAM(10).create();//����ھ���ģʽ��ʡ����Director��ͬһ��װ���̣������Ҽ���Builder���ĳ���ʽ���ã�
		
		System.out.println("Computer Info : " + computer.toString());  
		
	}
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

	private static void timetest() {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss"); 
//		String time = formatter.format(new Date());
		String time = formatter.format(new Date(1467563550000L));
		System.out.println("time=="+time);
		
	}

}
