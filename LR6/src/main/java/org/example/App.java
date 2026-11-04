package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(5);
        System.out.println(c1);
        System.out.println("Площадь окружности = "+c1.area());
        System.out.println("Длина окружности = "+c1.circumference());
        System.out.println(c2);
        System.out.println("Площадь окружности = "+c2.area());
        System.out.println("Длина окружности = "+c2.circumference());

    }
}
