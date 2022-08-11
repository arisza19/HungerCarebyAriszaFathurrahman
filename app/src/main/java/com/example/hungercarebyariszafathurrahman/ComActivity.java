package com.example.hungercarebyariszafathurrahman;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

/*

    Created by Arisza Zufar Fathurrahman
    10119237
    IF6

*/

public class ComActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com);

        View cardComOne = findViewById(R.id.cardComOne);
        View cardComTwo = findViewById(R.id.cardComTwo);
        View cardComThree = findViewById(R.id.cardComThree);

        View backCom = findViewById(R.id.backCom);
        backCom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        cardComOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/faoindonesia/"));
                startActivity(intent);
            }
        });

        cardComTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/cta.indonesia/"));
                startActivity(intent);
            }
        });

        cardComThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/sebung_bdg/"));
                startActivity(intent);
            }
        });

    }

}
