import java.util.Scanner;

public class ungdungtinhtienlaichovay {
    public static void main(String[] args) {
        System.out.println("Nhap vao so tien muon gui");
        Scanner scanner = new Scanner(System.in);
        double tiengui = scanner.nextDouble();
        System.out.println("Nhap vao lai hang thang");
        double lai = scanner.nextDouble();
        System.out.println("Nhap vao so thang muon gui");
        double sothang = scanner.nextDouble();
        double tongtien = 0;
        for (int i = 0; i < sothang; i++) {
            tongtien += tiengui * (lai / 100) / 12 * sothang;
        }
        System.out.println("Tong so tien gui: " + tiengui + " sau " + sothang + " la " + tongtien);
    }
}