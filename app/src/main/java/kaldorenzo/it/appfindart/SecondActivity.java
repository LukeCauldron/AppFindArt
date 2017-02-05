package kaldorenzo.it.appfindart;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

// la Second mostra la RecyclerView delle canzoni , al momento una prova, poi dal DB dopo la comparazione

public class SecondActivity extends Activity {

    RecyclerView songRecyclerView;
    RecyclerView.LayoutManager layoutManager;
    SongAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        songRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(this);
        adapter = new SongAdapter();

        songRecyclerView.setLayoutManager(layoutManager);
        songRecyclerView.setAdapter(adapter);
        fetchSongs();
    }


    private void fetchSongs(){
        ArrayList<Songs> albumSongs = new ArrayList<>();
        Songs s1 = new Songs();
        s1.setNome("Bohemian rhapsody");
        s1.setDuration("5'58''");
        s1.setYear("1975");
        Songs s2 = new Songs();
        s2.setNome("Innuendo");
        s2.setDuration("6'20''");
        s2.setYear("1990");
        Songs s3 = new Songs();
        s3.setNome("The show must go on");
        s3.setDuration("4'30''");
        s3.setYear("1990");

        albumSongs.add(s1);
        albumSongs.add(s2);
        albumSongs.add(s3);

        adapter.setDataSet(albumSongs);
    }
}
