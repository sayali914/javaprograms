import java.util.Scanner;
class SwitchDemo2{
    public static void main(String[] args){
     String taste;
     Scanner sc = new Scanner(System.in);
     System.out.println("what kind of taste you like ?");
      taste = sc.next();
      switch(taste){
          case "sweet": System.out.println("you can taste rasmalai,basundi,Gulab jamun,kajukatali");
                break;
         
          case "spicy": System.out.println("you can taste biryani,thecha,vada pav,veg-pulav,chiken-biryani");
                 break;
          default:System.out.println("invalid opt");
      }
    }
}