package ru.mirea.lab.lab6.ex2;

import java.util.Arrays;
import java.util.Comparator;


public class SortingStudentsByGPA extends Student1 {
    public static void main(String[] args) {
        Student1[] students = new Student1[5];
        Comparator<Student1> scomp = new StudentGPAComparator();
        students[0] = new Student1("Pasha ", 245);
        students[1] = new Student1("Masha ", 223);
        students[2] = new Student1("Kolya ", 221);
        students[3] = new Student1("Petya ", 290);
        students[4] = new Student1("Andrey ", 255);
        Arrays.sort(students, scomp);
        for (int i = 0; i < 5; i++) {
            System.out.println(students[i].getName() + " " + students[i].getGPA());
        }
    }

    static class StudentGPAComparator implements Comparator<Student1> {
        public int compare(Student1 a, Student1 b) {
            if (a.getGPA() > b.getGPA())
                return 1;
            else if (a.getGPA() < b.getGPA())
                return -1;
            else return 0;
        }
    }
}

