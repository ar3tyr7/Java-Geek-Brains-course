package work3;

import java.util.ArrayList;

//1. Пусть дан произвольный список целых чисел, удалить из него четные
// числа (в языке уже есть что-то готовое для этого)
public class main {
    public static void main(String[] args) {

        getEvenNumbers();
    }

    private static void getEvenNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] example = {2,3,4,1,4,8,16,22,2,1,3,3,2,44};
        for (int i = 0; i < example.length; i++) {
            numbers.add(example[i]);
        }
        for (int i = 0; i <numbers.size(); i++) {
            if (numbers.get(i)%2 == 0){
                numbers.remove(i);
                i--;
            }
        }
        System.out.println(numbers);
    }
}
