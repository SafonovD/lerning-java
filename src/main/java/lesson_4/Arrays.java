package lesson_4;

public class Arrays {
    public static void main(String[] args) {
        int number = 10; // преметивны тип данных  [10]
        char chacter = 'a'; // приметивный тип данных
        String s = "Привет"; // ссылочный тип данных
        String s1 = new String("Привет");  // ссылочный тип данных

        int[] numbers = new int[5];  // ссылочный тип данных  numbers -> [массив чисел]
        System.out.println(numbers[0]); // 0 1 2 3 4
        for (int i = 0; i< numbers.length; i++){
            numbers[i] = i*10;
        }
        for (int j : numbers) {
            System.out.println(j);
        }
        System.out.println("-------------");
        int [] numbers1 = {1,2,3,4,5};
        for (int k : numbers1){
            System.out.println(k);

        }
    }
}
