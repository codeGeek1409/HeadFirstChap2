package com.hf.ch2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void doItForMe(View v){
        Spinner s=(Spinner) findViewById(R.id.spnA);
        TextView r=(TextView) findViewById(R.id.txVDes);
        String str=String.valueOf(s.getSelectedItem());
        if(str.equals("Option A"))
        r.setText("Hello"); else r.setText(str);
    }
}