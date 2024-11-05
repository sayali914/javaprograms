import java.util.Scanner;
class AreaOfRectangleInput{
      public static void main(String[] args){
      int length,breadth,area;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter length :");
      length= sc.nextInt();
      System.out.println("Enter breadth :");
      breadth= sc.nextInt();
      area = length * breadth;
      System.out.println("Area of rectangle is: " +area);

     }
}