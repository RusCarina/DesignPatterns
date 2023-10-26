//Factory method -> foloseste o interfata care sa creeze obiectele intr-o superclasa,
// dar permite subclaselor sa modifice tipul de obiect care e creat

public abstract class Computer { //superclasa poate sa fie interfata, clasa abstracta sau clasa normala
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}
