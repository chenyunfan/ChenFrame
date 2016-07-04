package com.cyf.chendemo.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * 把关闭接口（数据流等各种操作的关闭，只要是实现了Closeable的接口都可以用）都用这个代替
 * 
 * @author chenyf
 * 
 */
public final class CloseUtils {

	private CloseUtils() {
	}

	/**
	 * 关闭closeable对象
	 * 
	 * @param closeable
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
