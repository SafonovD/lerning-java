package lesson_5;

public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Рома";
        person1.age = 29;
        person1.speak();
        Person person2 = new Person();
        person2.name = "Вася";
        person2.age = 30;
        person2.seyHello();
        person2.speak();

    }
}
class Person{
    String name;
    int age;

    void speak(){
        System.out.println("Меня зовут "+name+" мне "+age+" лет");
    }
    void seyHello(){
        System.out.println("Привет!!");
    }
}