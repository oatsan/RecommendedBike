package com.example.recommendedbike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Mtbbike extends AppCompatActivity {

    //step1
    ImageButton myBTColourWhite3,myBTLazada3,myBTShopee3,myBTColourBlack3,BTBack3;
    ImageView imageViewMtbBicycle2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtbbike);
        //step2
        myBTColourWhite3 = findViewById(R.id.BTColourWhite3);
        myBTLazada3 = findViewById(R.id.BTLazada3);
        myBTShopee3 = findViewById(R.id.BTShopee3);
        myBTColourBlack3 = findViewById(R.id.BTColourBlack3);
        BTBack3 = findViewById(R.id.BTBack3);
        imageViewMtbBicycle2 = findViewById(R.id.imageViewMtbBicycle2);

        //for lazada link
        myBTLazada3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String LazadaLink = "https://www.lazada.co.th/products/0-richter-smash-21sp-i3542434623-s13280137744.html?clickTrackInfo=query%253Arichter%252Bsmash%253Bnid%253A3542434623%253Bsrc%253ALazadaMainSrp%253Brn%253Aa3ec4f148925dd21dd156b4c712b9347%253Bregion%253Ath%253Bsku%253A3542434623_TH%253Bprice%253A4250%253Bclient%253Adesktop%253Bsupplier_id%253A100060022%253Basc_category_id%253A8717%253Bitem_id%253A3542434623%253Bsku_id%253A13280137744%253Bshop_id%253A95625&fastshipping=0&freeshipping=0&fs_ab=2&fuse_fs=0&lang=en&location=Nakhon%20Ratchasima&price=4.25E%203&priceCompare=&ratingscore=4.666666666666667&request_id=a3ec4f148925dd21dd156b4c712b9347&review=6&sale=19&search=1&source=search&spm=a2o4m.searchlist.list.i40.25301ed9v78Pv0&stock=1";
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(LazadaLink ));
                startActivity(myIntent);
            }
        });

        //for shopee link
        myBTShopee3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ShopeeLink = "https://shopee.co.th/%E0%B8%88%E0%B8%B1%E0%B8%81%E0%B8%A3%E0%B8%A2%E0%B8%B2%E0%B8%99%E0%B9%80%E0%B8%AA%E0%B8%B7%E0%B8%AD%E0%B8%A0%E0%B8%B9%E0%B9%80%E0%B8%82%E0%B8%B2-27.5-SMASH-i.39416278.15922064304?sp_atk=297a07bd-0f09-49ca-add6-274053fd7777&xptdk=297a07bd-0f09-49ca-add6-274053fd7777";
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(ShopeeLink));
                startActivity(myIntent);
            }
        });

        // for back button
        BTBack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(myIntent);
            }
        });
        //for choose colour of bicycle
        myBTColourWhite3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewMtbBicycle2.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.richtersmashwhite));
            }
        });
        myBTColourBlack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewMtbBicycle2.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.richtersmashblack));
            }
        });
    }
}