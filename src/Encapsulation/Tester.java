package Encapsulation;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner checkValue = new Scanner(System.in);

        House house1 = new House();

        System.out.println("Input floor number: ");
        int floors = checkValue.nextInt();
        house1.setFloorsNumber(floors);

        checkValue.nextLine();

        System.out.println("Input address: ");
        String addressCheck = checkValue.nextLine();
        house1.setAddress(addressCheck);

        System.out.println("Input names: ");
        String names = checkValue.nextLine();
        house1.setResidentsNames(names.split(","));

        String format = "House details: \nFloors: %d\nAddress: %s\nResidents: %s";
        System.out.println(String.format(format, house1.getFloorsNumber(), house1.getAddress(), String.join(", ", house1.getResidentsName())));

        checkValue.close();
    }
}
