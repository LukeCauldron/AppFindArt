package kaldorenzo.it.appfindart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private ImageView miaImmagine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miaImmagine = (ImageView) findViewById(R.id.img);
        //miaImmagine.setImageResource(R.drawable.img);

    }
}
