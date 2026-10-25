import java.util.Scanner;
public class StudiKasus218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPKM;

        System.out.print("Nama Mahasiswa: ");
        namaMahasiswa = sc.nextLine();
        System.out.println("Jenis Kegiatan BELMAWA/ BAKORMA/ Mandiri/ PKM/ Lainnya : ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Jumlah Dokumen : ");
        jumlahDokumen = sc.nextInt();
        System.out.print("Peringkat Juara : ");
        peringkatJuara = sc.nextInt();
        System.out.print("Status PKM : ");
        statusPKM = sc.nextInt();



        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")) {
            if (jumlahDokumen == 4 && peringkatJuara <= 3) {
                System.out.println("Valid, Dana Diberikan.");
            } else {System.out.println("Data Invalid, Dana Tidak Diberikan. Dokumen kurang " + (4 - jumlahDokumen));

            }
        }
        else if (jenisKegiatan.equalsIgnoreCase("BAKORMA")) { 
            if (jumlahDokumen == 4 && peringkatJuara <= 3) {
                System.out.println("Valid, Dana Diberikan.");
            } else {System.out.println("Data Invalid, Dana Tidak Diberikan. Dokumen kurang " + (4 - jumlahDokumen));
                
            }
        }
        else if (jenisKegiatan.equalsIgnoreCase("Mandiri")) { 
            if (jumlahDokumen == 4 && peringkatJuara <= 3) {
                System.out.println("Valid, Dana Diberikan.");
            } else {System.out.println("Data Invalid, Dana Tidak Diberikan. Dokumen kurang " + (4 - jumlahDokumen));
                
            }
        }
        else if (jenisKegiatan.equalsIgnoreCase("PKM")) { 
            if (statusPKM == 1) {
               if (peringkatJuara <= 3 && jumlahDokumen == 4 ) {
                System.out.println("Valid, Dana Diberikan.");
               }
            } else {System.out.println("Data Invalid, Dana Tidak Diberikan. Dokumen kurang " + (4 - jumlahDokumen));
                
            }
        } 
        else { System.out.println("Mohon Maaf Tidak dapat memberikan Dana, Kegiatan tidak masuk ke dalam ketentuan");
    }
    
    sc.close();
    }
}
