### Assignment: Implementing a Naïve Singleton for a Shared Meeting Room Management System

#### Background
In a corporate environment, meeting rooms are a shared resource and often need to be managed efficiently to accommodate various teams' needs. For this assignment, you will develop a simple meeting room management system using the Naïve Singleton design pattern. This system will ensure that there is only one instance of the meeting room manager, which will handle requests for setting up meeting rooms based on different requirements such as the number of chairs needed and whether a projector is required.

#### Objectives
1. Implement a Naïve Singleton class for the meeting room manager.
2. The meeting room manager should be able to handle requests for setting up the room with a specific number of chairs and the option to use a projector.
3. Demonstrate the use of the Singleton instance by setting up meetings with different requirements.

#### Requirements
1. **MeetingRoomManager Singleton Class**: This class should be a Naïve Singleton that manages the meeting room setup. It should have properties to store the current setup state, such as the number of chairs and projector availability.

2. **Meeting Setup Method**: Implement a method within the MeetingRoomManager class that allows the setup of the meeting room. This method should accept the number of chairs required and a boolean indicating whether a projector is needed.

3. **Demonstration**: Write a main class to demonstrate the use of the MeetingRoomManager. Try to set up different meetings with varying requirements to show that the same MeetingRoomManager instance is used across all setups.

#### Assignment Tasks

1. **Implement the MeetingRoomManager Class**: Create the MeetingRoomManager class with private static instance variable, private constructor, and a public static method to return the instance. Add properties to keep track of the number of chairs and projector status.

2. **Implement the Setup Method**: This method should update the meeting room's setup based on the parameters provided (number of chairs and projector need).

3. **Demonstrate Singleton Usage**: In your main class, obtain the MeetingRoomManager instance and set up meetings with different requirements. Display the meeting room setup after each request to show that the same instance is being used and that it reflects the most recent setup.

#### Example Code Structure

```java
public final class MeetingRoomManager {
    private static MeetingRoomManager instance;
    private int chairs;
    private boolean projector;

    private MeetingRoomManager() {
        // Private constructor
    }

    public static MeetingRoomManager getInstance() {
        if (instance == null) {
            instance = new MeetingRoomManager();
        }
        return instance;
    }

    public void setupMeetingRoom(int chairs, boolean projector) {
        this.chairs = chairs;
        this.projector = projector;
        // Additional setup logic here
    }

    // Getters for chairs and projector status
    public int getChairs() {
        return chairs;
    }

    public boolean isProjectorAvailable() {
        return projector;
    }
}

public class Main {
    public static void main(String[] args) {
        MeetingRoomManager manager = MeetingRoomManager.getInstance();

        // Setup for the first meeting
        manager.setupMeetingRoom(10, true);
        System.out.println("Meeting setup: " + manager.getChairs() + " chairs, Projector needed: " + manager.isProjectorAvailable());

        // Setup for another meeting
        manager.setupMeetingRoom(5, false);
        System.out.println("Meeting setup: " + manager.getChairs() + " chairs, Projector needed: " + manager.isProjectorAvailable());
    }
}
```

#### Deliverables
1. **MeetingRoomManager.java**: The Singleton class file.
2. **Main.java**: The demonstration class file showing the Singleton in action.

This assignment will help you understand the Singleton design pattern's implementation and its practical use in managing shared resources in a software system.
