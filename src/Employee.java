public class Employee extends Person {
    private String workType;
    private String workLength;
    private String responsibilityRide;
    //构造空参方法
    public Employee(){

    }


    //构造包含全部参数的函数
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


