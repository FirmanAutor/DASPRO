import java.util.Scanner;
public class nestedAksesLab_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        boolean mahasiswaAktif, sedangDisanksi, punyaIzinDosen, asistenLab;

        System.out.print("Apakah Mahasiswa Aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();

        System.out.print("Apakah Sedang di Sanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();

        System.out.print("Apakah Punya izin Dosen? (true/false): ");
        punyaIzinDosen = sc.nextBoolean();

        System.out.print("Apakah Asisten Lab? (true/false): ");
        asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses Lab Diberikan");
        } else {
            System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
        } 
        
    }
    }
}
