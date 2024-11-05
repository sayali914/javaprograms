/*
Array is a static collection of homogeneous elements.
Array elements are always stored in contigious memory locations

syntax
datatype [] arrayname = new datatype[]size;
*/

import java.util.Scanner;

class ArrayMaxMarks{
      public static void main(String[] args){
        int [] marks = new int[10];
        int i;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks of 10 students");
	for(i=0;i<10;i++){
            marks[i] = sc.nextInt();
          }
       // int max = marks[0];
        int min = marks[0];
      
        for(i=1; i<10; i++){
           /* if(marks[i] > max){
                 max= marks[i];
                  }
             */

            if(marks[i] < min){
                 min= marks[i];
                  }
           }
         //System.out.println("Hightest Marks :  " +max);
         System.out.println("Lowest Marks :  " +min);

      }     
}


