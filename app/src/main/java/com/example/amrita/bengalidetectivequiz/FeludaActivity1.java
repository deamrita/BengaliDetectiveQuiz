package com.example.amrita.bengalidetectivequiz;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.media.MediaPlayer;

public class FeludaActivity1 extends AppCompatActivity {
    public static MediaPlayer bkgrdmsc;
    private static Button button_skip;
    private static Button b1;
    private static Button b2;
    private static Button b3;
    public static int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feluda1);
        onClickListenerButton();

        bkgrdmsc=MediaPlayer.create(FeludaActivity1.this,R.raw.ftheme);
        bkgrdmsc.setLooping(true);
        bkgrdmsc.start();
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
                        Intent intent=new Intent(FeludaActivity1.this,FeludaActivity2.class);
                        startActivity(intent);
                    }
                }
        );
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(FeludaActivity1.this,FeludaActivity2.class);
                        startActivity(intent);
                    }
                }
        );
        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        score=score+10;
                        Intent intent=new Intent(FeludaActivity1.this,FeludaActivity2.class);
                        startActivity(intent);
                    }
                }
        );
        b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(FeludaActivity1.this,FeludaActivity2.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
