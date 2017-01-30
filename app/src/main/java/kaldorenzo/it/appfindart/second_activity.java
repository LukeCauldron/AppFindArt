package kaldorenzo.it.appfindart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class second_activity extends AppCompatActivity {

    RecyclerView songRecyclerView;
    RecyclerView.LayoutManager layoutManager;
    SongAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);

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
        s1.setNome("Innuendo");
        s1.setDuration("6'20''");
        s1.setYear("1990");
        Songs s3 = new Songs();
        s1.setNome("Sarà perché ti amo");
        s1.setDuration("3'30''");
        s1.setYear("1921");

        albumSongs.add(s1);
        albumSongs.add(s2);
        albumSongs.add(s3);

        adapter.setDataSet(albumSongs);
    }
}
