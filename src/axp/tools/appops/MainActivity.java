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
			Intent intent = new Intent();
			if (android.os.Build.VERSION.SDK_INT == 18) {
				intent.setClassName("com.android.settings", "com.android.settings.Settings$AppOpsSummaryActivity");
			} else {
				intent.setClassName("com.android.settings", "com.android.settings.Settings");
				intent.setAction("android.intent.action.MAIN");
				intent.addCategory("android.intent.category.DEFAULT");
				intent.putExtra(":android:show_fragment", "com.android.settings.applications.AppOpsSummary");
			}
			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
			startActivity(intent);
		} catch (Exception localException) {
			Toast.makeText(this, R.string.launch_error, Toast.LENGTH_SHORT).show();
		} finally {
			finish();
		}
	}
}
