package lesson_5;

public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Роман");
        person1.age = 29;
        person1.speak();
        Person person2 = new Person();
        person2.name = "Вася";
        person2.age = 30;
        person2.seyHello();
        person2.speak();
        int aer1 = person1.calculateYer();
        int ear2 = person2.calculateYer();
        System.out.println( ear2 +" "+ aer1);

    }
}
class Person{
    String name;
    int age;

    void setName(String userName){
        name = userName;
    }

    int calculateYer(){
        int ear = 65 - age;
        return ear;
    }

    void speak(){
        System.out.println("Меня зовут "+name+" мне "+age+" лет");
    }
    void seyHello(){
        System.out.println("Привет!!");
    }
}