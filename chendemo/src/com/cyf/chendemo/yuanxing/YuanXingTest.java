package com.cyf.chendemo.yuanxing;

public class YuanXingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		yuanxing1();
//		yuanxing11();
		
		
//		yuanxing2();
		yuanxing22();
	}

	/**
	 * 浅拷贝，不修改ArrayList
	 */
	private static void yuanxing1() {
		WordDocument originDoc = new WordDocument();
		originDoc.setText("这是一篇文档");
		originDoc.addImage("图片1");
		originDoc.addImage("图片2");
		originDoc.addImage("图片3");
		originDoc.showDocument();

		WordDocument doc2 = originDoc.clone();
		doc2.showDocument();

		doc2.setText("这是修改过的Doc2文本");
		doc2.showDocument();

		originDoc.showDocument();
	}
	/**
	 * 深拷贝，不修改ArrayList
	 */
	private static void yuanxing11() {
		WordDocument2 originDoc = new WordDocument2();
		originDoc.setText("这是一篇文档");
		originDoc.addImage("图片1");
		originDoc.addImage("图片2");
		originDoc.addImage("图片3");
		originDoc.showDocument();
		
		WordDocument2 doc2 = originDoc.clone();
		doc2.showDocument();
		
		doc2.setText("这是修改过的Doc2文本");
		doc2.showDocument();
		
		originDoc.showDocument();
	}
	/**
	 * 浅拷贝，修改ArrayList，结果：修改了拷贝的实例和原来的实例。
	 */
	private static void yuanxing2() {
		 WordDocument originDoc = new WordDocument();  
		    originDoc.setText("这是一篇文档");  
		    originDoc.addImage("图片1");  
		    originDoc.addImage("图片2");  
		    originDoc.addImage("图片3");  
		    originDoc.showDocument();  
		  
		    WordDocument doc2 = originDoc.clone();  
		      
		    doc2.showDocument();  
		      
		    doc2.setText("这是修改过的Doc2文本");  
		    doc2.addImage("哈哈.jpg");  
		    doc2.showDocument();  
		      
		    originDoc.showDocument();  
	}
	/**
	 * 深拷贝，修改ArrayList,结果：只修改了拷贝的实例，原来的实例没有改变
	 */
	private static void yuanxing22() {
		WordDocument2 originDoc = new WordDocument2();  
		originDoc.setText("这是一篇文档");  
		originDoc.addImage("图片1");  
		originDoc.addImage("图片2");  
		originDoc.addImage("图片3");  
		originDoc.showDocument();  
		
		WordDocument2 doc2 = originDoc.clone();  
		
		doc2.showDocument();  
		
		doc2.setText("这是修改过的Doc2文本");  
		doc2.addImage("哈哈.jpg");  
		doc2.showDocument();  
		
		originDoc.showDocument();  
	}

}
