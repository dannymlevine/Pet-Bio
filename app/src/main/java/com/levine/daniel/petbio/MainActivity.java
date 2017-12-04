package com.levine.daniel.petbio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView catView;
    private ImageView dogView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catView = (ImageView) findViewById(R.id.catView);
        dogView = (ImageView) findViewById(R.id.dogView);
        catView.setOnClickListener(this);
        dogView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.catView:
                Intent catIntent = new Intent(MainActivity.this,bioActivity.class);
                catIntent.putExtra("name","Jarvis");
                catIntent.putExtra("bio","Great cat. Loves People and meows a lot!");
                startActivity(catIntent);
                break;
            case R.id.dogView:
                Intent dogIntent = new Intent(MainActivity.this,bioActivity.class);
                dogIntent.putExtra("name","Dufus");
                dogIntent.putExtra("bio","Great dog. Barks and eats a lot!");
                startActivity(dogIntent);

                break;
        }

    }
}
