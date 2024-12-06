import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
import java.util.Collections;
import java.io.*;
import java.util.*;


    public class Ride implements RideInterface {
        private String rideName;
        private int rideID;
        private int minimumAge;
        private Employee operator;
        private Employee inspectors;
        private Queue<Visitor> queue;
        private LinkedList<Visitor> rideHistory;
        private int maxPlayer;
        private int numOfCycles;

        //Construct empty parameter function
        public Ride() {

        }

        //Construct a method with all parameters
        public Ride(String rideName, int rideID, int minimumAge, Employee operator,Employee inspectors, int maxPlayer, int numOfCycles) {
            this.rideName = rideName;
            this.rideID = rideID;
            this.minimumAge = minimumAge;
            this.operator = operator;
            this.inspectors = inspectors;
            this.queue = new LinkedList<>();
            this.rideHistory = new LinkedList<>();
            this.maxPlayer = maxPlayer;
            this.numOfCycles = 0;
        }

        // add visitors into queue
        @Override
        public void addVisitorToQueue(Visitor visitor) {
            queue.add(visitor);  // add visitor to the end of queue
            System.out.println(visitor.getName() + " has been added to the queue.");
        }

        // remove queue from queue
        @Override
        public void removeVisitorFromQueue(Visitor visitor) {
            if (queue.remove(visitor)) {
                System.out.println(visitor.getName() + " was removed from the queue.");
            } else {
                System.out.println(visitor.getName() + " not in queue.");
            }
        }

        // print all visitors in queue
        @Override
        public void printQueue() {
            System.out.println("Current queue:");
            if (queue.isEmpty()) {
                System.out.println("There is no visitor in the queue.");
            } else {
                for (Visitor visitor : queue) {
                    System.out.println(visitor.getName());
                }
            }
        }

        // Add visitor to history
        @Override
        public void addVisitorToHistory(Visitor visitor) {
            rideHistory.add(visitor);
            System.out.println(visitor.getName() + " has been added to the history.");
        }

        // Check if the visitor is in the history
        @Override
        public boolean checkVisitorFromHistory(Visitor visitor) {
            if (rideHistory.contains(visitor)) {
                System.out.println(visitor.getName() + " have ridden this ride");
                return true;
            } else {
                System.out.println(visitor.getName() + " has not ridden this ride.");
                return false;
            }
        }

        // return the amount of visitor in history
        @Override
        public int numberOfVisitors() {
            return rideHistory.size();
        }

        // print all visitor in history
        @Override
        public void printRideHistory() {
            System.out.println("Ride history:");
            if (rideHistory.isEmpty()) {
                System.out.println("No visitors have ridden this ride.");
            } else {
                Iterator<Visitor> iterator = rideHistory.iterator();  // Using iterators to traverse history
                while (iterator.hasNext()) {
                    Visitor visitor = iterator.next();
                    System.out.println(visitor);
                }
            }
        }

        // simulate running a ride
        @Override
        public void runOneCycle() {
            if (operator == null) {
                System.out.println("Rides cannot be run without operators.");
                return;
            }

            if (queue.isEmpty()) {
                System.out.println("The queue is empty, rides cannot be run.");
                return;
            }

            // Running cycle, receiving at most maxRider visitors
            int riders = 0;
            while (!queue.isEmpty() && riders < maxPlayer) {
                Visitor visitor = queue.remove();  // remove visitor from queue
                addVisitorToHistory(visitor);  // add visitor into history
                System.out.println(visitor.getName() + " is riding " + rideName + " ride.");
                riders++;
            }

            numOfCycles++;  // Increment the cycle number each time a cycle is run
            System.out.println("The amusement facilities have been completed and have received " + riders + " numbers。");
            System.out.println("Current running cycle number:" + numOfCycles);
        }

        //order the visitor history
        public void sortVisitorsInHistory() {
            // use VisitorComparator to order
            Collections.sort(rideHistory, new VisitorComparator());
            System.out.println("History has been sorted according to the rules。");
        }

        public void exportRideHistory(String fileName) {
            BufferedWriter writer = null;
            try {
                // Create a file writing stream
                writer = new BufferedWriter(new FileWriter(fileName));

                // Iterate through all visitors in history
                for (Visitor visitor : rideHistory) {
                    // Convert visitor information into CSV format and write to a file
                    writer.write(visitor.getName() + "," + visitor.getAge() + "," + visitor.getMembershipLevel());
                    writer.newLine();  // Wrap after each visitor writes
                }
                System.out.println("History successfully exported to file " + fileName);
            } catch (IOException e) {
                System.err.println("Error exporting history: " + e.getMessage());
            } finally {
                //Close the file writing stream
                try {
                    if (writer != null) {
                        writer.close();
                    }
                } catch (IOException e) {
                    System.err.println("Error closing file: " + e.getMessage());
                }
            }
        }

        public void importRideHistory(String filename) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Split row data into fields
                    String[] data = line.split(",");  // Use commas to separate each field

                    // Process each field, making sure there are no extra spaces
                    String id = data[0].trim();
                    String name = data[1].trim();
                    String gender = data[2].trim();
                    int age = Integer.parseInt(data[3].trim());
                    int phoneNumber = Integer.parseInt(data[4].trim());
                    int membershipLevel = Integer.parseInt(data[5].trim());
                    String membershipTime = data[6].trim();

                    // Create a Visitor object and add it to the history
                    Visitor visitor = new Visitor(id, name, gender, age, phoneNumber, membershipLevel, membershipTime);
                    addVisitorToHistory(visitor);
                }
            } catch (IOException e) {
                System.out.println("File read error: " + e.getMessage());
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("The data format is wrong and the number cannot be converted. Please check the data format in the file.");
                e.printStackTrace();
            }
        }

        // Getter and Setter

        public String getRideName() {
            return rideName;
        }

        public void setRideName(String rideName) {
            this.rideName = rideName;
        }

        public int getRideID() {
            return rideID;
        }

        public void setRideID(int rideID) {
            this.rideID = rideID;
        }

        public int getMinimumAge() {
            return minimumAge;
        }

        public void setMinimumAge(int minimumAge) {
            this.minimumAge = minimumAge;
        }

        public Employee getOperator() {
            return operator;
        }
        public void setOperator(Employee operator) {
            this.operator = operator;
        }

        public Employee getInspectors() {
            return inspectors;
        }
        public void setInspectors(Employee inspectors) {
            this.inspectors = inspectors;
        }


        public int getMaxPlayer() {
            return maxPlayer;
        }

        public void setMaxPlayer(int maxPlayer) {
            this.maxPlayer = maxPlayer;
        }

        public int getNumOfCycles() {
            return numOfCycles;
        }

        public void setNumOfCycles(int numOfCycles) {
            this.numOfCycles = numOfCycles;
        }

        @Override
        public String toString() {
            return "Ride Name: " + rideName + ", Ride ID: " + rideID + ", Minimum Age: " + minimumAge + ", Operator: " + operator + ", Inspectors: " + inspectors + ", Max Player: " + maxPlayer;
        }
    }
