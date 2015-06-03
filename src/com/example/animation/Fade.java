package com.example.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
/**
 * Fading image activity
 * @author Mohit Soni
 *
 *
 */
public class Fade extends Activity {
	ImageView image ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fade);
		image = (ImageView)findViewById(R.id.image);
		
		// Animation object to pass to image view
		Animation ani =  AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
		image.setAnimation(ani);
		
		
	}
	

}
