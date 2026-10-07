
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
                    System.out.println("Status: Selamat anda mendapatkan dana pengharagaan");

                } else {
                    System.out.println("Status: Juara tidak memenuhi syarat untuk mendapat dana pengharagaan");
                }

            } else {

                if (dokumen < 4 && dokumen >= 0) {
                    if (peringkat > 0 && peringkat < 4) {
                        System.out.println("Status: Dokumen anda tidak lengkap (kurang " + (4 - dokumen) + "), dana penghargaan tidak diberikan");
                    } else {
                        System.out.println("Status: Juara tidak memenuhi syarat dan dokumen tidak lengkap (kurang " + (4 - dokumen) + "), dana penghargaan tidak diberikan");
                    }
                } else {
                    if (dokumen > 4 && peringkat > 0 && peringkat < 4) {
                        System.out.println("Status: Dokumen tidak valid");
                    } else {
                        System.out.println("Status: Dokumen tidak valid dan juara tidak memenuhi syarat");
                    }
                }
                 
            }

        } else if (jenisKegiatan.equalsIgnoreCase("pkm")){
            System.out.print("Jumlah Dokumen: ");
            dokumen = sc.nextInt();
            System.out.print("Status: ");
            status = sc.nextInt();


            if (status == 1) {
                System.out.println("Status: Dokumen anda lengkap, anda mendapat dana pengharagaan");

            } else if (status == 0){
                if (dokumen < 4 && dokumen > 0) {
                    System.out.println("Status: Dokumen anda tidak lengkap (kurang " + (4 - dokumen) + ") dokumen, dana penghargaan tidak diberikan");

                } else {
                    System.out.println("Status: Dokumen tidak valid, dana penghargaan tidak diberikan");

                }
            } else {
                System.out.println("Status: Kode tidak valid");
            }
                
        } else {
            System.out.println("Status : Jenis kegiatan tidak memperoleh dana penghargaan.");
        }

    }
}
