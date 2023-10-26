// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}
//Abstract Fcatory -> ne permite sa producem familii de obiecte conectate fara sa specificam clasa concreta
//1.declaram explicit interfete pentru fiecare produs dinstinct al familiei de produse
//2.declaram Abstract Factory -> o interfata cu lista de metode create pentru toate produsele din familie
//aceste metode returneaza abstract product types
//Factory class -> e o clasa care returneaza produse de un tip particular
