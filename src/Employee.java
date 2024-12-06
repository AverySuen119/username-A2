public class Employee extends Person {
    private String workType;
    private String workLength;
    private String responsibilityRide;
    //Construct empty parameter function
    public Employee(){

    }


    //Construct a method with all parameters
    public Employee(String id,String name,String gender,int age,int phoneNumber,String workType,String workLength,String responsibilityRide) {
        super(id,name,gender,age,phoneNumber);
        this.workType = workType;
        this.workLength = workLength;
        this.responsibilityRide=responsibilityRide;
    }
    //get and set
    public String getWorkType() {
        return workType;
    }
    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getWorkLength() {
        return workLength;
    }
    public void setWorkLength(String workLength) {
        this.workLength = workLength;
    }

    public String getResponsibilityRide() {
        return responsibilityRide;
    }
    public void setResponsibilityRide(String responsibilityRide) {
    this.responsibilityRide = responsibilityRide;
    }

    @Override
    public String toString() {
        return super.toString()+", Work Type: "+workType+", Work Length: "+workLength+", Responsibility Ride: "+responsibilityRide;
   }
}


