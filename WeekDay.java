import java.util.Scanner;

class WeekDay{
     public static void main(String [] args){
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the total Days");
       int days = sc.nextInt();
       System.out.println(days  + "days = " + days/7 + "Weeks and "+ days%7 + "days");      

     }  
}