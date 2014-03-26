package com.kuan.cvapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {

	ImageButton ib;
	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		final View view = View.inflate(this, R.layout.activity_main, null);
		setContentView(view);

		ib = (ImageButton) findViewById(R.id.cv_splash);
		ib.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				redirectTo();
			}
		});

		tv = (TextView) findViewById(R.id.cv_suffix);
		tv.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				redirectTo();
			}
		});

		// AlphaAnimation aa = new AlphaAnimation(1.0f, 0f);
		// aa.setDuration(5000);
		// view.startAnimation(aa);
		// aa.setAnimationListener(new AnimationListener() {
		// @Override
		// public void onAnimationEnd(Animation arg0) {
		// redirectTo();
		// }
		//
		// @Override
		// public void onAnimationRepeat(Animation animation) {
		// }
		//
		// @Override
		// public void onAnimationStart(Animation animation) {
		// }
		//
		// });

	}

	/**
	 * 跳转到...
	 */
	private void redirectTo() {
		Intent intent = new Intent(this, CvMainScreen.class);
		startActivity(intent);
		finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
