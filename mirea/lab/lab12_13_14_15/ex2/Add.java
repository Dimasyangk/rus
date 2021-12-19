package ru.mirea.lab.lab12_13_14_15.ex2;

import java.util.StringTokenizer;

    public class Add {
        private String country, region, city, street, house, housing, flat;

        public Add(String stringToParse, boolean Deluteli){
            if(stringToParse == null) throw new NullPointerException();
            String[] s;
            if(Deluteli){
                StringTokenizer st = new StringTokenizer(stringToParse, ",.;");
                s = new String[st.countTokens()];
                int i = 0;
                while(st.hasMoreTokens()) s[i++] = st.nextToken();
            }else{
                s = stringToParse.split(",");
            }

            if(s.length < 7) throw new IllegalArgumentException("Строка содержит недостаточно данных!");
            country = s[0].trim();
            region = s[1].trim();
            city = s[2].trim();
            street = s[3].trim();
            house = s[4].trim();
            housing = s[5].trim();
            flat = s[6].trim();
        }

        @Override
        public String toString() {
            return "Address{" +
                    "country='" + country + '\'' + ", region='" + region + '\'' + ", city='" + city + '\'' + ", street='" + street + '\'' +
                    ", house='" + house + '\'' + ", housing='" + housing + '\'' + ", flat='" + flat + '\'' + '}';
        }

        public static void main(String[] args) {
            Add a1 = new Add("Россия, МО, Щёлково, Неделина, 25, 1, 76", false);
            Add a2 = new Add("Россия, МО, Ногинск,    Самодеятельная, 14; 1. 46", true);
            Add a3 = new Add("UK, London, London, Trafalgar square, 1, 2, 3", false);

            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);

        }
 }

