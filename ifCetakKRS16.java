import java.util.Scanner;

public class ifCetakKRS16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        boolean UKTLunas = sc.nextBoolean();
        System.out.println(UKTLunas ? "ukt terverifikasi ":" ukt tidak terverivikasi");
        

    }
}
