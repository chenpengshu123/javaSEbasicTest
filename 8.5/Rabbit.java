import java.util.Scanner;

 

public class Rabbit {

   public static void main(String[] args) {

      int  f1 = 2;
      int  f2=2; 

      System.out.println("ÇëÊäÈëÔÂ·İ");

      Scanner scanner=new Scanner(System.in);

      int mouth=scanner.nextInt();

       int temp = 0;

      for (int i = 3; i <=mouth; i++) {

         if (mouth==1||mouth==2) 

            f2=2;

         else 

            temp=f2;

            f2=f1+f2;

            f1=temp;

      }

      System.out.println(f2);

   }

}
