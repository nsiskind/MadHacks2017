package com.example.noah.mytravelbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FriendsAtDestination extends AppCompatActivity {

    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_at_destination);
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

        Bundle extras = getIntent().getExtras();
        if(extras == null) {
            newString= null;
        } else {
            newString= extras.getString(Destination.place);
        }
        String output = "Your friends that have visited " + newString ;
        TextView textView7;
        textView7  = (TextView)findViewById(R.id.textView7);
        textView7.setText(output);
          final Button button = (Button) findViewById(R.id.button8);
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                            }
//        });

        if (newString.toLowerCase().contains("madison")){
            button.setVisibility(View.VISIBLE);
        }



    }
    public void GlobalReview(View view){

     Intent intent = new Intent(this, GlobalReview.class);
     startActivity(intent);
    }
    public void ExampleReview(View view){
        Intent intent = new Intent(this, ExampleReview.class);
        startActivity(intent);
    }



}
