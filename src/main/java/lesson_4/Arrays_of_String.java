package lesson_4;

public class Arrays_of_String {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;  // инициализация
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        String [] strings = new String[3];
        strings[0] = "привет";
        strings[1] = "пока";
        strings[2] = "Java";

        System.out.println(strings[0]);
        System.out.println(strings[2]);
        for(int i = 0; i < strings.length; i++){
            System.out.print(strings[i]+" ");
        }
        System.out.println("-------");
        for (String string : strings ) {
            System.out.println(string);
        }
        System.out.println("-------");
        int[] numbers1 ={1,2,3,4};
        int sum = 0;
        for (int x: numbers1){
            sum += x; // идентично  sum = sum+x;
        }
        System.out.println(sum);
    }
}
