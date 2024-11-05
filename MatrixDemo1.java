import java.util.Scanner;

class MatrixDemo1{
 public static void main(String[] args){
        int [][]m = new int [3][4];
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter element in 3*4 matrix");
            for(i=0;i<3;i++){
               for(j=0;j<4;j++){
                  m[i][j]= sc.nextInt();
                  }
                }
                System.out.println(" the given matrix");
                   for(i=0;i<3;i++){
                         for(j=0;j<4;j++){
                           System.out.print(m[i][j] + " ");


                  }
                   System.out.println();
                } 
               System.out.println(" the transpose of given matrix");
                   for(i=0;i<4;i++){
                         for(j=0;j<3;j++){
                           System.out.print(m[j][i] + " ");


                  }
                   System.out.println();
                }     
             
        }
}