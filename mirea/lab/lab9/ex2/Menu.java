package ru.mirea.lab.lab9.ex2;

import java.util.Arrays;
import java.util.Comparator;

public class Menu {
    static java.util.Scanner IN = new java.util.Scanner(System.in);

    public static void main(String[] args) throws StudentNotFoundException {
        System.out.print("Введите количество студентов: ");
        int length = IN.nextInt();

        Student[] Students = new Student[length];

        for (int i = 0; i < length; ++i) {
            System.out.println("Студент №" + (i + 1) + ":");
            System.out.println();
            System.out.print("Введите ФИО студента: ");
            IN.nextLine();
            String fio = IN.nextLine();
            System.out.print("Введите средний балл студента: ");
            int gpa = IN.nextInt();
            Students[i] = new Student(i, gpa, fio);
        }

        System.out.println("========================================");

        while (true) {
            System.out.println("  1) Получить информацию о студенте;");
            System.out.println("  2) Вывести список студентов;");
            System.out.println("  3) Отсортировать список студентов;");
            System.out.println("  4) Завершить работу.");

            int choice = IN.nextInt();

            IN.nextLine();
            System.out.println();

            switch (choice) {
                case 1:
                    getStudent(Students);
                    System.out.println();
                    break;

                case 2:
                    print(Students);
                    System.out.println();
                    break;

                case 3:
                    sort(Students);
                    print(Students);

                    System.out.println();
                    break;

                case 4:
                    return;
            }
        }
    }

    public static int find(Student[] students, String name) throws StudentNotFoundException {
        for (int i = 0; i < students.length; ++i) {
            if (students[i].getName().equals(name))
                return i;
        }

        throw new StudentNotFoundException("!ERROR!: Студента с ФИО " + name + " нет в списке");
    }
    private static void getStudent(Student[] students) throws StudentNotFoundException {
        System.out.print("Введите ФИО студента: ");
        String name = IN.nextLine();
        System.out.println(students[find(students, name)]);
    }

    private static void print(Student[] students) {
        System.out.printf("%3s|%50s|%14s\n", "ID", "ФИО", "Средний балл");
        System.out.println("---------------------------------------------------------------------");

        for (Student stud : students) {
            System.out.printf("%3d|%50s|%14f\n", stud.getiD(), stud.getName(), stud.getGPA());
        }
    }
    public static void sort(Student[] students){
        Comparator<Student> scomp = new StudentGPAComparator();
        Arrays.sort(students, scomp);
    }
}
