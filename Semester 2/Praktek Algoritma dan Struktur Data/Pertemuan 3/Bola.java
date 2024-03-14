package Pertemuan3;
import java.lang.Math;
public class Bola {
    public int jarijari;
    public double hitungLuasPermukaan(){
        return 4 * Math.PI * jarijari * jarijari;
    }

    public double hitungVolume(){
        return (4.0 / 3) * Math.PI * jarijari * jarijari;
    }
}
