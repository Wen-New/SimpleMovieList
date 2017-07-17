package sg.edu.rp.c346.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMovie;
    ArrayList<String> alMovieList;
    ArrayAdapter<String> aaMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMovie = (ListView) findViewById(R.id.listViewMovie);
        alMovieList = new ArrayList<String>();
        aaMovie = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alMovieList);
        lvMovie.setAdapter(aaMovie);
        alMovieList.add("War for the Planet of the Apes. A 2017 sequel of the Planet of the Apes science fiction franchise by French author Pierre Boulle's");
        alMovieList.add("King Kong. Movie about a giant ape, created by American filmmaker  Merian C. Cooper that first appear in 1930s.");
    }
}
