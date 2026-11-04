package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Clothing[] clothes = {
                new Jacket("Nike", "M", "Черный", "Натуральная кожа"),
                new Jacket("Adidas", "L", "Синий", "Эко-кожа"),
                new Jacket("Puma", "XL", "Серый", "Замша"),
                new TShirt("Reebok", "M", "Белый", "Sport"),
                new TShirt("GUCCI", "L", "Красный", "Fitness")
        };
        for (Clothing clothing : clothes) {
            clothing.displayInfo();
            System.out.println("--------------------");
        }
//        Clothing clothing = new Clothing("Brand", "M", "Black");
    }
}
