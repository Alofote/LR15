package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        int task = 2;

        switch (task) {
            case 1:
                Map<String, Garment> garments = new HashMap<>();

                garments.put("Jacket1", new Jacket("Jacket1", 1, "M", "Leather"));
                garments.put("Jacket2", new Jacket("Jacket2", 2, "L", "Cotton"));
                garments.put("Jacket3", new Jacket("Jacket3", 3, "XL", "Wool"));

                garments.put("TShirt1", new TShirt("TShirt1", 4, "S", "Sport"));
                garments.put("TShirt2", new TShirt("TShirt2", 5, "M", "Music"));
                garments.put("TShirt3", new TShirt("TShirt3", 6, "L", "Anime"));

                garments.put("Pants1", new Pants("Pants1", 7, "M", 100));
                garments.put("Pants2", new Pants("Pants2", 8, "L", 110));

                for (Map.Entry<String, Garment> entry : garments.entrySet()) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }
                break;

            case 2:
                List<Programmer> programmers = new ArrayList<>();

                programmers.add(new Programmer(1, "Ivan", "Java", 1, Arrays.asList(5, 4, 5)));
                programmers.add(new Programmer(2, "Petr", "C#", 2, Arrays.asList(2, 3, 2)));
                programmers.add(new Programmer(3, "uAlex", "Python", 3, Arrays.asList(5, 4, 5)));
                programmers.add(new Programmer(4, "rAlex", "С++", 3, Arrays.asList(4, 4, 5)));
                programmers.add(new Programmer(5, "fAlex", "Kotlin", 3, Arrays.asList(4, 3, 5)));
                programmers.add(new Programmer(6, "Atlex", "Java Script", 3, Arrays.asList(4, 4, 5)));

                programmers.removeIf(p -> p.getAverageReview() < 3);

                for (Programmer p : programmers) {
                    if (p.getAverageReview() >= 4) {
                        p.setLevel(p.getLevel() + 1);
                    }
                }

                programmers.sort(
                        Comparator.comparingDouble(Programmer::getAverageReview)
                          //      .reversed()
                                .thenComparing(Programmer::getName).reversed()
                );

                for (Programmer p : programmers) {
                    System.out.println(p
                    );
                }
                break;
        }
    }
}
