package com.example.sensorlist;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text= findViewById(R.id.tv);

        SensorManager manager = (SensorManager) this.getSystemService(SENSOR_SERVICE);
        List<Sensor> sensors = manager.getSensorList(Sensor.TYPE_ALL);

        StringBuilder message= new StringBuilder();
        message.append("Sensors on this device are: \n\n");

        for(Sensor sensor:sensors){
            message.append(">>  "+sensor.getName()+"\n");


        }
        text.setText(message);
    }
}