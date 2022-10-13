package soft;

import model.Student;

import java.util.Comparator;

public class SoftByScoreAscending implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getDiemTB() == o2.getDiemTB()) {
            return 0;
        } else if (o1.getDiemTB() > o2.getDiemTB()) {
            return 1;
        } else {
            return -1;
        }
    }
}
