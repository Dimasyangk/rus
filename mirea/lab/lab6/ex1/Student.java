package ru.mirea.lab.lab6.ex1;

public class Student {
    public int idNumber[];

    public Student() {
        idNumber = new int[6];
        int a=0;
        int b=100;
        for (int i =0; i <idNumber.length;i++){
            idNumber[i] = a+ (int) (Math.random()*b);
        }
    }
    public void selectionSort() {
        for (int j = 1; j < idNumber.length; j++) {
            int current = idNumber[j];
            int i = j - 1;
            while ((i > -1) && (idNumber[i] > current)) {
                idNumber[i + 1] = idNumber[i];
                i--;
            }
            idNumber[i + 1] = current;

        }   }
    public void PrintScr() {
        for (int aIdNumber : idNumber) {
            System.out.println(aIdNumber);
        }
    }


}
