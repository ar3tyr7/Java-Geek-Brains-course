package work3;

import java.beans.Introspector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

//2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и
// среднее арифметическое из этого списка.
public class main2 {
    public static void main(String[] args) {
        homeTask();
    }

    private static void homeTask() {
        Random rnd = new Random();
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lst.add(rnd.nextInt(0,101));
        }
        System.out.println("Рандомный список от 0 до 100");
        System.out.println(lst);
        int max = Collections.max(lst);
        int min = Collections.min(lst);
        double avarageLst = getSum(lst)/lst.size();
        System.out.println("Максимальное число списка " + max);
        System.out.println("Минимальное число списка " + min);
        System.out.println("Среднее арифмитическое списка " + avarageLst);
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }
        return sum;
    }
}
