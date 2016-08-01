package com.cyf.chendemo.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.util.DisplayMetrics;
import android.util.Log;

public class Utils {

	/**
	 * <i> 判断输入字符串是否为空 </i>
	 * 
	 * @param inputStr
	 *            指定的字符串
	 * 
	 * @return 如果为空则返回true 如果不为空则返回false
	 */
	public static boolean isNull(Object inputStr) {
		if (null == inputStr || "".equals(inputStr) || "null".equals(inputStr)
				|| "".equals(inputStr.toString().trim()))
			return true;
		return false;
	}

	/**
	 * 检查网络状态
	 * 
	 * @param context
	 * @return true 网络正常 false 网络异常
	 */
	public static final boolean checkNetState(Context mContext) {
		WifiManager wifiManager = (WifiManager) mContext
				.getSystemService(Context.WIFI_SERVICE);
		if (wifiManager.getWifiState() == WifiManager.WIFI_STATE_ENABLED) { // wifi可用
			return true;
		} else {
			ConnectivityManager cManager = (ConnectivityManager) mContext
					.getSystemService(Context.CONNECTIVITY_SERVICE);
			NetworkInfo info = cManager.getActiveNetworkInfo();
			if (info != null && info.isAvailable()) {
				// 能联网
				return true;
			} else {
				// 不能联网
				return false;
			}
		}
	}

	
	
	/**
	 * 获取屏幕各种属性
	 * @param context
	 */
	public static void getDeviseDensity(Context context){
		DisplayMetrics dm = new DisplayMetrics();  
		dm = context.getResources().getDisplayMetrics();  
		  
		float density  = dm.density;        // 屏幕密度（像素比例：0.75/1.0/1.5/2.0）  
		int densityDPI = dm.densityDpi;     // 屏幕密度（每寸像素：120/160/240/320）  
		float xdpi = dm.xdpi;             
		float ydpi = dm.ydpi;  
		  
		Log.e("  DisplayMetrics", "xdpi=" + xdpi + "; ydpi=" + ydpi);  
		Log.e("  DisplayMetrics", "density=" + density + "; densityDPI=" + densityDPI);  
		  
		int screenWidth  = dm.widthPixels;      // 屏幕宽（像素，如：480px）  
		int screenHeight = dm.heightPixels;     // 屏幕高（像素，如：800px）  
		  
		Log.e("  DisplayMetrics(111)", "screenWidth=" + screenWidth + "; screenHeight=" + screenHeight);  
	}
	/**
	 * @param context
	 */
	public static int getScreenHeight(Context context){
		DisplayMetrics dm = new DisplayMetrics();  
		dm = context.getResources().getDisplayMetrics();  
		
		int screenHeight = dm.heightPixels;     // 屏幕高（像素，如：800px）  
		return screenHeight;
	}
	/**
	 * @param context
	 */
	public static int getScreenWidth(Context context){
		DisplayMetrics dm = new DisplayMetrics();  
		dm = context.getResources().getDisplayMetrics();  
		
		int screenWidth  = dm.widthPixels;      // 屏幕宽（像素，如：480px）  
		return screenWidth;
	}
}
