package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.btn1);
        e1=(EditText)findViewById(R.id.et1);
        e2=(EditText)findViewById(R.id.et2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("admin") && e2.getText().toString().equals("12345"))
                {
                    Intent i=new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(i);
                }
            }
        });
    }
}

//Create a login page ang go to another page with 4 options media player,Toast,alertbox,Videoplayer
