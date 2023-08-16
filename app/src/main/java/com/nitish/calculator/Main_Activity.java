package com.nitish.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.nio.Buffer;

public class Main_Activity extends AppCompatActivity {
    EditText e1, e2;
    Button b1;
    ImageButton i1, i2, i3, i4;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.editText1);
        e2=(EditText) findViewById(R.id.editText2);
        t1=(TextView) findViewById(R.id.textView);
        i1=(ImageButton) findViewById(R.id.imageButton1);
        i2=(ImageButton) findViewById(R.id.imageButton2);
        i3=(ImageButton) findViewById(R.id.imageButton3);
        i4=(ImageButton) findViewById(R.id.imageButton4);
        b1=(Button) findViewById(R.id.button);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one= e1.getText().toString();
                String two= e2.getText().toString();
                if(one.isEmpty()){
                    e1.setError("Enter a number");
                }else {
                    if(two.isEmpty()){
                        e2.setError("Enter a number");
                    }
                    else{
                        Float one1= Float.parseFloat(one);
                        Float two1= Float.parseFloat(two);
                        float result= one1/two1;
                        String result1=Float.toString(result);
                        String massage = "your result is ";
                        t1.setText( massage + result1);
                    }
                }
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one= e1.getText().toString();
                String two= e2.getText().toString();
                if(one.isEmpty()){
                    e1.setError("Enter a number");
                }else {
                    if(two.isEmpty()){
                        e2.setError("Enter a number");
                    }
                    else{
                        Float one1= Float.parseFloat(one);
                        Float two1= Float.parseFloat(two);
                        float result= one1*two1;
                        String result1=Float.toString(result);
                        String massage = "your result is ";
                        t1.setText( massage + result1);
                    }
                }
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one= e1.getText().toString();
                String two= e2.getText().toString();
                if(one.isEmpty()){
                    e1.setError("Enter a number");
                }else {
                    if(two.isEmpty()){
                        e2.setError("Enter a number");
                    }
                    else{
                        Float one1= Float.parseFloat(one);
                        Float two1= Float.parseFloat(two);
                        float result= one1+two1;
                        String result1=Float.toString(result);
                        String massage = "your result is ";
                        t1.setText( massage + result1);
                    }
                }
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one= e1.getText().toString();
                String two= e2.getText().toString();
                if(one.isEmpty()){
                    e1.setError("Enter a number");
                }else {
                    if(two.isEmpty()){
                        e2.setError("Enter a number");
                    }
                    else{
                        Float one1= Float.parseFloat(one);
                        Float two1= Float.parseFloat(two);
                        float result= one1-two1;
                        String result1=Float.toString(result);
                        String massage = "your result is: ";
                        t1.setText( massage+result1);
                    }
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                        Toast.makeText(Main_Activity.this, "This App is made by Nitesh Kumar\n" +
                                "Sangwan.nitish27@gmail.com", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
