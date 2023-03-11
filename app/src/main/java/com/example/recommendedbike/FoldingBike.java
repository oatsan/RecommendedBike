package com.example.recommendedbike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class FoldingBike extends AppCompatActivity {

    //step1
    ImageButton myBTColourGray,myBTColourBlue,myBTLazada2,myBTShopee2,myBTBack2;
    ImageView myimageViewFoldingBicycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folding_bike);
        //step2
        myBTColourBlue = findViewById(R.id.BTColourBlue);
        myBTColourGray = findViewById(R.id.BTColourGray);
        myBTLazada2 = findViewById(R.id.BTLazada2);
        myBTShopee2 = findViewById(R.id.BTShopee2);
        myBTBack2 = findViewById(R.id.BTBack2);
        myimageViewFoldingBicycle = findViewById(R.id.imageViewFoldingBicycle);


        //for lazada link
        myBTLazada2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String LazadaLink = "https://www.lazada.co.th/products/trinx-dolphin-10-20175-shimano-7-i2900034370-s15602376185.html?";
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(LazadaLink ));
                startActivity(myIntent);
            }
        });

        //for shopee link
        myBTShopee2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ShopeeLink = "https://shopee.co.th/TRINX-DOLPHIN-1.0(%E0%B8%AA%E0%B9%88%E0%B8%87%E0%B8%9F%E0%B8%A3%E0%B8%B5-%E0%B8%9C%E0%B9%88%E0%B8%AD%E0%B8%990-)-%E0%B8%88%E0%B8%B1%E0%B8%81%E0%B8%A3%E0%B8%A2%E0%B8%B2%E0%B8%99%E0%B8%9E%E0%B8%B1%E0%B8%9A%E0%B9%84%E0%B8%94%E0%B9%89-%E0%B8%A5%E0%B9%89%E0%B8%AD-20%C3%971.75-%E0%B8%99%E0%B8%B4%E0%B9%89%E0%B8%A7-%E0%B9%80%E0%B8%81%E0%B8%B5%E0%B8%A2%E0%B8%A3%E0%B9%8C-SHIMANO-7-%E0%B8%AA%E0%B8%9B%E0%B8%B5%E0%B8%94-%E0%B8%94%E0%B8%B4%E0%B8%AA%E0%B8%81%E0%B9%8C%E0%B9%80%E0%B8%9A%E0%B8%A3%E0%B8%84-%E0%B8%94%E0%B8%B8%E0%B8%A1%E0%B9%81%E0%B8%9A%E0%B8%A3%E0%B8%B4%E0%B9%88%E0%B8%87-%E0%B9%80%E0%B8%9F%E0%B8%A3%E0%B8%A1%E0%B9%80%E0%B8%AB%E0%B8%A5%E0%B9%87%E0%B8%81-i.65800974.4943352686?sp_atk=c9148c58-98f6-498a-9ff4-4f8d11c94c0b&xptdk=c9148c58-98f6-498a-9ff4-4f8d11c94c0b";
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(ShopeeLink));
                startActivity(myIntent);
            }
        });

        // for back button
        myBTBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(myIntent);
            }
        });
        //for choose colour of bicycle
        myBTColourBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myimageViewFoldingBicycle.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.bicyclefoldingtrinxdolphonblue));
            }
        });
        myBTColourGray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myimageViewFoldingBicycle.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.bicyclefoldingtrinxdolphongrey));
            }
        });

    }
}