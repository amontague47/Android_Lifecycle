package com.example.mm98800.myapplication2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        String userName = getIntent().getStringExtra(MainActivity.MAIN_ACTIVITY_EXTRA);

        TextView textView = findViewById(R.id.displayUserName);
        textView.setText(String.format(getString(R.string.greeting), userName));
    }
}
