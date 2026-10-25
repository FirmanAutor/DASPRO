import java.util.Scanner;

public class Tugas2_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahLembar, biayaCetak = 500, biayaJilid = 5000, totalBiaya;

        System.out.print("Masukkan jumlah lembar: ");
        jumlahLembar = sc.nextInt();

        totalBiaya = (jumlahLembar * biayaCetak) + biayaJilid;

        System.out.println("Total biaya yang harus dibayar adalah Rp. " + totalBiaya);

        sc.close();
    }
}