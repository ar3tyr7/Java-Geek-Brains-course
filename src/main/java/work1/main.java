package work1;

import java.util.Arrays;
import java.util.Random;

// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
public class main {
    public static void main(String[] args) {
        createMassive();
    }

    private static void createMassive() {
        Random random = new Random();
        int [] massive = new int [1000];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(-100,100);
        }
        System.out.println(Arrays.toString(massive));
        int max = massive[0];
        int min = massive[0];
        for (int i = 1; i < massive.length; i++){
            if (massive[i]>max){
                max = massive[i];
            }
            if (massive[i]<min){
                min = massive[i];
            }
        }
        System.out.println("Наименьший элемент массива "+ min);
        System.out.println("Наибольший элемент массива "+ max);
    }
}
