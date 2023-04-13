package com.example.moneyconventer;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView from;
    TextView to;
    TextView result;
    EditText editableInput;
    Button btnusd, btneur, btnkrn, btnjpn, btnchn, btnrus;

    String amount;
    double vnd, convertResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        onClick();

        getSupportActionBar().hide();
    }
    public void init() {
        to = findViewById(R.id.to);
        from = findViewById(R.id.from);
        result = findViewById(R.id.result);
        editableInput = findViewById(R.id.editableInput);

        btnusd = findViewById(R.id.btnusd);
        btneur = findViewById(R.id.btneur);
        btnkrn = findViewById(R.id.btnkrn);
        btnjpn = findViewById(R.id.btnjpn);
        btnchn = findViewById(R.id.btnchn);
        btnrus = findViewById(R.id.btnRus);
    }

    public void onClick() {
        btnusd.setOnClickListener(view -> {
            amount = editableInput.getText().toString();
            vnd = 23820;
            convertResult = Integer.parseInt(amount)*(vnd);
            result.setText(String.valueOf(convertResult));
            from.setText("From USD to VND");
            to.setText( amount +" USD$ = " + convertResult +"VND");

        });

        btneur.setOnClickListener(view -> {
            amount = editableInput.getText().toString();
            vnd = 25526.70;
            convertResult = Integer.parseInt(amount)*(vnd);
            result.setText(String.valueOf(convertResult));
            from.setText("From EUR to VND");
            to.setText( amount +" EUR = " + convertResult +"VND");
        });
        btnkrn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = editableInput.getText().toString();
                vnd = 18.38;
                convertResult = Integer.parseInt(amount)*(vnd);
                result.setText(String.valueOf(convertResult));
                from.setText("From KRN to VND");
                to.setText( amount +" WON = " + convertResult +"VND");
            }
        });
        btnjpn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = editableInput.getText().toString();
                vnd = 179.28;
                convertResult = Integer.parseInt(amount)*(vnd);
                result.setText(String.valueOf(convertResult));
                from.setText("From JPN to VND");
                to.setText( amount +" YEN = " + convertResult +"VND");
            }
        });
        btnchn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = editableInput.getText().toString();
                vnd = 3468.46;
                convertResult = Integer.parseInt(amount)*(vnd);
                result.setText(String.valueOf(convertResult));
                from.setText("From CHN to VND");
                to.setText( amount +" NDT = " + convertResult +"VND");
            }
        });
        btnrus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = editableInput.getText().toString();
                vnd = 321.81;
                convertResult = Integer.parseInt(amount)*(vnd);
                result.setText(String.valueOf(convertResult));
                from.setText("From RUS to VND");
                to.setText( amount +" RUP = " + convertResult +"VND");
            }
        });

    }
}