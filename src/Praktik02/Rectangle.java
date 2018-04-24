package Praktik02;
public class Rectangle {
    double panjang;
    double lebar;

    public Rectangle() {
        panjang=5;
        lebar=3;
    }
    
    void cetakinfo(){
        System.out.println("===================");
        System.out.println("Panjang     : "+panjang);
        System.out.println("Lebar       : "+lebar);
        System.out.println("===================");
    }
    
    double hitungluas(){
        double luas;
        luas = panjang*lebar;
        return luas;
    }
    
    void cetakLuas(){
        System.out.println("Luas Rectangle : "+hitungluas());
    }
}
