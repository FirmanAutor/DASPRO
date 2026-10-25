import java.util.Scanner;
public class pertemuan9Tugas1_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int hari=1, jamBelajar, totalJam=0;

        while (hari <= 7) {
            
                System.out.println("Masukkan Jam Belajar hari ke " + hari + " : ");
                jamBelajar = sc.nextInt();
                
                while (jamBelajar > 10) {
                    System.out.println("jam belajar gak masuk akal");
                    System.out.print("masukan jam belajar di bawah 10 jam : ");
                jamBelajar = sc.nextInt();
                }

        totalJam =  totalJam + jamBelajar;
        hari++;
    }
    System.out.println("Total jam belajar dalam 1 minggu : " + totalJam);
    sc.close();
  }
}