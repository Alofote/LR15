package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Connectable[] devices = {
                new Router("TP-Link AX55", "Wi-Fi 6"),
                new Router("ASUS RT-AX58U", "Mesh"),
                new Router("Keenetic Hero", "Dual Band"),
                new Computer("Dell Inspiron", "Windows 11"),
                new Computer("Lenovo ThinkPad", "Ubuntu")
        };

        for (Connectable device : devices) {
            device.connect();
            System.out.println("Статус подключения: " + device.isConnected());
            device.disconnect();
            System.out.println();
        }

        Configurable[] configurableDevices = {
                (Configurable) devices[0],
                (Configurable) devices[1],
                (Configurable) devices[2],
                (Configurable) devices[3],
                (Configurable) devices[4]
        };

        for (Configurable device : configurableDevices) {
            device.configure();
            System.out.println();
        }
    }
}
