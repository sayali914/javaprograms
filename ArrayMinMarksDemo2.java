
import java.util.Scanner;
class ArrayMinMarksDemo2{
           void acceptArray(){
                int [] marks = new int[10];
        	int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of 10 students");
		       for(i=0;i<10;i++){
           	       marks[i] = sc.nextInt();
                 }
 
                findMinMarks(marks);
             }
            void findMinMarks(int []marks){
                int min = marks[0];
                int i;
        	for(i=1; i<10; i++){
                       if(marks[i] < min){
                       min= marks[i];
                     }
               }
               System.out.println("Lowest Marks :  " +min);
       
            }
            public static void main(String[] args){
               	   ArrayMinMarksDemo2 a1 = new ArrayMinMarksDemo2();
                   a1.acceptArray();
            }
 
}