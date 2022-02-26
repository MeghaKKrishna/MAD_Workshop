package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main3Activity extends AppCompatActivity {
VideoView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        v=(VideoView)findViewById(R.id.vw);
        MediaController m=new MediaController(this);
        m.setAnchorView(v);
        Uri uri=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);
        v.setMediaController(m);
        v.setVideoURI(uri);
        v.requestFocus();
        v.start();
    }
}
