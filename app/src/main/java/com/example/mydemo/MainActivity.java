package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView qualityText,allSeedsText;
ImageView qualityImage,allSeedsImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qualityImage=findViewById(R.id.qualityimage);
        qualityText=findViewById(R.id.qualitytext);
        allSeedsImage=findViewById(R.id.allseedsimage);
        allSeedsText= findViewById(R.id.allseedstext);
        allSeedsImage.setOnClickListener(v->{
            Intent intent=new Intent(MainActivity.this,AllSeeds.class);
            startActivity(intent);

        });
        allSeedsText.setOnClickListener(v->{   Intent intent=new Intent(MainActivity.this,AllSeeds.class);
            startActivity(intent);});

    }
}
