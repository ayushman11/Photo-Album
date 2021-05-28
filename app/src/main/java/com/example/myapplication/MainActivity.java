package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    int num=1;

    public void next(View view)
    {
        ImageView img= findViewById(R.id.imageView3);
        switch (num)
        {
            case 1:
                num++;
                img.setImageResource(R.drawable.c2);
                break;
            case 2:
                num++;
                img.setImageResource(R.drawable.c3);
                break;
            case 3:
                num++;
                img.setImageResource(R.drawable.c4);
                break;
            case 4:
                num++;
                img.setImageResource(R.drawable.c5);
                break;
            case 5:
                num++;
                img.setImageResource(R.drawable.c6);
                break;
            case 6:
                num++;
                img.setImageResource(R.drawable.c7);
                break;
            case 7:
                num++;
                img.setImageResource(R.drawable.c8);
                break;
            case 8:
                num=1;
                img.setImageResource(R.drawable.c1);
                break;
        }
    }
    public void prev(View view)
    {
        ImageView img= findViewById(R.id.imageView3);
        switch (num)
        {
            case 1:
                num=8;
                img.setImageResource(R.drawable.c8);
                break;
            case 2:
                num--;
                img.setImageResource(R.drawable.c1);
                break;
            case 3:
                num--;
                img.setImageResource(R.drawable.c2);
                break;
            case 4:
                num--;
                img.setImageResource(R.drawable.c3);
                break;
            case 5:
                num--;
                img.setImageResource(R.drawable.c4);
                break;
            case 6:
                num--;
                img.setImageResource(R.drawable.c5);
                break;
            case 7:
                num--;
                img.setImageResource(R.drawable.c6);
                break;
            case 8:
                num--;
                img.setImageResource(R.drawable.c7);
                break;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}