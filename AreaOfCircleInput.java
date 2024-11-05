import java.util.Scanner;

class AreaOfCircleInput{
       public static void main(String[] args){
                 int r;
 		 double pi = 3.142,area;

  		 Scanner sc = new Scanner(System.in);
  		 System.out.println("Enter radius : ");
  		 r=sc.nextInt();
                 area = pi * r * r;
  
                 System.out.println("Area of circle : " +area);

   
   }
}