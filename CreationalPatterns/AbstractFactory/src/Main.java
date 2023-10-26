// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        shape3.draw();
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        shape4.draw();
    }
}