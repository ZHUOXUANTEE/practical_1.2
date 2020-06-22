package com.example.practical_12_parta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button countBtn,msgBtn;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeUI();

        msgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"TEE ZHUO XUAN 1900612",Toast.LENGTH_SHORT).show();
            }
        });

        countBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(resultText.getText().toString());

                x++;
                if(resultText != null)
                resultText.setText(String.valueOf(x));
            }
        });
    }



    private void initializeUI() {
        countBtn = findViewById(R.id.countBtn);
        msgBtn = findViewById(R.id.msgBtn);
        resultText = findViewById(R.id.resultText);
    }

}
