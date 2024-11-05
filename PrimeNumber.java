import java.util.Scanner;

//prime num means divisible by 1 & itself 

class PrimeNumber{
    public static void main(String[] args){
         Scanner sc =  new Scanner(System.in);
         boolean flag=false;
         System.out.println("Enter any number");
         int no = sc.nextInt();

  	 // no  flag  i
  	 // 23  true  5

         for(int i=2;i<no;i++){
              if(no%i==0){
                 flag=true;
                 break;
                }
             
         }
         if(flag==true)
	     System.out.println("The number is not prime");
	 else
             System.out.println("The number is prime");
          }

}