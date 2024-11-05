  
//write a program to accept a number and print whether its 4digit num or not


import java.util.Scanner;
/*class DigitNumber{
   public static void main(String[] args){
      int no;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any Number : ");
         no = sc.nextInt();
         //int n = 12345;
         int count = 0;
         while (no != 0) {
         no /= 10;
         count++;
    }
System.out.println("Number of digits: " + count);

            

        }
   }
*/


class DigitNumber{
   public static void main(String[] args){
      int no;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any Number : ");
        no = sc.nextInt();
        int count=0;
         if(no !=0 ){
             //no /= 10;
             System.out.println(" four digit Number: " +no);
             count++;

       }else{
         System.out.println(" NOt four digit Number: " +no);
         } 

   }
}