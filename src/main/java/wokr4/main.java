package wokr4;

import java.util.ArrayList;
import java.util.Scanner;

//1. Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
public class main {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input somthing: ");
        ArrayList<String> str = new ArrayList<>();
        String elem = "";
        while (true){
            elem = sc.next();
            if (elem.equals("print")){
                System.out.println(str);
            } else if (elem.equals("revert")) {
                try {
                    str.remove((str.size()-1));
                } catch (Exception e){
                    System.out.println("Невозможно удалить элемент ");
                }
            } else {
                str.add(elem);
            }
        }
    }
}
