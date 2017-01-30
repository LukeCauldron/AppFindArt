package kaldorenzo.it.appfindart;

/**
 * Created by dilomede on 27/01/17.
 */
        import org.json.JSONArray;
        import org.json.JSONException;
        import org.json.JSONObject;

        import java.util.ArrayList;

/**
 * Created by amine on 27/01/17.
 */
public class Songs {

    private String nome;
    private String duration;
    private String year;


    public Songs(){}
    public Songs(JSONObject songsJson) {
        try {
            nome = songsJson.getString("name");
            duration = songsJson.getString("durata");
            year = songsJson.getString("anno");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public static ArrayList<Songs> getSongsListFromJson(JSONArray jsonArray){
        ArrayList<Songs> songs = new ArrayList<>();
        for (int i = 0; i<jsonArray.length();i++) {
            try {
                JSONObject songsJson = jsonArray.getJSONObject(i);
                songs.add(new Songs(songsJson));
            } catch (JSONException e) {
                e.printStackTrace();
            }


        }
        return songs;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



}