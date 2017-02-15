package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dell on 2/8/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private int tColorResourceId;

    private static final String LOG_TAG = EarthquakeAdapter.class.getSimpleName();

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> tours, int colorResourceId){
        super(context,0,tours);
        tColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Earthquake currentEarthquake = getItem(position);

        TextView magnitude = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitude.setText(String.valueOf(currentEarthquake.getMagnitude()));

        TextView location = (TextView) listItemView.findViewById(R.id.location);
        location.setText(String.valueOf(currentEarthquake.getLocation()));

        TextView time = (TextView) listItemView.findViewById(R.id.time);
        time.setText(String.valueOf(currentEarthquake.getDate()));

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),tColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;

    }

}
