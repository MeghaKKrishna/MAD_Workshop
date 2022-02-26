package com.example.contextmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btnshow);
        registerForContextMenu(btn);
    }
    public void onCreateContextMenu(ContextMenu menu,View v,ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.setHeaderTitle("Context Menu");
        menu.add(0,v.getId(),0,"Upload");
        menu.add(0,v.getId(),0,"Search");
        menu.add(0,v.getId(),0,"View");
    }
    public boolean onContextItemSelected(MenuItem item){
        Toast.makeText(this, "Selected Item:"+item.getTitle(), Toast.LENGTH_SHORT).show();
        return true;
    }
}

//    <?xml version="1.0" encoding="utf-8"?>
//<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
//        xmlns:app="http://schemas.android.com/apk/res-auto"
//        xmlns:tools="http://schemas.android.com/tools"
//        android:layout_width="match_parent"
//        android:layout_height="match_parent"
//        tools:context=".MainActivity">
//
//
//<Button
//        android:layout_width="wrap_content"
//                android:layout_height="wrap_content"
//                android:text="Long Press Me"
//                android:id="@+id/btnshow"/>
//
//</LinearLayout>
