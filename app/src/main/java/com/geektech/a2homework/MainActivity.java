package com.geektech.a2homework;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
Button button;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.calculator);
        textView=findViewById(R.id.antwort);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,SecondActivity.class);
               startActivity(intent);
               finish();
            }
        });
    }


    public void getAnswer(View view) {
        Intent intent1=getIntent();
        if(intent1!=null){
            String text=intent1.getStringExtra("result_key");
            if(text!=null){
                textView.setText(text);
            }
        }
    }
}
