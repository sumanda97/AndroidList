package com.dicoding.picodiploma.buku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        grabIntent();
    }

    private void grabIntent() {
        String item_name = getIntent().getStringExtra("name");
        String item_detail = getIntent().getStringExtra("detail");
        int item_photo = getIntent().getIntExtra("photo",0);

        TextView name = findViewById(R.id.name);
        TextView detail = findViewById(R.id.detail);
        ImageView photo = findViewById(R.id.photo);

        name.setText(item_name);
        detail.setText(item_detail);

        Glide.with(this)
                .load(item_photo)
                .apply(new RequestOptions().override(550,550))
                .into(photo);
    }
}
