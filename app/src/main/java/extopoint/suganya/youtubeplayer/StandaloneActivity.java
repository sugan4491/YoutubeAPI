package extopoint.suganya.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandaloneActivity extends AppCompatActivity {

    private Button playvideo;
    private Button next;

    private String GOOGLE_API_KEY="AIzaSyBZVbNSsdQZCX_yWFCHPQ_fQMcK4xf9hDk";
    private String YOUTUBE_VIDEO_ID="EknEIzswvC0";
    private String YOUTUBE_PLAYLIST_ID="PLS1QulWo1RIbb1cYyzZpLFCKvdYV_yJ-E";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        playvideo=(Button)findViewById(R.id.btnplayvideo);
        next=(Button)findViewById(R.id.btnnext);

        playvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(StandaloneActivity.this, "Toast for PlayVideo", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(YouTubeStandalonePlayer.createVideoIntent(StandaloneActivity.this,GOOGLE_API_KEY,YOUTUBE_VIDEO_ID));
                startActivity(i);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(StandaloneActivity.this, "Toast for Next", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(YouTubeStandalonePlayer.createPlaylistIntent(StandaloneActivity.this,GOOGLE_API_KEY,YOUTUBE_PLAYLIST_ID));
                startActivity(i);

            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }



}
