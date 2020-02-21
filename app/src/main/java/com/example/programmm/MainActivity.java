package com.example.programmm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.bluetooth.*;

public class MainActivity extends AppCompatActivity {

    private int REQUEST_ENABLE_BT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but = findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                //startActivity(intent);
                BluetoothAdapter bl= BluetoothAdapter.getDefaultAdapter();
               if (!bl.isEnabled()) {
                   bl.enable();
//                 Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
//                 startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
                 Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                 startActivity(intent);
               }
               else
                {
                   Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                   startActivity(intent);
                }



//               if(bl==null)
//                {
//                   Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                  startActivity(intent);
//              }
            }
        });
    }
}





//    public static boolean setBluetooth(boolean enable)
//    {
//        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
//        boolean isEnabled = bluetoothAdapter.isEnabled();
//        if (enable && !isEnabled)
//        {
//            return bluetoothAdapter.enable();
//        }
//        else if(!enable && isEnabled)
//        {
//            return bluetoothAdapter.disable();
//        }
//}
