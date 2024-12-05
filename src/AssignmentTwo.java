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
        Visitor visitor1 = new Visitor("V430", "Sherry", "Female", 20, 3348590, 4, "2 Years");
        Visitor visitor2 = new Visitor("V289", "Keren", "Female", 24, 8746373, 1, "1 Years");
        Visitor visitor3 = new Visitor("V124", "Kristien", "Male", 25, 7466534, 6, "4 Years");
        Visitor visitor4 = new Visitor("V520", "Maggie", "Female", 21, 3529485, 4, "3 Years");
        Visitor visitor5 = new Visitor("V220", "Joey", "Male", 23, 2145530, 2, "1 Years");

        Employee operator = new Employee();
        Ride ride = new Ride("Roller Coaster", 7, 13, operator,20,5);


// 将游客添加到队列中
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
        Visitor visitor1 = new Visitor("V430", "Sherry", "Female", 20, 3348590, 4, "2 Years");
        Visitor visitor2 = new Visitor("V289", "Keren", "Female", 24, 8746373, 1, "1 Years");
        Visitor visitor3 = new Visitor("V124", "Kristien", "Male", 25, 7466534, 6, "4 Years");
        Visitor visitor4 = new Visitor("V520", "Maggie", "Female", 21, 3529485, 4, "3 Years");
        Visitor visitor5 = new Visitor("V220", "Joey", "Male", 23, 2145530, 2, "1 Years");

        Employee operator1 = new Employee("E223","Harry","Male",30,5563829,"Operator","2 Years","Roller Coaster");
        Employee operator2 =new Employee("E563","Peter","Male",38,7384920,"Operator","5 Years","Thunder Storm");
        Ride  ride = new Ride("Roller Coaster", 7, 13, operator1,20,9);


        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);

        // 执行一次游乐设施
        ride.runOneCycle();

        // 检查访客是否在历史记录中
        ride.checkVisitorFromHistory(visitor1);
        ride.checkVisitorFromHistory(visitor2);

        // 打印历史记录中的访客
        ride.printRideHistory();

        // 打印历史记录中的访客数量
        System.out.println("乘坐过游乐设施的访客数量: " + ride.numberOfVisitors());
        System.out.println("\n--------------------------------------------");

    }


    public void partFourB(){
        Employee operator1 = new Employee("E223","Harry","Male",30,5563829,"Operator","2 Years","Roller Coaster");
        Ride  rollerCoaster = new Ride("Roller Coaster", 7, 13, operator1,20,9);

        rollerCoaster.addVisitorToHistory(new Visitor("V430", "Sherry", "Female", 20, 3348590, 4, "2 Years"));
        rollerCoaster.addVisitorToHistory(new Visitor("V289", "Keren", "Female", 24, 8746373, 1, "1 Years"));
        rollerCoaster.addVisitorToHistory(new Visitor("V124", "Kristien", "Male", 25, 7466534, 6, "4 Years"));
        rollerCoaster.addVisitorToHistory(new Visitor("V520", "Maggie", "Female", 21, 3529485, 4, "3 Years"));
        rollerCoaster.addVisitorToHistory(new Visitor("V220", "Joey", "Male", 23, 2145530, 2, "1 Years"));



        System.out.println("未排序的访客：");
        rollerCoaster.printRideHistory();

        // 对访客进行排序
        rollerCoaster.sortVisitorsInHistory();

        // 打印所有访客（排序后）
        System.out.println("\n排序后的访客：");
        rollerCoaster.printRideHistory();
        System.out.println("\n--------------------------------------------");

    }
    public void partFive(){
        Employee operator1 = new Employee("E223","Harry","Male",30,5563829,"Operator","2 Years","Roller Coaster");
        Employee operator2 =new Employee("E563","Peter","Male",38,7384920,"Operator","5 Years","Thunder Storm");
        Ride  ride = new Ride("Thunder Storm", 5, 15, operator2,23,5);

        Visitor visitor1 = new Visitor("V430", "Sherry", "Female", 20, 3348590, 4, "2 Years");
        Visitor visitor2 = new Visitor("V289", "Keren", "Female", 24, 8746373, 1, "1 Years");
        Visitor visitor3 = new Visitor("V124", "Kristien", "Male", 25, 7466534, 6, "4 Years");
        Visitor visitor4 = new Visitor("V520", "Maggie", "Female", 21, 3529485, 4, "3 Years");
        Visitor visitor5 = new Visitor("V220", "Joey", "Male", 23, 2145530, 2, "1 Years");

        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);

        // 打印队列中的所有访客
        ride.printQueue();

        // 运行一次周期
        ride.runOneCycle();

        // 打印队列中的访客
        ride.printQueue();

        // 打印所有历史记录中的访客
        ride.printRideHistory();
        System.out.println("\n--------------------------------------------");
    }

    public void partSix(){
        Employee operator1 = new Employee("E223","Harry","Male",30,5563829,"Operator","2 Years","Roller Coaster");
        Employee operator2 =new Employee("E563","Peter","Male",38,7384920,"Operator","5 Years","Thunder Storm");
        Ride  ride = new Ride("Roller Coaster", 7, 13, operator1,20,9);

        ride.addVisitorToHistory(new Visitor("V430", "Sherry", "Female", 20, 3348590, 4, "2 Years"));
        ride.addVisitorToHistory(new Visitor("V289", "Keren", "Female", 24, 8746373, 1, "1 Years"));
        ride.addVisitorToHistory(new Visitor("V124", "Kristien", "Male", 25, 7466534, 6, "4 Years"));
        ride.addVisitorToHistory(new Visitor("V520", "Maggie", "Female", 21, 3529485, 4, "3 Years"));
        ride.addVisitorToHistory(new Visitor("V220", "Joey", "Male", 23, 2145530, 2, "1 Years"));

        ride.exportRideHistory("ride_history.csv");
        System.out.println("\n--------------------------------------------");



    }
    public void partSeven(){
    }
}





/***Employee employee1=new Employee("E567","Abby","Female",35,7788293,"Ticket checking","5 Years","Roller coaster");
        Employee employee2=new Employee("E378","Frank","Male",40,8233490,"Safety officer","7 Years","Roller Coaster");
        Employee employee3=new Employee("E235","Tommy","Male",43,2234775,"Operator","9 Years","Roller Coaster");

        Visitor visitor1=new Visitor("V220","Sherry","Female",20,3348590,4,"3 Years");
        Ride RollerCoaster1=new Ride("Roller coaster",67,13,employee2,employee3);


        System.out.println(employee1);

        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(visitor1);
        System.out.println(RollerCoaster1);***/

