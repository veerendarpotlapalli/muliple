    package com.example.multiple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


    public class MainActivity3 extends AppCompatActivity {
    private TextView a;
    private Button z,x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().setTitle("ragnaar lothbroke");
        z=findViewById(R.id.esc);
        x=findViewById(R.id.escape);
    }
    public void hai(View view){
        TextView txt=(TextView) findViewById(R.id.textView3);
        txt.setText("hello");

    }
    public void haa(View view){
        TextView axt=(TextView) findViewById(R.id.textView4);
        axt.setText("poraa");
    }
    public void hmm(View view){
        startActivity(new Intent(this,MainActivity4.class));
    }

}