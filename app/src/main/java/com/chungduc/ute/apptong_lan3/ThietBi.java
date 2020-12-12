package com.chungduc.ute.apptong_lan3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ThietBi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thiet_bi);

        BottomNavigationView bottomNavigationView_409 =findViewById(R.id.bottom_nav);
        bottomNavigationView_409.setSelectedItemId(R.id.thietbi);
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

                        return true;
                    case R.id.thongbao:
                        startActivity(new Intent(getApplicationContext(), ThongBao.class));
                        overridePendingTransition(0,0);
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