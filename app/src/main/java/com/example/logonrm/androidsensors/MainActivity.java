package com.example.logonrm.androidsensors;

import android.content.Intent;
import android.hardware.SensorEventListener;
import android.support.annotation.IntDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnAcelerometro;
    Button btnTTS;
    Button btnSTT;
    Button btnTodosSensores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAcelerometro = (Button) findViewById(R.id.btn_acelerometro);
        btnTTS = (Button) findViewById(R.id.btn_tts);

        btnAcelerometro.setOnClickListener(this);
        btnTTS.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btn_acelerometro:
                startActivity(new Intent(MainActivity.this, Acelerometro.class));
                break;
        }
    }
}
