package HomeWork.DZ4;


import java.util.Random;

/*
 Создать новый массив размера 100 и заполнить его случайными числами из
диапазона от 0 до 10000.
Затем, используя циклы for each вывести:
- наибольший элемент массива
- наименьший элемент массива
- количество элементов массива, оканчивающихся на 0
- сумму элементов массива, оканчивающихся на 0
Использовать сортировку запрещено.

 */
public class Task2 {
    public static void main(String[] args) {
        Random randoms = new Random();
        int[] arrays = new int[100];
        for (int i = 0;i< arrays.length; i++){
            arrays[i]= randoms.nextInt(1000);
        }
        int maxValue = 0;
        for( int value : arrays){
            if( value > maxValue)
              maxValue = value;
            }
        System.out.println("Наибольший элемент масива "+maxValue);

        int minValue = 100000;
        for(int value : arrays){
            if(value < minValue){
                minValue = value;
            }
        }
        System.out.println("Наименьший элемент масива "+minValue);

        int counter = 0;
        for (int value : arrays){
            if(value% 10 == 0)
                counter++;
        }
        System.out.println("количество элементов массива, оканчивающихся на 0 = "+counter);

        int summValue = 0;
        for (int value : arrays){
            if(value % 10 == 0){
                summValue += value;
            }
        }
        System.out.println("сумма элементов массива, оканчивающихся на 0 = "+summValue);



        }
}
