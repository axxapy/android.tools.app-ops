package axp.tools.appops;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		try {
			Intent localIntent = new Intent();
			localIntent.setClassName("com.android.settings", "com.android.settings.Settings$AppOpsSummaryActivity");
			startActivity(localIntent);
			return;
		} catch (Exception localException) {
			Toast.makeText(this, R.string.launch_error, Toast.LENGTH_SHORT).show();
			return;
		} finally {
			finish();
		}
	}
}
