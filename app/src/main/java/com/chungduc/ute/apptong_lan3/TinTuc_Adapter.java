package com.chungduc.ute.apptong_lan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TinTuc_Adapter extends BaseAdapter {
    private Context context_409;
    private String[] title_409;
    private int[] image_row_409;

    public TinTuc_Adapter(Context context_409, String[] title_409, int[] image_row_409) {
        this.context_409 = context_409;
        this.title_409 = title_409;
        this.image_row_409 = image_row_409;
    }

    @Override
    public int getCount() {
        return title_409.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater_409 = (LayoutInflater) context_409.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view =layoutInflater_409.inflate(R.layout.tintuc_row, null);
        TextView textView_409 = view.findViewById(R.id.txv_noidung);
        ImageView imageView_409 =view.findViewById(R.id.img_tintuc);
        textView_409.setText(title_409[i]);
        imageView_409.setImageResource(image_row_409[i]);
        return view;
    }
}
