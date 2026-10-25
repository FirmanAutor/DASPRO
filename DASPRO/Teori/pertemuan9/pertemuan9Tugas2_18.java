import java.util.Scanner;

public class pertemuan9Tugas2_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jamKerja;
        double gajiHarian, bonus;

        while (true) {
            System.out.print("Masukkan jam kerja (-1 untuk berhenti): ");
            jamKerja = sc.nextInt();

            if (jamKerja < 0) {
                System.out.println("Program berhenti.");
                break;
            }

            System.out.print("Masukkan gaji harian: Rp");
            gajiHarian = sc.nextDouble();

            if (jamKerja > 8) {
                bonus = gajiHarian * 20 / 100;
            } else {
                bonus = 0;
            }

            System.out.println("Jam kerja: " + jamKerja);
            System.out.println("Gaji harian: Rp" + gajiHarian);
            System.out.println("Bonus: Rp" + bonus);
            System.out.println("-------------------------");
        }

        sc.close();
    }
}