package lesson_6;
/*
- producer (изготовитель)
- year (год выпуска)
- length (длина)
- weight (вес)
- fuel (количество топлива в баке) + геттер для этого поля
 */
public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String producer,int year, int length, int weight, int fuel){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;

    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

     public void info(){
         System.out.println("Изготовитель: "+producer+" , год выпуска: "+year+" , длина: " +length+
                 "м. , вес: " +weight+" т. , количество топлива в баке: "+fuel+" л.");
     }
     public void fillUp(int fuel){
        this.fuel += fuel;
     }
}
