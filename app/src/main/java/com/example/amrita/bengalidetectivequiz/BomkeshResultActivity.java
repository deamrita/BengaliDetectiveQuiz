package com.example.amrita.bengalidetectivequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.amrita.bengalidetectivequiz.BomkeshActivity1.bkgrdmsc1;
import static com.example.amrita.bengalidetectivequiz.BomkeshActivity1.score1;
import static com.example.amrita.bengalidetectivequiz.FeludaActivity1.score;

public class BomkeshResultActivity extends AppCompatActivity {
    private Button bca;
    private Button bpa;
    private Button back;
    private TextView scores1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bomkesh_result);
        scores1=(TextView)findViewById(R.id.textView4);
        scores1.setText(Integer.toString(score1));
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
                        Intent intent=new Intent(BomkeshResultActivity.this,BomkeshAnswerActivity.class);
                        startActivity(intent);
                    }
                }
        );
        bpa.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        score1=0;
                        Intent intent=new Intent(BomkeshResultActivity.this,SecondActivity.class);
                        startActivity(intent);
                        bkgrdmsc1.stop();
                    }
                }
        );
        back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        score1=0;
                        Intent intent=new Intent(BomkeshResultActivity.this,MainActivity.class);
                        startActivity(intent);
                        bkgrdmsc1.stop();
                    }
                }
        );
    }

}
