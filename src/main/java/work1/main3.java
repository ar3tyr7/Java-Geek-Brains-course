package work1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//3. Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
public class main3 {
    public static void main (String[] args) {
        task();
    }

    private static void task() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 5 ");
        int val = scanner.nextInt();
        int [] nums = new int[10];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(6);
        }
        System.out.println(Arrays.toString(nums));
        int tmp;
        int right = nums.length-1;
        int i = 0;
        while (i <= right){
            if (nums[i]==val & nums[right]!=val){
                tmp=nums[right];
                nums[right]=nums[i];
                nums[i]=tmp;
                i++;
                right--;
            } else if (nums[i]==val & nums[right]==val) {
                right--;
            } else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}