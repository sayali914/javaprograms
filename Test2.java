//write a program to accept a number and check wheather its four digit or not

import java.util.Scanner;
class Test2{
   public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int number;
         System.out.println("Enter any number: ");
         number = sc.nextInt();
         if(number>=1000 && number<=9999){
              System.out.println("The number is Four Digit");
            }
          else{
             System.out.println("The number is not Four Digit");
             }
         } 
}