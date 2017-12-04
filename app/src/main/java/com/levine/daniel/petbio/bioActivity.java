package com.levine.daniel.petbio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class bioActivity extends AppCompatActivity {

    private ImageView petImageView;
    private TextView petName;
    private TextView petBio;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        petImageView = (ImageView) findViewById(R.id.petImageViewID);
        petName = (TextView) findViewById(R.id.nameID);
        petBio = (TextView) findViewById(R.id.bioTextID);

        extras = getIntent().getExtras();

        if (extras!=null){
            String name = extras.getString("name");
            String bio = extras.getString("bio");

            setUp(name,bio);
        }



    }

    public void setUp(String name,String bio){
        if(name.equals("Dufus")){
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_launcher_background));
        }else if (name.equals("Jarvis")){
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_launcher_foreground));
        }
        petName.setText(name);
        petBio.setText(bio);
    }
}
