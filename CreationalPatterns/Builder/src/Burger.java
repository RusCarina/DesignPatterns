//clasa abstracta care implementeaza interfata Item
//produce functionalitatile interfetei
public abstract class Burger implements Item{
    @Override
    public Packing packing(){
        return new Wrapper();
    }
}
