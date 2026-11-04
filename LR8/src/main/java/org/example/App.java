package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CelestialBody[] bodies = new CelestialBody[5];

        bodies[0] = new Planet("Земля", 5.972e24, 1.2742e7, 1);
        bodies[1] = new Planet("Марс", 6.39e23, 6.779e6, 2);
        bodies[2] = new Planet("Юпитер", 1.898e27, 1.3982e8, 95);

        bodies[3] = new Star("Солнце", 1.989e30, 1.3927e9, 5778);
        bodies[4] = new Star("Сириус", 4.018e30, 2.365e9, 9940);
        for (CelestialBody body : bodies) {
            body.displayInfo();
            System.out.println("Тип: " + body.getType());

            if (body instanceof Planet) {
                Planet planet = (Planet) body;
                System.out.println("Гравитация: " + planet.getGravity() + " м/с²");
                planet.showMoons();
            }

            if (body instanceof Star) {
                Star star = (Star) body;
                System.out.println("Светимость: " + star.getLuminosity() + " Вт");
                star.showTemperature();
            }

            System.out.println();
        }
    }
}
