package com.example.amrita.bengalidetectivequiz;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.media.MediaPlayer;
import static com.example.amrita.bengalidetectivequiz.FeludaActivity1.bkgrdmsc;
import static com.example.amrita.bengalidetectivequiz.FeludaActivity1.score;

public class FeludaResultActivity extends AppCompatActivity {
    private Button bca;
    private Button bpa;
    private Button back;
    private TextView scores;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feluda_result);
        scores=(TextView)findViewById(R.id.textView4);
        scores.setText(Integer.toString(score));
        onClickButtonListener();

    }


    public void onClickButtonListener(){
        bca=(Button)findViewById(R.id.button5);
        bpa=(Button)findViewById(R.id.button6);
        back=(Button)findViewById(R.id.button7);
        bca.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(FeludaResultActivity.this,FeludaAnswerActivity.class);
                        startActivity(intent);
                    }
                }
        );
        bpa.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        score=0;
                        Intent intent=new Intent(FeludaResultActivity.this,SecondActivity.class);
                        startActivity(intent);
                        bkgrdmsc.stop();
                    }
                }
        );
        back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        score=0;
                        Intent intent=new Intent(FeludaResultActivity.this,MainActivity.class);
                        startActivity(intent);
                        bkgrdmsc.stop();
                    }
                }
        );
    }

}
