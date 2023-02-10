package work3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//3. Пройти по списку из задания 2 с урока и удалить повторяющиеся элементы.
public class main3 {
        public static void main(String[] args) {
            counter(planets());
        }

        private static void counter(ArrayList<String> planets) {
            planets.sort(String::compareTo);
            System.out.println(planets);
            String coursor = planets.get(0);
            String result = "";
            int count = 1;
            for (int i = 0; i < planets().size(); i++) {
                if (coursor != planets.get(i)) {
                    result += (planets.get(i - 1) + " = " + count + "||  ");
                    count = 1;
                    coursor = planets.get(i);
                } else {
                    count++;
                }
            }
            result += (planets.get(planets.size() - 1) + " = " + count);
            System.out.println(result);
            Set<String> setPlanets = new HashSet<>(planets());
            planets.clear();
            planets.addAll(setPlanets);
            System.out.println(planets);
        }

        private static ArrayList<String> planets() {
            String[] solarSystemPlanets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
            Random rnd = new Random();
            ArrayList<String> galaxyBoom = new ArrayList<String>();
            for (int i = 0; i < 100; i++) {
                galaxyBoom.add(solarSystemPlanets[rnd.nextInt(solarSystemPlanets.length)]);
            }
            return galaxyBoom;
        }

}

