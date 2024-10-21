package com.music.test;

import com.music.events.concerts.ConcertEvent;
import com.music.events.festivals.FestivalEvent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MusicEventTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        List<ConcertEvent> concertEvents = new ArrayList<>();
        List<FestivalEvent> festivalEvents = new ArrayList<>();

        while (choice != 5) {
            System.out.println("+--------------------- MENU ----------------------------+");
            System.out.println("1. Input information for n Concert Events.");
            System.out.println("2. Input information for n Festival Events.");
            System.out.println("3. Display information of n Concert Events (Sorted by number of attendees descending).");
            System.out.println("4. Display information of n Festival Events (Sorted by duration days ascending).");
            System.out.println("5. Exit");
            System.out.println("+--------------------------------------------------------+");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter the number of concert events: ");
                    int concertEventNum = sc.nextInt();
                    for (int i = 0; i < concertEventNum; i++) {
                        ConcertEvent concertEvent = new ConcertEvent();
                        concertEvent.input();
                        concertEvents.add(concertEvent);
                    }
                    break;
                case 2:
                    System.out.println("\nEnter the number of festival events: ");
                    int festivalEventNum = sc.nextInt();
                    for (int i = 0; i < festivalEventNum; i++) {
                        FestivalEvent festivalEvent = new FestivalEvent();
                        festivalEvent.input();
                        festivalEvents.add(festivalEvent);
                    }
                    break;
                case 3:
                    if (concertEvents.isEmpty()) {
                        System.out.println("No concert events to display.");
                    } else {
                        List<ConcertEvent> sortedConcertEvents = concertEvents.stream()
                                .sorted(Comparator.comparing(ConcertEvent::getNumberOfAttendees).reversed()) // Sắp xếp giảm dần
                                .toList();

                        sortedConcertEvents.forEach(ConcertEvent::display);
                    }
                    break;
                case 4:
                    if (festivalEvents.isEmpty()) {
                        System.out.println("No festival events to display.");
                    } else {
                        List<FestivalEvent> sortedFestivalEvents = festivalEvents.stream()
                                .sorted(Comparator.comparing(FestivalEvent::getDurationDays)) // Sắp xếp tăng dần
                                .toList();
                        sortedFestivalEvents.forEach(FestivalEvent::display);
                    }
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
