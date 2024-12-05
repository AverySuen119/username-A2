import java.util.ArrayList;
import java.util.List;

public class Ride implements RideInterface{
    private String rideName;
    private int rideID;
    private int minimumAge;
    private Employee operator;
    private List<Visitor>queue;
    private List<Visitor>rideHistory;

    //构造空参方法
    public Ride(){

    }

    //构造包含全部参数的方法
    public Ride(String rideName, int rideID, int minimumAge,  Employee operator) {
        this.rideName = rideName;
        this.rideID = rideID;
        this.minimumAge = minimumAge;
        this.operator = new Employee();
        this.queue = new ArrayList<>();
        this.rideHistory = new ArrayList<>();
    }

    // 1. 添加游客到队列
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        queue.add(visitor);
        System.out.println(visitor.getName() + " has been added to the queue.");
    }

    // 2. 从队列中移除游客
    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (queue.remove(visitor)) {
            System.out.println(visitor.getName() + " has been removed from the queue.");
        } else {
            System.out.println(visitor.getName() + " is not in the queue.");
        }
    }

    // 3. 打印当前排队的游客
    @Override
    public void printQueue() {
        System.out.println("Current Queue:");
        for (Visitor visitor : queue) {
            System.out.println(visitor.getName());
        }
    }

    // 4. 执行一个游乐设施的周期
    @Override
    public void runOneCycle() {
        if (!queue.isEmpty()) {
            Visitor visitor = queue.remove(0); // 假设一个周期内，第一个游客体验游乐设施
            System.out.println(visitor.getName() + " is now riding the " + rideName);
            addVisitorToHistory(visitor); // 记录游客进入历史记录
        }
    }

    // 5. 将游客添加到游乐设施历史记录
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println(visitor.getName() + " has been added to the ride history.");
    }

    // 6. 检查游客是否已在历史记录中
    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    // 7. 获取历史记录中的游客数量
    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    // 8. 打印游乐设施的历史记录
    @Override
    public void printHistory() {
        System.out.println("Ride History:");
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor.getName());
        }
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


    public Employee getOperator() {
        return operator;
    }
    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Ride Name:" + rideName+", Ride ID"+ rideID+", Minimum Age:"+minimumAge+", Operator:"+operator;
    }
}
