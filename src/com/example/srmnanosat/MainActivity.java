package com.example.srmnanosat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		final Button click = (Button) findViewById(R.id.gobutton);

		click.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v)

			{
				 v.setPressed(true);
				Intent launchactivity = new Intent(MainActivity.this,
						Url.class);

				startActivity(launchactivity);

			}

		});
		
		 final Button click1=(Button)findViewById(R.id.button1);       
	        click1.setOnClickListener(new View.OnClickListener() {                                            
	            public void onClick(View v) 
	              {             
	Intent launchactivity= new Intent(MainActivity.this,AboutSat.class);                               
	startActivity(launchactivity);                          
	                }
	                 });

	}
}