package com.example.hungercarebyariszafathurrahman;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class WhyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_why);

        View ghi = findViewById(R.id.ghi);
        View lihatKom = findViewById(R.id.lihatKom);
        View backWhy = findViewById(R.id.backWhy);

        backWhy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        ghi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.globalhungerindex.org/ranking.html"));
                startActivity(intent);
            }
        });

        lihatKom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WhyActivity.this,ComActivity.class);
                startActivity(intent);
            }
        });

    }

}
