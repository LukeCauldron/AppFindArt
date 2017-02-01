package kaldorenzo.it.appfindart;

import android.app.Activity;
import android.os.Bundle;


/**
 * Created by luke on 2/1/17.
 */


    public class CameraActivity extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_camera);
            if (null == savedInstanceState) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.container, Camera2Fragment.newInstance())
                        .commit();
            }
        }

    }


