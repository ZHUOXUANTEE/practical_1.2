package com.example.practical_12_parta;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button countBtn,msgBtn,resetBtn;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeUI();

        msgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),R.string.toast_message,Toast.LENGTH_SHORT).show();
            }
        });

        countBtn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(resultText.getText().toString());
                x++;
                if(resultText != null)
                resultText.setText(String.valueOf(x));
                resetBtn.setBackgroundColor(getColor(R.color.colorPink));
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void reset(View v)
    {
        resetBtn.setBackgroundColor(getColor(R.color.colorGray));
        resultText.setText("0");
    }

    private void initializeUI() {
        countBtn = findViewById(R.id.countBtn);
        msgBtn = findViewById(R.id.msgBtn);
        resultText = findViewById(R.id.resultText);
        resetBtn = findViewById(R.id.resetbtn);
    }

}
