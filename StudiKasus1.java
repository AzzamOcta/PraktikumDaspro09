import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Beli berapa cup?: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang mu: ");
        uangBayar = sc.nextInt();

        totalHarga = hargaPerCup * jumlahCup;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        } else {
            diskon = 0;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Harga awal: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total: " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalHarga;
            System.out.println("Kembalian anda: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uangmu kurang: " + kurang);
        }
    }
}
