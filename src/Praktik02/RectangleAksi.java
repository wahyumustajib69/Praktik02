package Praktik02;

/**
 *
 * @author WAHYU'S PC
 */
public class RectangleAksi {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.panjang = 9;
        r1.lebar    = 3;
        
        r1.cetakinfo();
        System.out.println("Luas Rectangle : "+r1.hitungluas());
        r1.cetakLuas();
        
        Rectangle r2 = new Rectangle();
        r2.cetakinfo();
    }
}
