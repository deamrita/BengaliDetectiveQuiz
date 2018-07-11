package com.example.amrita.bengalidetectivequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private static Button button_mog;
    private static Button button_sat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        OnClickButtonListener();
    }
    public void OnClickButtonListener(){
        button_mog=(Button)findViewById(R.id.button2);
        button_sat=(Button)findViewById(R.id.button3);
        button_mog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1=new Intent(SecondActivity.this,FeludaActivity1.class);
                        startActivity(intent1);
                    }
                }
        );
        button_sat.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent2=new Intent(SecondActivity.this,BomkeshActivity1.class);
                        startActivity(intent2);
                    }
                }
        );
    }
}
