package com.example.classmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;
    private Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);

        btnLogin = findViewById(R.id.btn_login);
        btnExit = findViewById(R.id.btn_exit);

        Intent intent = getIntent();
        if (intent != null){
            String name = intent.getStringExtra("username");
            etUsername.setText(name);
        }


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                if (username.equals("")||password.equals("")){
                    Toast.makeText(MainActivity.this,"账号或密码不能为空",Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(MainActivity.this,ClassActivity.class);
                    String usernamer1 = etUsername.getText().toString().trim();
                    intent.putExtra("username","欢迎"+usernamer1+"来到您的空间");
                    startActivity(intent);
                }
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
