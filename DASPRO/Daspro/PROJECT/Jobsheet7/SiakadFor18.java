import java.util.Scanner;
public class SiakadFor18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi=0, terrendah=100;
        int i = 1, lulus=0,tidakLulus=0;

        for (i=1; i <= 10; i++) {
        System.out.print("Nilai Mahasiswa ke-" + i + " : ");
        nilai = sc.nextDouble();

    if (nilai > tertinggi) {
        tertinggi = nilai;
    } if (nilai < terrendah) {
        terrendah = nilai;
    } if (nilai >=60) {
        lulus++;
    } else {
        tidakLulus++;
    }
    
        }
            System.out.println("Nilai Tertinggi: " + tertinggi);
            System.out.println("Nilai Terrendah: " + terrendah);
            System.out.println("Mahasiswa Lulus: " + lulus + " *Selamat*");
            System.out.println("Mahasiswa Tidak Lulus: " + tidakLulus + " *Kasian*");
    }
}
