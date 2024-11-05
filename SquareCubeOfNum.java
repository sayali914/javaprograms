import java.util.Scanner;
class SquareCubeOfNum{
    public static void main(String[] args){
      int num,square,cube;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any number: ");
      num = sc.nextInt();
      square = num * num;
      cube = num * num * num;
      System.out.println("Square of a given number is :" + num + " = " +square + " cube is :" +cube);
       
    }
}