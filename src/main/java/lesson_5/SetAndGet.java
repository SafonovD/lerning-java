package lesson_5;

public class SetAndGet {
    public static void main(String[] args) {
        PersonSet person = new PersonSet();
        person.setName("Рома");
        person.setAge(25);

        person.speak();


    }
}
class PersonSet{
    private String name;
    private int age;

    public void setName(String userName){
        if (userName.isEmpty()){
            System.out.println("Вы ввели пустое имя");
        }else {
            name = userName;
        }
    }
    public String getName(){
        return name;
    }
    public void setAge(int userAge){
        if(userAge>0){
            System.out.println("Возраст должен быть положительным");
        }else {
            age = userAge;
        }
    }
    public int getAge(){
        return age;
    }

    void speak(){
        System.out.println("Меня зовут "+name+" мне "+age+" лет.");
    }

}
