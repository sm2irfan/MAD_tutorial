package com.example.using_strings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView2 = findViewById(R.id.tvMsg2);
        textView2.setText(R.string.Msg2);

        Log.i("Lifecycle","OnCreate() invoked....");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle","onStart called...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle","onResume called...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle","onPause called...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle","onStop called...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle","onDestroy called...");
    }
}