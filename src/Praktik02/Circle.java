package Praktik02;
public class Circle {
    double phi,jari;
    
    void cetakinfo(){
        System.out.println("=======================");
        System.out.println("PHI         : "+phi);
        System.out.println("JARI-JARI   : "+jari);
        System.out.println("=======================");
    }

    public Circle() {
        phi = 22/7;
        jari=9;
    }
    
    double hitungLuas(){
        double luas;
        luas = phi*jari*jari;
        return luas;
    }
    
    void cetakLuas(){
        System.out.println("Luas Lingkaran = "+hitungLuas());
    }
}
