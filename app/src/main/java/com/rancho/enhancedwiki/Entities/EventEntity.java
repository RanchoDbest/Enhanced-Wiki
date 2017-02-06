package com.rancho.enhancedwiki.Entities;

/**
 * Created by Rancho on 1/10/2016.
 */
public class EventEntity {
    private int _eventId;
    private String _eventName;
    private String _eventDate;
    private String _eventDescription;

    public void setEventId(int eventId){ _eventId = eventId; }
    public int getEventId() { return _eventId; }

    public void setEventDate(String eventDate){ _eventDate = eventDate; }
    public String getEventDate() { return _eventDate; }


    public void setEventName(String eventName){ _eventName = eventName; }
    public String getEventName() { return _eventName; }

    public void setEventDescription(String eventDescription){ _eventDescription = eventDescription; }
    public String getEventDescription() { return _eventDescription; }


}
