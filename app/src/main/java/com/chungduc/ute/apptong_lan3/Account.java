package com.chungduc.ute.apptong_lan3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Account extends AppCompatActivity {
    private ListView listView_409;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        listView_409 = findViewById(R.id.list_taikhoan);
        ArrayList<Contact> contactArrayList_409 = new ArrayList<>();
        Contact contact_409 = new Contact(R.drawable.setting,"Cài đặt");
        Contact contact_409_1 = new Contact(R.drawable.help,"Câu hỏi thường gặp");
        Contact contact_409_2 = new Contact(R.drawable.phanhoi,"Gửi phản hồi");
        Contact contact_409_3 = new Contact(R.drawable.account,"Trung tâm hỗ trợ");
        Contact contact_409_4 = new Contact(R.drawable.bell,"Thông tin hỗ trợ");

        contactArrayList_409.add(contact_409);
        contactArrayList_409.add(contact_409_1);
        contactArrayList_409.add(contact_409_2);
        contactArrayList_409.add(contact_409_3);
        contactArrayList_409.add(contact_409_4);
        listView_409.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 2){
                    Intent intent = new Intent(view.getContext(), PhanHoi.class);
                    startActivity(intent);
                }
            }
        });
        AccountAdapter accountAdapter_409 = new AccountAdapter(this, R.layout.row_item_taikhoan, contactArrayList_409);
        listView_409.setAdapter(accountAdapter_409);
        BottomNavigationView bottomNavigationView_409 =findViewById(R.id.bottom_nav);
        bottomNavigationView_409.setSelectedItemId(R.id.account);
        bottomNavigationView_409.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), HomePage.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.oder:
                        return true;
                    case R.id.thietbi:
                        startActivity(new Intent(getApplicationContext(), ThietBi.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.thongbao:
                        startActivity(new Intent(getApplicationContext(), ThongBao.class));
                        overridePendingTransition(0,0);
                        return  true;

                    case R.id.account:
                        return true;
                }
                return false;
            }

        });

    }
}