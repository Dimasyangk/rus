package ru.mirea.lab.lab9.ex2;

import java.util.Arrays;
import java.util.Comparator;


public class SortingStudentsByGPA extends Student {
    public static void print(Student[] students){
        for (int i = 0; i < 5; i++) {
            System.out.println(students[i].getiD() + " " + students[i].getGPA());
        }
    }

    public static void sort(Student[] students){
        Comparator<Student> scomp = new StudentGPAComparator();
        students[0] = new Student(64352, 245);
        students[1] = new Student(5234, 223);
        students[2] = new Student(1, 221);
        students[3] = new Student(666, 290);
        students[4] = new Student(777, 255);
        String[] strs = {"gffgd","sgdfdgfdff","agggg"};
        int[] x = {3434,5,2,1,-9999};
        Arrays.sort(students, scomp);
        print(students);
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        sort(students);



    }
}

class StudentGPAComparator implements Comparator<Student>{
    public int compare(Student a, Student b){
        if(a.getGPA()>b.getGPA())
            return 1;
        else if(a.getGPA()<b.getGPA())
            return -1;
        else return 0;
    }
}
