package com.example.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Zoom extends Activity {
	ImageView image ;
	Button zoom;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.zoom);
		image = (ImageView)findViewById(R.id.image);
		zoom = (Button)findViewById(R.id.zoom);
		zoom.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				clockWise(getCurrentFocus());
			}
		});
		
	}
	
	
	public void clockWise(View view){
		
		Animation ani =  AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
		image.setAnimation(ani);
		
	}

}
