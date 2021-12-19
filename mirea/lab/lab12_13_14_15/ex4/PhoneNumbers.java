package ru.mirea.lab.lab12_13_14_15.ex4;

public class PhoneNumbers {
    private String code, city, triple, quadruple;

    public PhoneNumbers(String phone){
        if(phone.startsWith("8")){
            code = "+7";
        }else{
            code = phone.substring(0, phone.length()-10);
        }
        city = phone.substring(phone.length()-10, phone.length()-7);
        triple = phone.substring(phone.length()-7, phone.length()-4);
        quadruple = phone.substring(phone.length()-4);
    }

    @Override
    public String toString() {
        return code + city + "-" + triple + "-" + quadruple;
    }

    public static void main(String[] args) {
        System.out.println(new PhoneNumbers("89998887766"));
        System.out.println(new PhoneNumbers("+79998887766"));
        System.out.println(new PhoneNumbers("+1234567891234"));
        System.out.println(new PhoneNumbers("+181112223335"));
    }
}
