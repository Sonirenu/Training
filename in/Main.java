package com.in;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Employee emp = new Employee("John Doe");
//
//        Address address = new Address("123 Main Street", "New York", "NY", "10001");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String empName = scanner.nextLine();
        Employee emp = new Employee(empName);

        System.out.println("Enter address details:");
        System.out.print("Street No: ");
        String streetNo = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("State: ");
        String state = scanner.nextLine();
        System.out.print("PIN: ");
        String pin = scanner.nextLine();

        Address address = new Address(streetNo, city, state, pin);



        System.out.println("Employee Name: " + emp.getName());

        System.out.println("Address: ");
        System.out.println("Street No: " + address.getStreetNo());
        System.out.println("City: " + address.getCity());
        System.out.println("State: " + address.getState());
        System.out.println("PIN: " + address.getPin());
    }
}
