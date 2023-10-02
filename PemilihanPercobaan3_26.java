package if_else_Daspro;

import java.util.Scanner;

public class PemilihanPercobaan3_26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;
        
        System.out.println("masukan angka pertama : ");
        angka1 = input26.nextDouble();
        System.out.println("Masukan angka kedua : ");
        angka2 = input26.nextDouble();
        System.out.println("Masukan Operator (+ - * /): ");
        operator = input26.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + "=" + hasil);
                break;
            case '-' :
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil); 
                break;  
            case'/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;    
            default:
                break;
        }
    }
}
