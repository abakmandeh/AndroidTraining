package com.rimbolapeh.trainingindocyberandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btn_login;
    EditText et_userName, et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_userName = (EditText) findViewById(R.id.et_userName);
        et_password = (EditText) findViewById(R.id.et_password);
        btn_login = (Button) findViewById(R.id.btn_login);

        //setOnClickListener berfungsiutk memberi aksi
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (et_userName.getText().toString().equals("") && et_password.getText().toString().equals("")){
                    Toast.makeText(LoginActivity.this, "Harap isi Username dan Password", Toast.LENGTH_SHORT).show();
                } else {
                    //startActivity berfungsi utk berpindah halaman
                    startActivity(new Intent(LoginActivity.this, RegisterActivity.class));

                    finish();//finish berfungsi utk destroy aplikasi

                    Toast.makeText(LoginActivity.this, "Selamat anda berhasil login", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
