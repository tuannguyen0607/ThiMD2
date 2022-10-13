package soft;

import model.Student;

import java.util.Comparator;

public class SoftByScoreDescending implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o2.getDiemTB() == o1.getDiemTB()){
            return 0;
        }else if (o2.getDiemTB() >  o1.getDiemTB()) {
            return 1;
        } else {
            return -1;
        }
    }
}
