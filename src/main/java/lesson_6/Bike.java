package lesson_6;

public class Bike {
    int year;

    public Bike(int year) {
        this.year = year;
    }

    public void info(){
        System.out.println("Это Мотоцикл");
    }
    public int yearDifference(int yearDifference){
        int result = this.year - yearDifference;
        return result;
    }
}
