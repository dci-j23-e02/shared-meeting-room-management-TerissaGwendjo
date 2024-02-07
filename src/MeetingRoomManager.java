public class MeetingRoomManager {
    private static MeetingRoomManager instance;
    private int numberOfChairs;
    private boolean projectorAvailable;

    // Private constructor to prevent instantiation from outside
    private MeetingRoomManager() {
        // Initialize default values
        numberOfChairs = 0;
        projectorAvailable = false;
    }

    // Public static method to return the singleton instance
    public static MeetingRoomManager getInstance() {
        if (instance == null) {
            instance = new MeetingRoomManager();
        }
        return instance;
    }

    // Method to set up the meeting room
    public void setupMeetingRoom(int numberOfChairs, boolean projectorNeeded) {
        this.numberOfChairs = numberOfChairs;
        this.projectorAvailable = projectorNeeded;
        System.out.println("Meeting room set up with " + numberOfChairs + " chairs");
        if (projectorNeeded) {
            System.out.println("Projector is available");
        } else {
            System.out.println("No projector available");
        }
    }

    // Getters for number of chairs and projector status
    public int getNumberOfChairs() {
        return numberOfChairs;
    }

    public boolean isProjectorAvailable() {
        return projectorAvailable;
    }
}
