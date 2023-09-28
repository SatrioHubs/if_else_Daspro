package if_else_Daspro;
import java.util.Scanner;

public class PemilihanPercobaan2_26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.println("nilai uas      : ");
        float uas = input26.nextFloat();
        System.out.println("nilai uts      : ");
        float uts = input26.nextFloat();
        System.out.println("nilai kuiz     : ");
        float kuiz = input26.nextFloat();
        System.out.println("nilai tugas    : ");
        float tugas = input26.nextFloat();

        float total = (uas * 0.4f) + (uts * 0.3f) + (kuiz * 0.1f) + (tugas * 0.2f);
        String message = total < 65 ? "Remidi" : "Tidak Remedi";
        System.out.println("Nilai Akhir = " + total + " Sehingga " + message);
    }
}
