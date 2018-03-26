package extopoint.suganya.youtubeplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity  {

    private Button playlist;
    private Button trending;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        
        playlist=(Button)findViewById(R.id.butnplaylist);
        trending=(Button)findViewById(R.id.butntrending);


        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,YoutubeActivity.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "You are been redirected to the Playlist", Toast.LENGTH_LONG).show();
            }
        });

        trending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,StandaloneActivity.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Trending Videos", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void setSupportActionBar(Toolbar toolbar) {

    }
}
