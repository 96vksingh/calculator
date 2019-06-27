package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText n1;
    private EditText n2;
    private Button b1;
    private TextView t1;
    private Button b2;
    private Button b3;
    private Button b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b1 = (Button) findViewById(R.id.button);
        n1 = (EditText) findViewById(R.id.editText);
        n2 = (EditText) findViewById(R.id.editText2);

        t1 = (TextView) findViewById(R.id.textView);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((n1.getText().length()) > 0 && (n2.getText().length() > 0))
                {
                    double val1=Double.parseDouble(n1.getText().toString());
                    double val2=Double.parseDouble(n2.getText().toString());
                    double total= val1 + val2;
                    t1.setText(Double.toString(total));
                }
            }
        });
    }
}
