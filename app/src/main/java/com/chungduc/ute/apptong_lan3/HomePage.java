package com.chungduc.ute.apptong_lan3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends AppCompatActivity {
    GridView gridView_409;
    ViewFlipper viewFliper_409;
    String [] tintuc_409 ={"Trải nghiệm dịch vụ bảo trì của DaiKin", "[VNReview] Trải nghiệm dịch vụ...","Mua máy lạnh từ E-Shop của Daikin","Máy lạnh 15 củ có gì hot"};
    int [] img_tintuc_409 ={R.drawable.tintuc_1,R.drawable.tintuc_2,R.drawable.tintuc_3,R.drawable.tintuc_4};
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        int [] img_km_409 = {R.drawable.km_daikin_1,R.drawable.km_daikin_2,R.drawable.km_daikin_3,R.drawable.km_daikin_4};
         viewFliper_409 = findViewById(R.id.filip_409);

         for(int image: img_km_409)
         {
             filperImage(image);
         }
        gridView_409 = findViewById(R.id.grid);
        TinTuc_Adapter tinTuc_adapter =new TinTuc_Adapter(this,tintuc_409,img_tintuc_409);
        gridView_409.setAdapter(tinTuc_adapter);
        BottomNavigationView bottomNavigationView_409 =findViewById(R.id.bottom_nav);
        bottomNavigationView_409.setSelectedItemId(R.id.home);
        bottomNavigationView_409.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
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
                        startActivity(new Intent(getApplicationContext(), ThongBao.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.account:
                        startActivity(new Intent(getApplicationContext(), Account.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }

        });

    }

    public void filperImage(int image_409){
        ImageView img_409 = new ImageView(this);
        img_409.setBackgroundResource(image_409);
        viewFliper_409.addView(img_409);
        viewFliper_409.setFlipInterval(3000);
        viewFliper_409.setAutoStart(true);
        viewFliper_409.setInAnimation(this, android.R.anim.slide_in_left);
    }
}