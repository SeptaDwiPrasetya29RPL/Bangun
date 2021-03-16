
package bangun;

public class BangunDatar {
    
    public void persegi(){
        System.out.println("1. Bangun datar yang dihitung : Persegi");
    }
    public int luas(int sisi){
        int luas = sisi*sisi;
        System.out.println("Luas Persegi 1 = "+luas);
        return luas;
    }
    public double luas(double sisi){
        double luas = sisi * sisi;
        System.out.println("Luas Persegi 2 = "+luas);
        return luas;
    }
    public int keliling(int sisi){
        int keliling = sisi * sisi * sisi;
        System.out.println("Keliling Persegi = "+keliling);
        return keliling;
    }
    public double keliling(double sisi){
        double keliling = sisi * sisi * sisi;
        System.out.println("Keliling Persegi = "+keliling);
        return keliling;
    }
    
}
