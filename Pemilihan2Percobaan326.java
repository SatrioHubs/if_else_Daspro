package if_else_Daspro;

import java.util.Scanner;

public class Pemilihan2Percobaan326 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.println("Masukan Kategori : ");
        kategori = input26.nextLine();
        System.out.println("Masukan Besarnya Penghasilan");
        penghasilan = input26.nextInt();

        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2000000) 
                pajak = 0.1;
            else if(penghasilan <= 3500000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("penghasilan bersih : " + gajiBersih);
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("penghasilan bersih : " + gajiBersih);    
        } else 
            System.out.println("Masukan Kategori Salah!");
    }
}