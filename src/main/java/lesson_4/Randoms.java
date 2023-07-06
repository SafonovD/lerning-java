package lesson_4;

import java.util.Random;

public class Randoms {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++){
         //   System.out.println(Math.random()); //генерация случайного числа от 0 до 1
         //   System.out.println(Math.ceil(Math.random()*10)); //Math.ceil -> округляет числа в большую сторону
            System.out.print(Math.round(Math.random()*10)+" "); //Math.round -> округляет числа
         //   System.out.println(Math.floor(Math.random()*10)); //Math.floor -> округляет числа в меньшую сторону
        }
        System.out.println("--------");
        Random random = new Random();
        for (int i = 0; i<20; i++){
            System.out.print(random.nextInt(20)+" ");
        }
    }
}
