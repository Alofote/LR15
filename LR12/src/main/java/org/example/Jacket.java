package org.example;

public class Jacket extends Garment {
    private String material;

    public Jacket(String name, int id, String size, String material) {
        super(name, id, size);
        this.material = material;
    }

    @Override
    public String toString() {
        return "Jacket{" +
                super.toString() +
                ", material='" + material + '\'' +
                '}';
    }
}
