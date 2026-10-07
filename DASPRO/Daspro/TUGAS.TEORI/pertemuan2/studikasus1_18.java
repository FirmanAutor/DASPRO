import java.util.Scanner;

public class studikasus1_18 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int panjang;
        int lebar;
        int keliling;

        System.out.print("masukan panjang : ");
        panjang = input.nextInt();
        System.out.print("masukan lebar : ");
        lebar = input.nextInt();
        
        keliling = 2 * (panjang + lebar);

        System.out.println("keliling = " + keliling);
    
    }
}