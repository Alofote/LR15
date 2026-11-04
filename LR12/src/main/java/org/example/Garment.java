package org.example;

public class Garment {
    protected String name;
    protected int id;
    protected String size;

    public Garment(String name, int id, String size) {
        this.name = name;
        this.id = id;
        this.size = size;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", id=" + id +
                ", size='" + size + '\'';
    }
}
