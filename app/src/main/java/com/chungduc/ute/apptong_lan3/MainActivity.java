package com.chungduc.ute.apptong_lan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.chungduc.ute.apptong_lan3.R;

public class MainActivity extends AppCompatActivity {
    Button bt_tt_12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1 = findViewById(R.id.textView5_12);
        textView1.setPaintFlags(textView1.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        bt_tt_12 = findViewById(R.id.bt_tieptuc_12);
        bt_tt_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tieptuc =new Intent(MainActivity.this, VerificationCode.class);
                startActivity(tieptuc);
            }
        });
    }
}