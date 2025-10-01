import java.util.Scanner;
public class ifCetakKRS16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Aakah UKT sudah lunas? (true/false): ");
        boolean UKTLunas = sc.nextBoolean();
        if (UKTLunas) {
            System.out.println("Pembayaran UKT terverivikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        }
    }
}
