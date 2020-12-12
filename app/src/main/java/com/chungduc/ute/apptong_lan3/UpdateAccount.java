package com.chungduc.ute.apptong_lan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UpdateAccount extends AppCompatActivity {
    Button bt1_409;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_account);
        bt1_409 = findViewById(R.id.bt_tt);
        bt1_409.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UpdateAccount.this,HomePage.class);
                startActivity(i);
            }
        });

    }
}