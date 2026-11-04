package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Computer c1 = new Computer("Dell", "i5", 8);
        Computer c2 = new Computer("HP", "i7", 16);
        Computer c3 = new Computer("Lenovo", "Ryzen 5", 12);
        Computer c4 = new Computer("Asus", "i3", 4);
        Computer c5 = new Computer("Acer", "Ryzen 7", 32);
        System.out.println("Средняя память всех компьютеров = "+Computer.getAverageRAM());
    }
}
