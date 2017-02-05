package kaldorenzo.it.appfindart;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by luke on 2/4/17.
 */

// la Fourth mostra l'esito della comparazione all'utente

public class FourthActivity extends Activity {

    String EIU = getIntent().getStringExtra("EXTRA_IMAGEVIEW_URL");
    int imghldr_url = Integer.parseInt(EIU);
    //qua và dichiarazione e instanziamento delle var che permettono l'assoc. del ritrovamento del
    // DB alla imgHolderDB
    private ImageView imgHolder;
    private ImageView imgHolderDB;
    private TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        imgHolder.setImageResource(imghldr_url);
        imgHolder = (ImageView)findViewById(R.id.compPhoto);
        //qua và l'istruzione che assegna l'immagine matchata del db all'imgHolderDB
        imgHolderDB = (ImageView)findViewById(R.id.dbPhoto);



    }
}
