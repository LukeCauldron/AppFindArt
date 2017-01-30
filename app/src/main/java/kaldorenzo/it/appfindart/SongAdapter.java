package kaldorenzo.it.appfindart;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by dilomede on 27/01/17.
 */

public class SongAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<Songs> dataSet;

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_song,parent,false);
        SongViewHolder holder = new SongViewHolder(v);
        return holder;


    }

}
