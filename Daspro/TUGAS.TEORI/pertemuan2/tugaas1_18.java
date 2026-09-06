import java.util.Scanner;

public class tugas1_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gaji, tunjangananak = 100000, jumlahanak;
        double danapensiun = 0.10, gajibersih, potongan;
        
        System.out.print("gaji anda = ");
        gaji = input.nextInt();
        System.out.print("jumlah anak = ");
        jumlahanak = input.nextInt();

        potongan = gaji * danapensiun;
        gajibersih = (gaji - potongan) + (tunjangananak * jumlahanak);

        System.out.print("gaji bersih anda = " + gajibersih);

    }
}