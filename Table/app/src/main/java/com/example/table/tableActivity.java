package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;

public class tableActivity extends AppCompatActivity {
    SeekBar seek;
    ListView ls;


    public void table(int i)
    {
        ArrayList<String> t=new ArrayList<>();
        for(int k=1;k<=10;k++)
        {
            String p="";
            p=p+i+" X "+k+" = "+i*k;
            t.add(p);

        }
        ArrayAdapter<String> a= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, t);
        ls.setAdapter(a);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = (String) adapterView.getItemAtPosition(i);
                Toast.makeText(getApplicationContext(), selectedItem, Toast.LENGTH_SHORT).show();

            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table2);
        ls=findViewById(R.id.listView);
        seek=findViewById(R.id.seekBar);
        seek.setMax(20);
        table(1);
        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                table(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}