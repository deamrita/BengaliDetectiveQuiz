package com.example.amrita.bengalidetectivequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;

public class BomkeshActivity1 extends AppCompatActivity {
    public static MediaPlayer bkgrdmsc1;
    private static Button button_skip;
    private static Button b1;
    private static Button b2;
    private static Button b3;
    public static int score1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bomkesh1);
        onClickListenerButton();

        bkgrdmsc1=MediaPlayer.create(BomkeshActivity1.this,R.raw.btheme);
        bkgrdmsc1.setLooping(true);
        bkgrdmsc1.start();
    }
    public void onClickListenerButton(){
        button_skip=(Button)findViewById(R.id.button4);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        button_skip.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(BomkeshActivity1.this,BomkeshActivity2.class);
                        startActivity(intent);
                    }
                }
        );
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        score1=score1+10;
                        Intent intent=new Intent(BomkeshActivity1.this,BomkeshActivity2.class);
                        startActivity(intent);
                    }
                }
        );
        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(BomkeshActivity1.this,BomkeshActivity2.class);
                        startActivity(intent);
                    }
                }
        );
        b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(BomkeshActivity1.this,BomkeshActivity2.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
