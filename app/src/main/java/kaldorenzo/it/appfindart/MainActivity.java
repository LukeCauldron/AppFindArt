package kaldorenzo.it.appfindart;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.widget.*;
=======
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
>>>>>>> e83c58a402de82c557137ec47c0eb6fb39df4932

public class MainActivity extends Activity {

    Activity activity = this;
    private ImageView miaImmagine;
    Button tastoCentrale;

View.OnClickListener changeBtnListener = new View.OnClickListener() {
    public void onClick(View view) {
        Intent intent = new Intent(activity, second_activity.class);
        startActivity(intent);
    }
};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miaImmagine = (ImageView) findViewById(R.id.img);
        //miaImmagine.setImageResource(R.drawable.img);

        tastoCentrale = (Button)findViewById(R.id.button);
        tastoCentrale.setOnClickListener(changeBtnListener);
    }
}
