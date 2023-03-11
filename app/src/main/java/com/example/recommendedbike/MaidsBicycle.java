package com.example.recommendedbike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MaidsBicycle extends AppCompatActivity {

    //step1
    ImageButton myBTColourOrange,myBTColourRed,myBTColourWhite,myBTBack,myBTShopee,myBTLazada;
    ImageView myImageViewMaidBicycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maids_bicycle);

        //step2
        myBTColourOrange = findViewById(R.id.BTColourOrange);
        myBTColourRed = findViewById(R.id.BTColourRed);
        myBTColourWhite = findViewById(R.id.BTColourWhite);
        myBTBack = findViewById(R.id.BTBack);
        myBTShopee = findViewById(R.id.BTShopee);
        myBTLazada = findViewById(R.id.BTLazada);
        myImageViewMaidBicycle = findViewById(R.id.ImageViewMaidBicycle);


        //for lazada link
        myBTLazada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String LazadaLink = "https://www.lazada.co.th/products/0-osaka-rhino-26-i1633448930-s10361191523.html?clickTrackInfo=query%253A%2525E0%2525B8%252588%2525E0%2525B8%2525B1%2525E0%2525B8%252581%2525E0%2525B8%2525A3%2525E0%2525B8%2525A2%2525E0%2525B8%2525B2%2525E0%2525B8%252599%252Bosaka%252Brhino%252B26%253Bnid%253A1633448930%253Bsrc%253ALazadaMainSrp%253Brn%253A8af9f2494a7a4e82d2a5558979fc2b28%253Bregion%253Ath%253Bsku%253A1633448930_TH%253Bprice%253A3450%253Bclient%253Adesktop%253Bsupplier_id%253A100060022%253Basc_category_id%253A8714%253Bitem_id%253A1633448930%253Bsku_id%253A10361191523%253Bshop_id%253A95625&fastshipping=0&freeshipping=0&fs_ab=2&fuse_fs=0&lang=th&location=%E0%B8%99%E0%B8%84%E0%B8%A3%E0%B8%A3%E0%B8%B2%E0%B8%8A%E0%B8%AA%E0%B8%B5%E0%B8%A1%E0%B8%B2&price=3.45E%203&priceCompare=&ratingscore=4.779761904761905&request_id=8af9f2494a7a4e82d2a5558979fc2b28&review=168&sale=589&search=1&source=search&spm=a2o4m.searchlist.list.i40.4321382b9hnLxH&stock=1";
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(LazadaLink ));
                startActivity(myIntent);
            }
        });

        //for shopee link
        myBTShopee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ShopeeLink = "https://shopee.co.th/(%E0%B8%A5%E0%B8%94%E0%B8%AA%E0%B8%B9%E0%B8%87%E0%B8%AA%E0%B8%B8%E0%B8%94500.-%E0%B9%80%E0%B8%A1%E0%B8%B7%E0%B9%88%E0%B8%AD%E0%B8%9E%E0%B8%B4%E0%B8%A1%E0%B8%9E%E0%B9%8CHSPTK500)-%E0%B8%88%E0%B8%B1%E0%B8%81%E0%B8%A3%E0%B8%A2%E0%B8%B2%E0%B8%99%E0%B8%A7%E0%B8%B4%E0%B8%99%E0%B9%80%E0%B8%97%E0%B8%88-%E0%B8%AA%E0%B9%84%E0%B8%95%E0%B8%A5%E0%B9%8C%E0%B8%8D%E0%B8%B5%E0%B9%88%E0%B8%9B%E0%B8%B8%E0%B9%88%E0%B8%99-Osaka-Rhino-(24-%E0%B8%99%E0%B8%B4%E0%B9%89%E0%B8%A7-26-%E0%B8%99%E0%B8%B4%E0%B9%89%E0%B8%A7)-i.76375321.5914541909?sp_atk=fbe3e2f8-fbb0-4eea-ba66-8a4e6ac93bbf&xptdk=fbe3e2f8-fbb0-4eea-ba66-8a4e6ac93bbf";
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(ShopeeLink));
                startActivity(myIntent);
            }
        });

        // for back button
        myBTBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(myIntent);
            }
        });
        //for choose colour of bicycle
        myBTColourRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myImageViewMaidBicycle.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.bicycleosakared));
            }
        });
        myBTColourOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myImageViewMaidBicycle.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.bicycleosakaorange));
            }
        });
        myBTColourWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myImageViewMaidBicycle.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.bicycleosakawhite));
            }
        });
    }
}