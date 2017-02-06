package com.rancho.enhancedwiki.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.rancho.enhancedwiki.Entities.CharacterEntity;
import com.rancho.enhancedwiki.Entities.EventEntity;
import com.rancho.enhancedwiki.R;


import java.util.ArrayList;

/**
 * Created by Rancho on 23-04-2016.
 */
public class CharacterListAdapter extends ArrayAdapter<CharacterEntity> {
    Context _context;
    int _layoutId;
    ArrayList<CharacterEntity> _charactertList = null;

    public CharacterListAdapter(Context context, int layout, ArrayList<CharacterEntity> items) {
        super(context, layout, items);

        this._context = context;
        this._layoutId = layout;
        this._charactertList = items;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);

    }
    public View getCustomView(int position, View convertView, ViewGroup parent){

        View row = convertView;
        final CharacterEntity name = _charactertList.get(position);

        if (row == null) {
            row = ((LayoutInflater) _context.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                    .inflate(R.layout.character_list, null);
        }

        TextView tvCharacterName = (TextView) row.findViewById(R.id.tvCharacterName);
        tvCharacterName.setText(name.getcharacterName());

//        TextView tvEventYr = (TextView) row.findViewById(R.id.tvEventYr);
//        tvEventYr.setText(event.getEventDate().substring(0,4));

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

