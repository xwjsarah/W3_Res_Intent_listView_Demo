package com.example.willl.w3_res_intent_listview_demo;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.net.URL;

import static com.example.willl.w3_res_intent_listview_demo.utils.Utils.MSG_KEY;

public class MainActivity extends AppCompatActivity {
   private Button button1;
    private EditText text1;
    private EditText name;
    private ListView list;
    private String[] itms;
     @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new Mysln());
        text1 = (EditText) findViewById(R.id.text1);
        list= (ListView) findViewById(R.id.listview);
         itms= getResources().getStringArray(R.array.my_item);
         ArrayAdapter<String>  ad = new  ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,itms);
         list.setAdapter(ad);
         list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 view.setBackgroundColor(Color.RED);

                 Intent exIntent = new Intent(MainActivity.this, Main2Activity.class);
                 exIntent.putExtra("PPPP",itms[position]);
                 startActivity(exIntent);

             }
         });
    }

    public void showMap(View view) {

        Intent  Newintent = new Intent(Intent.ACTION_VIEW);
        Newintent.setData(Uri.parse("geo:0,0?=Montclair+State+ University" + "new jersey + USA"  ));
    }

    class Mysln implements View.OnClickListener {


        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra(MSG_KEY, "age is " + text1.getText() + name.getText() );
            startActivity(intent);
        }
    }
}
