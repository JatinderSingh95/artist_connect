package com.example.administrator.artist_connect;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    InputStream inputStream;
    String[] ids;

    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView listView = (ListView)findViewById(R.id.txt1);

        final GridView gv = (GridView) findViewById(R.id.gv);
        String[] plants = new String[]{
                "Actor",
                "Actress",
                "Anchor",
                "Cameraman",
                "Comedy artist",
                "Choreographer",
                "Dressdesigner",
                "FilmDirector",

        };
        final List<String> plantsList = new ArrayList<String>(Arrays.asList(plants));

        // Create a new ArrayAdapter
        final ArrayAdapter<String> gridViewArrayAdapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1, plantsList);

        // Data bind GridView with ArrayAdapter (String Array elements)
        gv.setAdapter(gridViewArrayAdapter);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Intent i=new Intent(MainActivity.this,category.class);

                i.putExtra("position", plantsList.get(position));
                startActivity(i);
            }
        });

        arrayList=new ArrayList<>();
        inputStream = getResources().openRawResource(R.raw.alldata);

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            String cavline;
            while ((cavline = reader.readLine()) != null){
                ids=cavline.split(",");
                arrayList.add(cavline);
                try {
                   // Log.e("hanu","" + arrayList);

                }
                catch (Exception e){
//                    Log.e("jdsgf" ,""+e.toString());

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.twe, arrayList);
        listView.setAdapter(adapter);

        final TextView textView=(TextView)findViewById(R.id.inputSearch);
        textView.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                MainActivity.this.adapter.getFilter().filter(cs);
                listView.setVisibility(View.VISIBLE);

            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                if(TextUtils.isEmpty(textView.getText().toString())){
                    listView.setVisibility(View.GONE);
                    gv.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
