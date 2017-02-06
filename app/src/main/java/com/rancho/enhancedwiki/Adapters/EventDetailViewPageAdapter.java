package com.rancho.enhancedwiki.Adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rancho.enhancedwiki.Entities.EventEntity;
import com.rancho.enhancedwiki.R;

import java.util.ArrayList;

/**
 * Created by Rancho on 3/13/2016.
 */
public class EventDetailViewPageAdapter extends PagerAdapter {
    private Context _context;
    private ArrayList<EventEntity> _eventList;
    EventEntity selectedEvent;
    LayoutInflater inflater;

    final private String NULL = "-.-";

    public EventDetailViewPageAdapter(Context context, ArrayList<EventEntity> eventList)
    {
        _context = context;
        _eventList = eventList;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) _context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View itemView = inflater.inflate(R.layout.fragment_event_detail, container, false);

        selectedEvent = _eventList.get(position);

        final TextView tvEventDescription = (TextView) itemView.findViewById(R.id.tvEventDescription);
//        final TextView tvAddress = (TextView)itemView.findViewById(R.id.tvAddress);
//        final TextView tvLocation = (TextView)itemView.findViewById(R.id.tvLocation);
//        final TextView tvCity = (TextView)itemView.findViewById(R.id.tvCity);
//        final TextView tvContact = (TextView)itemView.findViewById(R.id.tvContact);
//        final TextView tvContactPerson = (TextView)itemView.findViewById(R.id.tvContactPerson);
//        final TextView tvEmail = (TextView)itemView.findViewById(R.id.tvEmail);
//        final TextView tvWebsite = (TextView)itemView.findViewById(R.id.tvWebsite);
//        final TextView tvWork = (TextView) itemView.findViewById(R.id.tvWork);

        String eventDescription = selectedEvent.getEventDescription();
//        String address = selectedNGO.getNGOAddress();
//        String location = selectedNGO.getNGOLocation();
//        String city = selectedNGO.getNGOCity();
//        String pincode = selectedNGO.getNGOPinCode();
//        String contactPerson = selectedNGO.getNGOContactPerson();
//        String mobile = selectedNGO.getNGOMobile();
//        String phone = selectedNGO.getNGOPhone();
//        String email = selectedNGO.getNGOEmail();
//        String website = selectedNGO.getNGOWebsite();
//        String work = selectedNGO.getNGOWork();
//        String contact = "";

        tvEventDescription.setText(eventDescription);

        if(eventDescription.trim().length() > 0) {
            tvEventDescription.setText(eventDescription);
//        } else {
//            tvAddress.setText(NULL);
//        }
//
//        if(location.trim().length() > 0) {
//            tvLocation.setText(location);
//        } else {
//            tvLocation.setText(NULL);
//        }
//
//        if(pincode.trim().length() > 0) {
//            tvCity.setText(city + " - " + pincode);
//        } else {
//            tvCity.setText(city);
//        }
//
//        if(contactPerson.trim().length() > 0) {
//            tvContactPerson.setText(contactPerson);
//        } else {
//            tvContactPerson.setText(NULL);
//        }
//
//        if(mobile.trim().length() > 0 && phone.trim().length() > 0) {
//            tvContact.setText(mobile + " / " + phone);
//        } else if(mobile.trim().length() > 0 && phone.trim().length() == 0) {
//            tvContact.setText(mobile);
//        } else if(mobile.trim().length() == 0 && phone.trim().length() > 0) {
//            tvContact.setText(phone);
//        } else {
//            tvContact.setText(NULL);
//        }
//
//        if(email.trim().length() > 0) {
//            tvEmail.setText(email);
//        } else {
//            tvEmail.setText(NULL);
//        }
//
//        if(website.trim().length() > 0) {
//            tvWebsite.setText(website);
//        } else {
//            tvWebsite.setText(NULL);
//        }
//
//        if(work.trim().length() > 0) {
//            tvWork.setText(work);
//        } else {
//            tvWork.setText(NULL);
       }

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return _eventList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == ((View) o);
    }

}
