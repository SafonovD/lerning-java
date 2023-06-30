package lesson_1;

public class DZ1 {
    public static void main(String[] args) {
        int value = 1;
        while (value<=10){
            System.out.print("Java ");
            value++;
        }
        System.out.println("---------");
        for (int i = 1;i<=10;i++){
            System.out.print("Java ");
        }
        System.out.println("---------");
        for (int i = 1;i<=10;i++){
            System.out.println("Java "+i);
        }
        System.out.println("---------");

        int year = 1980;
        while (year<=2020){
            System.out.println("Олимпиада "+year+" года");
            year = year+4;
        }
        System.out.println("---------");
        for (int i = 1980;i<=2020;i=i+4){
            System.out.println("Олимпиада "+i+" года");
        }
        System.out.println("---------");
        int k=15;
        for (int i = 1;i<=10;i++){
            System.out.println(i+"*"+k+" = "+i*k);
        }
    }
}
