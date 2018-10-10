package es.source.code.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainScreen extends AppCompatActivity{

    //@SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen_layout);
    }

    public void ClickBtn_3(View v){
        Intent intent = new Intent(MainScreen.this,OrderListActivity.class);
        startActivity(intent);
    }

    public void ClickBtn_2(View v){
        Intent intent = new Intent(MainScreen.this,OrderActivity.class);
        startActivity(intent);
    }
}
