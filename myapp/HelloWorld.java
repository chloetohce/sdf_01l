package myapp;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.Console;

public class HelloWorld {
   public HelloWorld() {
   }

   public static void main(String[] args) {
      System.out.println("Hello world");



      Console console = System.console();
      String var2 = console.readLine("What is your name? ");
      System.out.printf("Hello, %s. Pleased to meet you!\n", var2);



      String sport = console.readLine("What is sport do you like?");
      System.out.println(var2.replace('a', 'e'));



      Integer[] numbers = new Integer[5];
      for (int j = 0; j < numbers.length; j++) {
         Integer inputNum = Integer.parseInt(console.readLine("Enter your number:"));
         numbers[j] = inputNum;
      }
      for(Integer n : numbers) {
         System.out.println(n);
      }



      if (args.length > 0) {
         String[] names = new String[5];

         int x = 0;
         while (x < args.length && x < names.length) {
            names[x] = args[x];
            x++;
         }
         for (int y = 0; y < names.length; y++) {
            System.out.printf("Name[%d]: %s\n", y, names[y]);
         }
      } else {
         System.out.println("No argument passed");
      }



      List<String> names = new ArrayList<>();
      String in = "";
      do {
         in = console.readLine("Enter a name: ");
         if (!in.equals("quit")) {
            names.add(in);
         }

      } while (!in.equals("quit"));




      List<String> words = new ArrayList<>();   //coding to the interface
      String keyboardInput = "";
      keyboardInput = console.readLine("Enter a sentence: ");  // Uisng console to get input, but can also use new Scanner(System.in)
      Scanner s = new Scanner(keyboardInput);
      
      while (s.hasNext()) {
         words.add(s.next());
      }
      s.close();
      for(String str : words) {
         System.out.println(str);
      }
   }
}
