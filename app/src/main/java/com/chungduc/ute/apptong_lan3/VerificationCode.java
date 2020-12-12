package com.chungduc.ute.apptong_lan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VerificationCode extends AppCompatActivity {
    Button bt1_409;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_code);
        bt1_409 = findViewById(R.id.button_tieptuc_verification_12);
        bt1_409.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(VerificationCode.this,UpdateAccount.class);
                startActivity(i);
            }
        });
    }
}