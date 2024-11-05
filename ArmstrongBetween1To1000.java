class ArmstrongBetween1To1000{
     public static void check(int no){
      int temp=no;
      int d,sum=0;

      while(no>0){
               d = no%10;
               sum= sum+d*d*d;
               no=no/10;
            }
            if(sum==temp){
              System.out.println(temp);
            }
           
        }
     public static void main(String[] args){
         int no;
         for(no=1;no<=1000;no++){
           check(no);
            }
        }
}