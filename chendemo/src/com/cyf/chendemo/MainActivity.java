package com.cyf.chendemo;

import android.app.Dialog;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.cyf.chendemo.utils.Utils;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	private TextView main_tv;
	private TextView main_tv2;
	private TextView main_tv3;
	private TextView main_tv4;
	private TextView main_tv5;

	private int appCenterX = 0;
	private int appCenterY = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		Log.e("TAG", "onCreate");

		initView();

	}

	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		// TODO Auto-generated method stub

		Rect outRect = new Rect();
		this.getWindow().getDecorView().getWindowVisibleDisplayFrame(outRect);
		Rect outRect2 = new Rect();
		this.getWindow().findViewById(Window.ID_ANDROID_CONTENT)
				.getDrawingRect(outRect2);

		int systemTitleHeight = outRect.top - outRect2.top;

		// String str = outRect.centerX()+"====" +outRect.centerY();
		String str = outRect.top + "===" + outRect.left + "===" + outRect.right
				+ "===" + outRect.bottom;
		String str2 = outRect2.top + "===" + outRect2.left + "==="
				+ outRect2.right + "===" + outRect2.bottom;

		appCenterX = Utils.getScreenWidth(MainActivity.this) / 2;
		appCenterY = (Utils.getScreenHeight(MainActivity.this) - systemTitleHeight) / 2;

		main_tv4.setText(str);
		main_tv5.setText(str2);
		super.onWindowFocusChanged(hasFocus);
	}

	private void initView() {
		main_tv = (TextView) findViewById(R.id.main_tv);
		main_tv2 = (TextView) findViewById(R.id.main_tv2);
		main_tv3 = (TextView) findViewById(R.id.main_tv3);
		main_tv4 = (TextView) findViewById(R.id.main_tv4);
		main_tv5 = (TextView) findViewById(R.id.main_tv5);

		main_tv.setOnClickListener(this);
		
		
		main_iv = (ImageView) findViewById(R.id.main_iv);
		
//		main_iv.setImageBitmap(bm)
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		switch (event.getAction()) {
		/**
		 * 点击的开始位置
		 */
		case MotionEvent.ACTION_DOWN:
			main_tv.setText("起始位置：(" + event.getX() + "," + event.getY());
			Log.e("TAG", "ACTION_DOWN------------------" + event.getDownTime());

			break;
		/**
		 * 触屏实时位置
		 */
		case MotionEvent.ACTION_MOVE:
			Log.e("TAG", "ACTION_MOVE------------------" + event.getDownTime());
			main_tv2.setText("实时位置：(" + event.getX() + "," + event.getY());
			break;
		/**
		 * 离开屏幕的位置
		 */
		case MotionEvent.ACTION_UP:
			Log.e("TAG", "ACTION_UP------------------" + event.getDownTime());
			main_tv3.setText("结束位置：(" + event.getX() + "," + event.getY());
			break;
		default:
			break;
		}
		/**
		 * 注意返回值 true：view继续响应Touch操作；
		 * false：view不再响应Touch操作，故此处若为false，只能显示起始位置，不能显示实时位置和结束位置
		 */
		return true;
		// return super.onTouchEvent(event);
	}

	Handler mHandler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case 0:
				
				break;

			default:
				break;
			}
			super.handleMessage(msg);
		}
	};

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.main_tv:

			TouchTest();
			Log.e("TAG", "点击");

			break;

		default:
			break;
		}

	}

	private void TouchTest() {
		Long downTime = SystemClock.uptimeMillis();

		// TODO Auto-generated method stub
		MotionEvent down = MotionEvent.obtain(downTime,
				SystemClock.uptimeMillis() + 100, MotionEvent.ACTION_DOWN,
				appCenterX, appCenterY, 0);
		MainActivity.this.getWindow().getDecorView().dispatchTouchEvent(down);
		down.recycle();

		MotionEvent move = MotionEvent.obtain(downTime,
				SystemClock.uptimeMillis() + 100, MotionEvent.ACTION_MOVE,
				(int) (appCenterX * 0.8), appCenterY, 0);
		MainActivity.this.getWindow().getDecorView().dispatchTouchEvent(move);
		move.recycle();
		MotionEvent move2 = MotionEvent.obtain(downTime,
				SystemClock.uptimeMillis() + 100, MotionEvent.ACTION_MOVE,
				(int) (appCenterX * 0.8 * 0.8), appCenterY, 0);
		MainActivity.this.getWindow().getDecorView().dispatchTouchEvent(move2);
		move2.recycle();
		MotionEvent move3 = MotionEvent.obtain(downTime,
				SystemClock.uptimeMillis() + 100, MotionEvent.ACTION_MOVE,
				(int) (appCenterX * 0.8 * 0.8 * 0.8), appCenterY, 0);
		MainActivity.this.getWindow().getDecorView().dispatchTouchEvent(move3);
		move3.recycle();

		MotionEvent up = MotionEvent.obtain(downTime,
				SystemClock.uptimeMillis() + 100, MotionEvent.ACTION_UP,
				(int) (appCenterX * 0.8 * 0.8 * 0.8), appCenterY, 0);
		MainActivity.this.getWindow().getDecorView().dispatchTouchEvent(up);
		up.recycle();
	}

	private Boolean simulateTouch_End = true;
	private Long downTime1 = 0L;
	private int appCenterX1 = 0;
	private int appCenterY1 = 0;
	private double zoomX1 = 1;
	private double zoomY1 = 1;

	private int moveSize = 1;
	private MotionEvent down;
	private MotionEvent move;

	/**
	 * 模拟滑动
	 * 
	 * @param appCenterX
	 *            中心点X
	 * @param appCenterY
	 *            中心点Y
	 * @param zoomX
	 *            X缩放的比例，0是不变
	 * @param zoomY
	 *            Y缩放的比例，0是不变
	 */
	private void simulateTouch(final int appCenterX, final int appCenterY,
			final double zoomX, final double zoomY) {

		Long downTime = SystemClock.uptimeMillis();
		android.util.Log.e("TAG", "simulateTouch_End========"
				+ simulateTouch_End);
		appCenterX1 = appCenterX;
		appCenterY1 = appCenterY;
		zoomX1 = zoomX;
		zoomY1 = zoomY;

		if (simulateTouch_End) {

			down = MotionEvent.obtain(downTime,
					SystemClock.uptimeMillis() + 100, MotionEvent.ACTION_DOWN,
					appCenterX, appCenterY, 0);
			// mNaviMapView.dispatchTouchEvent(down);
			// findViewById(R.id.main_view).dispatchTouchEvent(down);
			this.getWindow().getDecorView().dispatchTouchEvent(down);
			down.recycle();
			// SystemClock.sleep(50);
			android.util.Log.e("TAG", "ACTION_DOWN========");
			simulateTouch_End = false;
			downTime1 = downTime;

		} else {
			moveSize++;
		}
		// android.util.Log.e("TAG",
		// "(int)(appCenterX*(1-zoomX*moveSize))========"
		// + (int) (appCenterX * (1 - zoomX * moveSize)));
		// android.util.Log.e("TAG",
		// "(int)(appCenterY*(1-zoomY*moveSize))========"
		// + (int) (appCenterY * (1 - zoomY * moveSize)));
		// android.util.Log.e("TAG", "moveSize========" + moveSize);
		// android.util.Log.e("TAG", "zoomX========" + zoomX);
		// android.util.Log.e("TAG", "zoomY========" + zoomY);
		move = MotionEvent.obtain(downTime1, SystemClock.uptimeMillis() + 150,
				MotionEvent.ACTION_MOVE, (int) (appCenterX * (1 - zoomX
						* moveSize)),
				(int) (appCenterY * (1 - zoomY * moveSize)), 0);
		this.getWindow().getDecorView().dispatchTouchEvent(move);
		move.recycle();
		android.util.Log.e("TAG", "ACTION_MOVE========");
		// SystemClock.sleep(20);

		mHandler.removeCallbacks(runnable);
		mHandler.postDelayed(runnable, 400);

	}

	Runnable runnable = new Runnable() {

		@Override
		public void run() {
			MotionEvent up = MotionEvent.obtain(downTime1,
					SystemClock.uptimeMillis() + 200, MotionEvent.ACTION_UP,
					(int) (appCenterX1 * (1 - zoomX1 * moveSize)),
					(int) (appCenterY1 * (1 - zoomY1 * moveSize)), 0);
			MainActivity.this.getWindow().getDecorView().dispatchTouchEvent(up);
			up.recycle();
			android.util.Log.e("TAG", "ACTION_UP========");
			// SystemClock.sleep(400);
			moveSize = 1;
			simulateTouch_End = true;
		}
	};
	private ImageView main_iv;
	
	
	
	@Override
	public void onBackPressed() {
		
		Log.e("TAG", "onBackPressed");
//		showExitDialog();
		
		super.onBackPressed();
	}
	
	public void showExitDialog() {
		final Dialog dialog = new Dialog(this, R.style.customProgressDialog);
		dialog.show();
		dialog.setCanceledOnTouchOutside(false);
		dialog.setContentView(R.layout.layout_exit_view);

		dialog.findViewById(R.id.btn_exit_ok).setOnClickListener(
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						dialog.dismiss();
					}
				});
		dialog.findViewById(R.id.btn_exit_no).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						dialog.dismiss();
					}
				});
	}
}
