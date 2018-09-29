package com.example.miraj.countryprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        textView1=findViewById(R.id.detailsId);
        imageView=findViewById(R.id.imageViewId);


        Bundle bundle=getIntent().getExtras();

        if (bundle!=null){

            imageView.setImageResource(bundle.getInt("country_flags"));
            textView1.setText(bundle.getString("country_details"));
        }
    }
}
