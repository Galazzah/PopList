package com.example.ghiyath.poplist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ghiyath on 5/28/2015.
 */
public class PopClassAdapter extends ArrayAdapter<PopClass> {
    public PopClassAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }
    public PopClassAdapter(Context context, int resource, List<PopClass> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.itemlistrow, null);
        }
        //Container for your data
        PopClass p = getItem(position);

        if (p != null) {
            //Be sure to check itemlistrow.xml to see if it looks the way you want
            //Whatever your stringData is -> PopClass.getStringData()
            TextView tv1 = (TextView) v.findViewById(R.id.stringData);
            //Whatever your intData is -> PopClass.getIntData()
            TextView tv2 = (TextView) v.findViewById(R.id.intData);
            //WHEREVER your image resource is located -> PopClass.getImageData
            ImageView tv3 = (ImageView) v.findViewById(R.id.imageData);
            if (tv1 != null) {
                //Fills in your StringData into a TextView (you can change the view type)
                tv1.setText(p.getStringData());
            }
            if (tv2 != null) {
                //Fills in your IntData into a TextView
                tv2.setText(p.getIntData());
            }
            if (tv3 != null) {
                //Sets your image in the ImageView
                tv3.setImageResource(p.getImageData());
            }
        }
        return v;
    }
}
