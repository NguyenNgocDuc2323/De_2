package com.music.events.concerts;

import com.music.events.MusicEvent;

import java.util.Scanner;

public class ConcertEvent extends MusicEvent {
    private String artistName;
    private String genre;
    public ConcertEvent(){;}
    public ConcertEvent(String eventID, String eventName, String date, int numberOfAttendees, String artistName, String genre) {
        super(eventID, eventName, date, numberOfAttendees);
        this.artistName = artistName;
        this.genre = genre;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Event ID: ");
        setEventID(scanner.nextLine());
        System.out.println("Enter Event Name: ");
        setEventName(scanner.nextLine());
        System.out.println("Enter Event Date: ");
        setDate(scanner.nextLine());
        System.out.println("Enter Number of Attendees: ");
        setNumberOfAttendees(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter Artist Name: ");
        setArtistName(scanner.nextLine());
        System.out.println("Enter Genre: ");
        setGenre(scanner.nextLine());
    }

    @Override
    public void display() {
        System.out.println("Event ID: " + getEventID());
        System.out.println("Event Name: " + getEventName());
        System.out.println("Date: " + getDate());
        System.out.println("Number of Attendees: " + getNumberOfAttendees());
        System.out.println("Artist Name: " + getArtistName());
        System.out.println("Genre: " + getGenre());
    }
}
