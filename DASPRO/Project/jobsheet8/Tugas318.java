import java.util.Scanner;
public class Tugas318 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, totalSemua = 0;
        int terbanyak = -1, tokoTerbanyak = 1;

        System.out.print("Masukkan jumlah toko: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Jumlah pelanggan toko " + i + ": ");
            int pelanggan = input.nextInt();
            int totalBarang = 0;
            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("Jumlah barang pelanggan " + j + ": ");
                int barang = input.nextInt();
                totalBarang += barang;
            }
            totalSemua += totalBarang;
            System.out.println("Toko " + i + " - pelanggan: "
            + pelanggan + ", total barang: " + totalBarang);
            if (totalBarang > terbanyak) {
                terbanyak = totalBarang;
                tokoTerbanyak = i;
            }
        }
        System.out.println("Total barang seluruh toko: " + totalSemua);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        input.close();
    }
}