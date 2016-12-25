package com.introtoandroid.simplescrolling;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class NoScrollActivity extends AppCompatActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("No Scrolling");
        setContentView(R.layout.noscroll);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}