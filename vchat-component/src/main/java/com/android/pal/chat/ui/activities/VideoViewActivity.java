package com.android.pal.chat.ui.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

import com.android.pal.chat.R;
import com.android.pal.chat.base.BaseActivity;


/**
 * Created by vijay on 4/1/18.
 */

public class VideoViewActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);
        VideoView videoView = (VideoView) findViewById(R.id.video_view);
        Intent intent = getIntent();
        if (intent != null) {
            videoView.setVideoURI(Uri.parse(intent.getStringExtra("uri")));
            MediaController mediaController = new
                    MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
        }
    }
}
