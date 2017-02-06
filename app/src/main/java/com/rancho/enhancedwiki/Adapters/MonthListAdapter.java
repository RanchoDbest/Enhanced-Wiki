package com.rancho.enhancedwiki.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.rancho.enhancedwiki.Entities.EventEntity;
import com.rancho.enhancedwiki.R;

import java.util.ArrayList;

/**
 * Created by Rancho on 3/11/2016.
 */
public class MonthListAdapter extends ArrayAdapter<EventEntity> {
    Context _context;
    int _layoutId;
    ArrayList<EventEntity> _eventList = null;

    public MonthListAdapter(Context context, int layout, ArrayList<EventEntity> items) {
        super(context, layout, items);

        this._context = context;
        this._layoutId = layout;
        this._eventList = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);

    }


    public View getCustomView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        final EventEntity event = _eventList.get(position);

        if (row == null) {
            row = ((LayoutInflater) _context.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                    .inflate(R.layout.event_list_item, null);
        }

        TextView tvEvent = (TextView) row.findViewById(R.id.tvEvent);
        tvEvent.setText(event.getEventName());

        TextView tvEventYr = (TextView) row.findViewById(R.id.tvEventYr);
        tvEventYr.setText(event.getEventDate().substring(6, 8));

//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MMM-dd");
//
//        try {
//            Date date = format.parse(event.getEventDate());
//
//            Calendar calendar = Calendar.getInstance();
//            calendar.setTime(date);
//            int year = calendar.get(Calendar.YEAR);
//
//            tvEventYr.setText(String.valueOf(year));
//
//
//        } catch (ParseException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

        return row;
    }
}
