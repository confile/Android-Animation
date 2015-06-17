package com.example.animation;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ShareActionProvider;
import android.widget.Toast;
/**
 * This is a simple example of Action bar tweaks like Search view,Enabling back 
 * button
 * 
 * 
 * @author Mohit Soni
 *
 *
 */
public class Main extends Activity {
	private Button but;
	private ShareActionProvider m_provider;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		if(android.os.Build.VERSION.SDK_INT > android.os.Build.VERSION_CODES.GINGERBREAD_MR1 ){
			
			
			/*getting the action bar*/
			ActionBar action = getActionBar();
			
			/*hides the action bar*/
			/** action.hide();*/
			
			/*showing action on create*/
			action.show();  
			
			action.setTitle("  Action");
		}
		
		
		/*linking XML element*/
		but = (Button)findViewById(R.id.button);
		
		/*Listing button*/
		but.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				/* intent to move to other activity*/
				Intent in = new Intent(Main.this,Back_button.class);
				startActivity(in);
	
			}
		});
		
		
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case (R.id.menu):
			Toast.makeText(getBaseContext(), "Menu Clicked", Toast.LENGTH_LONG).show();
			break;
		
		default:
		 this.finish();
			break;
		}
		
		return super.onOptionsItemSelected(item);
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu1, menu);
		MenuItem menu_item  = menu.findItem(R.id.share);
		m_provider = (ShareActionProvider)menu_item.getActionProvider();
		m_provider.setShareIntent(getDefault());
		
		
		return super.onCreateOptionsMenu(menu);
		
	}
	private Intent getDefault(){
		Intent intent = new Intent(Intent.ACTION_SEND);
		intent.setType("text/*");
		return intent;
	}


}
