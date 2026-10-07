import java.util.Scanner;
public class nestedUjianSkripsi_18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;

        System.out.print("Apakah mahasiswa bebas kompen? (ya/tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Jumlah bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Jumlah bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua Syarat terpenuhi. Mahasiswa boleh mendaftar ujian skirpsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal: bimbingan Pembimbing 1 kurang dari 8 dan Pembimbing 2 kurang dari 4";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal: bimbingan Pembimbing 1 kurang dari 8";
            } else {
                pesan = "Gagal: bimbingan Pembimbing 2 kurang dari 4";
            }
        } else {
            pesan = "Gagal: mahasiswa tidak bebas kompen";
        }
        
        System.out.println(pesan);

    }
}