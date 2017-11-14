package com.jenny.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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

    }

}
