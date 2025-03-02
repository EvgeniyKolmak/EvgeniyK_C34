package service;

import model.Student;

public class StudentService {

    public int getStudentCountPerGroup(Student[] students, int groupNumber) {
        int count = 0;

        for (Student student : students) {
            if (student.getGroup() == groupNumber) {
                count += 1;
            }
        }

        return count;
    }

}
