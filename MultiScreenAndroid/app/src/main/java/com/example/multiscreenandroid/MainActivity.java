package com.example.multiscreenandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void changeAct(View view)
    {
        Intent intent=new Intent(this, homepage.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView cd=findViewById(R.id.welcome);
        cd.setTranslationY(-1000f);
        cd.animate().translationYBy(1000f).setDuration(1000);
        Button button=findViewById(R.id.button);
        button.setTranslationY(1000f);
        button.animate().translationYBy(-1000f).setDuration(1000);




    }
}