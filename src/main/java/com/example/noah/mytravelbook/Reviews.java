package com.example.noah.mytravelbook;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

public class Reviews extends AppCompatActivity {
    Context cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        cont = this;

    }
    public void successful(View view){
        Toast toast = Toast.makeText(cont, "Thanks for your review \n This destination has been added to your list!", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER | Gravity.BOTTOM, 0, 0);
        toast.show();
        Toast toast2 = Toast.makeText(cont, "YOUR RANKED UP!", Toast.LENGTH_SHORT);
        toast2.setGravity(Gravity.CENTER | Gravity.BOTTOM, 0, 0);
        toast2.show();
        Main2Activity.rank++;
    }
}
