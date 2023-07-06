package lesson_4;

public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[] numbers ={1,2,3};
        System.out.println(numbers[1]);
        System.out.println("-------");

        int[][] matrice = new int[5][5];
        int [][] matrix1 = {{1,2,30},
                           {2,3,4},
                           {4,6,8}};
        System.out.println(matrix1[2][2]);
        System.out.println("------");
        for (int i = 0; i<matrix1.length;i++){
            for (int k = 0; k < matrix1[i].length; k++){
                System.out.print(matrix1[i][k]+" ");
            }
            System.out.println();
        }
    }
}
