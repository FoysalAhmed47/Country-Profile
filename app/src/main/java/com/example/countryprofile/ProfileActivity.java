package com.example.countryprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
        private ImageView imageView;
        private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView=(ImageView) findViewById(R.id.imageViewId);
        textView=(TextView) findViewById(R.id.textViewId);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String countryName=bundle.getString("name");
            showDetails(countryName);
        }
    }

    private void showDetails(String countryName) {

        if (countryName.equals("bangladesh")){
            imageView.setImageResource(R.drawable.parliament);
            textView.setText(R.string.bangladesh_text);
        }

        if (countryName.equals("india")){
            imageView.setImageResource(R.drawable.tajmohol);
            textView.setText(R.string.india_text);
        }

        if (countryName.equals("pakistan")){
            imageView.setImageResource(R.drawable.paparlama);
            textView.setText(R.string.pakistan_text);
        }

        if (countryName.equals("bhutan")){
            imageView.setImageResource(R.drawable.butancuntry);
            textView.setText(R.string.bhutan_text);
        }

        if (countryName.equals("nepal")){
            imageView.setImageResource(R.drawable.nepalcuntry);
            textView.setText(R.string.nepal_text);
        }

        if (countryName.equals("srilanka")){
            imageView.setImageResource(R.drawable.srilankacuntry);
            textView.setText(R.string.srilanka_text);
        }

        if (countryName.equals("afghanistan")){
            imageView.setImageResource(R.drawable.afghan);
            textView.setText(R.string.afghanistan_text);
        }

        if (countryName.equals("maldive")){
            imageView.setImageResource(R.drawable.mmmmm);
            textView.setText(R.string.maldives_text);
        }
    }
}
