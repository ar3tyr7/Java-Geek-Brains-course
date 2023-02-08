package wrok2;

import java.util.Scanner;

// 1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом //(возвращает boolean значение).
public class main {
    public static void main(String[] args) {
        boolean result = palindrome();
        System.out.println(result);
    }

    private static boolean palindrome() {
        String str = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово ");
        str = sc.next();
        StringBuilder sb = new StringBuilder(str);

        char begin =sb.charAt(0);
        char end = sb.charAt(str.length()-1);
        boolean flag = true;
        int count = 0;

        while ((str.length()/2)>count & flag == true) {
            if (begin!=end){
                flag=false;
            }
            count++;
            begin = sb.charAt(count);
            end = sb.charAt(str.length()-count-1);
        }
        return flag;
    }
}
