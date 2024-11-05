import java.util.Scanner;
class SwitchDemo{
  public static void main(String[] args){
   int no1,no2;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter any two numbers");
   no1 = sc.nextInt();
   no2 = sc.nextInt();
   System.out.println("Please select any option");
   System.out.println("1. add 2.Subtract 3.multipy 4.Divide 5.Modulus");
   int opt = sc.nextInt();
   switch(opt){
          case 1: System.out.println("Addition : " +(no1+no2));
          break;
          case 2: System.out.println("Subtraction : " +(no1-no2));
          break;
          default:System.out.println("Invalid Option");
          
     }

   
}
}