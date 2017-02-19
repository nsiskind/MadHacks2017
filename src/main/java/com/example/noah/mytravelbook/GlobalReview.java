package com.example.noah.mytravelbook;
import android.content.Context;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class GlobalReview extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global_review);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//    }
        ArrayList<String> friends = new ArrayList();
        friends.add("Sydeny Johnson -- Global Rank: 1");
        friends.add("Jenny Jackson -- Global Rank: 2");
        friends.add("Matt Black -- Global Rank: 3");
        friends.add("Vivek Partner -- Global Rank: 4");
        friends.add("Sam Simons -- Global Rank: 5");
        friends.add("Karl Klien -- Global Rank: 6");
        friends.add("David Davidson-- GLobal Rank: 7");



        TextView textView8;
        textView8 = (TextView) findViewById(R.id.textView24);
        for(int i = 0; i < friends.size(); i++) {
            textView8.append(friends.get(i));
            textView8.append("\n");
        }

    }

}
