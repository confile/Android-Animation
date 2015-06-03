package com.example.animation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
	ImageView image ;
	Button zoom,fade,blink,rotate,move,slideup,slidedown,bounce;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		image = (ImageView)findViewById(R.id.image);
		zoom = (Button)findViewById(R.id.zoom);
		fade = (Button)findViewById(R.id.fade);
		blink = (Button)findViewById(R.id.blink);
		rotate = (Button)findViewById(R.id.rotate);
		move = (Button)findViewById(R.id.move);
		slideup = (Button)findViewById(R.id.slideup);
		slidedown = (Button)findViewById(R.id.slidedown);
		bounce = (Button)findViewById(R.id.bounce);
		
		zoom.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this,Zoom.class));
			}
		});

		fade.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this,Fade.class));
			}
		});
		blink.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this,Blink.class));
			}
		});
		rotate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this,Rotate.class));
			}
		});
		move.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this,Move.class));
			}
		});
		slideup.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this,SlideUp.class));
			}
		});
		slidedown.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this,SlideDown.class));
			}
		});
		bounce.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this,Bounce.class));
			}
		});
	}
	
	
	public void clockWise(View view){
		
		Animation ani =  AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
		image.setAnimation(ani);
		
	}

}
