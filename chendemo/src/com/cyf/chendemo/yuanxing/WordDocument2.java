package com.cyf.chendemo.yuanxing;

import java.util.ArrayList;
import java.util.List;

/**
 * �ĵ�����, ���ݵ���ConcretePrototype��ɫ����cloneable�Ǵ���prototype��ɫ
 * 
 * @author mrsimple
 */
public class WordDocument2 implements Cloneable {
	/**
	 * �ı�
	 */
	private String mText;
	/**
	 * ͼƬ���б�
	 */
	private ArrayList<String> mImages = new ArrayList<String>();

	public WordDocument2() {
		System.out.println("----------- WordDocument���캯�� -----------");
	}

	/**
	 * ��¡����(���)
	 */
	@Override
	protected WordDocument2 clone() {
		try {
			WordDocument2 doc = (WordDocument2) super.clone();
			doc.mText = this.mText;
			doc.mImages = (ArrayList<String>) this.mImages.clone();
			return doc;
		} catch (Exception e) {
		}

		return null;
	}

	public String getText() {
		return mText;
	}

	public void setText(String mText) {
		this.mText = mText;
	}

	public List<String> getImages() {
		return mImages;
	}

	/**
	 * @param img
	 */
	public void addImage(String img) {
		this.mImages.add(img);
	}

	/**
	 * ��ӡ�ĵ�����
	 */
	public void showDocument() {
		System.out.println("----------- Word Content Start -----------");
		System.out.println("Text : " + mText);
		System.out.println("Images List: ");
		for (String imgName : mImages) {
			System.out.println("image name : " + imgName);
		}
		System.out.println("----------- Word Content End -----------");
	}
}