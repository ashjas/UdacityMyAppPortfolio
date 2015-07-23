package com.ashjas.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment())
					.commit();
		}
	}
	public void onButtonClick(View view)
	{
		switch(view.getId())
		{
			case R.id.Buttonspotify:
				Toast.makeText(this,R.string.SpotifyStremer,Toast.LENGTH_SHORT).show();
				break;
			case R.id.Buttonscores:
				Toast.makeText(this,R.string.ScoresApp,Toast.LENGTH_SHORT).show();
				break;
			case R.id.Buttonlibrary:
				Toast.makeText(this,R.string.LibraryApp,Toast.LENGTH_SHORT).show();
				break;
			case R.id.ButtonBuildItBigger:
				Toast.makeText(this,R.string.BuildItBigger,Toast.LENGTH_SHORT).show();
				break;
			case R.id.ButtonXYZ:
				Toast.makeText(this,R.string.XYZReader,Toast.LENGTH_SHORT).show();
				break;
			case R.id.ButtonCapstone:
				Toast.makeText(this,R.string.Capstone,Toast.LENGTH_SHORT).show();
				break;
		}

	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
								 Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container, false);
			return rootView;
		}
	}
}
