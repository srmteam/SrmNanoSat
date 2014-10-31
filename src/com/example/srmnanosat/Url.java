package com.example.srmnanosat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Url extends Activity {
	
	WebView mWebview;
	ProgressBar progressBar;
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		mWebview = new WebView(this);
		this.getWindow().requestFeature(Window.FEATURE_PROGRESS);
		getWindow().setFeatureInt(	Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON); 


		mWebview.getSettings().setJavaScriptEnabled(true); // enable javascript

		final Activity activity = this;

		mWebview.setWebViewClient(new WebViewClient() {
			public void onProgressChanged(WebView view, int progress)   
	        {
	         //Make the bar disappear after URL is loaded, and changes string to Loading...
	         activity.setTitle("Loading...");
	         activity.setProgress(progress * 100); //Make the bar disappear after URL is loaded
	 
	         // Return the app name after finish loading
	            if(progress == 100)
	               activity.setTitle(R.string.app_name);
	          }
			public void onReceivedError(WebView view, int errorCode,
					String description, String failingUrl) {
				Toast.makeText(activity, description, Toast.LENGTH_SHORT)
						.show();
			}

		});
		mWebview.getSettings().setSupportZoom(true);
		mWebview.getSettings().setBuiltInZoomControls(true);
		mWebview.loadUrl("http://www.n2yo.com/?s=37841");
		setContentView(mWebview);

	}

}