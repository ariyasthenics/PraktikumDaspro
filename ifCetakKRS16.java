import java.util.Scanner;

import javax.print.DocFlavor.STRING;
public class ifCetakKRS16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Aakah UKT sudah lunas? (true/false): ");
        boolean UKTLunas = sc.nextBoolean();
        System.out.println(UKTLunas ? "ukt terverivikasi ":" ukt tidak terverivikasi");
        

    }
}
