// write a prog to accept two numbers and print welcome if the first num is 3 digit num 
//and print good bye if second number is 2 digit number ow print hello


import java.util.Scanner;

class Test{
     public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int no1,no2;
       System.out.println("Enter any two numbers :");
       no1 = sc.nextInt();
       no2 = sc.nextInt();
       if(no1>=100 && no1<=999){
              System.out.println("welcome");
             }
         else if(no2>=10 && no2<=99){
               System.out.println("Good bye"); 
           }
          else{
               System.out.println("hello");
            }
       
      }
}