import java.util.Scanner;
class LeapYear{
   public static void main(String[] args){
          int year;
   		 Scanner sc = new Scanner(System.in);
    		 System.out.println("Enter any year");
                 year= sc.nextInt();

                 if(year % 4 == 0){
                       System.out.println("Leap year: " +year);
                     }
                    else{
                         System.out.println("Not Leap Year: " +year);
                    
                      }

          }
}