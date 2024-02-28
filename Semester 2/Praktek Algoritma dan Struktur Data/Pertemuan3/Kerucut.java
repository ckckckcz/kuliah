package Pertemuan3;
import java.lang.Math;
public class Kerucut {
    public int jarijari, sisiMiringKerucut;

    public double hitungLuasPermukaan(){
        return Math.PI * jarijari * (jarijari + sisiMiringKerucut);
    }

    public double hitungVolume(){
        return (1.0 / 3) * Math.PI * jarijari * jarijari * sisiMiringKerucut;
    }
}
