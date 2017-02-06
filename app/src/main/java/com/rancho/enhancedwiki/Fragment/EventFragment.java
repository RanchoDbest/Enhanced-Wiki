package com.rancho.enhancedwiki.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.rancho.enhancedwiki.Adapters.EventListAdapter;
import com.rancho.enhancedwiki.Entities.EventEntity;
import com.rancho.enhancedwiki.R;
import com.rancho.enhancedwiki.SQLHelper.DBHelper;


import java.util.ArrayList;

/**
 * Created by Rancho on 1/10/2016.
 */
public class EventFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Event List");

        View rootView = inflater.inflate(R.layout.fragment_event, container, false);
        ListView lvEvent = (ListView) rootView.findViewById(R.id.lvEvent);

        DBHelper db = new DBHelper(getActivity().getApplicationContext());
        ArrayList<EventEntity> eventList = db.GetAllEvent();
        db.close();

        EventListAdapter adapter = new EventListAdapter(getActivity().getApplicationContext(),
                R.layout.event_list_item, eventList);
        lvEvent.setAdapter(adapter);


//        lvNGO.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(getActivity().getApplicationContext(), NGODetailActivity.class);
//                intent.putExtra("selectedIndex", position);
//                startActivity(intent);
//
//            }
//        });

        return rootView;

    }
}
