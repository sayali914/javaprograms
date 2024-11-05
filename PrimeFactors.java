import java.util.Scanner;

class PrimeFactors{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int i=2;
       System.out.println("enter any number");
       int no = sc.nextInt();
       
       while(no>1){
           if(no % i == 0){
           System.out.println(i+ " ");
           no = no / i;
           } 
             else{
                i++; 
              }
           }

     }
}