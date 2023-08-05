package lesson_6;

public class Car {
    int year;

    public Car(int year) {
        this.year = year;
    }

    public void info(){
        System.out.println("Это Автомобиль");
    }
    public int yearDifference(int yearDifference){
        return Math.abs(this.year-yearDifference);
    }
}
