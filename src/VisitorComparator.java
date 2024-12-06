import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {

    @Override
    public int compare(Visitor v1, Visitor v2) {
        // compare the name by alphabetical order
        int nameComparison = v1.getName().compareTo(v2.getName());

        // If names are the same, compare ages and sort in ascending order
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return Integer.compare(v1.getAge(), v2.getAge());
        }
    }
}



