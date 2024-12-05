import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {

    @Override
    public int compare(Visitor v1, Visitor v2) {
        // 比较姓名，按字母顺序排序
        int nameComparison = v1.getName().compareTo(v2.getName());

        // 如果姓名相同，则比较年龄，按年龄升序排序
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return Integer.compare(v1.getAge(), v2.getAge());
        }
    }
}



