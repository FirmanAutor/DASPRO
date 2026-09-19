import java.util.Scanner;

public class Tugas1_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double harga, uangMuka, sisa, bunga, totalCicilan, cicilan;
        int bulan;

        System.out.print("Masukkan harga laptop: Rp. ");
        harga = sc.nextDouble();

        System.out.print("Masukkan uang muka: Rp. ");
        uangMuka = sc.nextDouble();

        System.out.print("Masukkan jumlah bulan cicilan: ");
        bulan = sc.nextInt();

        sisa = harga - uangMuka;
        bunga = 0.02 * sisa;
        totalCicilan = sisa + bunga;
        cicilan = totalCicilan / bulan;

        System.out.println("Sisa harga: Rp. " + sisa);
        System.out.println("Bunga: Rp. " + bunga);
        System.out.println("Cicilan per bulan: Rp. " + cicilan);

        sc.close();
    }
}