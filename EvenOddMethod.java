import java.util.Scanner;

class EvenOddMethod{

      /* void acceptNumber(){
           Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number"); 
           int no = sc.nextInt();
           EvenOdd(no);
          }*/

          void EvenOdd(int num){
            if(num%2==0){
               System.out.println("Even");
               }
            else{
                 System.out.println("Odd");
                }
            }
          public static void main(String[] args){
                  EvenOddMethod e1 = new EvenOddMethod();

                  Scanner sc = new Scanner(System.in);
	   	  System.out.println("Enter the number"); 
                  int no = sc.nextInt();
                  e1.EvenOdd(no);
                  //e1.acceptNumber();
              }
   }