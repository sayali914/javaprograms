import java.util.Scanner;
  class ArrayExchangeSort{
       void sort(int []a){
       int temp;
       for(int i=0;i<10;i++){
          for(int j=0;j<10;j++){
             if(a[i]> a[j]){            //asending 
                                       //if(a[j] < a[j+1])  desending order
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
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