package com.zhuomiankaifa;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.os.Build;

public class Newsname extends ActionBarActivity {

	private EditText newsEditText;
	private EditText commentEditText1;
	private EditText commentEditText2;
	private EditText commentEditText3;
	private Button commentButton;
	private Button squareButton;
	private Button personalButton;
	private Button setButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_newsname);


		initViews();

	}

	
	private void initViews()
	{

		newsEditText = (EditText)findViewById(R.id.newsEditText);
		commentEditText1 = (EditText)findViewById(R.id.commentEditText1);
		commentEditText2 = (EditText)findViewById(R.id.commentEditText2);
		commentEditText3 = (EditText)findViewById(R.id.commentEditText3);
		commentButton = (Button)findViewById(R.id.commentButton);
		squareButton = (Button)findViewById(R.id.squareButton);
		personalButton = (Button)findViewById(R.id.personalButton);
		setButton = (Button)findViewById(R.id.setButton);
	}	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.newsname, menu);
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

	/**
	 * A placeholder fragment containing a simple view.
	 */

}
