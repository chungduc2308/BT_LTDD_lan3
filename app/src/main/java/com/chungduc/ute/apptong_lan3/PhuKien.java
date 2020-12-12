package com.chungduc.ute.apptong_lan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

public class PhuKien extends AppCompatActivity {
    GridView gridView_409;
    ImageView imageView_409;
    String [] phukien_409 ={"Van nạp ga Tasco TA166Za", "Phin lọc khử mùi Daikin....","Dụng cụ loe ống đồng...",
            "Đồng hồ áp suất","Van nạp ga Tasco TA166Za", "Phin lọc khử mùi Daikin....","Dụng cụ loe ống đồng..."};
    int [] img_phukien_409 ={R.drawable.tintuc_1,R.drawable.tintuc_2,R.drawable.tintuc_3,R.drawable.tintuc_4
    ,R.drawable.tintuc_1,R.drawable.tintuc_2,R.drawable.tintuc_3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phu_kien);
        gridView_409 = findViewById(R.id.grid);
        PhuKienAdapter phuKienAdapter = new PhuKienAdapter(this, phukien_409, img_phukien_409);
        gridView_409.setAdapter(phuKienAdapter);
    }
}