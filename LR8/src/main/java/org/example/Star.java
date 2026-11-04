package org.example;

public class Star extends CelestialBody {
    private double temperature;

    public Star(String name, double mass, double diameter, double temperature) {
        super(name, mass, diameter);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String getType() {
        return "Звезда";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Температура: " + temperature + " К");
    }

    public double getLuminosity() {
        double sigma = 5.670374419e-8;
        double radius = getDiameter() / 2;
        return 4 * Math.PI * radius * radius * sigma
                * Math.pow(temperature, 4);
    }

    public void showTemperature() {
        System.out.println("Температура поверхности: " + temperature + " К");
    }
}
