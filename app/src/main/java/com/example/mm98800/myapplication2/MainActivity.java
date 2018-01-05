package com.example.mm98800.myapplication2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    public static final String TAG = MainActivity.class.getSimpleName();
    public static final String MAIN_ACTIVITY_EXTRA = "user";

    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate");

        textView = findViewById(R.id.text_view);
        editText = findViewById(R.id.edit_text);

        Button helloButton = findViewById(R.id.change_text_button);
        helloButton.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                    sayHello(v);
               }
        });

        if (savedInstanceState != null){
            textView.setText(savedInstanceState.getString("greeting"));
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("greeting", textView.getText().toString());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    public void sayHello(View v) {
        String name = editText.getText().toString();
        textView.setText("Hello " + name +"!");
        Intent intent = new Intent(this, WelcomeActivity.class);
        intent.putExtra(MAIN_ACTIVITY_EXTRA, name);
        startActivity(intent);
    }
}
