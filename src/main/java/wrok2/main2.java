package wrok2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//2. Напишите метод, который составит строку, состоящую из 100 повторений слова
// TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения
public class main2 {
    public static void main(String[] args) {
        task();

    }

    private static String[] testWriter() {
        String[] str = new String[100];

        for (int i = 0; i < 100; i++) {
            str[i] = "TEST";
        }
        return str;
    }
    private static void task() {
        StringBuilder sb = new StringBuilder();
        for (String text :testWriter())
            sb.append(text).append(System.lineSeparator());
            try (PrintWriter pw = new PrintWriter("/Users/artur/Documents/Home work GB/Java_gb/homework/src/main/resources/lib/text.txt")) {
                pw.println(sb);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
    }
}
