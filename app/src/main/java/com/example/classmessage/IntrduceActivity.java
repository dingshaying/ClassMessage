package com.example.classmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IntrduceActivity extends AppCompatActivity {
    private TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intrduce);
        tvText = findViewById(R.id.tv_text);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String name = bundle.getString("text");
        tvText.setText(name);
    }
}
