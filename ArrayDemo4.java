// convert array to number

import java.util.Scanner;

class ArrayDemo4{
         void convertToNumber(int []a){
             int no=0;
             for(int i=0;i<a.length;i++){
               no = no*10+a[i];
            }
            //return no;
            System.out.println("No : "+no);
          }
         public static void main(String[] args){
            int []a = new int[10];
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any 10 number");
    
              for(int i=0;i<10;i++){
                 a[i] = sc.nextInt();
             }
 
             ArrayDemo4 a1 = new ArrayDemo4();
             a1.convertToNumber(a);
      }
}

//input=86677
//op = [8,6,6,7,7]