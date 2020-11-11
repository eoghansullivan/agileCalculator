import java.util.Scanner;
public class Calculator {


    public static void main(String[] args) {
      double num1,num2,ans;
      int option;

      Scanner in = new Scanner(System.in);

      System.out.println("Calculator Menu");
      System.out.println();
      System.out.println("1)   Add 2 numbers");
      System.out.println("2)   Multiply 2 numbers");
      System.out.println("3)   Divide 2 numbers");
      System.out.println("4)   Exit the Program");

      System.out.print("\nPlease enter your choice:");
      option=in.nextInt();

      System.out.print("Please enter 1st number:");
      num1 = in.nextDouble();
      System.out.print("Please enter 2nd number:");
      num2 = in.nextDouble();

      if(option == 1)
      {
          ans=num1+num2;
          System.out.println("The sum of "+num1+" plus "+num2+" = "+ans);
      }

      if(option == 2)
      {
        ans=num1*num2;
        System.out.println("The product of "+num1+" times "+num2+" = "+ans);
      }

      if(option == 3)
        if(num2 !=0)
         {
          ans=num1/num2;
          System.out.println("The answer of "+num1+" divide "+num2+" = "+ans);
         }
        else
          System.out.println("Sorry - cannot divide by 0");

      System.out.println("Thank you for using this program");
    }


}
