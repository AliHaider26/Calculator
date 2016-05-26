package com.app.ali.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String val = "";
    int oper;
    String fVal = "";
    float fResult;
    static String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bmulti, bdiv, bdot, bsub, badd;

        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        bmulti = (Button) findViewById(R.id.bmulti);
        bdiv = (Button) findViewById(R.id.bdiv);
        bdot = (Button) findViewById(R.id.bdot);
        bsub = (Button) findViewById(R.id.bsub);
        badd = (Button) findViewById(R.id.badd);


        b0.setOnClickListener(onclick);
        b1.setOnClickListener(onclick);
        b2.setOnClickListener(onclick);
        b3.setOnClickListener(onclick);
        b4.setOnClickListener(onclick);
        b5.setOnClickListener(onclick);
        b6.setOnClickListener(onclick);
        b7.setOnClickListener(onclick);
        b8.setOnClickListener(onclick);
        b9.setOnClickListener(onclick);
        bsub.setOnClickListener(onclick);
        badd.setOnClickListener(onclick);
        bmulti.setOnClickListener(onclick);
        bdiv.setOnClickListener(onclick);
        bdot.setOnClickListener(onclick);
    }

    private View.OnClickListener onclick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView tex = (TextView) findViewById(R.id.textView);

            switch (v.getId()) {
                case R.id.b0: {
                    val += "0";
                    tex.setText(val);
                }
                break;

                case R.id.b1: {
                    val += "1";
                    tex.setText("" + val);
                }
                break;
                case R.id.b2: {
                    val += "2";
                    tex.setText("" + val);
                }
                break;
                case R.id.b3: {
                    val += "3";
                    tex.setText("" + val);
                }
                break;

                case R.id.b4: {
                    val += "4";
                    tex.setText("" + val);
                }
                break;
                case R.id.b5: {
                    val += "5";
                    tex.setText("" + val);
                }
                break;
                case R.id.b6: {
                    val += "6";
                    tex.setText("" + val);
                }
                break;

                case R.id.b7: {
                    val += "7";
                    tex.setText("" + val);
                }
                break;

                case R.id.b8: {
                    val += "8";
                    tex.setText("" + val);
                }
                break;

                case R.id.b9: {
                    val += "9";
                    tex.setText("" + val);
                }
                break;

                case R.id.bdot: {
                    val += ".";
                    tex.setText("" + val);
                }
                break;

                case R.id.bdiv: {
                    tex.setText("");
                    oper=4;
                    fVal = val;
                    val = "";
                }
                break;

                case R.id.bmulti: {
                    tex.setText("");
                    oper=3;
                    fVal = val;
                    val = "";
                }
                break;

                case R.id.badd: {
                    oper = 1;
                    tex.setText("");
                    fVal = val;
                    val = "";
                }
                break;

                case R.id.bsub: {
                    tex.setText("");
                    oper=2;
                    fVal = val;
                    val = "";
                }
                break;

                default:
                    break;
            }
        }
    };

public void formula(String fnum ,int oper,String lnum)
{
    float first = Float.parseFloat(fnum);
    float second = Float.parseFloat(lnum);

    switch (oper) {
        case 1:
            fResult =  first+second;
            break;
        case 2:
            fResult =  first-second;
            break;
        case 3:
            fResult =  first*second;
            break;
        case 4:
            fResult =  first/second;
            break;
        default:
            break;
        }
}




    public void result(View v)
{
    formula(fVal, oper, val);
    val="";
    Intent intent = new Intent(this , Main2Activity.class);
    String ff="" + fResult;
    intent.putExtra(result, ff);
    startActivity(intent);
}













}
