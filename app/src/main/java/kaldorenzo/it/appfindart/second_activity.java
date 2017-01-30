package kaldorenzo.it.appfindart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class second_activity extends AppCompatActivity {

    RecyclerView songRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);

        songRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
    }
}
