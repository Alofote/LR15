package org.example;

public class Pants extends Garment {
    private int length;

    public Pants(String name, int id, String size, int length) {
        super(name, id, size);
        this.length = length;
    }

    @Override
    public String toString() {
        return "Pants{" +
                super.toString() +
                ", length=" + length +
                '}';
    }
}
