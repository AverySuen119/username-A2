import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class Ride implements RideInterface{
    private String rideName;
    private int rideID;
    private int minimumAge;
    private Employee operator;
    private Queue<Visitor> queue;
    private LinkedList<Visitor> rideHistory;

    //构造空参方法
    public Ride(){

    }

    //构造包含全部参数的方法
    public Ride(String rideName, int rideID, int minimumAge,  Employee operator) {
        this.rideName = rideName;
        this.rideID = rideID;
        this.minimumAge = minimumAge;
        this.operator = new Employee();
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // 将访客添加到队列
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        queue.add(visitor);  // 将访客添加到队列的尾部
        System.out.println(visitor.getName() + " 已被添加到队列中.");
    }

    // 从队列中移除访客
    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (queue.remove(visitor)) {
            System.out.println(visitor.getName() + " 已从队列中移除.");
        } else {
            System.out.println(visitor.getName() + " 不在队列中.");
        }
    }

    // 打印队列中的所有访客
    @Override
    public void printQueue() {
        System.out.println("当前队列:");
        if (queue.isEmpty()) {
            System.out.println("队列中没有访客.");
        } else {
            for (Visitor visitor : queue) {
                System.out.println(visitor.getName());
            }
        }
    }

    // 将访客添加到历史记录中
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);  // 将访客添加到历史记录
        System.out.println(visitor.getName() + " 已被添加到历史记录中.");
    }

    // 检查访客是否在历史记录中
    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        if (rideHistory.contains(visitor)) {
            System.out.println(visitor.getName() + " 已乘坐过该游乐设施.");
            return true;
        } else {
            System.out.println(visitor.getName() + " 尚未乘坐过该游乐设施.");
            return false;
        }
    }

    // 返回历史记录中访客的数量
    @Override
    public int numberOfVisitors() {
        return rideHistory.size();  // 返回历史记录中访客的数量
    }

    // 打印历史记录中的所有访客
    @Override
    public void printRideHistory() {
        System.out.println("游乐设施历史记录:");
        if (rideHistory.isEmpty()) {
            System.out.println("没有访客乘坐过该游乐设施.");
        } else {
            Iterator<Visitor> iterator = rideHistory.iterator();  // 使用迭代器遍历历史记录
            while (iterator.hasNext()) {
                Visitor visitor = iterator.next();
                System.out.println(visitor);
            }
        }
    }

    // 模拟运行一次游乐设施
    @Override
    public void runOneCycle() {
        if (!queue.isEmpty()) {
            Visitor visitor = queue.remove();  // 移除队列中的第一个访客
            addVisitorToHistory(visitor);  // 将其添加到历史记录
            System.out.println(visitor.getName() + " 正在乘坐 " + rideName + " 游乐设施.");
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
