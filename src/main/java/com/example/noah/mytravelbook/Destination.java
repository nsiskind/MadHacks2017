package com.example.noah.mytravelbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Destination extends AppCompatActivity {
    public static String place;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);
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



    }
    public void friendsAtDestination(View view){
        TextView editText3 = (TextView) findViewById(R.id.editText3) ;

         place = editText3.getText().toString();

        Intent intent = new Intent(this, FriendsAtDestination.class);

        intent.putExtra(place, place);

        startActivity(intent);
    }



}
