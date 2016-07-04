package com.cyf.chendemo.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * �ѹرսӿڣ��������ȸ��ֲ����Ĺرգ�ֻҪ��ʵ����Closeable�Ľӿڶ������ã������������
 * 
 * @author chenyf
 * 
 */
public final class CloseUtils {

	private CloseUtils() {
	}

	/**
	 * �ر�closeable����
	 * 
	 * ���÷�����CloseUtils.closeQuietly(fileOutputStream);
	 * @param closeable Ҫ���رյ�ʵ������
	 */
	public static void closeQuietly(Closeable closeable) {
		if (null != closeable) {

			try {
				closeable.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
