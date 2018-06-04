package com.example.smart_00.myapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    MediaPlayer mPlayer1, mPlayer2, mPlayer3,mPlayer4, mPlayer5, mPlayer6,mPlayer7, mPlayer8;
    Button d, re, mi, fa, sol, ra, si, dh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("MP3 플레이어");
        mPlayer1 = MediaPlayer.create(MainActivity2.this, R.raw.d);
        mPlayer1.setLooping(false);
        mPlayer2 = MediaPlayer.create(MainActivity2.this, R.raw.re);
        mPlayer2.setLooping(false);
        mPlayer3 = MediaPlayer.create(MainActivity2.this, R.raw.mi);
        mPlayer3.setLooping(false);

        //btn 찾기
        d=(Button) findViewById(R.id.button1);
        re=(Button) findViewById(R.id.button2);
        mi=(Button) findViewById(R.id.button3);

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mPlayer1.isPlaying()){
                    mPlayer1.pause();
                } else {
                    mPlayer1.start();
                }
            }
        });
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mPlayer2.isPlaying()){
                    mPlayer2.pause();
                } else {
                    mPlayer2.start();
                }
            }
        });
        mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mPlayer3.isPlaying()){
                    mPlayer3.pause();
                } else {
                    mPlayer3.start();
                }
            }
        });
    }
}
