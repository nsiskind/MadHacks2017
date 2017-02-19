package com.example.noah.mytravelbook;

import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    Context cont;
   static int rank = 8;
    public int getRank(){
        return rank;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        cont = this;
        successful();


        String output = "User Rank: " + rank ;
        TextView textView3;
        textView3  = (TextView)findViewById(R.id.textView3);
        textView3.setText(output);
    }

    public void successful(){
        Toast toast = Toast.makeText(cont, "Login Succesful", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER | Gravity.BOTTOM, 0, 0);
        toast.show();

    }
    public void destination(View view){
        Intent intent = new Intent(this, Destination.class);
        startActivity(intent);
    }
    public void review(View view){
        Intent intent = new Intent(this, Reviews.class);
        startActivity(intent);
    }

    public void friendList(View view){
        Intent intent = new Intent(this, Friend_List.class);
        startActivity(intent);
    }
}
