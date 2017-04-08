package com.example.mahika.smart_backpack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void list(View view){
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }

    public void location(View view){
        Intent intent = new Intent(this, LocationActivity.class);
        startActivity(intent);
    }
    public void autolock(View view){
        Intent intent = new Intent(this, AutolockActivity.class);
        startActivity(intent);
    }
}
