import java.util.Scanner;

public class MenghitungTotalBayar18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int harga;
        double potongan, jml_bayar, diskon = 0.15;

        System.out.println("Masukan Harga : ");
        harga = sc.nextInt();
        potongan=diskon*harga;
        jml_bayar=harga-potongan;
        System.out.println("Jumlah Yang Harus Anda Bayar Adalah : Rp." + jml_bayar);

    }
    
}
