import java.util.List;

public interface RideInterface {
    void addVisitorToQueue(Visitor visitor); // Add a visitor to the queue
    void removeVisitorFromQueue(Visitor visitor); // Remove a visitor from the queue
    void printQueue(); // Print all visitors in the queue
    void runOneCycle(); // Run a ride cycle
    void addVisitorToHistory(Visitor visitor); // Add a visitor to history
    boolean checkVisitorFromHistory(Visitor visitor); // Check if a visitor is in history
    int numberOfVisitors(); // Return the number of visitors in the history
    void printRideHistory(); // Print all visitors in the history
}
