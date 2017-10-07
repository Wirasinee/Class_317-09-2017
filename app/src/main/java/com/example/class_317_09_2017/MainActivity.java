package com.example.class_317_09_2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//รัน,เอาทุกอย่างในไฟลมาสร้างobj
        //Button okButton = new Button();//สร้างobj button ขึ้นมา
        //okButton.setText("เปลียนข้อความบนปุ่ม");

        Button okButton = (Button) findViewById(R.id.ok_button);//สร้างตัวแปรเพืออ้างข้อมูลของปุ่ม id ok_button   R.id.ชื่อ ต้องแคสด้วย
        EditText emailEditText = (EditText) findViewById(R.id.email_edit_text);

        okButton.setText("เปลียนข้อความปุ่ม");

        /*กดปุ่มแล้วค่อยโชว์ Toast ต้องสร้าง Listeners ค่อยดักอีเสน*/
        okButton.setOnClickListener(new View.OnClickListener() { //ไปดูเรือง java Interface
            @Override
            public void onClick(View view) {//เมือกดปุ่มกด เกิด...

                Toast showToast = Toast.makeText(MainActivity.this,"ข้อความที่อยากแสดงToast",Toast.LENGTH_SHORT);  //แสดง Toast : การแจ้งเตือนแปปนึงแล้วหายไป
                // Toast.makeText(context บริบท this อคือ้างถึงobjตัวปัจจุบันคือMainActivity,ข้อความที่อยากแสดง,ระยะเวลา Toast.LENGTH_SHORT หรือ LoNG)
                showToast.show(); //สังให้แสดงออกมา

            }
        });

        Button exitButton =  (Button) findViewById(R.id.exit_button);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); //เมือกดปุ่มจะออกหน้าจอปัจจุบัน อารมปุ่มแบค แต่ถ้าหน้านั้นเป็นหน้าหลักจะออกจากแอพ
            }
        });

    }
}
