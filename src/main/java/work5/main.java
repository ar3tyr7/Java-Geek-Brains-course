package work5;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
//        Пусть дан список сотрудников:
//        Иван Иванов
//        Светлана Петрова
//        Кристина Белова
//        Анна Мусина
//        Анна Крутова
//        Иван Юрин
//        Петр Лыков
//        Павел Чернов
//        Петр Чернышов
//        Мария Федорова
//        Марина Светлова
//        Мария Савина
//        Мария Рыкова
//        Марина Лугова
//        Анна Владимирова
//        Иван Мечников
//        Петр Петин
//        Иван Ежов
//  Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//  Отсортировать по убыванию популярности.
public class main {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        // Создадим словарь в котором ключом будет номер, а значением имя и фамилия
        HashMap<Integer, String> telBook = new HashMap<>();
        // создадим массив из представленных имен и значений, чтобы потом зарандомить номера телефонов
        String[] names = new String[]{"Иван Иванов", " Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};
        Random rd = new Random();
        int numberExample = 100000000;
        for (int i = 0; i < names.length; i++) {
            telBook.put(numberExample+ rd.nextInt(999999),names[i]);
        }
        // Добавим дополнительные номера некоторым из контактов
        telBook.put(983475890,"Петр Чернышов");
        telBook.put(983475490,"Иван Мечников");
        telBook.put(983475390,"Анна Владимирова");

        HashMap<String, Integer> counterNames = new HashMap<>();
        String name = "";
        String secondName = "";
        ArrayList<String> secondNms = new ArrayList<>();
        for (int keyTb: telBook.keySet()) {
            name = telBook.get(keyTb).split(" ")[0];
            secondName = telBook.get(keyTb).split(" ")[1];
            if ((!counterNames.containsKey(name) && !secondNms.contains(secondName))) {
                secondNms.add(secondName);
                counterNames.put(name,1);
            }
            if (!secondNms.contains(secondName)) {
                counterNames.put(name,counterNames.get(name)+1);
            }

        }
        System.out.println(counterNames);
    }
}
