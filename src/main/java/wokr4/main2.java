package wokr4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class main2 {
    public static void main(String[] args) {
        rtnList();
    }

    private static void rtnList() {
        LinkedList<String> example = new LinkedList<>();
        example.add("bananas");
        example.add("apple");
        example.add("pomodoro");
        example.add("potatoes");
        for (int i =example.size()-1; i >=0 ; i--) {
            System.out.println(example.get(i));
        }
    }
}
