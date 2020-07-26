package com.rk.jam2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Date;

import com.wilis.jam2.R;

public class jam2 extends Activity implements View.OnClickListener {
	Button btn;

	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);

		setContentView(R.layout.main);
		
		btn=(Button)findViewById(R.id.button);
		btn.setOnClickListener(this);
		updateTime();
		setContentView(btn);
	}

	public void onClick(View view) {
		updateTime();
	}

	private void updateTime() {
		btn.setText(new Date().toString());
	}
}