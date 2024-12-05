public class Ride {
    private String rideName;
    private int rideID;
    private int minimumAge;
    private Employee securityOfficer;

    //构造空参方法
    public Ride(){

    }

    //构造包含全部参数的方法
    public Ride(String rideName, int rideID, int minimumAge, String securityOfficer) {
        this.rideName = rideName;
        this.rideID = rideID;
        this.minimumAge = minimumAge;
        this.securityOfficer = new Employee();
    }

    //get and set
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

    public Employee getSecurityOfficer() {
        return securityOfficer;
    }
    public void setSecurityOfficer(Employee securityOfficer) {
        this.securityOfficer = securityOfficer;
    }

    @Override
    public String toString() {
        return "Ride Name:" + rideName+"Ride ID"+ rideID+"Minimum Age:"+minimumAge+"Security Officer:"+securityOfficer;
    }
}
