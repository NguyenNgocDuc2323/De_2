package com.music.events;

public abstract class MusicEvent {
    private String eventID;
    private String eventName;
    private String date;
    private int numberOfAttendees;
    public MusicEvent(){;}

    public MusicEvent(String eventID, String eventName, String date, int numberOfAttendees) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.date = date;
        this.numberOfAttendees = numberOfAttendees;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }
    public abstract void input();
    public abstract void display();
    @Override
    public String toString() {
        return "MusicEvent{" +
                "eventID='" + eventID + '\'' +
                ", eventName='" + eventName + '\'' +
                ", date='" + date + '\'' +
                ", numberOfAttendees=" + numberOfAttendees +
                '}';
    }
}
