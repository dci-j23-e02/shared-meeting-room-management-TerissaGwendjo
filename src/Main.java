public class Main {
    public static void main(String[] args) {
        // Obtain the MeetingRoomManager instance
        MeetingRoomManager manager = MeetingRoomManager.getInstance();

        // Set up meetings with different requirements
        manager.setupMeetingRoom(10, true);
        System.out.println("Number of chairs: " + manager.getNumberOfChairs());
        System.out.println("Projector available: " + manager.isProjectorAvailable());

        // Another meeting setup
        manager.setupMeetingRoom(15, false);
        System.out.println("Number of chairs: " + manager.getNumberOfChairs());
        System.out.println("Projector available: " + manager.isProjectorAvailable());

        // Demonstrate that the same instance is used across all setups
        MeetingRoomManager manager2 = MeetingRoomManager.getInstance();
        System.out.println("Are the two instances the same? " + (manager == manager2));
    }
}