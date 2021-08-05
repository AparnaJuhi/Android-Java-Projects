package com.example.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    int curr=0;
    public void prev(View view)
    {
        String idx="pic"+curr;
        int x=this.getResources().getIdentifier(idx,"id",getPackageName());
        img=findViewById(x);
        img.setAlpha(0f);

        curr=(3+ curr-1)%3;
        String idy="pic"+curr;
        int y=this.getResources().getIdentifier(idy,"id",getPackageName());
        img=findViewById(y);
        img.setAlpha(1f);




    }
    public void next(View view)
    {
        String idx="pic"+curr;
        int x=this.getResources().getIdentifier(idx,"id",getPackageName());
        img=findViewById(x);
        img.setAlpha(0f);

        curr=(curr+1)%3;
        String idy="pic"+curr;
        int y=this.getResources().getIdentifier(idy,"id",getPackageName());
        img=findViewById(y);
        img.setAlpha(1f);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}