package com.example.multiple;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.*;

public class MainActivity4 extends AppCompatActivity {
    private TextView sss;

    

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getSupportActionBar().setTitle("menu");
             /* //g=findViewById(R.id.chips);
            //  u=findViewById(R.id.textView5);
              TextView hh=(TextView) findViewById(R.id.textView5);
                hh.setText("veerendar potlapalli" +
                        " he is having a great power" +
                        " okay then bye");*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.item0:
                Toast.makeText(this,"veerendar",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item1:
                Toast.makeText(this,"ragnaar lothboke",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this,"veeru bhai",Toast.LENGTH_SHORT).show();
                return true;
           // case R.id.item3:
               // Toast.makeText(this,"vamshi",Toast.LENGTH_SHORT).show();
                //return true;
            case R.id.subitem1:
                Toast.makeText(this,"potlapalli",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem2:
                Toast.makeText(this,"veeren",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem3:
                Toast.makeText(this,"strong",Toast.LENGTH_SHORT).show();
                return true;

            default: return super.onOptionsItemSelected(item);
        }
    }
    public void avnaa(View view) {
        sss.setText("\n veerendar potlapalli");
    }
}