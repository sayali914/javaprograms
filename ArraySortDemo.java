// Array bubble sort [45,76,87,89,45,67,78,76,56,56]

//temp =  575 a[j]=575  a[j+1]=86 
//j = 4
//i = 1

import java.util.Scanner;
  class ArraySortDemo{
       void sort(int []a){
       int temp;
       for(int i=0;i<10;i++){
          for(int j=0;j<9-i;j++){
             //if(a[j]> a[j+1]){      //asending 
                  if(a[j] < a[j+1]){  //desending order
		  temp=a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;
                  }
              }
        }
   }
    void print(int []a){
           for(int i=0;i<a.length;i++){
               System.out.println(a[i]+ " ");
                }
           }
       public static void main(String[] args){
           int[]a = new int[10];
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter any 10 number");
              for(int i=0;i<10;i++){
                     a[i]= sc.nextInt();
                      }
            ArraySortDemo a1 = new ArraySortDemo();
            a1.sort(a);
            a1.print(a);
              
            }
}