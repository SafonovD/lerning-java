package lesson_2;

public class If {
    public static void main(String[] args) {
        int myInt = 15;
        if(myInt<10){
            System.out.println("Да верно");
        } else if (myInt > 20){
            System.out.println("не верно");
        }else {
            System.out.println("не одно из предыдущих");
        }
    }

}
