package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Building building = new Building("ул. Центральная, 1", 3, 500);
        Building residential = new Residential("ул. Лесная, 15", 9, 1200);
        Building office = new Office("пр. Победы, 25", 12, 2500);
        System.out.println("Перегрузка методов:");
        building.build();
        building.build(5);
        building.build("кирпича");
        System.out.println();
        System.out.println("Переопределение методов:");
        System.out.println(building.getPurpose());
        System.out.println(residential.getPurpose());
        System.out.println(office.getPurpose());
    }
}
