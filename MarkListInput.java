import java.util.Scanner;
class MarkListInput{
      public static void main(String[] args){
            int m1,m2,m3;
            float total,avg;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter m1 marks: ");
             m1= sc.nextInt();
             System.out.println("Enter m2 marks: ");
             m2= sc.nextInt();
             System.out.println("Enter m3 marks: ");
             m3= sc.nextInt();
            
             total = m1+m2+m3;
             avg = m1+m2+m3/3;
             System.out.println("Total is : " + total + " avg is : " +avg);
             
       

       }
}