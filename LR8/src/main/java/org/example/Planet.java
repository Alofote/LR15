package org.example;

public class Planet extends CelestialBody {
    private int moons;

    public Planet(String name, double mass, double diameter, int moons) {
        super(name, mass, diameter);
        this.moons = moons;
    }

    public int getMoons() {
        return moons;
    }

    public void setMoons(int moons) {
        this.moons = moons;
    }

    @Override
    public String getType() {
        return "Планета";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество спутников: " + moons);
    }

    public double getGravity() {
        double G = 6.67430e-11;
        double radius = getDiameter() / 2;
        return G * getMass() / (radius * radius);
    }

    public void showMoons() {
        System.out.println("Спутников: " + moons);
    }
}
