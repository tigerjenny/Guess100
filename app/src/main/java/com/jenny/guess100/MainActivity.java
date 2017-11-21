package com.jenny.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int ran_num = new Random().nextInt(100)+1;
    private EditText edNum;
    private TextView txSecret;
    private TextView txInfo;
    private Button btSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.findViews();
    }
    public void findViews(){
        edNum = (EditText) findViewById(R.id.number);
        txSecret = (TextView) findViewById(R.id.secret);
        txInfo = (TextView) findViewById(R.id.info);
        btSend = (Button) findViewById(R.id.send);

        txSecret.setText(Integer.toString(ran_num));
    }

    int num2 = 0;
    int num3 = 100 ;

    public void num (View view) {
        EditText edNum = (EditText) findViewById(R.id.number);
        int num = Integer.parseInt(edNum.getText().toString());

        if (num > ran_num ){
            num3 = num;
            new AlertDialog.Builder(this)
                    .setMessage(num2 +" to "+ num3)
                    .setTitle("Messenge")
                    .setPositiveButton("OK",null)
                    .show();

        }else if (num < ran_num){
            num2 = num;
            new AlertDialog.Builder(this)
                    .setMessage(num+" to "+num3)
                    .setTitle("Messenge")
                    .setPositiveButton("OK",null)
                    .show();
        }else {
            new AlertDialog.Builder(this)
                    .setMessage("Good job")
                    .setTitle("Messenge")
                    .setPositiveButton("OK",null)
                    .show();
        }


    }

}
