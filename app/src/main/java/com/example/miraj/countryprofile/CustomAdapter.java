package com.example.miraj.countryprofile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    String[] countryNames;
    int[] flags;
    Context context;
    private LayoutInflater inflater;

    CustomAdapter (Context context,String[]countryNames,int[]flags){
        this.context=context;
        this.countryNames=countryNames;
        this.flags=flags;


    }
    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view==null){
            inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.sample,viewGroup,false);//inflater sample view
        }
       ImageView imageView=(ImageView) view.findViewById(R.id.imageViewId);//sample view Image Id
        TextView textView=(TextView)view.findViewById(R.id.CountryNameId); //sample view Text Id
        imageView.setImageResource(flags[i]);
        //Main Activity variable
        textView.setText(countryNames[i]);
        return view;
    }
}
