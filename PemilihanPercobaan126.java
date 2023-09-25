package if_else_Daspro;
import java.util.Scanner;

/**
 * PemilihanPercobaan126
 */
public class PemilihanPercobaan126 {

    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.println("masukan angka: ");
        int angka = input26.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka "+angka+" bilangan genap");
        }else{
            System.out.println("Angka "+angka+" bilangan ganjil");
        }
    }
}