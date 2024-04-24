package com.example.exp1;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.tv_btn);
        TextView text = findViewById(R.id.tv_text);
        EditText editText = findViewById(R.id.tv_et);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t = editText.getText().toString();
                text.setText("Hello, " + t);
            }
        });
    }
}