package com.example.willl.w3_res_intent_listview_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import static com.example.willl.w3_res_intent_listview_demo.utils.Utils.MSG_KEY;

public class Main2Activity extends AppCompatActivity {


    private TextView text2;
    private TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text2 = (TextView) findViewById(R.id.text2);
        name = (TextView) findViewById(R.id.name);
        text2.setText(getIntent().getStringExtra(MSG_KEY));

    }
}
