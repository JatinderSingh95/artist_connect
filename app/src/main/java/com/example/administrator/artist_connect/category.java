package com.example.administrator.artist_connect;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

public class category extends AppCompatActivity {
    InputStream inputStream;
    String[] ids;
    ArrayList<String> arrayList;

   String j;
    ArrayAdapter<String> adapter;
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        ListView listView = (ListView) findViewById(R.id.lstv);
        TextView textView = (TextView) findViewById(R.id.txt);
        Intent iin = getIntent();
        Bundle b = iin.getExtras();

        if (b != null) {
            j = (String) b.get("position");
            textView.setText(j);
        }


        arrayList = new ArrayList<>();

        if (Objects.equals(j, "Actor")){


            inputStream = getResources().openRawResource(R.raw.male);

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                String cavline;
                while ((cavline = reader.readLine()) != null) {
                    ids = cavline.split(",");
                    arrayList.add(cavline);
                    try {
                        Log.e("hanu", "" + arrayList);

                    } catch (Exception e) {
                        Log.e("jdsgf", "" + e.toString());

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.twe, arrayList);
            listView.setAdapter(adapter);
        }

        else if(Objects.equals(j, "Actress")){
            inputStream = getResources().openRawResource(R.raw.female);

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(inputStream));
        try {
            String cavline;
            while ((cavline = reader1.readLine()) != null){
                ids=cavline.split(",");
                arrayList.add(cavline);
                try {
                    Log.e("hanu","" + arrayList);

                }
                catch (Exception e){
                    Log.e("jdsgf" ,""+e.toString());

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.twe, arrayList);
        listView.setAdapter(adapter);
    }

        else if(Objects.equals(j, "Anchor")){
            inputStream = getResources().openRawResource(R.raw.anchor);

            BufferedReader reader1 = new BufferedReader(new InputStreamReader(inputStream));
            try {
                String cavline;
                while ((cavline = reader1.readLine()) != null){
                    ids=cavline.split(",");
                    arrayList.add(cavline);
                    try {
                        Log.e("hanu","" + arrayList);

                    }
                    catch (Exception e){
                        Log.e("jdsgf" ,""+e.toString());

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.twe, arrayList);
            listView.setAdapter(adapter);
        }

        else if(Objects.equals(j, "Cameraman")){
            inputStream = getResources().openRawResource(R.raw.cameraman);

            BufferedReader reader1 = new BufferedReader(new InputStreamReader(inputStream));
            try {
                String cavline;
                while ((cavline = reader1.readLine()) != null){
                    ids=cavline.split(",");
                    arrayList.add(cavline);
                    try {
                        Log.e("hanu","" + arrayList);

                    }
                    catch (Exception e){
                        Log.e("jdsgf" ,""+e.toString());

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.twe, arrayList);
            listView.setAdapter(adapter);
        }
        else if(Objects.equals(j, "Comedy artist")){
            inputStream = getResources().openRawResource(R.raw.comedy);

            BufferedReader reader1 = new BufferedReader(new InputStreamReader(inputStream));
            try {
                String cavline;
                while ((cavline = reader1.readLine()) != null){
                    ids=cavline.split(",");
                    arrayList.add(cavline);
                    try {
                        Log.e("hanu","" + arrayList);

                    }
                    catch (Exception e){
                        Log.e("jdsgf" ,""+e.toString());

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.twe, arrayList);
            listView.setAdapter(adapter);
        }
        else if(Objects.equals(j, "Choreographer")){
            inputStream = getResources().openRawResource(R.raw.choreograph);

            BufferedReader reader1 = new BufferedReader(new InputStreamReader(inputStream));
            try {
                String cavline;
                while ((cavline = reader1.readLine()) != null){
                    ids=cavline.split(",");
                    arrayList.add(cavline);
                    try {
                        Log.e("hanu","" + arrayList);

                    }
                    catch (Exception e){
                        Log.e("jdsgf" ,""+e.toString());

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.twe, arrayList);
            listView.setAdapter(adapter);
        }
        else if(Objects.equals(j, "Dressdesigner")){
            inputStream = getResources().openRawResource(R.raw.dress);

            BufferedReader reader1 = new BufferedReader(new InputStreamReader(inputStream));
            try {
                String cavline;
                while ((cavline = reader1.readLine()) != null){
                    ids=cavline.split(",");
                    arrayList.add(cavline);
                    try {
                        Log.e("hanu","" + arrayList);

                    }
                    catch (Exception e){
                        Log.e("jdsgf" ,""+e.toString());

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.twe, arrayList);
            listView.setAdapter(adapter);
        }
        else if(Objects.equals(j, "FilmDirector")){
            inputStream = getResources().openRawResource(R.raw.fdirect);

            BufferedReader reader1 = new BufferedReader(new InputStreamReader(inputStream));
            try {
                String cavline;
                while ((cavline = reader1.readLine()) != null){
                    ids=cavline.split(",");
                    arrayList.add(cavline);
                    try {
                        Log.e("hanu","" + arrayList);

                    }
                    catch (Exception e){
                        Log.e("jdsgf" ,""+e.toString());

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.twe, arrayList);
            listView.setAdapter(adapter);
        }

}}

