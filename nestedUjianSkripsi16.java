import java.util.Scanner;
public class nestedUjianSkripsi16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;
        System.out.println("Apakah mahasiswa sudah bebas kompen? (ya/tidak): ");
        String bebasKompen = sc.nextLine().trim();
        System.out.println("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbingapP1 = sc.nextInt();
        System.out.println("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbingapP2 = sc.nextInt();
        if (bebasKompen.equalsIgnoreCase("ya")) {
            if (bimbingapP1 >=8 && bimbingapP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian sripsi";    
            } else if (bimbingapP1 < 8 && bimbingapP2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan 2 kurang dari 4 kali";
            } else if (bimbingapP1 < 8) {
                pesan = "Gagal! log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! log bimbingan P2 belum me~ncapai 4 kali";
            }
        } else {
            pesan = "Gagal! mahasiswa masih mepunyai tanggungan kompen";
        }
        System.out.println(pesan);
    }
}
