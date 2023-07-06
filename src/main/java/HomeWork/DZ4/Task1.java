package HomeWork.DZ4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
С клавиатуры вводится число n - размер массива. Необходимо создать массив
указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
содержимое массива в консоль, а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива

 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int value = scanner.nextInt();
        int[] numbers = new int[value];
        Random random = new Random();

        for (int i = 0;i<numbers.length;i++){
            numbers[i] = random.nextInt(10);
        }
        System.out.println("Содержимое массива : ");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Длина массива = "+numbers.length);

        int counter8 = 0;
        for (int i = 0;i< numbers.length; i++){
            if(numbers[i] > 8){
                counter8++;
            }
        }
        System.out.println("Количестве чисел больше 8: "+counter8);

        int counter1 = 0;
        for (int i = 0;i< numbers.length; i++){
            if(numbers[i]==1){
                counter1++;
            }
        }
        System.out.println("Количестве чисел равных 1: "+counter1);

        int counterEven = 0;
        for (int i = 0;i< numbers.length; i++){
            if(numbers[i]%2 == 0){
                counterEven++;
            }
        }
        System.out.println("Количестве четных чисел: "+counterEven);

        int counterOod = 0;
        for (int i = 0;i< numbers.length; i++){
            if(numbers[i]%2 !=0){
                counterOod++;
            }
        }
        System.out.println("Количестве не четных чисел: "+counterOod);

        long summ =0;
        for (int i : numbers){
            summ += i;
        }
        System.out.println("сумма всех чисел = "+summ);
    }
}
