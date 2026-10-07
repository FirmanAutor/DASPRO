import java.util.Scanner;
public class operatorLogikaWifi_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswa, dosen, akunDiblokir;

        System.out.print("Apakah prngguna Mahasiswa? (true/false): ");
        mahasiswa = sc.nextBoolean();

        System.out.print("Apakah pengguna Dosen? (true/false): ");
        dosen = sc.nextBoolean();

        System.out.print("Apakah Akun Sedang Diblokir? (true/false): ");
        akunDiblokir = sc.nextBoolean();

        if ((mahasiswa && dosen) && !akunDiblokir) {
            System.out.println("Akses Wifi diberikan");
        } else {
            System.out.println("Akses Wifi ditolak");
        }
    }
}