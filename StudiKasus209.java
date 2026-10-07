
import java.util.Scanner;

public class StudiKasus209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        String jenisKegiatan;
        int dokumen, peringkat;
        int status;

        System.out.print("Nama Mahasiswa: " );
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("belmawa") || jenisKegiatan.equalsIgnoreCase("bakorma") || jenisKegiatan.equalsIgnoreCase("mandiri")) {

            System.out.print("Jumlah Dokumen: ");
            dokumen = sc.nextInt();
            System.out.print("Peringkat Juara: ");
            peringkat = sc.nextInt();

            if (dokumen == 4) {
                if (peringkat > 0 && peringkat < 4) {
                    System.out.println("Selamat anda mendapatkan dana pengharagaan");

                } else {
                    System.out.println("Juara tidak memenuhi syarat untuk mendapat dana pengharagaan");
                }

            } else {

                if (peringkat > 4 && peringkat == 0 || (dokumen > 0 && dokumen < 4)) {
                    System.out.println("Juara tidak memenuhi syarat untuk mendapat dana pengharagaan, dokumen kurang " + (4 - dokumen) + ", Dana penghargaan tidak diberikan");

                } else if (peringkat > 4 || peringkat == 0 && dokumen > 4) {
                    System.out.println("Juara tidak memenuhi syarat untuk mendapat dana pengharagaan, dokumen tidak valid");

                } else {
                    if (dokumen > 0 && dokumen < 4) {
                        System.out.println("Dokumen tidak lengap (kurang " + (4 - dokumen) + " dokumen), Dana penghargaan tidak diberikan");
                        
                    } else {
                        System.out.println("Dokumen tidak valid");
                        
                    }
                } 
            }

        } else {

        }

    }
}
