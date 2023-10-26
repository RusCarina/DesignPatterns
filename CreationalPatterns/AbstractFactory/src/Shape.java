public interface Shape {
    void draw();
}

//Abstract Fcatory -> ne permite sa producem familii de obiecte conectate fara sa specificam clasa concreta
//1.declaram explicit interfete pentru fiecare produs dinstinct al familiei de produse
//2.declaram Abstract Factory -> o interfata cu lista de metode create pentru toate produsele din familie
//aceste metode returneaza abstract product types
//Factory class -> e o clasa care returneaza produse de un tip particular

