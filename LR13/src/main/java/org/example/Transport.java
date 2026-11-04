package org.example;

public class Transport {

    private String type;
    private String brand;
    private int year;
    private int capacity;
    private double fuelConsumption;

    public Transport(String type, String brand, int year,
                     int capacity, double fuelConsumption) throws InvalidTransportDataException{
        this.type = type;
        this.brand = brand;
        setYear(year);
        setCapacity(capacity);
        this.fuelConsumption = fuelConsumption;
    }

    public void setYear(int year) throws  InvalidTransportDataException{
        if (year <= 1900) {
            throw new InvalidTransportDataException(
                    "Год выпуска должен быть больше 1900");
        }
            this.year = year;
    }

    public void setCapacity(int capacity) throws InvalidTransportDataException{
        if (capacity <= 0) {
            throw new InvalidTransportDataException(
                    "Вместимость должна быть больше 0");
        }
        else
            this.capacity = capacity;
    }

    public void service() throws MaintenanceException {

        if (year < 2000) {
            throw new MaintenanceException(
                    "Транспорт требует капитального обслуживания");
        }

        System.out.println(brand + " успешно обслужен");
    }

    public double calculateFuel(double distance)
            throws InvalidTransportDataException {

        if (distance <= 0) {
            throw new InvalidTransportDataException(
                    "Расстояние должно быть больше 0");
        }

        return distance * fuelConsumption / 100.0;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", capacity=" + capacity +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}