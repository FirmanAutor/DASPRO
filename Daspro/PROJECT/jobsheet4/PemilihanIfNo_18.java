import java.util.Scanner;
public class PemilihanIfNo_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT Sudah Lunas? (true/false)");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas){
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        }else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
        sc.close();
    }
    
}
