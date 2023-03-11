package com.example.recommendedbike;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //step1
    Spinner myPricespinner,myUsespinner,myTypespinner;
    Button myBTsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //step2
        myTypespinner = findViewById(R.id.Typespinner);
        myUsespinner = findViewById(R.id.Usespinner);
        myPricespinner = findViewById(R.id.Pricespinner);
        myBTsubmit = findViewById(R.id.BTsubmit);

        //step3
        myBTsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String s1 = myTypespinner.getSelectedItem().toString();
                final String s2 = myUsespinner.getSelectedItem().toString();
                final String s3 = myPricespinner.getSelectedItem().toString();

                if(s1.equals("หอพัก")){

                    if (s2.equals("ปั่นจ่ายตลาดหรือใช้ในชีวิตประจำวัน")){

                        if (s3.equals("น้อยกว่า 5,000 บาท")){

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();

                        } else if (s3.equals("น้อยกว่า 10,000 บาท")) {

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();

                        } else if (s3.equals("น้อยกว่า 15,000 บาท")) {

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();

                        }


                    } else if (s2.equals("ปั่นออกกำลังกาย")) {


                        if (s3.equals("น้อยกว่า 5,000 บาท")){

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();

                        } else if (s3.equals("น้อยกว่า 10,000 บาท")) {

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();

                        } else if (s3.equals("น้อยกว่า 15,000 บาท")) {

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();

                        }

                    } else if (s2.equals("ปั่นไปทำงานใกล้ๆหรือต่อBTS")) {


                        if (s3.equals("น้อยกว่า 5,000 บาท")){
                            Intent myIntent = new Intent(getApplicationContext(),FoldingBike.class);
                            startActivity(myIntent);

                        } else if (s3.equals("น้อยกว่า 10,000 บาท")) {

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();

                        } else if (s3.equals("น้อยกว่า 15,000 บาท")) {

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();

                        }

                    }

                } else if (s1.equals("คอนโด")) {


                    if (s2.equals("ปั่นจ่ายตลาดหรือใช้ในชีวิตประจำวัน")){

                        if (s3.equals("น้อยกว่า 5,000 บาท")){

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();

                        } else if (s3.equals("น้อยกว่า 10,000 บาท")) {

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();

                        } else if (s3.equals("น้อยกว่า 15,000 บาท")) {

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();

                        }


                    } else if (s2.equals("ปั่นออกกำลังกาย")) {


                        if (s3.equals("น้อยกว่า 5,000 บาท")){

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();

                        } else if (s3.equals("น้อยกว่า 10,000 บาท")) {

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();

                        } else if (s3.equals("น้อยกว่า 15,000 บาท")) {

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();

                        }

                    } else if (s2.equals("ปั่นไปทำงานใกล้ๆหรือต่อBTS")) {


                        if (s3.equals("น้อยกว่า 5,000 บาท")){

                            Intent myIntent = new Intent(getApplicationContext(),FoldingBike.class);
                            startActivity(myIntent);

                        } else if (s3.equals("น้อยกว่า 10,000 บาท")) {

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();

                        } else if (s3.equals("น้อยกว่า 15,000 บาท")) {

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();

                        }

                    }


                } else if (s1.equals("บ้าน")) {


                    if (s2.equals("ปั่นจ่ายตลาดหรือใช้ในชีวิตประจำวัน")){

                        if (s3.equals("น้อยกว่า 5,000 บาท")){

                            Intent myIntent = new Intent(getApplicationContext(),MaidsBicycle.class);
                            startActivity(myIntent);

                        } else if (s3.equals("น้อยกว่า 10,000 บาท")) {

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();

                        } else if (s3.equals("น้อยกว่า 15,000 บาท")) {

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();

                        }


                    } else if (s2.equals("ปั่นออกกำลังกาย")) {

                        if (s3.equals("น้อยกว่า 5,000 บาท")){

                            Intent myIntent = new Intent(getApplicationContext(),Mtbbike.class);
                            startActivity(myIntent);


                        } else if (s3.equals("น้อยกว่า 10,000 บาท")) {
                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();


                        } else if (s3.equals("น้อยกว่า 15,000 บาท")) {
                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();


                        }

                    } else if (s2.equals("ปั่นไปทำงานใกล้ๆหรือต่อBTS")) {


                        if (s3.equals("น้อยกว่า 5,000 บาท")){

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();


                        } else if (s3.equals("น้อยกว่า 10,000 บาท")) {

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();


                        } else if (s3.equals("น้อยกว่า 15,000 บาท")) {

                            Toast.makeText(getApplicationContext(),"ขออภัยไม่พบข้อมูล",Toast.LENGTH_SHORT).show();

                        }

                    }


                }


            }
        });


    }
}