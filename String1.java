// program to count the words in the string

import java.util.Scanner;

public class A1{
    public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the value of string type");
  String str = sc.nextLine();
   
  int spc_count = 0;
  str = str.trim();

  for(int i=0;i<str.length();i++)
  {
      if(str.charAt(i) == ' ')
      {
          spc_count++;
      }
  }
  int word_count = spc_count + 1;
  System.out.println("Word Count:"+word_count);
   
   
}
}
