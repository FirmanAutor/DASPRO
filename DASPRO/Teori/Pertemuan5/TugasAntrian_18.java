import java.util.Scanner;

public class TugasAntrianPresensi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kode;

        System.out.println("Masukan Kode Layanan : ");
        kode = sc.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Layanan Legalisir Ijazah");
                System.out.println("Loket: Loket A");
                break;

            case 2:
                System.out.println("Surat Keterangan Aktif Kuliah");
                System.out.println("Loket: Loket B");
                break;

            case 3:
                System.out.println("Pembayaran UKT");
                System.out.println("Loket: Loket C");
                break;
            
            case 4:
                System.out.println("Pengajuan Cuti Akademik");
                System.out.println("Loket: Loket D");

            default:
                System.out.println("Kode Layanan Tidak Valid");
        }
        sc.close();
    }
}