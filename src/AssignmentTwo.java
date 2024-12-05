public class AssignmentTwo {
    public static void main(String[] args) {

    }
    public void partThree(){

        Visitor visitor1 = new Visitor("V220","Sherry","Female",20,3348590,4,"3 Years");
        Visitor visitor2 = new Visitor("V289","Sherry","Female",20,3348590,4,"3 Years");
        Visitor visitor3 = new Visitor("V124","Sherry","Female",20,3348590,4,"3 Years");
        Visitor visitor4 = new Visitor("V520","Sherry","Female",20,3348590,4,"3 Years");
        Visitor visitor5 = new Visitor("V220","Sherry","Female",20,3348590,4,"3 Years");

        Employee operator = new Employee();
        Ride ride =new Ride("Roller Coaster",7,13,operator);

            }
// 将游客添加到队列中
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);





            public void partFourA(){
            }
            public void partFourB(){
            }
            public void partFive(){
            }
            public void partSix(){
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

    }
}
