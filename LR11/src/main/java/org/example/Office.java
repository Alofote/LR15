package org.example;

public class Office extends Building {

    public Office(String address, int floors, double area) {
        super(address, floors, area);
    }

    @Override
    public String getPurpose() {
        return "Офис";
    }
}