import java.util.Scanner;

public class latihan1_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jam, tarif;

        System.out.println("masukan lama parkir (jam): ");
        jam = sc.nextInt();

        if (jam <= 2) {
            tarif = 2000;
        } else {
            tarif = 2000 + ((jam - 2) * 1000);
        }

        System.out.println("tarif parkir : Rp." + tarif);

        sc.close();
    }
}