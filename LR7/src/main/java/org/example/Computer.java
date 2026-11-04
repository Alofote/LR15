package org.example;

public class Computer {

    private String brand;
    private String processor;
    private int ram;
    private static int totalComputers = 0;
    private static int totalRAM = 0;
    public Computer(String brand, String processor, int ram) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        totalComputers++;
        totalRAM += ram;
    }
    public static double getAverageRAM() {
        return (double) totalRAM / totalComputers;
    }
}