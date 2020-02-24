package com.example.programmm;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.*;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Toast t = Toast.makeText(getApplicationContext(),"Bluetooth включён",Toast.LENGTH_LONG);
        final Toast t2 = Toast.makeText(getApplicationContext(),"Включите bluetooth",Toast.LENGTH_LONG);
        final Toast t3 = Toast.makeText(getApplicationContext(),"Подкючено к устройству",Toast.LENGTH_LONG);
        final Toast t4 = Toast.makeText(getApplicationContext(),"Всё выключено",Toast.LENGTH_LONG);
        final BluetoothAdapter bl= BluetoothAdapter.getDefaultAdapter();
        Button b = findViewById(R.id.button7);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bl.enable();
                t.show();
            }
        });
        Button b1 = findViewById(R.id.button8);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!bl.isEnabled())
                t2.show();
                else
                t3.show();
            }
        });
        Button b2 = findViewById(R.id.button9);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bl.disable();
                t4.show();
            }
        });
        Button but = findViewById(R.id.button2);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);
            }
        });
        Button but1 = findViewById(R.id.button6);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
