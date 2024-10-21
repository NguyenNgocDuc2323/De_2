package com.music.events.festivals;

import com.music.events.MusicEvent;

import java.util.Scanner;

public class FestivalEvent extends MusicEvent {
    private int numberOfStages;
    private int durationDays;
    public FestivalEvent(){;}

    public FestivalEvent(String eventID, String eventName, String date, int numberOfAttendees, int numberOfStages, int durationDays) {
        super(eventID, eventName, date, numberOfAttendees);
        this.numberOfStages = numberOfStages;
        this.durationDays = durationDays;
    }

    public int getNumberOfStages() {
        return numberOfStages;
    }

    public void setNumberOfStages(int numberOfStages) {
        this.numberOfStages = numberOfStages;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }
    public double calculateEstimatedAttendance(FestivalEvent festivalEvent){
        double estimatedAttendance = 0;
        estimatedAttendance = festivalEvent.getNumberOfStages() * festivalEvent.getDurationDays() * 1000;
        return estimatedAttendance;
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
        System.out.println("Enter Number of Stages: ");
        setNumberOfStages(scanner.nextInt());
        System.out.println("Enter Duration Days: ");
        setDurationDays(scanner.nextInt());
        double estimatedAttendance = calculateEstimatedAttendance(this);
        System.out.println("Estimated Attendance: " + estimatedAttendance);
    }

    @Override
    public void display() {
        System.out.println("Event ID: " + getEventID());
        System.out.println("Event Name: " + getEventName());
        System.out.println("Date: " + getDate());
        System.out.println("Number of Attendees: " + getNumberOfAttendees());
        System.out.println("Number of Stages: " + getNumberOfStages());
        System.out.println("Duration Days: " + getDurationDays());

    }
}
