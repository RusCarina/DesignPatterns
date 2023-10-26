//clasa concreta care implementeaza una din interfete
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName){
        System.out.println("Playing vlc file named " + fileName);
    }
    @Override
    public void playMp4(String fileName){}
}
