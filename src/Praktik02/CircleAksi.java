package Praktik02;
public class CircleAksi {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.phi = 3.14;
        c1.jari = 9;
        
        c1.cetakinfo();
        System.out.println("Luas Lingkaran = "+c1.hitungLuas()+"cm");
        c1.cetakLuas();
        
        Circle c2 = new Circle();
        c2.cetakinfo();
        c2.cetakLuas();
        
        Circle c3 = new Circle(3.14,9);
        c3.cetakinfo();
        c3.cetakLuas();
    }
}
