package com.chungduc.ute.apptong_lan3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ThongBao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_bao);
        BottomNavigationView bottomNavigationView_409 =findViewById(R.id.bottom_nav);
        bottomNavigationView_409.setSelectedItemId(R.id.thongbao);
        bottomNavigationView_409.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), HomePage.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.oder:
                        startActivity(new Intent(getApplicationContext(), DonHang.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.thietbi:
                        startActivity(new Intent(getApplicationContext(), ThietBi.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.thongbao:
                        return  true;

                    case R.id.account:
                        startActivity(new Intent(getApplicationContext(), Account.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }

        });
    }
}