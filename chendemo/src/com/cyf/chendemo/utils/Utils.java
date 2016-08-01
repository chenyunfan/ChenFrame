package com.cyf.chendemo.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.util.DisplayMetrics;
import android.util.Log;

public class Utils {

	/**
	 * <i> �ж������ַ����Ƿ�Ϊ�� </i>
	 * 
	 * @param inputStr
	 *            ָ�����ַ���
	 * 
	 * @return ���Ϊ���򷵻�true �����Ϊ���򷵻�false
	 */
	public static boolean isNull(Object inputStr) {
		if (null == inputStr || "".equals(inputStr) || "null".equals(inputStr)
				|| "".equals(inputStr.toString().trim()))
			return true;
		return false;
	}

	/**
	 * �������״̬
	 * 
	 * @param context
	 * @return true �������� false �����쳣
	 */
	public static final boolean checkNetState(Context mContext) {
		WifiManager wifiManager = (WifiManager) mContext
				.getSystemService(Context.WIFI_SERVICE);
		if (wifiManager.getWifiState() == WifiManager.WIFI_STATE_ENABLED) { // wifi����
			return true;
		} else {
			ConnectivityManager cManager = (ConnectivityManager) mContext
					.getSystemService(Context.CONNECTIVITY_SERVICE);
			NetworkInfo info = cManager.getActiveNetworkInfo();
			if (info != null && info.isAvailable()) {
				// ������
				return true;
			} else {
				// ��������
				return false;
			}
		}
	}

	
	
	/**
	 * ��ȡ��Ļ��������
	 * @param context
	 */
	public static void getDeviseDensity(Context context){
		DisplayMetrics dm = new DisplayMetrics();  
		dm = context.getResources().getDisplayMetrics();  
		  
		float density  = dm.density;        // ��Ļ�ܶȣ����ر�����0.75/1.0/1.5/2.0��  
		int densityDPI = dm.densityDpi;     // ��Ļ�ܶȣ�ÿ�����أ�120/160/240/320��  
		float xdpi = dm.xdpi;             
		float ydpi = dm.ydpi;  
		  
		Log.e("  DisplayMetrics", "xdpi=" + xdpi + "; ydpi=" + ydpi);  
		Log.e("  DisplayMetrics", "density=" + density + "; densityDPI=" + densityDPI);  
		  
		int screenWidth  = dm.widthPixels;      // ��Ļ�����أ��磺480px��  
		int screenHeight = dm.heightPixels;     // ��Ļ�ߣ����أ��磺800px��  
		  
		Log.e("  DisplayMetrics(111)", "screenWidth=" + screenWidth + "; screenHeight=" + screenHeight);  
	}
	/**
	 * @param context
	 */
	public static int getScreenHeight(Context context){
		DisplayMetrics dm = new DisplayMetrics();  
		dm = context.getResources().getDisplayMetrics();  
		
		int screenHeight = dm.heightPixels;     // ��Ļ�ߣ����أ��磺800px��  
		return screenHeight;
	}
	/**
	 * @param context
	 */
	public static int getScreenWidth(Context context){
		DisplayMetrics dm = new DisplayMetrics();  
		dm = context.getResources().getDisplayMetrics();  
		
		int screenWidth  = dm.widthPixels;      // ��Ļ�����أ��磺480px��  
		return screenWidth;
	}
}
