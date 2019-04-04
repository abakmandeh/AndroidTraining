package com.rimbolapeh.trainingindocyberandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    Button btn_kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btn_kembali = (Button) findViewById(R.id.btn_kembali);

        //setOnClickListener berfungsiutk memberi aksi
        btn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity berfungsi utk berpindah halaman
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                finish();//finish berfungsi utk destroy aplikasi
            }
        });
    }
}
