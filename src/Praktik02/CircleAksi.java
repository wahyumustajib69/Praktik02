package Praktik02;
public class CircleAksi {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.phi = 3.14;
        c1.jari = 9;
        
        c1.cetakinfo();
        System.out.println("Luas Lingkaran = "+c1.hitungLuas());
    }
}
