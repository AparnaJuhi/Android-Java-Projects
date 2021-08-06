package com.example.lovecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class calculator extends AppCompatActivity {
    EditText male;
    EditText female;
    TextView tx;
    public void fun(View view)
    {
        String m=male.getText().toString();
        m=m.toLowerCase();
        String f=female.getText().toString();
        f=f.toLowerCase();
        if(m=="" || f=="")
        {
            Toast.makeText(this, "Enter values",Toast.LENGTH_SHORT).show();
        }
        else {
            HashMap<Character, Integer> map1 = new HashMap<>();

            //8
            int count;
            for (int i = 0; i < m.length(); i++) {
                //9
                char word = m.charAt(i);
                if (map1.containsKey(word)) {
                    count = map1.get(word);
                    map1.put(word, count + 1);
                } else {
                    map1.put(word, 1);
                }
            }


            HashMap<Character, Integer> map2 = new HashMap<>();
            for (int i = 0; i < f.length(); i++) {
                //9
                char word = f.charAt(i);
                if (map2.containsKey(word)) {
                    count = map2.get(word);
                    map2.put(word, count + 1);
                } else {
                    map2.put(word, 1);
                }
            }
            //getting the count of matched pairs
            int temp = 0;
            for (HashMap.Entry<Character, Integer> set :
                    map1.entrySet()) {
                Character ff = set.getKey();
                if (map2.containsKey(ff)) {
                    if (map2.get(ff) < set.getValue()) {
                        temp = temp + 2 * map2.get(ff);
                    } else {
                        temp = temp + 2 * set.getValue();
                    }
                }

            }

            int total=m.length()+f.length();
            int per;
            if(total%2==0)
            per = 80 + temp;
            else
                per=81+temp;
            if (per >= 100) {
                per = per - (temp) / 2;
            }

            tx.setText(per + "%");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        male=findViewById(R.id.male);
        female=findViewById(R.id.female);
        tx = findViewById(R.id.textView);

    }
}