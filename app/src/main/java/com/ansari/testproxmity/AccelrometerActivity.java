package com.ansari.testproxmity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AccelrometerActivity extends AppCompatActivity {


    TextView tv;
    SensorManager sensorManager;
    Sensor acceSensor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelrometer);

        tv = findViewById(R.id.textViewShow);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        acceSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        SensorEventListener sensorEventListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent event) {
                    tv.setText(" x :" + event.values[0] +
                                " \n Y :" + event.values[1]+
                                " \n Z :" + event.values[2]);
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {

            }
        };

        sensorManager.registerListener(sensorEventListener,acceSensor,SensorManager.SENSOR_DELAY_NORMAL);
    }
}
