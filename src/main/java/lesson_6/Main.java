package lesson_6;

import HomeWork.DZ6.Student;
import HomeWork.DZ6.Teacher;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(2022);
        Bike bike = new Bike(1985);
        Airplane airplane = new Airplane("Boing", 2020, 50, 40, 0);

        car.info();
        bike.info();
        airplane.info();
        System.out.println("--------");
        System.out.println(car.yearDifference(1800));
        System.out.println(bike.yearDifference(198));
        System.out.println("---------");
        airplane.setLength(64);
        airplane.setYear(1977);
        airplane.fillUp(200);
        airplane.info();
        System.out.println("----------------");
        airplane.fillUp(300);
        airplane.info();
        System.out.println("--------");

    }
}
