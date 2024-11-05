import java.util.Scanner;
class Grade{
   public static void main(String[] args){
      int m1,m2,m3;
System.out.println("Enter the marks of three subjects");
Scanner sc = new Scanner(System.in);
m1 = sc.naextInt();
m2 = sc.naextInt();
m3 = sc.naextInt();

int total = m1+m2+m3;
int avg = total/3;

System.out.println("total marks : " +total);
System.out.println("Average marks : " +avg);

if(avg >=80){
      System.out.println("Distinction");
     }
     else{
          if(avg>=60){
               System.out.println("First class");
           } 
        }
      else{
            if(avg >=50){
                 System.out.println("second class");
             }
          }
        else{
           if(avg>=40){
                   System.out.println("pass");
           }
           }else{
              System.out.println("Fail");
             }

         } 
      }
   }
}
}