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
	 * ǳ���������޸�ArrayList
	 */
	private static void yuanxing1() {
		WordDocument originDoc = new WordDocument();
		originDoc.setText("����һƪ�ĵ�");
		originDoc.addImage("ͼƬ1");
		originDoc.addImage("ͼƬ2");
		originDoc.addImage("ͼƬ3");
		originDoc.showDocument();

		WordDocument doc2 = originDoc.clone();
		doc2.showDocument();

		doc2.setText("�����޸Ĺ���Doc2�ı�");
		doc2.showDocument();

		originDoc.showDocument();
	}
	/**
	 * ��������޸�ArrayList
	 */
	private static void yuanxing11() {
		WordDocument2 originDoc = new WordDocument2();
		originDoc.setText("����һƪ�ĵ�");
		originDoc.addImage("ͼƬ1");
		originDoc.addImage("ͼƬ2");
		originDoc.addImage("ͼƬ3");
		originDoc.showDocument();
		
		WordDocument2 doc2 = originDoc.clone();
		doc2.showDocument();
		
		doc2.setText("�����޸Ĺ���Doc2�ı�");
		doc2.showDocument();
		
		originDoc.showDocument();
	}
	/**
	 * ǳ�������޸�ArrayList��������޸��˿�����ʵ����ԭ����ʵ����
	 */
	private static void yuanxing2() {
		 WordDocument originDoc = new WordDocument();  
		    originDoc.setText("����һƪ�ĵ�");  
		    originDoc.addImage("ͼƬ1");  
		    originDoc.addImage("ͼƬ2");  
		    originDoc.addImage("ͼƬ3");  
		    originDoc.showDocument();  
		  
		    WordDocument doc2 = originDoc.clone();  
		      
		    doc2.showDocument();  
		      
		    doc2.setText("�����޸Ĺ���Doc2�ı�");  
		    doc2.addImage("����.jpg");  
		    doc2.showDocument();  
		      
		    originDoc.showDocument();  
	}
	/**
	 * ������޸�ArrayList,�����ֻ�޸��˿�����ʵ����ԭ����ʵ��û�иı�
	 */
	private static void yuanxing22() {
		WordDocument2 originDoc = new WordDocument2();  
		originDoc.setText("����һƪ�ĵ�");  
		originDoc.addImage("ͼƬ1");  
		originDoc.addImage("ͼƬ2");  
		originDoc.addImage("ͼƬ3");  
		originDoc.showDocument();  
		
		WordDocument2 doc2 = originDoc.clone();  
		
		doc2.showDocument();  
		
		doc2.setText("�����޸Ĺ���Doc2�ı�");  
		doc2.addImage("����.jpg");  
		doc2.showDocument();  
		
		originDoc.showDocument();  
	}

}
