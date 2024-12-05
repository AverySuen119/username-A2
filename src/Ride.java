import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
import java.util.Collections;
import java.io.*;
import java.util.*;


    public class Ride implements RideInterface {
        private String rideName;
        private int rideID;
        private int minimumAge;
        private Employee operator;
        private Queue<Visitor> queue;
        private LinkedList<Visitor> rideHistory;
        private int maxPlayer;  // 一次最多接待多少访客
        private int numOfCycles;

        //构造空参方法
        public Ride() {
            this.queue = new LinkedList<>();
            this.rideHistory = new LinkedList<>();
        }

        //构造包含全部参数的方法
        public Ride(String rideName, int rideID, int minimumAge, Employee operator, int maxPlayer, int numOfCycles) {
            this.rideName = rideName;
            this.rideID = rideID;
            this.minimumAge = minimumAge;
            this.operator = operator;
            this.queue = new LinkedList<>();
            this.rideHistory = new LinkedList<>();
            this.maxPlayer = maxPlayer;
            this.numOfCycles = 0;
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
            if (operator == null) {
                System.out.println("没有操作员，游乐设施无法运行.");
                return;
            }

            if (queue.isEmpty()) {
                System.out.println("队列为空，无法运行游乐设施.");
                return;
            }

            // 运行周期，最多接待 maxRider 个访客
            int riders = 0;
            while (!queue.isEmpty() && riders < maxPlayer) {
                Visitor visitor = queue.remove();  // 从队列中移除访客
                addVisitorToHistory(visitor);  // 将其添加到历史记录
                System.out.println(visitor.getName() + " 正在乘坐 " + rideName + " 游乐设施.");
                riders++;
            }

            numOfCycles++;  // 每次运行周期时增加周期数
            System.out.println("游乐设施运行完毕，本次已接待 " + riders + " 名访客。");
            System.out.println("当前运行周期数：" + numOfCycles);
        }

        // 排序访客历史记录
        public void sortVisitorsInHistory() {
            // 使用VisitorComparator进行排序
            Collections.sort(rideHistory, new VisitorComparator());
            System.out.println("历史记录已根据规则排序。");
        }

        public void exportRideHistory(String fileName) {
            BufferedWriter writer = null;
            try {
                // 创建文件写入流
                writer = new BufferedWriter(new FileWriter(fileName));

                // 遍历历史记录中的所有访客
                for (Visitor visitor : rideHistory) {
                    // 将访客的信息转换成 CSV 格式并写入文件
                    writer.write(visitor.getName() + "," + visitor.getAge() + "," + visitor.getMembershipLevel());
                    writer.newLine();  // 每个访客写入后换行
                }
                System.out.println("历史记录已成功导出到文件 " + fileName);
            } catch (IOException e) {
                System.err.println("导出历史记录时出错: " + e.getMessage());
            } finally {
                // 关闭文件写入流
                try {
                    if (writer != null) {
                        writer.close();
                    }
                } catch (IOException e) {
                    System.err.println("关闭文件时出错: " + e.getMessage());
                }
            }
        }


        // Getter 和 Setter 方法

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

        public int getMaxPlayer() {
            return maxPlayer;
        }

        public void setMaxPlayer(int maxPlayer) {
            this.maxPlayer = maxPlayer;
        }

        public int getNumOfCycles() {
            return numOfCycles;
        }

        public void setNumOfCycles(int numOfCycles) {
            this.numOfCycles = numOfCycles;
        }

        @Override
        public String toString() {
            return "Ride Name: " + rideName + ", Ride ID: " + rideID + ", Minimum Age: " + minimumAge + ", Operator: " + operator;
        }
    }
