
/*
class ForDemo1{
     public static void main(String[] args){
          int i=1;
          for( ;i>10;){
            System.out.println(i);
		i++;
		//if(i>10){
       			//break;
     		     //}
               
            }
       }
}


class ForDemo1{
     public static void main(String[] args){
          int i=2;
          for( ;;){
            System.out.println(i);
		i+=2;
		if(i>100){
       			break;
     		     }
               
            }
       }
}
*/


//program to print all numbers divisible by 3 & 5

class ForDemo1{
     public static void main(String[] args){
          int i=1;
          for(;;){

           if(i%3==0 && i%5==0)
            System.out.println(i);
		 i++;
		if(i>100){
       			break;
     		     }
               
            }
       }
}