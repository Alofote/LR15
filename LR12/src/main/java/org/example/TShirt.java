package org.example;

public class TShirt extends Garment {
    private String print;

    public TShirt(String name, int id, String size, String print) {
        super(name, id, size);
        this.print = print;
    }

    @Override
    public String toString() {
        return "TShirt{" +
                super.toString() +
                ", print='" + print + '\'' +
                '}';
    }
}
