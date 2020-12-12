package com.chungduc.ute.apptong_lan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chungduc.ute.apptong_lan3.R;

import java.util.ArrayList;
import java.util.List;

import com.chungduc.ute.apptong_lan3.Contact;

public class AccountAdapter extends ArrayAdapter {
    private Context context_409;
    private int resource_409;
    private ArrayList<Contact> contactArrayList_409;
    public AccountAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context_409 = context;
        this.resource_409 = resource;
        this.contactArrayList_409 = (ArrayList<Contact>) objects;

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context_409).inflate(R.layout.row_item_taikhoan, parent, false);
        TextView tv_icon_409 = convertView.findViewById(R.id.tv_icon);
        TextView tv_item_taikhoan_409 = convertView.findViewById(R.id.tv_item_taikhoan);
        Contact contact_409 = contactArrayList_409.get(position);
        tv_icon_409.setBackgroundResource(contact_409.getIcon());
        tv_item_taikhoan_409.setText(contact_409.getName());
        return convertView;
    }
}
