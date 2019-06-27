package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText n1;
    private EditText n2;
    private Button add;
    private TextView res;
    private Button sub;
    private Button div;
    private Button mul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = (Button) findViewById(R.id.button);
        n1 = (EditText) findViewById(R.id.editText);
        n2 = (EditText) findViewById(R.id.editText2);
        sub = (Button) findViewById(R.id.button2);
        div = (Button) findViewById(R.id.button4);
        mul = (Button) findViewById(R.id.button3);

        res = (TextView) findViewById(R.id.textView);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((n1.getText().length()) > 0 && (n2.getText().length() > 0))
                {
                    double val1=Double.parseDouble(n1.getText().toString());
                    double val2=Double.parseDouble(n2.getText().toString());
                    double total= val1 + val2;
                    res.setText(Double.toString(total));
                }
                else
                {
                    Toast toast = Toast.makeText(MainActivity.this,"Enter Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((n1.getText().length()) > 0 && (n2.getText().length() > 0))
                {
                    double val1=Double.parseDouble(n1.getText().toString());
                    double val2=Double.parseDouble(n2.getText().toString());
                    double total= val1 - val2;
                    res.setText(Double.toString(total));
                }
                else
                {
                    Toast toast = Toast.makeText(MainActivity.this,"Enter Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((n1.getText().length()) > 0 && (n2.getText().length() > 0))
                {
                    double val1=Double.parseDouble(n1.getText().toString());
                    double val2=Double.parseDouble(n2.getText().toString());
                    double total= val1 * val2;
                    res.setText(Double.toString(total));
                }
                else
                {
                    Toast toast = Toast.makeText(MainActivity.this,"Enter Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((n1.getText().length()) > 0 && (n2.getText().length() > 0))
                {
                    double val1=Double.parseDouble(n1.getText().toString());
                    double val2=Double.parseDouble(n2.getText().toString());
                    double total= val1 / val2;
                    res.setText(Double.toString(total));
                }
                else
                {
                    Toast toast = Toast.makeText(MainActivity.this,"Enter Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

    }
}
