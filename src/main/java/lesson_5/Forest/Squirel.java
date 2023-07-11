package lesson_5.Forest;

public class Squirel {
    private String color;
    private int age;

   public void setColor(String color){
       this.color = color;
   }
   public void setAge(int age){
       this.age = age;
   }
   public String getColor(){
       return color;
   }
   public int getAge(){
       return age;
   }
   public void getInfo(){
       System.out.println("Белка цветом "+color+" ей "+age+" года");
   }
}
