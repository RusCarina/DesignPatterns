// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
       Shape square = new Square(new Blue());
       if(Objects.equals(square.draw(), "Square colored Blue")){
           System.out.println("Yes");
      }
       else  System.out.println("No");
    }
}