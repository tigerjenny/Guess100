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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.findViews();
    }
    public void findViews(){
        EditText edNum = (EditText) findViewById(R.id.number);
        TextView txSecret = (TextView) findViewById(R.id.secret);
        TextView txInfo = (TextView) findViewById(R.id.info);
        Button btSend = (Button) findViewById(R.id.send);

        txSecret.setText(Integer.toString(ran_num));
    }
    public void num (View view) {
        EditText edNum = (EditText) findViewById(R.id.number);
        int num = Integer.parseInt(edNum.getText().toString());
        int num2 = 0 ;
        int num3 = 100 ;
        if (num > ran_num ){
            num = num2;
            new AlertDialog.Builder(this)
                    .setMessage(num2 +" to "+ num3)
                    .setTitle("Messenge")
                    .setPositiveButton("OK",null)
                    .show();

        }else if (num < ran_num){
            num3= num;
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
