// Fibonacci Series

import java.util.Scanner;

public class Fib{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the value of num:");
      
      int num = sc.nextInt();
      
      System.out.println("Fibbonacci Series:");
      for(int i=0;i<num;i++)
      {
          System.out.println(fibonacci(i) + " ");
      }
      
      
    }

public static int fibonacci(int n)
{
    if(n<=1)
    {
        return n;
    }
    else
    {
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
}
