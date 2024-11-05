import java.util.Scanner;
class BillAmtInput{
     public static void main(String[] args){
      int bill,rate,quantity;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter quantity");
      quantity = sc.nextInt();
      System.out.println("Enter Rate");
      rate = sc.nextInt();
      bill = quantity * rate;
      System.out.println("Bill amount : " +bill);
      
}
}