package com.example.countryprofile;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.SearchView;

import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bangladeshButton,indiaButton,pakistanButton,bhutanButton,nepalButton,srilankaButton,afghanistanButton,maldiveButton;
    private Intent intent;

    private AutoCompleteTextView autoCompleteTextView;
    private String[] countryNames;
 //   ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoTextView);
        countryNames=getResources().getStringArray(R.array.country_names);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,countryNames);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);

       // MenuItem menuItem = null;
       // SearchView searchView=(SearchView) menuItem.getActionView();

        bangladeshButton=(Button) findViewById(R.id.bangladeshButtonId);
        indiaButton=(Button) findViewById(R.id.indiaButtonId);
        pakistanButton=(Button) findViewById(R.id.pakistanButtonId);
        bhutanButton=(Button) findViewById(R.id.bhutanButtonId);
        nepalButton=(Button) findViewById(R.id.nepalButtonId);
        srilankaButton=(Button)findViewById(R.id.srilankaButtonId);
        afghanistanButton=(Button)findViewById(R.id.afghanistanButtonId);
        maldiveButton=(Button) findViewById(R.id.maldiveButtonId);

        bangladeshButton.setOnClickListener(this);
        indiaButton.setOnClickListener(this);
        pakistanButton.setOnClickListener(this);
        bhutanButton.setOnClickListener(this);
        nepalButton.setOnClickListener(this);
        srilankaButton.setOnClickListener(this);
        afghanistanButton.setOnClickListener(this);
        maldiveButton.setOnClickListener(this);
    }





    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.bangladeshButtonId){

            intent=new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","bangladesh");
            startActivity(intent);
        }

        if(v.getId()==R.id.indiaButtonId){

            intent=new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","india");
            startActivity(intent);
        }

        if(v.getId()==R.id.pakistanButtonId){

            intent=new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","pakistan");
            startActivity(intent);
        }

        if(v.getId()==R.id.bhutanButtonId){

            intent=new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","bhutan");
            startActivity(intent);
        }

        if(v.getId()==R.id.nepalButtonId){

            intent=new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","nepal");
            startActivity(intent);
        }

        if(v.getId()==R.id.srilankaButtonId){

            intent=new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","srilanka");
            startActivity(intent);
        }


        if(v.getId()==R.id.afghanistanButtonId){

            intent=new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","afghanistan");
            startActivity(intent);
        }


        if(v.getId()==R.id.maldiveButtonId){

            intent=new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","maldive");
            startActivity(intent);
        }


    }
}
