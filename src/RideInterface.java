import java.util.List;

public interface RideInterface {
    // Part 2 - 这些方法定义了游乐设施的基本功能
    void addVisitorToQueue(Visitor visitor);  // 将访客添加到队列
    void removeVisitorFromQueue(Visitor visitor);  // 从队列中移除访客
    void printQueue();  // 打印队列中的所有访客
    void runOneCycle();  // 执行一次游乐设施循环
    void addVisitorToHistory(Visitor visitor);  // 将访客添加到历史记录
    boolean checkVisitorFromHistory(Visitor visitor);  // 检查访客是否在历史记录中
    int numberOfVisitors();  // 返回历史记录中访客的数量
    void printRideHistory();  // 打印历史记录中的所有访客
}
