package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public boolean onCreateOptionsMenu(Menu menu)//Connection of menu_example.xml to this page
    {
        getMenuInflater().inflate(R.menu.menu_example,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "Selected Item: " + item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()) {//Giving cases for each menu
            case R.id.search:
                //do the code
                return true;
            case R.id.copy:
                //do the code
                return true;
            case R.id.bookmark:
                //do the code
                return true;
            case R.id.Print:
                //do the code
                return true;
            case R.id.upload:
                //do the code
                return true;
            case R.id.Share:
                //do the code
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
