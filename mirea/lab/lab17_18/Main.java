package ru.mirea.lab.lab17_18;

import java.util.Scanner;
import java.util.regex.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Pattern pattern1 = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher1 = pattern1.matcher(str);
        boolean flag = matcher1.matches();
        if (flag) {
            System.out.println("Да");
        } else System.out.println("Нет");

        String regex = "(([a-f]|[A-F]|[0-9])+:){5}(([a-f]|[A-F]|[0-9])+)";
        str = in.nextLine();
        Pattern pattern2 = Pattern.compile(regex);
        Matcher matcher2 = pattern2.matcher(str);
        flag = matcher2.matches();
        if (flag) System.out.println("Да");
        else System.out.println("Нет");

        String input = " 22 UDD, 0.002 USD, 23.78 USD, 34 RUR, 46.9 EU, 3656.99 RUR 969.699 RUR";
        System.out.println("Список цен: \""+ input+" \"");
        Pattern pattern = Pattern.compile("(([0-9]{1,}\\.[0-9]{1,2}\\s)|(\\s[0-9]{1,}\\s))+(USD|RUR|EU)");
        Matcher matcher = pattern.matcher(input);
        System.out.println("Подходящие под шаблон цены: ");
        while(matcher.find())
            System.out.println(matcher.group());
        }
}
