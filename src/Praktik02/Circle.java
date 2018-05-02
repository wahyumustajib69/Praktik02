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
        phi = 3.14;
        jari=9;
    }

    public Circle(double phi, double jari) {
        this.phi = phi;
        this.jari = jari;
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
