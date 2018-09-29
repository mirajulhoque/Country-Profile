package com.example.miraj.countryprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // declaring variable

    private ListView listView;
    private String[] countryNames;
    private String[]countryDetails;
    private int[] flags={R.drawable.bd,R.drawable.india,R.drawable.pakistan,R.drawable.america,R.drawable.australia,R.drawable.japan,R.drawable.england,R.drawable.new_zealand,R.drawable.srilanka,R.drawable.china};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find View By Id

        listView=findViewById(R.id.listViewId);
        countryNames=getResources().getStringArray(R.array.Country_Names);
        countryDetails=getResources().getStringArray(R.array.country_details);

        // creating A customAdaapter
        CustomAdapter adapter= new CustomAdapter(this,countryNames,flags);
        listView.setAdapter(adapter);

        // Set On Item Click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("country_name",countryNames[i]);
                intent.putExtra("country_details",countryDetails[i]);
                intent.putExtra("country_flags",flags[i]);
                Toast.makeText(MainActivity.this, countryNames[i], Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
