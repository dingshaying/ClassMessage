package com.example.classmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class ClassActivity extends AppCompatActivity {
    private TextView tvName;
    private ImageButton btnMessage;
    private ImageButton btnTools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);

        Intent intent = getIntent();
        tvName = findViewById(R.id.tv_name);
        tvName.setText(intent.getStringExtra("username"));


        btnMessage=findViewById(R.id.btn_message);
        btnTools = findViewById(R.id.btn_tools);

        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClassActivity.this,ChooseActivity.class);
                startActivity(intent);
            }
        });
    }
}
