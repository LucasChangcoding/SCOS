package es.source.code.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SCOSEntry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entry);
    }
    public void tomainscreen(View view){
        Intent intent = new Intent(SCOSEntry.this,MainScreen.class);
        startActivity(intent);
    }
}
