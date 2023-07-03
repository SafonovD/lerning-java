package DZ2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();

        if (a >= b){
            System.out.println("Не правильный ввод");
        } else{
            while ((a + 1)< b){
                if(a % 5 == 0 && b % 10 != 0){
                    System.out.print(a + " ");
                }
                a++;
            }
        }
    }
}
