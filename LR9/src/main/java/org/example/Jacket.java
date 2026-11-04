package org.example;

public class Jacket extends Clothing {
    private String material;

    public Jacket(String brand, String size, String color, String material) {
        super(brand, size, color);
        this.material = material;
    }

    public String getJacketMaterial() {
        return material;
    }

    public void setJacketMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getSeason() {
        return "Осень/Зима";
    }

    @Override
    public String getMaterial() {
        return "Кожа";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Материал куртки: " + material);
        System.out.println("Сезон: " + getSeason());
        System.out.println("Материал: " + getMaterial());
    }
}
