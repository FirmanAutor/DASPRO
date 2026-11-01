import java.util.Scanner;
public class NilaiKelompok18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Jumlah Kelompok: ");
        int jumlahKel=sc.nextInt();
        System.out.print("Masukan Jumlah Penilai: ");
        int jumlahPenilai=sc.nextInt();

        if (jumlahKel <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah penilai dan jumlah kelompok harus lebih dari 0");
        } else {
            int noKel=1;
            double rataTertinggi=-1;
            int kelTerbaik=0;
            while(noKel <= jumlahKel) {
                System.out.println("Kelompok " + noKel);
                double totalNilai=0;
                 for (int j=1; j <= jumlahPenilai; j++) {
                int nilai;
                do {
                    System.out.print("Nilai dari penilai " + j + ": ");
                    nilai=sc.nextInt();
                    if (nilai < 0 || nilai > 100) {
                        System.out.println("Nilai harus 0-100. Ulangi input!!!");
                    }
                } while (nilai < 0 || nilai > 100);
                totalNilai += nilai;
            }  double rataNilai = totalNilai/jumlahPenilai;
            System.out.println("Kelompok " + noKel + ": Nilai Nilai Rata-Rata = " + rataNilai);
            if (rataNilai > rataTertinggi) {
                kelTerbaik=noKel;
                rataTertinggi=rataNilai;
            }
                noKel++;
            } 

            System.out.println("==============================");
            System.out.println("Kelompok Terbaik: " + kelTerbaik);
            System.out.println("Rata-rata Tertinggi: " + rataTertinggi);
        }
    }
}
