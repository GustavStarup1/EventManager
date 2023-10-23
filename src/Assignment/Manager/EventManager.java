package Assignment.Manager;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class EventManager {
    ArrayList<Event> assignments;
    public static void main(String[] args) {
        new EventManager().run();
    }
    public EventManager() {
        assignments = new ArrayList<>();
    }
    Random rndm = new Random();

    public void run(){
        assignments = new ArrayList<>();
        generateAssignments();
        assignments.sort((event1, event2) -> event1.getDeadLine().compareTo(event2.getDeadLine()));

        for (Event event : assignments) {
            System.out.println(event.getName()+ " " + event.getDeadLine());
        }
    }

    public void generateAssignments() {
        for (int i = 0; i < 10000;i++) { //
            LocalDateTime deadline = getRandomDeadline();
            String name = getRandomName();
            Event newEvent = new Event(deadline,name);
            assignments.add(newEvent);
        }
    }


    private String[] subject = {
            "Programming", "System Development", "Organization", "Technology",

    };

    private LocalDateTime getRandomDeadline() {
        int year = rndm.nextInt(1)+ 2023;
        int month = rndm.nextInt(12) + 1;
        int day = rndm.nextInt(28) + 1;
        int hour = rndm.nextInt(24);
        return LocalDateTime.of(year, month, day, hour,0);
    }
    private String getRandomName() {
        int rndmNumber = rndm.nextInt(subject.length);
        return subject[rndmNumber];
    }
}

