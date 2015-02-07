package jeffhorus.browseractivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;

/**
 * Created by Jelink on 2/7/2015.
 */
public class MainActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.vogella.com"));
        startActivity(intent);
    }
}
