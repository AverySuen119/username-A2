public class Visitor extends Person {
    public int membershipLevel;
    public String membershipTime;

    //构造空参方法
    public Visitor() {

    }

    //构造包含全部参数的方法
    public Visitor(String id,String name,String gender,int age,int phoneNumber,int membershipLevel,String membershipTime){
        super(id,name,gender,age,phoneNumber);
        this.membershipLevel=membershipLevel;
        this.membershipTime=membershipTime;
    }
    //get and set
    public int getMembershipLevel() {
        return membershipLevel;
    }
    public void setMembershipLevel(int membershipLevel) {
        this.membershipLevel = membershipLevel;
    }


    public String getMembershipTime() {
        return membershipTime;
    }
    public void setMembershipTime(String membershipTime) {
        this.membershipTime = membershipTime;
    }

    @Override
    public String toString() {
        return super.toString()+", Membership Level: "+membershipLevel+", Membership Time: "+membershipTime;
    }


}

