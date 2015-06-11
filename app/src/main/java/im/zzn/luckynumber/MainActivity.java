package im.zzn.luckynumber;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

import com.google.ads.conversiontracking.AdWordsConversionReporter;

public class MainActivity extends ActionBarActivity {
    // Remove the below line after defining your own ad unit ID.
    private static final String TOAST_TEXT = "Test ads are being shown. "
            + "To show live ads, replace the ad unit ID in res/values/strings.xml with your own ad unit ID.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Toasts the test ad message on the screen. Remove this after defining your own ad unit ID.
        Toast.makeText(this, TOAST_TEXT, Toast.LENGTH_LONG).show();

        Button button = (Button) findViewById(R.id.button);
        final TextView textView = (TextView) findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf(Math.floor(Math.random() * 100)));
            }
        });

        // Lucky Number Download
        // Google Android download conversion tracking snippet
        // Add this code to the onCreate() method of your application activity

        AdWordsConversionReporter.reportWithConversionId(this.getApplicationContext(),
                "991950745", "WtZqCOivi10Qme__2AM", "1.00", false);

        // Lucky number native First Open
        // Google Android first open conversion tracking snippet
        // Add this code to the onCreate() method of your application activity

        AdWordsConversionReporter.reportWithConversionId(this.getApplicationContext(),
                "991950745", "4DYyCPXMl10Qme__2AM", "0.00", false);

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

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
