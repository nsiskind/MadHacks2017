package com.example.noah.mytravelbook;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Friend_List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend__list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        ArrayList<String> friends = new ArrayList();
        friends.add("Sydeny Johnson -- Global Rank: 10");
        friends.add("Jenny Jackson -- Global Rank: 57");
        friends.add("Matt Black -- Global Rank: 151");
        friends.add("Vivek Partner -- Global Rank: 321");
        friends.add("Sam Simons -- Global Rank: 400");
        friends.add("Karl Klien -- Global Rank: 467");
        friends.add("David Davidson-- GLobal Rank: 501");



        TextView textView8;
        textView8 = (TextView) findViewById(R.id.textView14);
        for(int i = 0; i < friends.size(); i++) {
            textView8.append(friends.get(i));
            textView8.append("\n");
        }
    }

}
