package kaldorenzo.it.appfindart;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends Activity {

    Activity activity = this;
    private ImageView miaImmagine;
    Button tastoTrackList;
    Button tastoCentrale;

    View.OnClickListener changeBtnListener2nd = new View.OnClickListener() {
    public void onClick(View view) {
        Intent intent = new Intent(activity, kaldorenzo.it.appfindart.SecondActivity.class);
        startActivity(intent);
    }
};

    View.OnClickListener changeBtnListenerCAM = new View.OnClickListener() {
        public void onClick(View view) {
            Intent intent = new Intent(activity, kaldorenzo.it.appfindart.ThirdActivity.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miaImmagine = (ImageView) findViewById(R.id.img);
        miaImmagine.setImageResource(R.drawable.img);

        tastoTrackList = (Button)findViewById(R.id.button);
        tastoTrackList.setOnClickListener(changeBtnListener2nd);

        tastoCentrale = (Button)findViewById(R.id.search);

        tastoCentrale.setOnClickListener(changeBtnListenerCAM);
    }






}
