
//1. Print 1 to 10 using for loop
/*
class ForLoopsExample{
     public static void main(String[] args){
      int i;
      for(i=1;i<=10;i++){
          System.out.println(i);
        }
     }
}

2. Print even numbers from 1 to 20

class ForLoopsExample{
      public static void main(String[] args){
            for(int i=2; i<=20; i +=2){
		System.out.println(i);
              }
     }
}



3. Print the sum of the first 10 natural numbers

class ForLoopsExample{
      public static void main(String[] args){
      int sum =0;
        for(int  i=1; i<=10;i++){
             sum +=i;
      }
      System.out.println("Sum: " + sum);


   }
}

4. Print the factorial of a number

class ForLoopsExample{
      public static void main(String[] args){
        int n = 5;
        int fact = 1;
        for(int i =1; i<=n ; i++){
            fact *=i; 
         }
        System.out.println("Factorial: " + fact);
    
      }
}


5. Print a multiplication table of 5
 
class ForLoopsExample{
      public static void main(String[] args){
             int n = 5;
             for (int i = 1; i <= 10; i++) {
             System.out.println(n + " x " + i + " = " + (n * i));
    }
  
   }
}


6. Print the Fibonacci series up to 10 terms

class ForLoopsExample{
      public static void main(String[] args){
     int a = 0,b = 1;
     for(int i =1;i<=10;i++){
       System.out.println(a + " ");
       int next = a + b;
        a = b;
        b = next;
     }
    }
}


7. Check if a number is prime
 class ForLoopsExample{
      public static void main(String[] args){
      int n =29;
       boolean isPrime = true;
       for(int i = 2; i<=n/2; i++){
               if(n % 1== 0 ){
               isPrime = false;
                break;
              }
          }
       System.out.println(n + "is prime: " +isPrime);
    }
 }


//8. Reverse a number

class ForLoopsExample{
      public static void main(String[] args){
        int n = 1234;
        int rev = 0;
          while (n !=0){
          int digit = n%10 ;
          rev = rev *10 +digit;
          n /=10;
    
       }
         System.out.println("Rev number: " +rev);
     }
}
*/

//9. Check if a number is a palindrome

 class ForLoopsExample{
      public static void main(String[] args){
       int n =121;
       int original = n,rev = 0;
       while (n !=0){
        int digit = n % 10;
        rev = rev *10 + digit;
        n /= 10;
   } 
System.out.println("Is palindrome: " + (original == rev));      
}
}


