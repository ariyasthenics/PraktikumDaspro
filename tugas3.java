import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        boolean regist, kartuMahasiswa;
        Scanner sc = new Scanner(System.in);

        System.out.println(System.in);
        System.out.println("apakah sudah memasukkan kartu? ");
        kartuMahasiswa = sc.nextBoolean();
        System.out.println("apakah sudah registrasi? ");
        regist = sc.nextBoolean();

        if (regist == true || kartuMahasiswa == true) {
            System.out.println("boleh masuk");            
        } else {
            System.out.println("ditolak masuk");
        }
    }
}