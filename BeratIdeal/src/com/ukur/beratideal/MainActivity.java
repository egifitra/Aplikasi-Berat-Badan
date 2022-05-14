package com.ukur.beratideal;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button Jumlah=(Button)findViewById(R.id.button);
		
		Jumlah.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			EditText tinggi = (EditText)findViewById(R.id.editText);
			TextView Result = (TextView)findViewById(R.id.textView2);
		
			double tinggi1= Double.parseDouble(tinggi.getText().toString());
			double result =(tinggi1-100)-0.1*(tinggi1-100);
			Result.setText("Berat Badan Idealmu " + result + " Kg");
		}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
}
