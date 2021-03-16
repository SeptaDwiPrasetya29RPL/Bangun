
package bangun;

public class BangunRuang extends BangunDatar{
    public void kubus(){
        System.out.println("2. Bangun Ruang  yang dihitung : Kubus");
    }
    public double luas(double sisi){
        double luas;
        luas = 6 * sisi * sisi;
        System.out.println("Luas Permukaan kubus = "+luas);
        return luas;
    }
    public double volume(double sisi){
        double volume;
        volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus = "+volume);
        return volume;
    }    
    
}
