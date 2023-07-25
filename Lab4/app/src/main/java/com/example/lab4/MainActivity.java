package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.lab4.Bai2.Bai2_Lab4;
import com.example.lab4.Bai2.LoginFragment;
import com.example.lab4.Bai2.ProfileFragment;
import com.example.lab4.Bai2.RegisterFragment;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
    }
    public void bai2(View view) {
        Toast.makeText(getApplicationContext(),"Bài 1",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, Bai2_Lab4.class);
        startActivity(intent);
    }
//    public void bai2(View view) {
//        Toast.makeText(getApplicationContext(),"Bài 2",Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(MainActivity.this, Bai2_Lab3.class);
//        startActivity(intent);
//    }
//    public void bai3(View view) {
//        Toast.makeText(getApplicationContext(),"Bài 3",Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(MainActivity.this, Bai3_Lab3.class);
//        startActivity(intent);
//    }
//    public void bai4(View view) {
//        Toast.makeText(getApplicationContext(),"Bài 4",Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(MainActivity.this, Bai4_Lab3.class);
//        startActivity(intent);
//    }
}