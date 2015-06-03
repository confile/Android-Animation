package com.example.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Fade extends Activity {
	ImageView image ;
	Button fade;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.zoom);
		image = (ImageView)findViewById(R.id.image);
		fade = (Button)findViewById(R.id.fade);
		fade.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				clockWise(getCurrentFocus());
			}
		});
		
	}
	
	
	public void clockWise(View view){
		
		Animation ani =  AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
		image.setAnimation(ani);
		
	}

}
