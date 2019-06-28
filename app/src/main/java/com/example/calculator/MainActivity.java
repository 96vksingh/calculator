package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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
    private TextView pro;
    private Button sub;
    private Button div;
    private Button mul;
    private Button clr;
    Animation animation;
    Animation animation2;
    Animation bblink;
    Animation zzoom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bblink = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        zzoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
        add = (Button) findViewById(R.id.button);
        n1 = (EditText) findViewById(R.id.editText);
        n2 = (EditText) findViewById(R.id.editText2);
        sub = (Button) findViewById(R.id.button2);
        div = (Button) findViewById(R.id.button4);
        mul = (Button) findViewById(R.id.button3);
        clr = (Button) findViewById(R.id.button5);
        pro= (TextView) findViewById(R.id.textView2);
        res = (TextView) findViewById(R.id.textView);
//        animation=AnimationUtils.loadAnimation(getApplicationContext,R.anim.sample.anim);
        animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sample_anim);
        animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((n1.getText().length()) > 0 && (n2.getText().length() > 0))
                {
                    add.startAnimation(bblink);
                    add.startAnimation(zzoom);
                    pro.setText("ADDITION");
                    pro.startAnimation(bblink);
                    double val1=Double.parseDouble(n1.getText().toString());
                    double val2=Double.parseDouble(n2.getText().toString());
                    double total= val1 + val2;
                    res.setText(Double.toString(total));
                    res.startAnimation(animation);
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
                    sub.startAnimation(bblink);
                    sub.startAnimation(zzoom);
                    pro.setText("SUBTRACTION");
                    pro.startAnimation(bblink);
                    double val1=Double.parseDouble(n1.getText().toString());
                    double val2=Double.parseDouble(n2.getText().toString());
                    double total= val1 - val2;
                    res.setText(Double.toString(total));
                    res.startAnimation(animation2);
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
                    mul.startAnimation(bblink);
                    mul.startAnimation(zzoom);
                    pro.setText("MULTIPLICATION");
                    pro.startAnimation(bblink);
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
                    div.startAnimation(bblink);
                    div.startAnimation(zzoom);
                    pro.setText("DIVISION");
                    pro.startAnimation(bblink);
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

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1.setText("");
                n2.setText("");
                res.setText("");
                pro.setText("");
                n1.requestFocus();
            }
        });

    }
}
