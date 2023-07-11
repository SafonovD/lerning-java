package lesson_5.Forest;

public class Tree {
    int age;
    int height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void getInfo(){
        System.out.println("Дереву "+age+" лет, высота его "+height+" метров.");
    }
}
