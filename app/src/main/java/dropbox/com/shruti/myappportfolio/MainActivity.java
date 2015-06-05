package dropbox.com.shruti.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void displayMessage1(View view) {
        Toast.makeText(getApplicationContext(), "Spotify Streamer was clicked.",
                Toast.LENGTH_SHORT).show();
    }
    public void displayMessage2(View view) {
        Toast.makeText(getApplicationContext(), "Scores App was clicked.",
                Toast.LENGTH_SHORT).show();
    }
    public void displayMessage3(View view) {
        Toast.makeText(getApplicationContext(), "Library App was clicked.",
                Toast.LENGTH_SHORT).show();
    }
    public void displayMessage4(View view) {
        Toast.makeText(getApplicationContext(), "Build it bigger was clicked.",
                Toast.LENGTH_SHORT).show();
    }
    public void displayMessage5(View view) {
        Toast.makeText(getApplicationContext(), "Bacon Reader was clicked.",
                Toast.LENGTH_SHORT).show();
    }
    public void displayMessage6(View view) {
        Toast.makeText(getApplicationContext(), "Capstone was clicked.",
                Toast.LENGTH_SHORT).show();
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
}
