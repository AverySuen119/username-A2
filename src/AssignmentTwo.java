public class AssignmentTwo {

    public static void main(String[] args) {
        // In the main method, you can call the methods for each part.
        AssignmentTwo assignment = new AssignmentTwo();

        // Example of calling the methods for each part
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
        assignment.partFive();
        assignment.partSix();
        assignment.partSeven();
    }

    public void partThree(){
        System.out.println("\nPart Three");
        Visitor visitor1 = new Visitor("V430", "Sherry", "Female", 20, 3348590, 4, "2 Years");
        Visitor visitor2 = new Visitor("V289", "Keren", "Female", 24, 8746373, 1, "1 Years");
        Visitor visitor3 = new Visitor("V124", "Kristien", "Male", 25, 7466534, 6, "4 Years");
        Visitor visitor4 = new Visitor("V520", "Maggie", "Female", 21, 3529485, 4, "3 Years");
        Visitor visitor5 = new Visitor("V220", "Joey", "Male", 23, 2145530, 2, "1 Years");

        Employee operator1 = new Employee("E223","Harry","Male",30,5563829,"Operator","2 Years","Roller Coaster");
        Employee operator2 =new Employee("E563","Peter","Male",38,7384920,"Inspectors","5 Years","Thunder Storm");
        Ride ride = new Ride("Roller Coaster", 7, 13, operator1,operator2,20,5);


// Adding visitors to the queue
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);

        ride.printQueue();

        ride.removeVisitorFromQueue(visitor3);

        ride.printQueue();
        System.out.println("\n--------------------------------------------");
    }

    public void partFourA(){
        System.out.println("\nPart Four A");
        Visitor visitor1 = new Visitor("V430", "Sherry", "Female", 20, 3348590, 4, "2 Years");
        Visitor visitor2 = new Visitor("V289", "Keren", "Female", 24, 8746373, 1, "1 Years");
        Visitor visitor3 = new Visitor("V124", "Kristien", "Male", 25, 7466534, 6, "4 Years");
        Visitor visitor4 = new Visitor("V520", "Maggie", "Female", 21, 3529485, 4, "3 Years");
        Visitor visitor5 = new Visitor("V220", "Joey", "Male", 23, 2145530, 2, "1 Years");

        Employee operator1 = new Employee("E223","Harry","Male",30,5563829,"Operator","2 Years","Roller Coaster");
        Employee operator2 =new Employee("E563","Peter","Male",38,7384920,"Inspectors","5 Years","Thunder Storm");
        Ride  ride = new Ride("Roller Coaster", 7, 13, operator1,operator2,20,9);


        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);

        // Take a ride
        ride.runOneCycle();

        // Check if the visitor is in the history
        ride.checkVisitorFromHistory(visitor1);
        ride.checkVisitorFromHistory(visitor2);

        // Print visitors from history
        ride.printRideHistory();

        // Print the number of visitors in the history
        System.out.println("Number of visitors who rode the ride: " + ride.numberOfVisitors());
        System.out.println("\n--------------------------------------------");

    }


    public void partFourB(){
        System.out.println("\nPart Four B");
        Employee operator1 = new Employee("E223","Harry","Male",30,5563829,"Operator","2 Years","Roller Coaster");
        Employee operator2 =new Employee("E563","Peter","Male",38,7384920,"Inspectors","5 Years","Roller Coaster");
        Ride  rollerCoaster = new Ride("Roller Coaster", 7, 13, operator1,operator2,20,9);

        rollerCoaster.addVisitorToHistory(new Visitor("V430", "Sherry", "Female", 20, 3348590, 4, "2 Years"));
        rollerCoaster.addVisitorToHistory(new Visitor("V289", "Keren", "Female", 24, 8746373, 1, "1 Years"));
        rollerCoaster.addVisitorToHistory(new Visitor("V124", "Kristien", "Male", 25, 7466534, 6, "4 Years"));
        rollerCoaster.addVisitorToHistory(new Visitor("V520", "Maggie", "Female", 21, 3529485, 4, "3 Years"));
        rollerCoaster.addVisitorToHistory(new Visitor("V220", "Joey", "Male", 23, 2145530, 2, "1 Years"));



        System.out.println("Unsorted visitors：");
        rollerCoaster.printRideHistory();

        // Sort visitors
        rollerCoaster.sortVisitorsInHistory();

        // Print all visitors (sorted)
        System.out.println("\nSorted visitors：");
        rollerCoaster.printRideHistory();
        System.out.println("\n--------------------------------------------");

    }
    public void partFive(){
        System.out.println("\nPart Five");
        Employee operator1 = new Employee("E223","Harry","Male",30,5563829,"Operator","2 Years","Thunder Storm");
        Employee operator2 =new Employee("E563","Peter","Male",38,7384920,"Operator","5 Years","Thunder Storm");
        Ride  ride = new Ride("Thunder Storm", 5, 15, operator1,operator2,23,5);

        Visitor visitor1 = new Visitor("V430", "Sherry", "Female", 20, 3348590, 4, "2 Years");
        Visitor visitor2 = new Visitor("V289", "Keren", "Female", 24, 8746373, 1, "1 Years");
        Visitor visitor3 = new Visitor("V124", "Kristien", "Male", 25, 7466534, 6, "4 Years");
        Visitor visitor4 = new Visitor("V520", "Maggie", "Female", 21, 3529485, 4, "3 Years");
        Visitor visitor5 = new Visitor("V220", "Joey", "Male", 23, 2145530, 2, "1 Years");
        Visitor visitor6 = new Visitor("V156", "Avery", "Female", 20, 5202210, 3, "2 Years");
        Visitor visitor7 = new Visitor("V532", "Wendy", "Female", 23, 5211190, 3, "2 Years");
        Visitor visitor8 = new Visitor("V266", "Irene", "Female", 25, 3300319, 3, "2 Years");
        Visitor visitor9 = new Visitor("V732", "Carol", "Female", 33, 2124378, 4, "6 Years");
        Visitor visitor10 = new Visitor("V330", "Abby", "Female", 34, 6362130, 5, "7 Years");
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);
        ride.addVisitorToQueue(visitor6);
        ride.addVisitorToQueue(visitor7);
        ride.addVisitorToQueue(visitor8);
        ride.addVisitorToQueue(visitor9);
        ride.addVisitorToQueue(visitor10);

        // Print all visitors in the queue
        ride.printQueue();

        // Run a cycle
        ride.runOneCycle();

        // Print the guests in the queue
        ride.printQueue();

        // Print all guests in the history
        ride.printRideHistory();
        System.out.println("\n--------------------------------------------");
    }

    public void partSix(){
        System.out.println("\nPart Six");
        Employee operator1 = new Employee("E223","Harry","Male",30,5563829,"Operator","2 Years","Roller Coaster");
        Employee operator2 =new Employee("E563","Peter","Male",38,7384920,"Operator","5 Years","Roller Coaster");
        Ride  ride = new Ride("Roller Coaster", 7, 13, operator1,operator2,20,9);

        ride.addVisitorToHistory(new Visitor("V430", "Sherry", "Female", 20, 3348590, 4, "2 Years"));
        ride.addVisitorToHistory(new Visitor("V289", "Keren", "Female", 24, 8746373, 1, "1 Years"));
        ride.addVisitorToHistory(new Visitor("V124", "Kristien", "Male", 25, 7466534, 6, "4 Years"));
        ride.addVisitorToHistory(new Visitor("V520", "Maggie", "Female", 21, 3529485, 4, "3 Years"));
        ride.addVisitorToHistory(new Visitor("V220", "Joey", "Male", 23, 2145530, 2, "1 Years"));

        ride.exportRideHistory("ride_history.csv");
        System.out.println("\n--------------------------------------------");



    }
    public void partSeven(){
        System.out.println("\nPart Seven");
        Employee operator1 = new Employee("E223","Harry","Male",30,5563829,"Operator","2 Years","Thunder Storm");
        Employee operator2 =new Employee("E563","Peter","Male",38,7384920,"Operator","5 Years","Thunder Storm");
        Ride  ride = new Ride("Thunder Storm", 5, 15, operator1,operator2,23,5);

        String filename = "ride_history.txt";

        // Import history
        ride.importRideHistory(filename);

        // Print number of guests in the history
        System.out.println("导入的访客数量: " + ride.numberOfVisitors());

        // Print all imported guest information
        ride.printRideHistory();
    }
}




