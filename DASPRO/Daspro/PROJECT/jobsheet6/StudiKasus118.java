import java.util.Scanner;
public class StudiKasus118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int hargaPercup = 18000, jumlahCup, uangBayar, totalHaarga, totalBayar, diskon, kembalian, uangKurang;

        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = scanner.nextInt();

        totalHaarga = jumlahCup * hargaPercup;
         diskon=0;

        if (totalHaarga >= 100000) {
            diskon = totalHaarga * 10 / 100;
        } 

        totalBayar = totalHaarga - diskon;

        System.out.println(totalHaarga + " - " + diskon + " Total Bayar: Rp. " + totalBayar);

        System.out.print("Masukan Jumlah Tunai: Rp. ");
        uangBayar = scanner.nextInt();

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("kembalian : Rp. " + kembalian);
        } else {
            uangKurang = totalBayar - uangBayar;
            System.out.println("Mohon Maaf, Uang Anda Tidak Cukup, silahkan tambah senilai: Rp. " + uangKurang);
        }

        scanner.close();

        }
    }
