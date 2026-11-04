package org.example;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */

public class App {

    public static Transport findTransport(
            List<Transport> transports,
            String brand)
            throws TransportNotFoundException {

        for (Transport transport : transports) {
            if (transport.getBrand().equalsIgnoreCase(brand)) {
                return transport;
            }
        }

        throw new TransportNotFoundException(
                "Транспорт " + brand + " не найден");
    }

    public static void main(String[] args) {

        List<Transport> park = new ArrayList<>();

        try {
            park.add(new Transport(
                    "Автобус",
                    "MAZ",
                    2015,
                    45,
                    25));

            park.add(new Transport(
                    "Грузовик",
                    "MAN",
                    1995,
                    20,
                    30));

            park.add(new Transport(
                    "Микроавтобус",
                    "Mercedes",
                    2018,
                    16,
                    12));

        } catch (InvalidTransportDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            Transport transport = findTransport(park, "MAN");
            transport.service();
        } catch (TransportNotFoundException |
                 MaintenanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            Transport transport = findTransport(park, "Mercedes");
            double fuel = transport.calculateFuel(250);
            System.out.println(
                    "Необходимое количество топлива: "
                            + fuel + " л");
        } catch (TransportNotFoundException |
                 InvalidTransportDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            findTransport(park, "Volvo");
        } catch (TransportNotFoundException e) {
            System.err.println(e.getMessage());
        }

        try {
            new Transport(
                    "Автобус",
                    "Ikarus",
                    1890,
                    40,
                    22);
        } catch (InvalidTransportDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
