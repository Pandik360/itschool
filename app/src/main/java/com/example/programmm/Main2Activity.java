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
        final CheckBox ch1 = findViewById(R.id.checkBox);
        final CheckBox ch2 = findViewById(R.id.checkBox2);
        final CheckBox ch3 = findViewById(R.id.checkBox3);
        final BluetoothAdapter bl= BluetoothAdapter.getDefaultAdapter();
        Button cb = findViewById(R.id.button7);
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch1.isChecked())
                {
                    if (!bl.enable())
                        Toast.makeText(getApplicationContext(),"Включение", Toast.LENGTH_SHORT);
                    else
                        Toast.makeText(getApplicationContext(),"Bluetooth включён", Toast.LENGTH_LONG);
                    bl.enable();
                }
                if(ch2.isChecked())
                    Toast.makeText(getApplicationContext(),"Подключено",Toast.LENGTH_SHORT);
                if(ch3.isChecked())
                    bl.disable();
                    if(bl.disable())
                    Toast.makeText(getApplicationContext(),"Всё выключено(пока что только bluetooth)",Toast.LENGTH_LONG);
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
