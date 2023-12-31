package HomeWork.DZ4;

import java.util.Random;

/*
Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
строк несколько, вывести индекс последней из них.
Пример сгенерированной матрицы (для простоты m=3, n=5):
3 2 1 5 7 // сумма - 18
1 2 5 6 2 // сумма - 16
3 4 9 6 4 // сумма - 26
Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
 */
public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int m =12;
        int n = 8;
        int [][] matrice = new int[m][n];

        for (int i = 0; i<matrice.length;i++){
            for (int j = 0; j< matrice[i].length; j++){
                matrice[i][j] = random.nextInt(50);
            }
        }
        int maxSumm = 0;
        int maxSummIndex = 0;
        for (int i = 0; i< matrice.length; i++){
            int summ = 0;
            for (int j = 0; j< matrice[i].length;j++){
                summ += matrice[i][j];
            }
            if(summ >= maxSumm){
                maxSumm = summ;
                maxSummIndex = i;
            }
        }
        System.out.println("Индекс строки с максимальной суммой чисел " +maxSummIndex);
    }
}
