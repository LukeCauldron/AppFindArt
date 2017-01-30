package kaldorenzo.it.appfindart;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.cameraview.CameraView;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.support.design.widget.FloatingActionButton;


/**
 * Created by luke on 1/30/17.
 */

public class ThirdActivity extends Activity {

    CameraView cameraView;
    Camera2 camera2;

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.take_picture:
                    if (cameraView != null) {
                        cameraView.takePicture();
                    }
                    break;
            }
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_activity);
        cameraView = (CameraView) findViewById(R.id.camera);

        // Preso dalla repository google

        if (cameraView != null) {
            cameraView.addCallback(mCallback);
        }
        FloatingActionButton takePicture = (FloatingActionButton) findViewById(R.id.take_picture);
        if (takePicture != null) {
            takePicture.setOnClickListener(mOnClickListener);
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(false);
        }


    }

    @Override
    protected void onResume() {
        super.onResume();
        cameraView.start();
    }

    @Override
    protected void onPause() {
        cameraView.stop();
        super.onPause();
    }


}
