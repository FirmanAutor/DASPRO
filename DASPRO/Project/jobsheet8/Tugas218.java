import java.util.Scanner;
public class Tugas218 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.print("Masukan nilai n: ");
        int n=sc.nextInt();
        int i=0, j=0;
        int total=0;

        for (i=1; i<=n; i++) {
            for (j=1; j<=n; j++) {
            System.out.print(" "+ (i*j) +"");
            total+=i*j;
        } System.out.println("");
           
        } 
        
        System.out.println("Jumlah seluruh angka: " + total); 
    }
}
