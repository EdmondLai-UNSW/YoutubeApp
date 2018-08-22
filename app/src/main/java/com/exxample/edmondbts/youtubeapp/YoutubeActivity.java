package com.exxample.edmondbts.youtubeapp;


import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class YoutubeActivity extends YouTubeBaseActivity
implements YouTubePlayer.OnInitializedListener {
static final String GOOGLE_API_KEY = "AIzaSyB7I3e_h7UMrtYo7uv7f0jl03ERYXNH-sA";
static final String YOUTUBE_VIDEO_ID = "7C2z4GqqS5E";
static final String YOUTUBE_PLAYLIST = "PLT4TAmCUcB9mcLdyy02ubnqVP7j6-J_bp";
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConstraintLayout layout = (ConstraintLayout) getLayoutInflater().inflate(R.layout.activity_youtube,null);
        setContentView(layout);
        //       // setContentView(R.layout.activity_youtube);
       // ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.activity_youtube);
        //Button btn = new Button(this);
        //btn.setLayoutParams(new ConstraintLayout.LayoutParams(300,80));
        //btn.setText("Button added");
        //layout.addView(btn);
        YouTubePlayerView playerView = new YouTubePlayerView(this);
        playerView.setLayoutParams(new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
      layout.addView(playerView);
  playerView.initialize(GOOGLE_API_KEY,this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
