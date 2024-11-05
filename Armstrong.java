import java.util.Scanner;

//153 1*1*1 5*5*5 3*3*3
//if the summation of cubes of every digit is same as that number then its armstrong number


class Armstrong{
      public static void main(String[] args){
             int no,d,sum=0,temp;

                  //no   d   sum
                 //0    1   153

             Scanner sc = new Scanner(System.in);
             System.out.println("Enter any number");
             no = sc.nextInt();
             temp=no;
              while(no>0){
               d = no%10;
               sum= sum+d*d*d;
               no=no/10;
            }
            if(sum==temp){
              System.out.println("Armstrong");
            }
           else{
             System.out.println("Not Armstrong");
          }
      
    }
}