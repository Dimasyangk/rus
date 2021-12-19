package ru.mirea.lab.lab9.ex1;


import java.util.HashMap;



public class INN {
    static java.util.Scanner IN = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        var INNBase = new HashMap<String, String>(5);

        INNBase.put("5367687281", "Иванов Иван Иванович");
        INNBase.put("0567475944", "Петров Василий Петрович");
        INNBase.put("7992222888", "Пулин Владимир Владимирович ");
        INNBase.put("3401662695", "Александров Александр Александрович ");
        INNBase.put("0204012893", "Кулин Евгений Евгеньевич");

        System.out.print("Введите ФИО: ");
        String name = IN.nextLine();

        System.out.print("Введите ИНН: ");
        String inn = IN.next();

        try {
            String baseName = INNBase.get(inn);

            if (!name.equals(baseName)) {
                throw new InvalidINNException("[ERROR]: ИНН \"" + inn + "\" не действителен для пользователя " + name);
            }

            System.out.println("ИНН \"" + inn + "\" действителен для пользователя " + name);
        }
        catch (InvalidINNException exc) {
            System.err.println(exc.getMessage());
        }
    }
}
