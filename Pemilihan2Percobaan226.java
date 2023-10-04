package if_else_Daspro;

import java.util.Scanner;

/**
 * Pemilihan2Percobaan226
 */
public class Pemilihan2Percobaan226 {

    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        int sudut1, sudut2, sudut3, totalSudut;
        System.out.println("Masukan Sudut Pertama : ");
            sudut1 = input26.nextInt();
        System.out.println("Masukan Sudut Kedua : ");
            sudut2 = input26.nextInt();
        System.out.println("Masukan Sudut Ketiga : ");
            sudut3 = input26.nextInt();
        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
                System.out.println("Segitiga tersebut adalah segitiga siku siku");
            }else if (sudut1 == 60  && sudut2 == 60 && sudut3 == 60){
                System.out.println("segitiga tersebut segitiga sama sisi");
            }else if (sudut1 == sudut2 || sudut2 == sudut3 || sudut3 == sudut1) {
                System.out.println("segitiga tersebut segitiga sama kaki");
            }else{
                System.out.println("segitiga tersebut adalah segitiga sembarang");
            }    
        }else{
            System.out.println("Bukan Segitiga!");
        }
    }
}